package mpa.audit.repository.sql;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.AuditAnnotations;
import mpa.audit.annotation.AuditJoin;
import mpa.audit.annotation.AuditJoinDefinition;
import mpa.audit.annotation.AuditJoinDefinitions;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.audit.config.strategy.JoinStrategy;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.entity.schema.MetaColumn;
import mpa.persistence.entity.schema.MetaTable;
import org.springframework.core.annotation.AnnotationConfigurationException;
import org.springframework.core.annotation.AnnotationUtils;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.StringJoiner;

@RequiredArgsConstructor
public class JoinQueryWriter implements QueryWriter {

    private static final String JOIN_ADDITION_NAME_PREFIX = "JAN__"; // JOIN_ADDITION_NAME

    private final JoinStrategy joinStrategy;
    private final CaseConversionStrategy stringCaseConverter;
    private final EntityCache entityCache;


    @Override
    public void write(QueryStructure queryStructure, Class<?> entityClass) {
        String tableName = getTableName(entityClass);

        if (emptyCache(tableName)) {
            return;
        }

        MetaTable sourceMetaTable = getMetaTable(tableName);
        String sourceTableAlias = sourceMetaTable.getAlias();
        Field[] fields = entityClass.getDeclaredFields();

        StringJoiner newSelectClause = new StringJoiner(", ");
        newSelectClause.add(queryStructure.getSelectClause());

        String columnName;

        for (Field f : fields) {
            if (isIgnore(f) || isNotJoin(f)) {
                continue;
            }

            columnName = convertCase(f.getName());

            if (notExistsColumn(sourceMetaTable, columnName)) {
                continue;
            }

            newSelectClause.add(makeJoinScalaSubQuery(f, columnName, tableName, sourceTableAlias));
        }

        queryStructure.changeSelectClause(newSelectClause.toString());
    }

    private String makeJoinScalaSubQuery(Field f, String sourceColumName, String sourceTableName, String sourceTableAlias) {
        AuditJoin joinAnnotation = getJoinAnnotation(f);
        Class<?> joinEntity = joinAnnotation.entity();
        AuditJoinDefinition joinDefinitionAnnotation = getJoinDefinitionAnnotation(joinEntity, joinAnnotation.definition());

        String joinTableName = getTableName(joinEntity);
        String auditColumnName = convertCase(joinDefinitionAnnotation.auditProperty());
        String joinColumnName = convertCase(joinDefinitionAnnotation.joinProperty());

        StringBuilder clause = new StringBuilder()
                .append(" ( SELECT ")
                .append(auditColumnName)
                .append(" FROM ")
                .append(joinTableName)
                .append(" WHERE ")
                .append(joinColumnName)
                .append(" = ")
                .append(sourceTableAlias)
                .append(".")
                .append(sourceColumName)
                ;

        if (hasWithProperties(joinAnnotation)) {
            JoinCondition[] conditions = toJoinConditions(joinAnnotation.withProperties(), joinDefinitionAnnotation);

            for (JoinCondition condition : conditions) {
                clause
                        .append(" AND ")
                        .append(condition.getJoinColumn())
                        .append(" = ")
                        .append(sourceTableAlias)
                        .append(".")
                        .append(condition.getSourceColumn());
            }
        }

        return clause
                .append(" ) AS ")
                .append(JOIN_ADDITION_NAME_PREFIX)
                .append("$")
                .append(sourceTableName)
                .append("$")
                .append(sourceColumName)
                .append("$")
                .append(joinTableName)
                .append("$")
                .append(auditColumnName)
                .toString();
    }

    private boolean isIgnore(Field f) {
        return f.isAnnotationPresent(AuditAnnotations.AUDIT_IGNORE);
    }

    private boolean isNotJoin(Field f) {
        return !f.isAnnotationPresent(AuditAnnotations.JOIN);
    }

    private String getTableName(Class<?> entityClass) {
        return EntityAnnotations.getTableName(entityClass);
    }

    private boolean emptyCache(String tableName) {
        return !entityCache.existsByTableName(tableName);
    }

    private boolean notExistsColumn(MetaTable metaTable, String columnName) {
        return !metaTable.existsColumn(columnName);
    }

    private MetaTable getMetaTable(String tableName) {
        EntityDefinition entityDefinition = entityCache.getByTableName(tableName);
        return entityDefinition.getMetaTable();
    }

    private AuditJoin getJoinAnnotation(Field f) {
        return f.getAnnotation(AuditAnnotations.JOIN);
    }

