package mpa.audit.event;

import lombok.Getter;
import mpa.audit.AuditTrail;
import mpa.persistence.context.Scope;

import java.util.List;
import java.util.Objects;

public class ScopeAuditEventHandler implements AuditEventHandler {

    @Getter
    private final Scope scope;
    private final AuditTrailListener listener;


    public ScopeAuditEventHandler(Scope scope, AuditTrailListener listener) {
        Objects.requireNonNull(scope);
        Objects.requireNonNull(listener);

        this.scope = scope;
        this.listener = listener;
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