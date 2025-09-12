package mpa.persistence.context;

import lombok.Getter;
import lombok.Setter;
import mpa.persistence.config.CaseConversionStrategy;
import mpa.persistence.database.DatabaseType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Objects;

@Getter
public class DataSourceAware {

    @Setter
    private SqlSessionFactory sqlSessionFactory;

    private DataSource dataSource;

    private DatabaseType databaseType;

    @Setter
    private CaseConversionStrategy caseConversionStrategy;


    public Connection getConnection() {
        return DataSourceUtils.getConnection(dataSource);
    }

    public void releaseConnection(Connection connection) {
        DataSourceUtils.releaseConnection(connection, dataSource);
    }


    public static DataSourceAware ofDefault(SqlSessionFactory sqlSessionFactory) {
        DataSourceAware dataSourceAware = new DataSourceAware();
        dataSourceAware.setSqlSessionFactory(sqlSessionFactory);
        dataSourceAware.setCaseConversionStrategy(CaseConversionStrategy.CAMEL_TO_UPPER_SNAKE);
        return dataSourceAware;
    }

    public static DataSourceAware create() {
        DataSourceAware dataSourceAware = new DataSourceAware();
        dataSourceAware.setCaseConversionStrategy(CaseConversionStrategy.CAMEL_TO_UPPER_SNAKE);
        return dataSourceAware;
    }

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        DataSource dataSource = sqlSessionFactory.getConfiguration().getEnvironment().getDataSource();

        Objects.requireNonNull(sqlSessionFactory);
        Objects.requireNonNull(dataSource);

        this.sqlSessionFactory = sqlSessionFactory;
        this.dataSource = dataSource;
        this.databaseType = getType(dataSource);
    }

    private DatabaseType getType(DataSource dataSource) {
        try {
            DatabaseMetaData metaData = dataSource.getConnection().getMetaData();
            String driverName = metaData.getDriverName();
            return DatabaseType.getByDriverName(driverName);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}