package mpa.audit.repository.dataaccess;

import lombok.RequiredArgsConstructor;
import mpa.audit.repository.dataaccess.schema.ColumnImpl;
import mpa.audit.repository.dataaccess.schema.Data;
import mpa.audit.repository.dataaccess.schema.Row;
import mpa.audit.repository.dataaccess.schema.SchemaFactory;
import mpa.audit.repository.dataaccess.sql.AuditSQL;
import mpa.audit.repository.dataaccess.sql.argument.Argument;
import mpa.persistence.context.DataSourceAware;
import mpa.persistence.context.Scope;

import java.sql.*;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class AuditDataAccessRepository implements DataAccessRepository {

    private final Scope scope;


    private DataSourceAware dataSourceAware() {
        return scope.getDataSourceAware();
    }

    private void executeQuery(AuditSQL sql, Argument argument, Consumer<ResultSet> resultSetBinder) {
        Connection connection = dataSourceAware().getConnection();

        try (
                PreparedStatement statement = connection.prepareStatement(sql.toString());
                ResultSet resultSet = sql.execute(statement, argument);
        ) {
            resultSetBinder.accept(resultSet);

        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            dataSourceAware().releaseConnection(connection);
        }
    }

    @Override
    public Data selectData(AuditSQL sql, Argument argument) {
        Data data = SchemaFactory.createData();

        executeQuery(sql, argument, resultSet -> {
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
}