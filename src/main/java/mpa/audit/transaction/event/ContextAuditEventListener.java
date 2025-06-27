package mpa.audit.transaction.event;

public interface ContextAuditEventListener extends AuditEventListener {

    void addListener(ScopeAuditEventListener listener);

}
