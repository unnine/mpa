package mpa.audit.transaction.event;

import mpa.audit.context.AuditTrail;

import java.util.List;

public interface AuditTrailListener {

    default void beforeCommit(List<AuditTrail> auditTrails) {}

    default void afterCommit(List<AuditTrail> auditTrails) {}

    default void manuallyCommit(List<AuditTrail> auditTrails) {}

}
