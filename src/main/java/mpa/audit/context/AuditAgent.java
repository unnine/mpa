package mpa.audit.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.AuditInfo;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;

@RequiredArgsConstructor
public class AuditAgent {

    private final EntityCache entityCache;
    private final AuditTracker auditTracker;


    public void beginTracking(AuditInfo auditInfo) {
        Snapshot snapshot = makeSnapshot(auditInfo);

        if (!auditTracker.isTracking(snapshot)) {
            auditTracker.beginTracking(snapshot);
        }
    }

    public void capture(AuditInfo auditInfo) {
        Snapshot snapshot = makeSnapshot(auditInfo);
        auditTracker.capture(snapshot);
    }

    public void endTracking() {
        auditTracker.endTracking();
    }

    private Snapshot makeSnapshot(AuditInfo auditInfo) {
        EntityDefinition entityDefinition = entityCache.getByTableName(auditInfo.getTableName());
        return Snapshot.ofTransaction(auditInfo, entityDefinition);
    }

}
