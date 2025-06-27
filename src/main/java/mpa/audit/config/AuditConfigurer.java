package mpa.audit.config;

import mpa.audit.config.strategy.TrackingStrategy;

public interface AuditConfigurer {

    void off();

    AuditConfigurer trackingStrategy(TrackingStrategy trackingStrategy);

}
