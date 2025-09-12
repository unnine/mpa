package mpa.audit.repository.sql;

import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.AuditIgnore;
import mpa.persistence.config.CaseConversionStrategy;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.schema.MetaColumn;
import mpa.persistence.entity.schema.MetaTable;

import java.lang.reflect.Field;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

@RequiredArgsConstructor
public class BaseQueryWriter implements QueryWriter {

    private static final String ORIGIN_COLUMN_NAME_PREFIX = "OC__"; // ORIGIN_COLUMN

    private final CaseConversionStrategy stringCaseConverter;
    private final EntityCache entityCache;


    @Override
    public void write(QueryStructure queryStructure, Class<?> entityClass) {
        if (!entityCache.existsByEntity(entityClass)) {
            return;
        }

        MetaTable baseTable = getMetaTable(entityClass);
        Field[] fields = entityClass.getDeclaredFields();
        String columnName, alias;

        for (Field f : fields) {
            if (isIgnore(f)) {
                continue;
            }

            columnName = stringCaseConverter.convert(f.getName());

            if (!baseTable.existsColumn(columnName)) {
                continue;
            }

            alias = new StringBuilder()
                    .append(ORIGIN_COLUMN_NAME_PREFIX)
                    .append("$")
                    .append(baseTable.getName())
                    .append("$")
                    .append(columnName)
                    .toString();

            queryStructure.addSelectColumn(columnName, baseTable.addAlias(columnName), alias);
        }

        queryStructure.changeFromClause(String.format(" FROM %s %s ", baseTable.getName(), baseTable.getAlias()));
    }

    private boolean isIgnore(Field f) {
        if (f.getType() == Byte.class) {
            return true;
        }
        if (f.getType() == Blob.class) {
            return true;
        }
        if (f.isAnnotationPresent(AuditIgnore.class)) {
            return true;
        }
        return false;
    }

    private MetaTable getMetaTable(Class<?> entityClass) {
        EntityDefinition entityDefinition = entityCache.getByEntity(entityClass);
        return entityDefinition.getMetaTable();
    }

    @Override
    public boolean supports(ResultSet resultSet, int columnIndex) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String columnLabel = metaData.getColumnLabel(columnIndex);
        return columnLabel.startsWith(ORIGIN_COLUMN_NAME_PREFIX);
    }

    @Override
    public QueryResultColumn parse(ResultSet resultSet, int columnIndex) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String value = resultSet.getString(columnIndex);
        String columnLabel = metaData.getColumnLabel(columnIndex);
        String[] names = columnLabel.split("\\$");
        String tableName = names[1];
        String columnName = names[2];

        MetaTable metaTable = getMetaTable(tableName);
        MetaColumn metaColumn = metaTable.getColumn(columnName);
        String comment = metaColumn.getComment();

        return QueryResultColumn.of(tableName, columnName, value, comment);
    }

    private MetaTable getMetaTable(String tableName) {
        EntityDefinition entityDefinition = entityCache.getByTableName(tableName);
        return entityDefinition.getMetaTable();
    }

}