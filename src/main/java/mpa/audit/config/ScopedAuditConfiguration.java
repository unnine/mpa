package mpa.audit.config;

import mpa.audit.config.strategy.JoinStrategy;
import mpa.audit.config.strategy.StringCaseConverter;
import mpa.audit.config.strategy.TrackingStrategy;
import mpa.audit.config.type.DatabaseType;

public interface ScopedAuditConfiguration extends AuditConfigure {

    TrackingStrategy trackingStrategy();

    StringCaseConverter stringCaseConverter();

    DatabaseType databaseType();

    JoinStrategy joinStrategy();

}
