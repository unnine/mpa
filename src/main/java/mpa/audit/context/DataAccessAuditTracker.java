package mpa.audit.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;
import mpa.audit.repository.DataAccessRepository;
import mpa.audit.repository.schema.Data;
import mpa.audit.repository.sql.AuditSQL;
import mpa.audit.repository.sql.cache.AuditSQLCache;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.Scope;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DataAccessAuditTracker implements AuditTracker {

    private final AuditTrailContext auditTrailContext;
    private final TrackingAuditTrailFactory trackingAuditTrailFactory;
    private final Scopable<AuditSQLCache> sqlCacheScopable;
    private final Scopable<DataAccessRepository> accessRepositoryScopable;


    @Override
    public boolean isTracking(Snapshot snapshot) {
        return auditTrailContext.exists(snapshot.getKey());
    }

    @Override
    public void beginTracking(Snapshot snapshot) {
        Data data = selectAuditData(snapshot);

        BasicTrackingAuditTrail auditTrail = trackingAuditTrailFactory.create(snapshot);
        auditTrail.setOriginData(data);

        auditTrailContext.add(snapshot.getKey(), auditTrail);
    }

    @Override
    public void endTracking() {
        auditTrailContext.clear();
    }

    @Override
    public void capture(Snapshot snapshot) {
        markAsUpdated(snapshot);
        refreshTrackingId(snapshot);
    }

    private void markAsUpdated(Snapshot snapshot) {
        TrackingAuditTrail auditTrail = auditTrailContext.get(snapshot.getKey());
        auditTrail.markingToUpdated();
    }

    private void refreshTrackingId(Snapshot snapshot) {
        TrackingAuditTrail trackingAuditTrail = auditTrailContext.get(snapshot.getKey());

        String oldKey = snapshot.getKey();
        snapshot.refreshKey();
        String newKey = snapshot.getKey();

        auditTrailContext.remove(oldKey);
        auditTrailContext.add(newKey, trackingAuditTrail);
    }

    @Override
    public List<AuditTrail> flush() {
        if (auditTrailContext.isEmpty()) {
            return Collections.emptyList();
        }
        List<TrackingAuditTrail> trackingAuditTrails = auditTrailContext.getAuditTrailsAll();

        for (TrackingAuditTrail auditTrail : trackingAuditTrails) {
            captureChanged(auditTrail);
        }

        List<AuditTrail> auditTrails = trackingAuditTrails.stream()
                .filter(TrackingAuditTrail::isUpdated)
                .map(TrackingAuditTrail::toAuditTrail)
                .collect(Collectors.toList());

        endTracking();

        return auditTrails;
    }

    private void captureChanged(TrackingAuditTrail auditTrail) {
        Snapshot snapshot = auditTrail.getSnapshot();
        Data data = selectAuditData(snapshot);
        auditTrail.update(data);
    }

    private Data selectAuditData(Snapshot snapshot) {
        AuditInfo auditInfo = snapshot.getAuditInfo();
        Scope scope = auditInfo.getScope();
        AuditSQL sql = sqlCacheScopable.getInstance(scope).getSQLByTableName(auditInfo.getTableName());
        return accessRepositoryScopable.getInstance(scope).selectData(sql, auditInfo.getArgument());
    }
}
