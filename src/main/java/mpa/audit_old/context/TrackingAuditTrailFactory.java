package mpa.audit_old.context;

import lombok.RequiredArgsConstructor;
import mpa.audit_old.config.ScopedAuditConfiguration;
import mpa.audit_old.config.holder.AuditScopeAware;
import mpa.audit_old.config.scope.ScopeInfo;
import mpa.audit_old.config.strategy.TrackingStrategy;
import mpa.audit_old.context.filter.ColumnsFilter;

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