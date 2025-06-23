package mpa.audit_old.context;

import mpa.audit_old.AuditTrail;

import java.util.List;

public interface AuditTracker {

    boolean isTracking(Snapshot snapshot);

    void capture(Snapshot snapshot);

    void endTracking();

    List<AuditTrail> flush();

}
