package mpa.audit.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
public class CompositeAuditEventListener implements AuditEventListener {

    private final Set<AuditEventListener> listeners = new HashSet<>();


    public void addListener(AuditEventListener listener) {
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
