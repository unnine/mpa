package mpa.audit.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.AuditInfo;
import mpa.audit.config.type.CommandType;
import mpa.audit.context.AuditAgent;
import mpa.audit.context.AuditTracker;
import mpa.audit.holder.AuditScope;
import mpa.audit.repository.dataaccess.sql.argument.MutationArgumentsParser;
import mpa.audit.transaction.AuditTransactionListener;
import mpa.audit.transaction.AuditTransactionSynchronizationManager;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.event.MutationEvent;
import mpa.persistence.event.PersistenceMutationsEventListener;

import java.util.Optional;

@RequiredArgsConstructor
public class AuditPersistenceMutationsEventListener implements PersistenceMutationsEventListener {

    private final ThreadLocal<AuditAgent> threadAgent = new ThreadLocal<>();

    private final EntityCache entityCache;
    private final AuditTracker auditTracker;
    private final MutationArgumentsParser argumentsParser;
    private final AuditTransactionListener transactionListener;


    @Override
    public boolean ignore(MutationEvent event) {
        return notRegisteredEntity(event);
    }

    private boolean notRegisteredEntity(MutationEvent event) {
        EntityDefinition entityDefinition = event.getEntityDefinition();
        String tableName = entityDefinition.getTableName();
        return !entityCache.existsByTableName(tableName);
    }

    @Override
    public void onBefore(MutationEvent event) {
        synchronizeTransaction();

        threadAgent.set(new AuditAgent(entityCache, auditTracker));

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
    public void onCompletion(MutationEvent event) {
        getAgent().ifPresent(AuditAgent::endTracking);
        AuditTransactionSynchronizationManager.releaseResources();
    }

    private void synchronizeTransaction() {
        AuditTransactionSynchronizationManager.synchronizeTransaction(transactionListener);
    }

    private Optional<AuditAgent> getAgent() {
        return Optional.ofNullable(threadAgent.get());
    }

    private AuditInfo makeAuditInfo(MutationEvent event) {
        EntityDefinition entityDefinition = event.getEntityDefinition();

        return AuditInfo.builder()
                .scope(new AuditScope(event.getScope(), null))
                .commandType(CommandType.of(event.getMutationType()))
                .target(entityDefinition.getEntityClass())
                .tableName(entityDefinition.getTableName())
                .argument(argumentsParser.parse(event.getArgument()))
                // TODO label 처리
                .label("")
                .build();
    }
}
