package mpa.config;

import mpa.audit.config.strategy.TrackingStrategy;

public interface AuditConfigure {

    AuditConfigure trackingStrategy(TrackingStrategy trackingStrategy);

}
