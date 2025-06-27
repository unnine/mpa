package mpa.persistence.context;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.persistence.dataaccess.DatabaseType;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.Connection;

@Getter
@Setter(AccessLevel.PACKAGE)
public class DataSourceAware {

    private String ref;
    private DataSource dataSource;
    private DatabaseType databaseType;
    private CaseConversionStrategy caseConversionStrategy;
    private boolean isDefault = false;


    public Connection getConnection() {
        return DataSourceUtils.getConnection(dataSource);
    }

    public void releaseConnection(Connection connection) {
        DataSourceUtils.releaseConnection(connection, dataSource);
    }


    public static DataSourceAware ofDefault(DataSource dataSource) {
        DataSourceAware dataSourceAware = new DataSourceAware();
        dataSourceAware.setRef("__$default$dataSource");
        dataSourceAware.setDataSource(dataSource);
        dataSourceAware.setDatabaseType(DatabaseType.ORACLE);
        dataSourceAware.setCaseConversionStrategy(CaseConversionStrategy.CAMEL_TO_UPPER_SNAKE);
        dataSourceAware.setDefault(true);
        return dataSourceAware;
    }

    public static DataSourceAware create() {
        DataSourceAware dataSourceAware = new DataSourceAware();
        dataSourceAware.setDatabaseType(DatabaseType.ORACLE);
        dataSourceAware.setCaseConversionStrategy(CaseConversionStrategy.CAMEL_TO_UPPER_SNAKE);
        dataSourceAware.setDefault(false);
        return dataSourceAware;
    }
}