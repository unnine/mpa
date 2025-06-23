package mpa.audit_old.transaction.event;

import mpa.audit_old.AuditTrail;
import mpa.audit_old.transaction.event.loader.AuditEventListenerLoader;
import org.springframework.util.CollectionUtils;

import java.util.List;

public class AuditEventPublisherImpl implements AuditEventPublisher {

    private final List<AuditEventListener> listeners;


    public AuditEventPublisherImpl(AuditEventListenerLoader eventListenerLoader) {
        listeners = eventListenerLoader.load();
    }

    @Override
    public void publishCommitEvent(AuditCommitEvent event, List<AuditTrail> auditTrails) {
        if (CollectionUtils.isEmpty(auditTrails)) {
            return;
        }
        if (event == AuditCommitEvent.BEFORE) {
            publishBeforeCommit(auditTrails);
            return;
        }
        if (event == AuditCommitEvent.AFTER) {
            publishAfterCommit(auditTrails);
            return;
        }
        if (event == AuditCommitEvent.MANUALLY) {
            publishManuallyCommit(auditTrails);
            return;
        }
    }

    private void publishBeforeCommit(List<AuditTrail> auditTrails) {
        listeners.forEach(listener -> listener.beforeCommit(auditTrails));
    }

    private void publishAfterCommit(List<AuditTrail> auditTrails) {
        listeners.forEach(listener -> listener.afterCommit(auditTrails));
    }

    private void publishManuallyCommit(List<AuditTrail> auditTrails) {
        listeners.forEach(listener -> listener.manuallyCommit(auditTrails));
    }
}