package mpa.audit.repository.sql.join;

import lombok.RequiredArgsConstructor;
import mpa.audit.repository.sql.ColumnWriter;
import mpa.audit.repository.sql.QueryResultColumn;
import mpa.audit.repository.sql.QueryStructure;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.schema.MetaColumn;
import mpa.persistence.entity.schema.MetaTable;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

@RequiredArgsConstructor
public class ChangeValueJoinColumnWriter implements ColumnWriter {

    private static final String JOIN_REPLACE_COLUMN_NAME_PREFIX = "JCR__"; // JOIN_COLUMN

    private final EntityCache entityCache;


    @Override
    public void write(QueryStructure queryStructure, Class<?> entityClass, Join join) {
        Select select = join.getSelect();
        String columnName, alias;

        for (ChangeValueColumn column : select.getChangeValueColumns()) {
            columnName = join.getJoinTableAlias() + "." + column.getJoinColumName();

            alias = new StringBuilder()
                    .append(JOIN_REPLACE_COLUMN_NAME_PREFIX)
                    .append("$")
                    .append(getBaseTableName(entityClass))
                    .append("$")
                    .append(column.getBaseColumnName())
                    .append("$")
                    .append(getJoinTableName(join))
                    .append("$")
                    .append(column.getJoinColumName())
                    .toString();

            queryStructure.addSelectColumn(column.getBaseColumnName(), columnName, alias);
        }
    }

    private String getBaseTableName(Class<?> baseEntityClass) {
        EntityDefinition baseEntityDefinition = entityCache.getByEntity(baseEntityClass);
        return baseEntityDefinition.getTableName();
    }

    private String getJoinTableName(Join join) {
        EntityDefinition joinEntityDefinition = entityCache.getByEntity(join.getJoinEntityClass());
        return joinEntityDefinition.getTableName();
    }

    @Override
    public boolean supports(ResultSet resultSet, int columnIndex) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String columnLabel = metaData.getColumnLabel(columnIndex);
        return columnLabel.startsWith(JOIN_REPLACE_COLUMN_NAME_PREFIX);
    }

    @Override
    public QueryResultColumn parse(ResultSet resultSet, int columnIndex) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String columnLabel = metaData.getColumnLabel(columnIndex);
        String[] names = columnLabel.split("\\$");
        return makeJoinColumn(names, resultSet, columnIndex);
    }

    private QueryResultColumn makeJoinColumn(String[] names, ResultSet resultSet, int columnIndex) throws SQLException {
        String value = resultSet.getString(columnIndex);
        String baseTableName = names[1];
        String baseColumnName = names[2];
        String joinTableName = names[3];
        String joinColumnName = names[4];

        MetaTable joinMetaTable = getMetaTable(joinTableName);
        MetaColumn joinMetaColumn = joinMetaTable.getColumn(joinColumnName);
        String comment = joinMetaColumn.getComment();

        return QueryResultColumn.of(baseTableName, baseColumnName, value, comment);
    }

    private MetaTable getMetaTable(String tableName) {
        EntityDefinition entityDefinition = entityCache.getByTableName(tableName);
        return entityDefinition.getMetaTable();
    }

}
