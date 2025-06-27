package mpa.audit.transaction.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;
import mpa.persistence.context.Scopable;

import java.util.List;

@RequiredArgsConstructor
public class ScopableAuditEventListener implements ContextAuditEventListener {

    private final Scopable<ContextAuditEventListener> proxy;


    private ContextAuditEventListener getInstance() {
        return proxy.getInstance();
    }

    @Override
    public void addListener(ScopeAuditEventListener listener) {
        ContextAuditEventListener instance = proxy.getInstanceByName(listener.getScopeName());
        instance.addListener(listener);
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
