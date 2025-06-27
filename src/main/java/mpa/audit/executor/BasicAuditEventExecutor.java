package mpa.audit.executor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.AuditInfo;
import mpa.audit.config.type.CommandType;
import mpa.audit.context.AuditAgent;
import mpa.audit.context.AuditTracker;
import mpa.audit.context.AuditTrail;
import mpa.audit.repository.sql.argument.MutationArgumentsParser;
import mpa.audit.transaction.event.AuditCommitEvent;
import mpa.audit.transaction.event.AuditEventPublisher;
import mpa.persistence.annotation.Mutations;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.event.MutationArgument;
import mpa.persistence.holder.MutationsAnnotationHolder;
import mpa.util.StringUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class BasicAuditEventExecutor implements AuditEventExecutor {

    private final String scopeName;
    private final List<Node> auditNodes;
    private final ScopeAware scopeAware;
    private final Scopable<EntityCache> entityCacheScopable;
    private final AuditTracker auditTracker;
    private final AuditEventPublisher eventPublisher;
    private final Scopable<MutationArgumentsParser> argumentsParserScopable;
    private final MutationsAnnotationHolder mutationsHolder;


    public BasicAuditEventExecutor(String scopeName, List<Object> arguments, ScopeAware scopeAware, Scopable<EntityCache> entityCacheScopable, AuditTracker auditTracker, AuditEventPublisher eventPublisher, Scopable<MutationArgumentsParser> argumentsParserScopable, MutationsAnnotationHolder mutationsHolder) {
        this.scopeName = scopeName;
        this.auditNodes = arguments.stream()
                .map(this::beginTracking)
                .collect(Collectors.toList());
        this.scopeAware = scopeAware;
        this.entityCacheScopable = entityCacheScopable;
        this.auditTracker = auditTracker;
        this.eventPublisher = eventPublisher;
        this.argumentsParserScopable = argumentsParserScopable;
        this.mutationsHolder = mutationsHolder;
    }


    @Override
    public synchronized void execute() {
        auditNodes.forEach(node -> {
            AuditAgent agent = node.getAgent();
            AuditInfo auditInfo = makeAuditInfo(node.getScope(), node.entityCache, node.argument);
            agent.capture(auditInfo);
        });

        List<AuditTrail> auditTrails = auditTracker.flush();
        eventPublisher.publishCommitEvent(AuditCommitEvent.MANUALLY, auditTrails);

        auditNodes.clear();
        auditTracker.endTracking();
    }

    private Node beginTracking(Object argument) {
        Scope scope = scopeAware.get(scopeName);
        EntityCache entityCache = entityCacheScopable.getInstance(scope);
        AuditAgent agent = new AuditAgent(entityCache, auditTracker);
        AuditInfo auditInfo = makeAuditInfo(scope, entityCache, argument);
        agent.beginTracking(auditInfo);
        return Node.builder()
                .scope(scope)
                .entityCache(entityCache)
                .argument(argument)
                .agent(agent)
                .build();
    }

    private AuditInfo makeAuditInfo(Scope scope, EntityCache entityCache, Object argument) {
        Class<?> entityClass = argument.getClass();
        EntityDefinition entityDefinition = entityCache.getByEntity(entityClass);
        MutationArgument mutationArgument = new MutationArgument(argument);
        MutationArgumentsParser argumentsParser = argumentsParserScopable.getInstance(scope);
        String label = getMutationsLabel();

        return AuditInfo.builder()
                .scope(scope)
                .commandType(CommandType.UNKNOWN)
                .target(entityDefinition.getEntityClass())
                .tableName(entityDefinition.getTableName())
                .argument(argumentsParser.parse(entityDefinition, mutationArgument))
                .label(label)
                .build();
    }

    private String getMutationsLabel() {
        return mutationsHolder
                .getLast()
                .map(Mutations::label)
                .orElse(null);
    }


    @Getter
    @lombok.Builder
    private static class Node {

        private final Scope scope;
        private final EntityCache entityCache;
        private final Object argument;
        private final AuditAgent agent;
    }


    @RequiredArgsConstructor
    public static class BuilderImpl implements Builder {

        private String scopeName = Scope.DEFAULT_NAME;
        private final List<Object> arguments = new ArrayList<>();

        private final ScopeAware scopeAware;
        private final Scopable<EntityCache> entityCacheScopable;
        private final AuditTracker auditTracker;
        private final AuditEventPublisher eventPublisher;
        private final Scopable<MutationArgumentsParser> argumentsParserScopable;
        private final MutationsAnnotationHolder mutationsHolder;


        @Override
        public BuilderImpl scope(String scopeName) {
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
            return new BasicAuditEventExecutor(
                    scopeName,
                    arguments,
                    scopeAware,
                    entityCacheScopable,
                    auditTracker,
                    eventPublisher,
                    argumentsParserScopable,
                    mutationsHolder
            );
        }
    }
}
