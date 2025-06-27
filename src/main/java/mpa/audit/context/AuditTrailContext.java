package mpa.audit.context;

import java.util.List;

public interface AuditTrailContext {

    void add(String key, TrackingAuditTrail auditTrail);

    void remove(String key);

    TrackingAuditTrail get(String key);

    List<TrackingAuditTrail> getAuditTrailsAll();

    boolean isEmpty();

    boolean exists(String key);

    void clear();
}