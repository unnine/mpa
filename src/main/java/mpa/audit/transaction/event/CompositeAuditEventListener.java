package mpa.audit.transaction.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;

import java.util.List;

@RequiredArgsConstructor
public class CompositeAuditEventListener implements AuditEventListener {

    private final List<AuditEventListener> listeners;


    @Override
    public void beforeCommit(List<AuditTrail> auditTrails) {
        listeners.forEach(listener -> listener.beforeCommit(auditTrails));
    }

    @Override
    public void afterCommit(List<AuditTrail> auditTrails) {
        listeners.forEach(listener -> listener.afterCommit(auditTrails));
    }

    @Override
    public void manuallyCommit(List<AuditTrail> auditTrails) {
        listeners.forEach(listener -> listener.manuallyCommit(auditTrails));
    }
}
