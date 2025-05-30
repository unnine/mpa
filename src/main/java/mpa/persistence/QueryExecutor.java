package mpa.persistence;

import mpa.holder.DataSourceAware;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.awt.print.Pageable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Consumer;

public class QueryExecutor {

    private final DataSourceAware dataSourceAware;


    public QueryExecutor(DataSourceAware dataSourceAware) {
        this.dataSourceAware = dataSourceAware;
    }



    public <T> T executeQuery(String sql, Consumer<PreparedStatement> parameterBinder) {
        Connection connection = getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            parameterBinder.accept(statement);
            ResultSet resultSet = statement.executeQuery();


        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            releaseConnection(connection);
        }
    }

    public int executeUpdate(String sql, Consumer<PreparedStatement> parameterBinder) {
        Connection connection = getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(sql);
        ) {
            parameterBinder.accept(statement);
            return statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            releaseConnection(connection);
        }
    }

    private Connection getConnection() {
        return dataSourceAware.getConnection();
    }

    private void releaseConnection(Connection connection) {
        dataSourceAware.releaseConnection(connection);
    }
}
