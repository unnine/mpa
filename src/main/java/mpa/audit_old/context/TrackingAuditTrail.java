package mpa.audit_old.context;

import mpa.audit_old.AuditTrail;
import mpa.audit_old.repository.database.schema.Data;

public interface TrackingAuditTrail {

    Snapshot getSnapshot();

    boolean isUpdated();

    void markAsUpdated();

    void update(Data data);

    AuditTrail toAuditTrail();
}