package mpa.audit.context;

import mpa.audit.AuditTrail;
import mpa.audit.repository.dataaccess.schema.Data;

public interface TrackingAuditTrail {

    Snapshot getSnapshot();

    boolean isUpdated();

    void markAsUpdated();

    void update(Data data);

    AuditTrail toAuditTrail();
}