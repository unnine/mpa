package mpa.audit.filter;

import mpa.audit.config.strategy.TrackingStrategy;
import mpa.audit.repository.schema.Data;

public class AllColumnsFilter implements ColumnsFilter {

    @Override
    public boolean supports(TrackingStrategy trackingStrategy) {
        return trackingStrategy == TrackingStrategy.ALL_COLUMNS;
    }

    @Override
    public void filter(TrackingStrategy trackingStrategy, Data originData, Data updatedData) {

    }
}
