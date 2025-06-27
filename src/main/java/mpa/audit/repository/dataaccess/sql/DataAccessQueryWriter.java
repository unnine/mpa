package mpa.audit.repository.dataaccess.sql;

import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.AuditAnnotations;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.audit.repository.dataaccess.schema.Column;
import mpa.audit.repository.dataaccess.schema.Comment;
import mpa.audit.repository.dataaccess.schema.SchemaFactory;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.schema.MetaColumn;
import mpa.persistence.entity.schema.MetaTable;
import mpa.util.Log;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@RequiredArgsConstructor
public class DataAccessQueryWriter implements QueryWriter {

    private static final String ORIGIN_COLUMN_NAME_PREFIX = "OC__"; // ORIGIN_COLUMN

    private final List<QueryWriter> writers = new ArrayList<>();

    private final CaseConversionStrategy stringCaseConverter;
    private final EntityCache entityCache;


    public void addWriter(QueryWriter writer) {
        this.writers.add(writer);
    }

    @Override
    public void write(QueryStructure queryStructure, Class<?> entityClass) {
        writeToOrigin(queryStructure, entityClass);
        writeToAddition(queryStructure, entityClass);
    }

    private void writeToOrigin(QueryStructure queryStructure, Class<?> entityClass) {
        if (!entityCache.existsByEntity(entityClass)) {
            return;
        }

        MetaTable metaTable = getMetaTable(entityClass);
        String alias = metaTable.getAlias();
        Field[] fields = entityClass.getDeclaredFields();

        StringJoiner newSelectClause = new StringJoiner(", ");
        String columnName;

        for (Field f : fields) {
            if (isIgnore(f)) {
                continue;
            }

            columnName = stringCaseConverter.convert(f.getName());

            if (notExistsColumn(metaTable, columnName)) {
                continue;
            }

            newSelectClause.add(alias + "." + columnName + " AS " + toOriginColumnAlias(metaTable.getName(), columnName));
        }

        queryStructure.changeSelectClause(" SELECT " + newSelectClause);
        queryStructure.changeFromClause(String.format(" FROM %s %s ", metaTable.getName(), alias));
    }

    private void writeToAddition(QueryStructure queryStructure, Class<?> entityClass) {
        for (QueryWriter writer : writers) {
            writer.write(queryStructure, entityClass);
        }
    }

    private boolean isIgnore(Field f) {
        return f.isAnnotationPresent(AuditAnnotations.AUDIT_IGNORE);
    }

    private boolean notExistsColumn(MetaTable metaTable, String columnName) {
        return !metaTable.existsColumn(columnName);
    }

    private MetaTable getMetaTable(Class<?> entityClass) {
        EntityDefinition entityDefinition = entityCache.getByEntity(entityClass);
        return entityDefinition.getMetaTable();
    }

    private MetaTable getMetaTable(String tableName) {
        EntityDefinition entityDefinition = entityCache.getByTableName(tableName);
        return entityDefinition.getMetaTable();
    }

    private String toOriginColumnAlias(String tableName, String columnName) {
        return ORIGIN_COLUMN_NAME_PREFIX + "$" + tableName + "$" + columnName;
    }


    @Override
    public boolean supports(ResultSet resultSet, int columnIndex) throws SQLException {
        if (isOriginColumn(resultSet, columnIndex)) {
            return true;
        }
        QueryWriter additionalQueryWriter = findSupportedAdditionalQueryWriter(resultSet, columnIndex);
        if (additionalQueryWriter != null) {
            return true;
        }
        return false;
    }

    @Override
    public QueryResultColumn parse(ResultSet resultSet, int columnIndex) throws SQLException {
        if (isOriginColumn(resultSet, columnIndex)) {
            return parseToOrigin(resultSet, columnIndex);
        }
        QueryWriter additionalQueryWriter = findSupportedAdditionalQueryWriter(resultSet, columnIndex);
        if (additionalQueryWriter != null) {
            return parseToAdditional(additionalQueryWriter, resultSet, columnIndex);
        }
        throw new SQLException(Log.format("exists invalid column. not matched query writer."));
    }

    private boolean isOriginColumn(ResultSet resultSet, int columnIndex) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String columnLabel = metaData.getColumnLabel(columnIndex);
        return columnLabel.startsWith(ORIGIN_COLUMN_NAME_PREFIX);
    }

    private QueryResultColumn parseToOrigin(ResultSet resultSet, int columnIndex) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String value = resultSet.getString(columnIndex);
        String columnLabel = metaData.getColumnLabel(columnIndex);
        String[] names = columnLabel.split("\\$");
        String tableName = names[1];
        String columnName = names[2];

        MetaTable metaTable = getMetaTable(tableName);
        MetaColumn metaColumn = metaTable.getColumn(columnName);

        QueryResultColumn resultColumn = new QueryResultColumn();
        resultColumn.setSourceTableName(tableName);
        resultColumn.setSourceColumName(columnName);
        resultColumn.setTableName(tableName);
        resultColumn.setName(columnName);
        resultColumn.setAdditionalName(columnName);
        resultColumn.setValue(value);
        resultColumn.setComment(metaColumn.getComment());

        return resultColumn;
    }

    private QueryWriter findSupportedAdditionalQueryWriter(ResultSet resultSet, int columnIndex) throws SQLException {
        for (QueryWriter writer : writers) {
            if (writer.supports(resultSet, columnIndex)) {
                return writer;
            }
        }
        return null;
    }

    private QueryResultColumn parseToAdditional(QueryWriter writer, ResultSet resultSet, int columnIndex) throws SQLException {
        QueryResultColumn resultColumn = writer.parse(resultSet, columnIndex);
        Column originColumn = makeOriginColumn(resultSet, resultColumn);
        resultColumn.setOrigin(originColumn);
        return resultColumn;
    }

    private Column makeOriginColumn(ResultSet resultSet, QueryResultColumn resultColumn) throws SQLException {
        String sourceTableName = resultColumn.getSourceTableName();
        String sourceColumnName = resultColumn.getSourceColumName();
        String value = resultSet.getString(toOriginColumnAlias(sourceTableName, sourceColumnName));

        MetaTable metaTable = getMetaTable(sourceTableName);
        MetaColumn metaColumn = metaTable.getColumn(sourceColumnName);

        Comment comment = SchemaFactory.createComment(metaTable.getName(), metaColumn.getName(), metaColumn.getComment());
        return SchemaFactory.createColumn(sourceColumnName, value, comment);
    }
}