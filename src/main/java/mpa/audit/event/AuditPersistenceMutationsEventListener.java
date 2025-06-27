package mpa.audit.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.AuditInfo;
import mpa.audit.config.type.CommandType;
import mpa.audit.context.AuditAgent;
import mpa.audit.context.AuditTracker;
import mpa.audit.repository.sql.argument.Argument;
import mpa.audit.repository.sql.argument.MutationArgumentsParser;
import mpa.persistence.context.PersistenceEnvironmentAttribute;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.Scope;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.event.MutationEvent;
import mpa.persistence.event.PersistenceMutationsEventListener;

import java.util.Optional;

@RequiredArgsConstructor
public class AuditPersistenceMutationsEventListener implements PersistenceMutationsEventListener {

    private static final ThreadLocal<AuditAgent> threadAgents = new ThreadLocal<>();

    private final Scopable<EntityCache> entityCacheScopable;
    private final AuditTracker auditTracker;
    private final Scopable<MutationArgumentsParser> argumentsParserScopable;


    @Override
    public boolean ignore(MutationEvent event) {
        if (!PersistenceEnvironmentAttribute.isAuditing()) {
            return true;
        }
        if (notRegisteredEntity(event)) {
            return true;
        }
        if (event.getArgument().isInvalid()) {
            return true;
        }
        return false;
    }

    private boolean notRegisteredEntity(MutationEvent event) {
        Scope scope = event.getScope();
        EntityDefinition entityDefinition = event.getEntityDefinition();
        String tableName = entityDefinition.getTableName();
        return !entityCacheScopable.getInstance(scope).existsByTableName(tableName);
    }

    @Override
    public void onBefore(MutationEvent event) {
        Scope scope = event.getScope();
        threadAgents.set(new AuditAgent(entityCacheScopable.getInstance(scope), auditTracker));

        getAgent().ifPresent(agent -> {
            AuditInfo auditInfo = makeAuditInfo(event);
            agent.beginTracking(auditInfo);
        });
    }

    @Override
    public void onAfter(MutationEvent event, boolean mutated) {
        if (!mutated) {
            return;
        }

        getAgent().ifPresent(agent -> {
            AuditInfo auditInfo = makeAuditInfo(event);
            agent.capture(auditInfo);
        });
    }

    @Override
    public void onAfterCompletion(MutationEvent event) {
        threadAgents.remove();
    }

    private Optional<AuditAgent> getAgent() {
        return Optional.ofNullable(threadAgents.get());
    }

    private AuditInfo makeAuditInfo(MutationEvent event) {
        EntityDefinition entityDefinition = event.getEntityDefinition();
        Argument argument = parseArgument(event);

        return AuditInfo.builder()
                .scope(event.getScope())
                .label(event.getLabel())
                .commandType(CommandType.of(event.getMutationType()))
                .target(entityDefinition.getEntityClass())
                .tableName(entityDefinition.getTableName())
                .argument(argument)
                .build();
    }

    private Argument parseArgument(MutationEvent event) {
        return argumentsParserScopable.getInstance(event.getScope()).parse(event.getEntityDefinition(), event.getArgument());
    }
}
