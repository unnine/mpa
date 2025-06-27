package mpa.audit.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.strategy.TrackingStrategy;
import mpa.audit.context.filter.ColumnsFilter;

@RequiredArgsConstructor
public class TrackingAuditTrailFactory {

    private final TrackingStrategy trackingStrategy;


    public TrackingAuditTrailImpl create(Snapshot snapshot) {
        return new TrackingAuditTrailImpl(snapshot, columnFilter());
    }

    private ColumnsFilter columnFilter() {
        return trackingStrategy.getColumnsFilter();
    }
}