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
public class AdditionalJoinColumnWriter implements ColumnWriter {

    private static final String JOIN_ADDITIONAL_COLUMN_NAME_PREFIX = "JCA__"; // JOIN_COLUMN
    private static final String ALIAS_PREFIX = "ALIAS_";
    private static final String JOIN_ADDITIONAL_COLUMN_ALIAS_PREFIX = ALIAS_PREFIX + JOIN_ADDITIONAL_COLUMN_NAME_PREFIX;

    private final EntityCache entityCache;


    @Override
    public void write(QueryStructure queryStructure, Class<?> entityClass, Join join) {
        Select select = join.getSelect();
        String alias;

        for (AdditionalColumn additionalColumn : select.getAdditionColumns()) {
            alias = getJoinTableName(join) + "$" + additionalColumn.getColumName();
            addJoinColumn(queryStructure, additionalColumn, join, alias);
            addAliasColumn(queryStructure, additionalColumn, alias);
        }
    }

    private void addJoinColumn(QueryStructure queryStructure, AdditionalColumn additionalColumn, Join join, String alias) {
        String columnName = join.getJoinTableAlias() + "." + additionalColumn.getColumName();
        String columnAlias = JOIN_ADDITIONAL_COLUMN_NAME_PREFIX + "$" + alias;
        queryStructure.addSelectColumn(additionalColumn.getColumName(), columnName, columnAlias);
    }

    private void addAliasColumn(QueryStructure queryStructure, AdditionalColumn additionalColumn, String alias) {
        String columnName = "'" + additionalColumn.getAlias() + "'";
        String columnAlias = JOIN_ADDITIONAL_COLUMN_ALIAS_PREFIX + "$" + alias;
        queryStructure.addSelectColumn(additionalColumn.getColumName() + "$alias", columnName, columnAlias);
    }

    private String getJoinTableName(Join join) {
        EntityDefinition joinEntityDefinition = entityCache.getByEntity(join.getJoinEntityClass());
        return joinEntityDefinition.getTableName();
    }

    @Override
    public boolean supports(ResultSet resultSet, int columnIndex) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String columnLabel = metaData.getColumnLabel(columnIndex);
        return isAdditionalColumn(columnLabel) || isAdditionalAliasColumn(columnLabel);
    }

    private boolean isAdditionalColumn(String columnLabel) {
        return columnLabel.startsWith(JOIN_ADDITIONAL_COLUMN_NAME_PREFIX);
    }

    private boolean isAdditionalAliasColumn(String columnLabel) {
        return columnLabel.startsWith(JOIN_ADDITIONAL_COLUMN_ALIAS_PREFIX);
    }

    @Override
    public QueryResultColumn parse(ResultSet resultSet, int columnIndex) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String columnLabel = metaData.getColumnLabel(columnIndex);

        if (isAdditionalAliasColumn(columnLabel)) {
            return QueryResultColumn.empty();
        }

        String[] names = columnLabel.split("\\$");
        String alias = resultSet.getString(ALIAS_PREFIX + columnLabel);

        return makeJoinColumn(names, resultSet, columnIndex, alias);
    }

    private QueryResultColumn makeJoinColumn(String[] names, ResultSet resultSet, int columnIndex, String alias) throws SQLException {
        String value = resultSet.getString(columnIndex);
        String joinTableName = names[1];
        String joinColumnName = names[2];

        MetaTable joinMetaTable = getMetaTable(joinTableName);
        MetaColumn joinMetaColumn = joinMetaTable.getColumn(joinColumnName);
        String comment = joinMetaColumn.getComment();

        return QueryResultColumn.ofAdditional(joinTableName, alias, value, comment);
    }

    private MetaTable getMetaTable(String tableName) {
        EntityDefinition entityDefinition = entityCache.getByTableName(tableName);
        return entityDefinition.getMetaTable();
    }

}
