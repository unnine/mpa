package mpa.audit_old.config.holder;

import org.springframework.jdbc.datasource.DataSourceUtils;

import javax.sql.DataSource;
import java.sql.Connection;

public final class DataSourceAware {

    private final DataSource dataSource;


    public DataSourceAware(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public Connection getConnection() {
        return DataSourceUtils.getConnection(dataSource);
    }

    public void releaseConnection(Connection connection) {
        DataSourceUtils.releaseConnection(connection, dataSource);
    }
}