package mpa.audit.event;

import mpa.audit.annotation.Audit;
import mpa.audit.annotation.AuditAnnotationInfo;
import mpa.audit.annotation.AuditAnnotations;
import mpa.audit.context.AuditTracker;
import mpa.audit.context.Snapshot;
import mpa.audit.repository.database.sql.parameter.QueryArgumentsParser;
import mpa.audit.transaction.AuditTransactionListener;
import mpa.audit.transaction.AuditTransactionManager;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.event.PersistenceMutationsEventListener;

import java.lang.reflect.Method;

public class AuditPersistenceMutationsEventListener implements PersistenceMutationsEventListener {

    private final EntityCache entityCache;
    private final AuditTracker auditTracker;
    private final AuditTransactionListener transactionListener;
    private final QueryArgumentsParser queryArgumentsParser;


    public AuditPersistenceMutationsEventListener(EntityCache entityCache, AuditTracker auditTracker, AuditTransactionListener transactionListener, QueryArgumentsParser queryArgumentsParser) {
        this.entityCache = entityCache;
        this.auditTracker = auditTracker;
        this.transactionListener = transactionListener;
        this.queryArgumentsParser = queryArgumentsParser;
    }


    @Override
    public boolean ignore(Method method, Object[] arguments) {
        return notRegisteredEntity(method);
    }

    @Override
    public void onBefore(Method method, Object[] arguments) {
        synchronizeTransaction();

        Snapshot snapshot = makeSnapshot(method, arguments);

        if (!auditTracker.isTracking(snapshot)) {
            auditTracker.beginTracking(snapshot);
        }
    }

    @Override
    public void onAfter(Method method, Object[] arguments, boolean mutated) {
        if (mutated) {
            Snapshot snapshot = makeSnapshot(method, arguments);
            auditTracker.capture(snapshot);
        }
    }

    @Override
    public void onCompletion(Method method, Object[] arguments) {
        auditTracker.endTracking();
        AuditTransactionManager.clear();
    }

    private boolean notRegisteredEntity(Method method) {
        AuditAnnotationInfo auditInfo = getAuditInfo(method);
        String tableName = auditInfo.getTableName();
        return !entityCache.existsByTableName(tableName);
    }

    private void synchronizeTransaction() {
        AuditTransactionManager.synchronizeTransaction(transactionListener);
    }

    private Snapshot makeSnapshot(Method method, Object[] arguments) {
        AuditAnnotationInfo auditInfo = getAuditInfo(method);
        String tableName = auditInfo.getTableName();
        EntityDefinition entityDefinition = entityCache.getByTableName(tableName);
        return Snapshot.ofTransaction(auditInfo, entityDefinition, queryArgumentsParser, arguments);
    }

    private AuditAnnotationInfo getAuditInfo(Method method) {
        Audit auditAnnotation = method.getAnnotation(AuditAnnotations.AUDIT);
        /**
         * TODO
         *  target -> 현재 파라미터의 엔티티
         *  commandType -> 현재 메서드의 이름
         *      - soft delete -> ...??
         *  label -> ...??
         */
        return new AuditAnnotationInfo(auditAnnotation.target(), auditAnnotation.label(), auditAnnotation.commandType());
    }
}
