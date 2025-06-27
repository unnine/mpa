package mpa.audit.transaction.event;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;

import java.util.List;

@RequiredArgsConstructor
public class ScopeAuditEventListener implements AuditEventListener {

    private final String scopeName;
    private final AuditTrailListener listener;


    public String getScopeName() {
        return scopeName;
    }

    @Override
    public void beforeCommit(List<AuditTrail> auditTrails) {
        listener.beforeCommit(auditTrails);
    }

    @Override
    public void afterCommit(List<AuditTrail> auditTrails) {
        listener.afterCommit(auditTrails);
    }

    @Override
    public void manuallyCommit(List<AuditTrail> auditTrails) {
        listener.manuallyCommit(auditTrails);
    }

}