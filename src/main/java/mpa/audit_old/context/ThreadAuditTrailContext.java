package mpa.audit_old.context;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ThreadAuditTrailContext implements AuditTrailContext {

    private static final ThreadLocal<LinkedHashMap<String, TrackingAuditTrail>> trackingAudits = new ThreadLocal<>();


    @Override
    public void add(String key, TrackingAuditTrail auditTrail) {
        if (trackingAudits.get() == null) {
            initRecord();
        }
        trackingAudits.get().put(key, auditTrail);
    }

    @Override
    public void remove(String key) {
        if (trackingAudits.get() == null) {
            return;
        }
        trackingAudits.get().remove(key);
    }

    @Override
    public TrackingAuditTrail get(String key) {
        if (!exists(key)) {
            return null;
        }
        return trackingAudits.get().get(key);
    }

    @Override
    public List<TrackingAuditTrail> getAuditTrailsAll() {
        return new ArrayList<>(trackingAudits.get().values());
    }

    @Override
    public boolean exists(String key) {
        LinkedHashMap<String, TrackingAuditTrail> audit = trackingAudits.get();
        if (audit == null) {
            return false;
        }
        return audit.containsKey(key);
    }

    @Override
    public void clear() {
        trackingAudits.remove();
    }

    private void initRecord() {
        trackingAudits.set(new LinkedHashMap<>());
    }
}