package mpa.audit_old.repository.database;

import lombok.RequiredArgsConstructor;
import mpa.audit_old.config.holder.DataSourceAware;
import mpa.audit_old.repository.database.schema.*;
import mpa.audit_old.repository.database.sql.AuditSQL;
import mpa.audit_old.repository.database.sql.MetaDataSQL;
import mpa.audit_old.repository.database.sql.SQL;
import mpa.audit_old.repository.database.sql.parameter.Parameter;

import java.sql.*;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class DatabaseAccessRepository implements DataAccessRepository {

    private final DataSourceAware dataSourceAware;


    @Override
    public Data selectData(AuditSQL sql, Parameter parameter) {
        Data data = SchemaFactory.createData();

        executeQuery(sql, parameter, resultSet -> {
            try {
                ResultSetMetaData metaData = resultSet.getMetaData();
                Row row = SchemaFactory.createRow();
                ColumnImpl column;

                while (resultSet.next()) {
                    for (int i = 1; i <= metaData.getColumnCount(); i++) {

                        if (!sql.parseableColumn(resultSet, i)) {
                            continue;
                        }

                        column = sql.getColumn(resultSet, i);

                        if (column == null) {
                            continue;
                        }

                        row.addColumn(column);

                        if (column.isAdditional()) {
                            data.addAdditionalColumn(column.additionalName(), column);
                        }
                    }
                    data.addRow(row);
                }

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });

        return data;
    }

    @Override
    public MetaData selectMetaData(MetaDataSQL sql) {
        MetaData data = new MetaData();

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

                    metaTable.addColumn(MetaColumn.builder()
                            .name(columnName)
                            .comment(comment)
                            .build());
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });

        return data;
    }


    private void executeQuery(SQL sql, Consumer<ResultSet> resultSetBinder) {
        executeQuery(sql, null, resultSetBinder);
    }

    private void executeQuery(SQL sql, Parameter parameter, Consumer<ResultSet> resultSetBinder) {
        Connection connection = getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(sql.toString());
                ResultSet resultSet = sql.execute(statement, parameter);
        ) {
            resultSetBinder.accept(resultSet);

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