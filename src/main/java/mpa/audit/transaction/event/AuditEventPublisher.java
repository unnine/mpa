package mpa.audit.transaction.event;

import mpa.audit.AuditTrail;

import java.util.List;

public interface AuditEventPublisher {

    void publishCommitEvent(AuditCommitEvent event, List<AuditTrail> auditTrails);

}