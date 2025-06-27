package mpa.audit.transaction.event;

import mpa.audit.context.AuditTrail;

import java.util.List;

public interface AuditEventPublisher {

    void publishCommitEvent(AuditCommitEvent event, List<AuditTrail> auditTrails);

}