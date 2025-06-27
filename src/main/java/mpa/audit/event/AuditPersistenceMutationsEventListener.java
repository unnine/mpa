package mpa.audit.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.AuditInfo;
import mpa.audit.config.type.CommandType;
import mpa.audit.context.AuditAgent;
import mpa.audit.context.AuditTracker;
import mpa.audit.repository.dataaccess.sql.argument.MutationArgumentsParser;
import mpa.persistence.context.RuntimeAttribute;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.event.MutationEvent;
import mpa.persistence.event.PersistenceMutationsEventListener;

import java.util.Optional;

@RequiredArgsConstructor
public class AuditPersistenceMutationsEventListener implements PersistenceMutationsEventListener {

    private static final ThreadLocal<AuditAgent> threadAgents = new ThreadLocal<>();

    private final EntityCache entityCache;
    private final AuditTracker auditTracker;
    private final MutationArgumentsParser argumentsParser;


    @Override
    public boolean ignore(MutationEvent event) {
        RuntimeAttribute runtimeAttribute = event.getRuntimeAttribute();
        if (!runtimeAttribute.isAuditing()) {
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
        EntityDefinition entityDefinition = event.getEntityDefinition();
        String tableName = entityDefinition.getTableName();
        return !entityCache.existsByTableName(tableName);
    }

    @Override
    public void onBefore(MutationEvent event) {
        threadAgents.set(new AuditAgent(entityCache, auditTracker));

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
        RuntimeAttribute runtimeAttribute = event.getRuntimeAttribute();
        EntityDefinition entityDefinition = event.getEntityDefinition();

        return AuditInfo.builder()
                .scope(runtimeAttribute.getScope()) // common
                .commandType(CommandType.of(event.getMutationType())) // ind
                .target(entityDefinition.getEntityClass()) // auto
                .tableName(entityDefinition.getTableName()) // auto
                .argument(argumentsParser.parse(event.getEntityDefinition(), event.getArgument())) // auto
                // TODO label 처리
                .label("") // ind
                .build();
    }
}
