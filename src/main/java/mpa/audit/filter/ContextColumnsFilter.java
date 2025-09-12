package mpa.audit.filter;

import mpa.persistence.config.audit.TrackingStrategy;
import mpa.audit.repository.schema.Data;

import java.util.ArrayList;
import java.util.List;

public class ContextColumnsFilter implements ColumnsFilter {

    private final List<ColumnsFilter> filters = new ArrayList<>();


    public void addFilter(ColumnsFilter filter) {
        if (filter == null) {
            return;
        }
        this.filters.add(filter);
    }

    @Override
    public boolean supports(TrackingStrategy trackingStrategy) {
        return true;
    }

    @Override
    public void filter(TrackingStrategy trackingStrategy, Data originData, Data updatedData) {
        for (ColumnsFilter filter : filters) {
            if (filter.supports(trackingStrategy)) {
                filter.filter(trackingStrategy, originData, updatedData);
            }
        }
    }
}