    private boolean hasWithProperties(AuditJoin joinAnnotation) {
        return joinAnnotation.withProperties() != null && joinAnnotation.withProperties().length > 0;
    }

    private AuditJoinDefinition getJoinDefinitionAnnotation(Class<?> entityClass, String definitionName) {
        if (entityClass.isAnnotationPresent(AuditAnnotations.JOIN_DEFINITION)) {
            AuditJoinDefinition definition = AnnotationUtils.findAnnotation(entityClass, AuditAnnotations.JOIN_DEFINITION);

            if (definitionName.equals(definition.name())) {
                return definition;
            }
        }
        if (entityClass.isAnnotationPresent(AuditAnnotations.JOIN_DEFINITIONS)) {
            AuditJoinDefinitions joinDefinitions = AnnotationUtils.findAnnotation(entityClass, AuditAnnotations.JOIN_DEFINITIONS);

            for (AuditJoinDefinition definition : joinDefinitions.definitions()) {
                if (definitionName.equals(definition.name())) {
                    return definition;
                }
            }
        }
        throw new AnnotationConfigurationException(String.format(
                "Not found matched AuditJoinDefinition. join target: '%s'",
                entityClass.getName() + "." + definitionName
        ));
    }

    private JoinCondition[] toJoinConditions(String[] withProperties, AuditJoinDefinition joinDefinitionAnnotation) {
        assertSameLength(withProperties, joinDefinitionAnnotation.withProperties());
        String[] conditionColumns = convertCaseArray(withProperties);
        String[] joinConditionColumns = convertCaseArray(joinDefinitionAnnotation.withProperties());

        JoinCondition[] conditions = new JoinCondition[conditionColumns.length];

        for (int i=0; i < conditionColumns.length; i++) {
            conditions[i] = new JoinCondition(conditionColumns[i], joinConditionColumns[i]);
        }
        return conditions;
    }

    private void assertSameLength(String[] arr, String[] compare) {
        if (arr != compare && arr.length != compare.length) {
            throw new AnnotationConfigurationException("audit definition and audit join's 'withProperties' value must have same length.");
        }
    }

    private String convertCase(String s) {
        return stringCaseConverter.convert(s);
    }

    private String[] convertCaseArray(String[] arr) {
        if (arr == null) {
            return null;
        }
        String[] convertedArr = new String[arr.length];
        for (int i=0; i < convertedArr.length; i++) {
            convertedArr[i] = convertCase(arr[i]);
        }
        return convertedArr;
    }


    @Getter
    private static class JoinCondition {
        private final String sourceColumn;
        private final String joinColumn;

        public JoinCondition(String sourceColumn, String joinColumn) {
            this.sourceColumn = sourceColumn;
            this.joinColumn = joinColumn;
        }
    }


    @Override
    public boolean supports(ResultSet resultSet, int columnIndex) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String columnLabel = metaData.getColumnLabel(columnIndex);
        return columnLabel.startsWith(JOIN_ADDITION_NAME_PREFIX);
    }

    @Override
    public QueryResultColumn parse(ResultSet resultSet, int columnIndex) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String columnLabel = metaData.getColumnLabel(columnIndex);
        String[] names = columnLabel.split("\\$");

        QueryResultColumn resultColumn = makeJoinColumn(names, resultSet, columnIndex);

        if (joinStrategy.isColumnAddition()) {
            resultColumn.toAdditional();
        }
        return resultColumn;
    }

    private QueryResultColumn makeJoinColumn(String[] names, ResultSet resultSet, int columnIndex) throws SQLException {
        String value = resultSet.getString(columnIndex);
        String sourceTableName = names[1];
        String sourceColumnName = names[2];
        String joinTableName = names[3];
        String auditColumnName = names[4];

        MetaTable joinMetaTable = getMetaTable(joinTableName);
        MetaColumn auditMetaColumn = joinMetaTable.getColumn(auditColumnName);

        String additionalColumnName = joinStrategy.convertAdditionColumnName(sourceColumnName);

        QueryResultColumn resultColumn = new QueryResultColumn();
        resultColumn.setSourceTableName(sourceTableName);
        resultColumn.setSourceColumName(sourceColumnName);
        resultColumn.setTableName(joinTableName);
        resultColumn.setName(additionalColumnName);
        resultColumn.setAdditionalName(additionalColumnName);
        resultColumn.setValue(value);
        resultColumn.setComment(auditMetaColumn.getComment());

        return resultColumn;
    }

}