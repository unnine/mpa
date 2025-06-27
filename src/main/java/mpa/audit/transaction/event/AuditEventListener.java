package mpa.audit.transaction.event;

import mpa.audit.AuditTrail;

import java.util.List;

public interface AuditEventListener {

    void beforeCommit(List<AuditTrail> auditTrails);

    void afterCommit(List<AuditTrail> auditTrails);

    void manuallyCommit(List<AuditTrail> auditTrails);

}