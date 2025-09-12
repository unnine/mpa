package mpa.audit.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RequiredArgsConstructor
public class CompositeAuditEventHandler implements AuditEventHandler {

    private final Set<AuditEventHandler> handlers = new HashSet<>();


    public void addHandler(AuditEventHandler handler) {
        handlers.add(handler);
    }

    @Override
    public void beforeCommit(List<AuditTrail> auditTrails) {
        handlers.forEach(handler -> handler.beforeCommit(auditTrails));
    }

    @Override
    public void afterCommit(List<AuditTrail> auditTrails) {
        handlers.forEach(handler -> handler.afterCommit(auditTrails));
    }

    @Override
    public void manuallyCommit(List<AuditTrail> auditTrails) {
        handlers.forEach(handler -> handler.manuallyCommit(auditTrails));
    }
}
