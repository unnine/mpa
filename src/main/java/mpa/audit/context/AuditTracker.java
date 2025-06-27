package mpa.audit.context;

import java.util.List;

public interface AuditTracker {

    boolean isTracking(Snapshot snapshot);

    void beginTracking(Snapshot snapshot);

    void capture(Snapshot snapshot);

    void endTracking();

    List<AuditTrail> flush();

}
