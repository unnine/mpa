package mpa.audit.filter;

import mpa.audit.config.strategy.TrackingStrategy;
import mpa.audit.repository.schema.Data;

public interface ColumnsFilter {

    boolean supports(TrackingStrategy trackingStrategy);

    void filter(TrackingStrategy trackingStrategy, Data originData, Data updatedData);

}