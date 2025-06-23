package mpa.audit_old.config.strategy;

import mpa.audit_old.context.filter.AllColumnsFilter;
import mpa.audit_old.context.filter.ColumnsFilter;
import mpa.audit_old.context.filter.OnlyChangedColumnsFilter;

public enum TrackingStrategy {
    ALL_COLUMNS(new AllColumnsFilter()),
    ONLY_CHANGED_COLUMNS(new OnlyChangedColumnsFilter()),
    ;

    private final ColumnsFilter columnsFilter;


    TrackingStrategy(ColumnsFilter columnsFilter) {
        this.columnsFilter = columnsFilter;
    }


    public ColumnsFilter getColumnsFilter() {
        return columnsFilter;
    }

}