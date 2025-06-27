package mpa.audit.transaction.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.context.AuditTrail;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class CompositeAuditEventListener implements AuditEventListener {

    private final List<AuditEventListener> listeners = new ArrayList<>();


    public void addListener(ScopeAuditEventListener listener) {
        listeners.add(listener);
    }

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
