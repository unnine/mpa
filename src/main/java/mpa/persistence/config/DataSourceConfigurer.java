package mpa.persistence.config;

import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.persistence.database.DatabaseType;

public interface DataSourceConfigurer {

    DataSourceConfigurer dataSourceRef(String dataSourceRef);

    DataSourceConfigurer databaseType(DatabaseType databaseType);

    DataSourceConfigurer caseConversionStrategy(CaseConversionStrategy caseConversionStrategy);

}
