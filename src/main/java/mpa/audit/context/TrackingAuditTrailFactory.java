package mpa.audit.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.filter.ColumnsFilter;

@RequiredArgsConstructor
public class TrackingAuditTrailFactory {

    private final ColumnsFilter columnsFilter;


    public BasicTrackingAuditTrail create(Snapshot snapshot) {
        return new BasicTrackingAuditTrail(snapshot, columnsFilter);
    }
}