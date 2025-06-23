package mpa.audit_old.config;

import mpa.audit_old.config.strategy.JoinStrategy;
import mpa.audit_old.config.strategy.StringCaseConverter;
import mpa.audit_old.config.strategy.TrackingStrategy;
import mpa.audit_old.config.type.DatabaseType;

public class DefaultScopedAuditConfiguration implements ScopedAuditConfiguration {

    private TrackingStrategy trackingStrategy = TrackingStrategy.ALL_COLUMNS;
    private StringCaseConverter stringCaseConverter = StringCaseConverter.CAMEL_TO_UPPER_SNAKE;
    private DatabaseType databaseType = DatabaseType.ORACLE;
    private JoinStrategy joinStrategy = new JoinStrategy();


    @Override
    public ScopedAuditConfiguration trackingStrategy(TrackingStrategy trackingStrategy) {
        if (trackingStrategy != null) {
            this.trackingStrategy = trackingStrategy;
        }
        return this;
    }

    @Override
    public TrackingStrategy trackingStrategy() {
        return trackingStrategy;
    }

    @Override
    public ScopedAuditConfiguration stringCaseConverter(StringCaseConverter stringCaseConverter) {
        if (stringCaseConverter != null) {
            this.stringCaseConverter = stringCaseConverter;
        }
        return this;
    }

    @Override
    public StringCaseConverter stringCaseConverter() {
        return stringCaseConverter;
    }

    @Override
    public ScopedAuditConfiguration databaseType(DatabaseType databaseType) {
        if (databaseType != null) {
            this.databaseType = databaseType;
        }
        return this;
    }

    @Override
    public DatabaseType databaseType() {
        return databaseType;
    }

    @Override
    public ScopedAuditConfiguration joinStrategy(JoinStrategy joinStrategy) {
        if (joinStrategy != null) {
            joinStrategy.validate();
            this.joinStrategy = joinStrategy;
        }
        return this;
    }

    @Override
    public JoinStrategy joinStrategy() {
        return joinStrategy;
    }
}
