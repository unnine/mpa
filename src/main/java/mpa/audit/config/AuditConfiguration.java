package mpa.audit.config;

import mpa.audit.config.strategy.TrackingStrategy;
import mpa.config.AuditConfigure;

public interface AuditConfiguration extends AuditConfigure {

    TrackingStrategy trackingStrategy();

}
