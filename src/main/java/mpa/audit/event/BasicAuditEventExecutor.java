package mpa.audit.event;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mpa.audit.AuditTrail;
import mpa.audit.config.type.CommandType;
import mpa.audit.config.type.EventType;
import mpa.audit.context.AuditAgent;
import mpa.audit.context.AuditInfo;
import mpa.audit.context.AuditTracker;
import mpa.audit.repository.sql.argument.MutationArgumentsParser;
import mpa.persistence.context.Scopable;
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

@Slf4j
public class BasicAuditEventExecutor implements AuditEventExecutor {

    private boolean discarded = false;
    private final String scopeName;
    private final String label;
    private final List<Node> auditNodes;
    private final ScopeAware scopeAware;
    private final Scopable<EntityCache> entityCacheScopable;
    private final AuditTracker auditTracker;
    private final AuditEventPublisher eventPublisher;
    private final Scopable<MutationArgumentsParser> argumentsParserScopable;


    public BasicAuditEventExecutor(String scopeName,
                                   String label,
                                   List<ExecuteArgument> executeArguments,
                                   ScopeAware scopeAware,
                                   Scopable<EntityCache> entityCacheScopable,
                                   AuditTracker auditTracker,
                                   AuditEventPublisher eventPublisher,
                                   Scopable<MutationArgumentsParser> argumentsParserScopable
    ) {
        this.scopeName = scopeName;
        this.label = label;
        this.scopeAware = scopeAware;
        this.entityCacheScopable = entityCacheScopable;
        this.auditTracker = auditTracker;
        this.eventPublisher = eventPublisher;
        this.argumentsParserScopable = argumentsParserScopable;
        this.auditNodes = executeArguments.stream()
                .map(this::beginTracking)
                .collect(Collectors.toList());
    }

    @Override
    public void addEntity(Object entity) {
        if (entity == null) {
            return;
        }
        beginTracking(new ExecuteArgument(entity, entity.getClass()));
    }

    @Override
    public void addEntities(Collection<Object> entities) {
        if (entities == null) {
            return;
        }
        if (entities.isEmpty()) {
            return;
        }
        for (Object entity : entities) {
            beginTracking(new ExecuteArgument(entity, entity.getClass()));
        }
    }

    @Override
    public void addId(Object id, Class<?> entityClass) {
        if (id == null) {
            return;
        }
        beginTracking(new ExecuteArgument(id, entityClass));
    }


    private Node beginTracking(ExecuteArgument executeArgument) {
        Scope scope = scopeAware.get(scopeName);
        EntityCache entityCache = entityCacheScopable.getInstance(scope);
        AuditAgent agent = new AuditAgent(entityCache, auditTracker);
        AuditInfo auditInfo = makeAuditInfo(scope, entityCache, executeArgument);
        agent.beginTracking(auditInfo);
        return new Node(scope, entityCache, executeArgument, agent);
    }

    @Override
    public synchronized void execute() {
        assertExecutable();
        executed();
        captureAudit();
        flushAudit();
        endTracking();
    }

    private void assertExecutable() {
        if (this.discarded) {
            throw new IllegalStateException("already finished audit event execution. create new audit event executor.");
        }
    }

    private void executed() {
        this.discarded = true;
    }

    private void captureAudit() {
        auditNodes.forEach(node -> {
            AuditAgent agent = node.getAgent();
            AuditInfo auditInfo = makeAuditInfo(node.getScope(), node.entityCache, node.executeArgument);
            agent.capture(auditInfo);
        });
    }

    private void flushAudit() {
        List<AuditTrail> auditTrails = auditTracker.flush();
        eventPublisher.publishCommitEvent(AuditCommitEvent.MANUALLY, auditTrails);
    }

    private void endTracking() {
        auditNodes.clear();
        auditTracker.endTracking();
    }

    private AuditInfo makeAuditInfo(Scope scope, EntityCache entityCache, ExecuteArgument executeArgument) {
        Object argument = executeArgument.getArg();
        Class<?> entityClass = executeArgument.getEntityClass();
        EntityDefinition entityDefinition = entityCache.getByEntity(entityClass);
        MutationArgument mutationArgument = new MutationArgument(argument);
        MutationArgumentsParser argumentsParser = argumentsParserScopable.getInstance(scope);
        return AuditInfo.builder()
                .scope(scope)
                .commandType(CommandType.UNKNOWN)
                .eventType(EventType.MANUALLY)
                .target(entityDefinition.getEntityClass())
                .tableName(entityDefinition.getTableName())
                .argument(argumentsParser.parse(entityDefinition, mutationArgument))
                .label(label)
                .build();
    }


    @Getter
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    private static class Node {

        private final Scope scope;
        private final EntityCache entityCache;
        private final ExecuteArgument executeArgument;
        private final AuditAgent agent;
    }


    @Getter
    @RequiredArgsConstructor(access = AccessLevel.PRIVATE)
    private static class ExecuteArgument {

        private final Object arg;
        private final Class<?> entityClass;
    }


    @RequiredArgsConstructor
    public static class BuilderImpl implements Builder {

        private String scopeName = Scope.DEFAULT_NAME;
        private String label;
        private final List<ExecuteArgument> executeArguments = new ArrayList<>();

        private final ScopeAware scopeAware;
        private final Scopable<EntityCache> entityCacheScopable;
        private final AuditTracker auditTracker;
        private final AuditEventPublisher eventPublisher;
        private final Scopable<MutationArgumentsParser> argumentsParserScopable;


        @Override
        public Builder defaultScope() {
            this.scopeName = Scope.DEFAULT_NAME;
            return this;
        }

        @Override
        public Builder scope(String scopeName) {
            if (StringUtil.isNotEmpty(scopeName)) {
                this.scopeName = scopeName;
            }
            return this;
        }

        @Override
        public Builder label(String label) {
            if (StringUtil.isNotEmpty(label)) {
                this.label = label;
            }
            return this;
        }

        @Override
        public AuditEventExecutor build() {
            return new BasicAuditEventExecutor(
                    scopeName,
                    label,
                    executeArguments,
                    scopeAware,
                    entityCacheScopable,
                    auditTracker,
                    eventPublisher,
                    argumentsParserScopable
            );
        }
    }
}
