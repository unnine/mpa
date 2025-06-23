package mpa.audit_old.transaction.event;

import mpa.audit_old.AuditTrail;

import java.util.List;

public interface AuditEventPublisher {

    void publishCommitEvent(AuditCommitEvent event, List<AuditTrail> auditTrails);

}