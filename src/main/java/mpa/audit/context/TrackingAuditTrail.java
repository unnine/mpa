package mpa.audit.context;

import mpa.audit.AuditTrail;
import mpa.audit.repository.schema.Data;

public interface TrackingAuditTrail {

    Snapshot getSnapshot();

    boolean isUpdated();

    void markingToUpdated();

    void update(Data data);

    AuditTrail toAuditTrail();
}