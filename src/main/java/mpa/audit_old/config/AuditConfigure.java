package mpa.audit_old.config;

import mpa.audit_old.config.strategy.JoinStrategy;
import mpa.audit_old.config.strategy.StringCaseConverter;
import mpa.audit_old.config.strategy.TrackingStrategy;
import mpa.audit_old.config.type.DatabaseType;

public interface AuditConfigure {

    ScopedAuditConfiguration trackingStrategy(TrackingStrategy trackingStrategy);

    ScopedAuditConfiguration stringCaseConverter(StringCaseConverter stringCaseConverter);

    ScopedAuditConfiguration databaseType(DatabaseType databaseType);

    ScopedAuditConfiguration joinStrategy(JoinStrategy joinStrategy);

}