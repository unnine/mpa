package mpa.audit.transaction.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;
import mpa.persistence.holder.Scopable;

import java.util.List;

@RequiredArgsConstructor
public class ScopableAuditEventListener implements AuditEventListener {

    private final Scopable<AuditEventListener> proxy;


    private AuditEventListener getInstance() {
        return proxy.getInstance();
    }

    @Override
    public void beforeCommit(List<AuditTrail> auditTrails) {
        getInstance().beforeCommit(auditTrails);
    }

    @Override
    public void afterCommit(List<AuditTrail> auditTrails) {
        getInstance().afterCommit(auditTrails);
    }

    @Override
    public void manuallyCommit(List<AuditTrail> auditTrails) {
        getInstance().manuallyCommit(auditTrails);
    }
}
