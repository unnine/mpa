package mpa.audit.context;

import mpa.audit.repository.schema.Data;

public interface TrackingAuditTrail {

    Snapshot getSnapshot();

    boolean isUpdated();

    void markAsUpdated();

    void update(Data data);

    AuditTrail toAuditTrail();
}