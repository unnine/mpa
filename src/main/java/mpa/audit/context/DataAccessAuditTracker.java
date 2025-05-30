package mpa.audit.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.AuditTrail;
import mpa.audit.repository.database.DataAccessRepository;
import mpa.audit.repository.database.schema.Data;
import mpa.entity.EntityDefinition;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class DataAccessAuditTracker implements AuditTracker {

    private final AuditTrailContext auditTrailContext;
    private final DataAccessRepository dataAccessRepository;
    private final TrackingAuditTrailFactory trackingAuditTrailFactory;


    @Override
    public boolean isTracking(Snapshot snapshot) {
        return auditTrailContext.exists(snapshot.getKey());
    }

    @Override
    public void endTracking() {
        auditTrailContext.clear();
    }

    @Override
    public void capture(Snapshot snapshot) {
        if (isTracking(snapshot)) {
            markAsUpdated(snapshot);
            refreshTrackingId(snapshot);
            return;
        }
        captureOrigin(snapshot);
    }

    @Override
    public List<AuditTrail> flush() {
        List<TrackingAuditTrail> auditTrails = auditTrailContext.getAuditTrailsAll();

        for (TrackingAuditTrail auditTrail : auditTrails) {
            captureChanged(auditTrail);
        }

        endTracking();

        return auditTrails.stream()
                .filter(TrackingAuditTrail::isUpdated)
                .map(TrackingAuditTrail::toAuditTrail)
                .collect(Collectors.toList());

    }

    private void captureOrigin(Snapshot snapshot) {
        Data data = selectAuditData(snapshot);

        TrackingAuditTrailImpl auditTrail = trackingAuditTrailFactory.create(snapshot);
        auditTrail.setOriginData(data);

        auditTrailContext.add(snapshot.getKey(), auditTrail);
    }

    private void captureChanged(TrackingAuditTrail auditTrail) {
        Snapshot snapshot = auditTrail.getSnapshot();
        Data data = selectAuditData(snapshot);
        auditTrail.update(data);
    }

    private void markAsUpdated(Snapshot snapshot) {
        TrackingAuditTrail auditTrail = auditTrailContext.get(snapshot.getKey());
        auditTrail.markAsUpdated();
    }

    private void refreshTrackingId(Snapshot snapshot) {
        TrackingAuditTrail trackingAuditTrail = auditTrailContext.get(snapshot.getKey());

        String oldKey = snapshot.getKey();
        snapshot.refreshKey();
        String newKey = snapshot.getKey();

        auditTrailContext.remove(oldKey);
        auditTrailContext.add(newKey, trackingAuditTrail);
    }

    private Data selectAuditData(Snapshot snapshot) {
        EntityDefinition entityDefinition = snapshot.getEntityDefinition();
        return dataAccessRepository.selectData(entityDefinition.getAuditSQL(), snapshot.getParameter());
    }
}
