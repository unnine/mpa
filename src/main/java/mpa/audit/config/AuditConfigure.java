package mpa.audit.config;

import mpa.audit.config.strategy.JoinStrategy;
import mpa.audit.config.strategy.StringCaseConverter;
import mpa.audit.config.strategy.TrackingStrategy;
import mpa.audit.config.type.DatabaseType;

public interface AuditConfigure {

    ScopedAuditConfiguration trackingStrategy(TrackingStrategy trackingStrategy);

    ScopedAuditConfiguration stringCaseConverter(StringCaseConverter stringCaseConverter);

    ScopedAuditConfiguration databaseType(DatabaseType databaseType);

    ScopedAuditConfiguration joinStrategy(JoinStrategy joinStrategy);

}