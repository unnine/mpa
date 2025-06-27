package mpa.audit.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.filter.ColumnsFilter;

@RequiredArgsConstructor
public class TrackingAuditTrailFactory {

    private final ColumnsFilter columnsFilter;


    public TrackingAuditTrailImpl create(Snapshot snapshot) {
        return new TrackingAuditTrailImpl(snapshot, columnsFilter);
    }
}