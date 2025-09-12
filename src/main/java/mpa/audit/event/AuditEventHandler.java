package mpa.audit.event;

import mpa.audit.AuditTrail;

import java.util.List;

public interface AuditEventHandler {

    default void beforeCommit(List<AuditTrail> auditTrails) {}

    default void afterCommit(List<AuditTrail> auditTrails) {}

    default void manuallyCommit(List<AuditTrail> auditTrails) {}

}