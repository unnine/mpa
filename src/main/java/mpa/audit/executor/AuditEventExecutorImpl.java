package mpa.audit.executor;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;
import mpa.audit.annotation.AuditInfo;
import mpa.audit.config.type.CommandType;
import mpa.audit.context.AuditAgent;
import mpa.audit.context.AuditTracker;
import mpa.audit.repository.dataaccess.sql.argument.MutationArgumentsParser;
import mpa.audit.transaction.event.AuditCommitEvent;
import mpa.audit.transaction.event.AuditEventPublisher;
import mpa.persistence.context.RuntimeAttribute;
import mpa.persistence.context.RuntimeThreadAttribute;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.event.MutationArgument;
import mpa.util.StringUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class AuditEventExecutorImpl implements AuditEventExecutor {

    private boolean discarded = false;

    private final List<AuditAgent> auditAgents;
    private final AuditTracker auditTracker;
    private final AuditEventPublisher eventPublisher;
    private final RuntimeThreadAttribute runtimeThreadAttribute;


    @Override
    public synchronized void execute() {
        assertExecutable();

        this.discarded = true;

        auditAgents.forEach(agent -> {
            agent.capture(null);
        });

        List<AuditTrail> auditTrails = auditTracker.flush();
        eventPublisher.publishCommitEvent(AuditCommitEvent.MANUALLY, auditTrails);

        auditAgents.clear();
        auditTracker.endTracking();
        runtimeThreadAttribute.clear();
    }

    private void assertExecutable() {
        if (this.discarded) {
            throw new IllegalStateException("already executed.");
        }
    }


    @RequiredArgsConstructor
    public static class BuilerImpl implements Builder {

        private String scopeName = Scope.getDefaultName();
        private final List<Object> arguments = new ArrayList<>();

        private final ScopeAware scopeAware;
        private final EntityCache entityCache;
        private final AuditTracker auditTracker;
        private final AuditEventPublisher eventPublisher;
        private final MutationArgumentsParser argumentsParser;
        private final RuntimeThreadAttribute runtimeThreadAttribute;


        @Override
        public BuilerImpl scope(String scopeName) {
            if (StringUtil.isNotEmpty(scopeName)) {
                this.scopeName = scopeName;
            }
            return this;
        }

        @Override
        public Builder addArgument(Object argument) {
            if (argument != null) {
                this.arguments.add(argument);
            }
            return this;
        }

        @Override
        public Builder addArguments(Collection<Object> arguments) {
            if (arguments != null && !arguments.isEmpty()) {
                this.arguments.addAll(arguments);
            }
            return this;
        }

        @Override
        public AuditEventExecutor build() {
            Scope scope = scopeAware.get(scopeName);
            runtimeThreadAttribute.set(new RuntimeAttribute(scope));

            List<AuditAgent> agents = arguments.stream()
                    .map(this::beginTracking)
                    .collect(Collectors.toList());

            return new AuditEventExecutorImpl(
                    agents,
                    auditTracker,
                    eventPublisher,
                    runtimeThreadAttribute
            );
        }

        private AuditAgent beginTracking(Object argument) {
            AuditAgent agent = new AuditAgent(entityCache, auditTracker);
            AuditInfo auditInfo = makeAuditInfo(argument);
            agent.beginTracking(auditInfo);
            return agent;
        }

        private AuditInfo makeAuditInfo(Object argument) {
            Class<?> entityClass = argument.getClass();
            RuntimeAttribute runtimeAttribute = runtimeThreadAttribute.get();
            EntityDefinition entityDefinition = entityCache.getByEntity(entityClass);
            MutationArgument mutationArgument = new MutationArgument(argument);

            return AuditInfo.builder()
                    .scope(runtimeAttribute.getScope())
                    .commandType(CommandType.UNKNOWN)
                    .target(entityDefinition.getEntityClass())
                    .tableName(entityDefinition.getTableName())
                    .argument(argumentsParser.parse(entityDefinition, mutationArgument))
                    // TODO label 처리
                    .label("")
                    .build();
        }
    }
}
