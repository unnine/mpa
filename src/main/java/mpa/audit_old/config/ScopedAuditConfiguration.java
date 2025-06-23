package mpa.audit_old.config;

import mpa.audit_old.config.strategy.JoinStrategy;
import mpa.audit_old.config.strategy.StringCaseConverter;
import mpa.audit_old.config.strategy.TrackingStrategy;
import mpa.audit_old.config.type.DatabaseType;

public interface ScopedAuditConfiguration extends AuditConfigure {

    TrackingStrategy trackingStrategy();

    StringCaseConverter stringCaseConverter();

    DatabaseType databaseType();

    JoinStrategy joinStrategy();

}
