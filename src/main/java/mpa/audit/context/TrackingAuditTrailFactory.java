package mpa.audit.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.ScopedAuditConfiguration;
import mpa.audit.config.holder.AuditScopeAware;
import mpa.audit.config.scope.ScopeInfo;
import mpa.audit.config.strategy.TrackingStrategy;
import mpa.audit.context.filter.ColumnsFilter;

@RequiredArgsConstructor
public class TrackingAuditTrailFactory {

    private final AuditScopeAware scopeAware;
    private final ScopedAuditConfiguration configuration;


    public TrackingAuditTrailImpl create(Snapshot snapshot) {
        ScopeInfo scope = ScopeInfo.of(scopeAware);
        ColumnsFilter columnFilter = getColumnFilter();
        return new TrackingAuditTrailImpl(scope, snapshot, columnFilter);
    }

    private ColumnsFilter getColumnFilter() {
        TrackingStrategy trackingStrategy = configuration.trackingStrategy();
        return trackingStrategy.getColumnsFilter();
    }
}