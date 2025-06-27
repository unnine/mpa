package mpa.persistence.entity;

import lombok.RequiredArgsConstructor;
import mpa.persistence.dataaccess.DatabaseType;
import mpa.persistence.dataaccess.MetaDataSQL;
import mpa.persistence.entity.schema.*;
import mpa.persistence.context.DataSourceAware;
import mpa.persistence.context.Scope;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class EntityMetaDataRepositoryImpl implements EntityMetaDataRepository {

    private final Scope scope;


    private DataSourceAware dataSourceAware() {
        return scope.getDataSourceAware();
    }

    private void executeQuery(MetaDataSQL sql, Consumer<ResultSet> resultSetBinder) {
        Connection connection = dataSourceAware().getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(sql.toString());
                ResultSet resultSet = sql.execute(statement);
        ) {
            resultSetBinder.accept(resultSet);

        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            dataSourceAware().releaseConnection(connection);
        }
    }

    @Override
    public MetaData selectMetaData() {
        DatabaseType databaseType = dataSourceAware().getDatabaseType();
        MetaDataSQL sql = databaseType.getMetaDataSQL();
        MetaData data = new MetaDataImpl();

        executeQuery(sql, resultSet -> {
            try {
                String tableName, columnName, comment;
                MetaTable metaTable;

                while (resultSet.next()) {
                    tableName = resultSet.getString("TABLE_NAME");
                    columnName = resultSet.getString("COLUMN_NAME");
                    comment = resultSet.getString("COMMENTS");

                    if (data.existsTable(tableName)) {
                        metaTable = data.getTable(tableName);

                    } else {
                        metaTable = new MetaTableImpl(tableName);
                        data.addTable(metaTable);
                    }

                    metaTable.addColumn(new MetaColumnImpl(columnName, comment));
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });

        return data;
    }
}
