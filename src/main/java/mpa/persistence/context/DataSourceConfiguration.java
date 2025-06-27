package mpa.persistence.context;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.persistence.config.DataSourceConfigurer;
import mpa.persistence.database.DatabaseType;
import mpa.util.StringUtil;

@Getter
@RequiredArgsConstructor
public class DataSourceConfiguration implements DataSourceConfigurer {

    private final ApplicationContextAware contextAware;

    private final DataSourceAware dataSourceAware;


    @Override
    public DataSourceConfigurer dataSourceRef(String dataSourceRef) {
        if (StringUtil.isNotEmpty(dataSourceRef)) {
            dataSourceAware.setRef(dataSourceRef);
            dataSourceAware.setDataSource(contextAware.getDataSourceByRefName(dataSourceRef));
        }
        return this;
    }

    @Override
    public DataSourceConfigurer databaseType(DatabaseType databaseType) {
        if (databaseType != null) {
            dataSourceAware.setDatabaseType(databaseType);
        }
        return this;
    }

    @Override
    public DataSourceConfigurer caseConversionStrategy(CaseConversionStrategy caseConversionStrategy) {
        if (caseConversionStrategy != null) {
            dataSourceAware.setCaseConversionStrategy(caseConversionStrategy);
        }
        return this;
    }
}
