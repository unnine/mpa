package mpa.audit.repository.dataaccess.sql;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.*;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.annotation.EntityAnnotations;
import mpa.persistence.entity.schema.MetaColumn;
import mpa.persistence.entity.schema.MetaTable;
import mpa.util.Log;
import org.springframework.core.annotation.AnnotationConfigurationException;
import org.springframework.core.annotation.AnnotationUtils;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

@RequiredArgsConstructor
public class EntityJoinQueryWriter implements QueryWriter {

    private static final String JOIN_NAME_PREFIX = "EJ__"; // ENTITY_JOIN
    private static final String JOIN_ADDITIONAL_NAME_PREFIX = "EJA__"; // ENTITY_JOIN_ADDITIONAL

    private final CaseConversionStrategy stringCaseConverter;
    private final EntityCache entityCache;


    @Getter
    @Builder
    private static class JoinInfo {
        private final Join joinAnnotation;
        private final AuditJoinDefinition joinDefinitionAnnotation;

        private final MetaTable originMetaTable;
        private final MetaColumn originMetaColumn;

        private final Class<?> sourceEntity;
        private final MetaTable sourceMetaTable;
        private final MetaColumn sourceMetaColumn;

        private final Class<?> joinEntity;
        private final MetaTable joinMetaTable;
        private final MetaColumn joinMetaColumn;
        private final MetaColumn auditMetaColumn;
    }

    private JoinInfo createJoinInfo(Class<?> sourceEntity, Class<?> joinEntity, Join joinAnnotation, MetaTable originMetaTable, MetaColumn originMetaColumn) {
        AuditJoinDefinition definitionAnnotation = getJoinDefinitionAnnotation(joinEntity, joinAnnotation.definition());

        MetaTable sourceMetaTable = getMetaTable(sourceEntity);
        String sourceColumnName = convertCase(joinAnnotation.joinProperty());
        MetaColumn sourceMetaColumn = sourceMetaTable.getColumn(sourceColumnName);

        MetaTable joinMetaTable = getMetaTable(joinEntity);
        String joinColumnName = convertCase(definitionAnnotation.joinProperty());
        MetaColumn joinMetaColumn = joinMetaTable.getColumn(joinColumnName);

        String auditColumnName = convertCase(definitionAnnotation.auditProperty());
        MetaColumn auditMetaColumn = joinMetaTable.getColumn(auditColumnName);

        if (originMetaTable == null) {
            originMetaTable = sourceMetaTable;
        }

        if (originMetaColumn == null) {
            originMetaColumn = sourceMetaColumn;
        }

        return JoinInfo.builder()
                .joinAnnotation(joinAnnotation)
                .joinDefinitionAnnotation(definitionAnnotation)
                .originMetaTable(originMetaTable)
                .originMetaColumn(originMetaColumn)
                .sourceEntity(sourceEntity)
                .sourceMetaTable(sourceMetaTable)
                .sourceMetaColumn(sourceMetaColumn)
                .joinEntity(joinEntity)
                .joinMetaTable(joinMetaTable)
                .joinMetaColumn(joinMetaColumn)
                .auditMetaColumn(auditMetaColumn)
                .build();
    }

    @Override
    public void write(QueryStructure queryStructure, Class<?> entityClass) {
        StringJoiner newSelectClause = new StringJoiner(", ");
        newSelectClause.add(queryStructure.getSelectClause());

        StringBuilder newFromClause = new StringBuilder(queryStructure.getFromClause());

        if (!hasEntityJoinAnnotation(entityClass) || emptyCache(entityClass)) {
            return;
        }

        write(newSelectClause, newFromClause, entityClass, null, null);

        queryStructure.changeSelectClause(newSelectClause.toString());
        queryStructure.changeFromClause(newFromClause.toString());
    }

    private void write(StringJoiner newSelectClause, StringBuilder newFromClause, Class<?> entityClass, MetaTable originMetaTable, MetaColumn originMetaColumn) {
        AuditEntityJoin entityJoinAnnotation = getEntityJoinAnnotation(entityClass);
        List<Join> joinAnnotations = getJoinAnnotations(entityJoinAnnotation);
        JoinInfo joinInfo;

        for (Join joinAnnotation : joinAnnotations) {
            joinInfo = createJoinInfo(entityClass, joinAnnotation.entity(), joinAnnotation, originMetaTable, originMetaColumn);

            writeSelectJoinClause(newSelectClause, joinInfo);
            writeFromJoinClause(newFromClause, joinInfo);

            if (entityJoinAnnotation.chain() && joinAnnotation.chain() && hasEntityJoinAnnotation(joinInfo.getJoinEntity())) {
                write(newSelectClause, newFromClause, joinInfo.getJoinEntity(), joinInfo.getOriginMetaTable(), joinInfo.getOriginMetaColumn());
            }
        }
    }

    private void writeSelectJoinClause(StringJoiner newSelectClause, JoinInfo joinInfo) {
        Join joinAnnotation = joinInfo.getJoinAnnotation();
        MetaTable originMetaTable = joinInfo.getOriginMetaTable();
        MetaColumn originMetaColumn = joinInfo.getOriginMetaColumn();
        MetaTable joinMetaTable = joinInfo.getJoinMetaTable();
        MetaColumn auditMetaColumn = joinInfo.getAuditMetaColumn();

        StringJoiner alias = new StringJoiner("$");
        alias.add(JOIN_NAME_PREFIX);
        alias.add(originMetaTable.getName());
        alias.add(originMetaColumn.getName());
        alias.add(joinMetaTable.getName());
        alias.add(auditMetaColumn.getName());

        newSelectClause.add(joinMetaTable.getAlias() + "." + auditMetaColumn.getName() + " AS " + alias);
        newSelectClause.add("'" + joinAnnotation.auditName() + "' AS " + JOIN_ADDITIONAL_NAME_PREFIX + alias);
    }

    private void writeFromJoinClause(StringBuilder newFromClause, JoinInfo joinInfo) {
        Join joinAnnotation = joinInfo.getJoinAnnotation();
        AuditJoinDefinition joinDefinitionAnnotation = joinInfo.getJoinDefinitionAnnotation();
        MetaTable sourceMetaTable = joinInfo.getSourceMetaTable();
        MetaColumn sourceMetaColumn = joinInfo.getSourceMetaColumn();
        MetaTable joinMetaTable = joinInfo.getJoinMetaTable();
        MetaColumn joinMetaColumn = joinInfo.getJoinMetaColumn();

        newFromClause
                .append(" LEFT JOIN ")
                .append(joinMetaTable.getName())
                .append(" ")
                .append(joinMetaTable.getAlias())
                .append(" ON ")
                .append(joinMetaTable.getAlias())
                .append(".")
                .append(joinMetaColumn.getName())
                .append(" = ")
                .append(sourceMetaTable.getAlias())
                .append(".")
                .append(sourceMetaColumn.getName());

        if (hasWithProperties(joinAnnotation)) {
            JoinCondition[] conditions = toJoinConditions(joinAnnotation.withProperties(), joinDefinitionAnnotation);

            for (JoinCondition condition : conditions) {
                newFromClause
                        .append(" AND ")
                        .append(joinMetaTable.getAlias())
                        .append(".")
                        .append(condition.getJoinColumn())
                        .append(" = ")
                        .append(sourceMetaTable.getAlias())
                        .append(".")
                        .append(condition.getSourceColumn());
            }
        }
    }

    private boolean hasEntityJoinAnnotation(Class<?> entityClass) {
        return AuditAnnotations.hasEntityJoin(entityClass);
    }

    private boolean emptyCache(Class<?> entityClass) {
        String tableName = EntityAnnotations.getTableName(entityClass);
        return !entityCache.existsByTableName(tableName);
    }

    private AuditEntityJoin getEntityJoinAnnotation(Class<?> entityClass) {
        return AuditAnnotations.getEntityJoin(entityClass);
    }

    private MetaTable getMetaTable(Class<?> entityClass) {
        String tableName = EntityAnnotations.getTableName(entityClass);
        return getMetaTable(tableName);
    }

    private MetaTable getMetaTable(String tableName) {
        EntityDefinition entityDefinition = entityCache.getByTableName(tableName);
        return entityDefinition.getMetaTable();
    }

    private List<Join> getJoinAnnotations(AuditEntityJoin entityJoinAnnotation) {
        return new ArrayList<>(Arrays.asList(entityJoinAnnotation.joins()));
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
        throw new AnnotationConfigurationException(Log.format(
                "Not found matched AuditJoinDefinition. join target: '%s'",
                entityClass.getName() + "." + definitionName
        ));
    }

    private boolean hasWithProperties(Join joinAnnotation) {
        return joinAnnotation.withProperties() != null && joinAnnotation.withProperties().length > 0;
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
            throw new AnnotationConfigurationException(Log.format("audit definition and audit join's 'withProperties' value must have same length."));
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
        return columnLabel.startsWith(JOIN_NAME_PREFIX);
    }

    @Override
    public QueryResultColumn parse(ResultSet resultSet, int columnIndex) throws SQLException {
        ResultSetMetaData metaData = resultSet.getMetaData();
        String columnLabel = metaData.getColumnLabel(columnIndex);
        String additionalName = resultSet.getString(JOIN_ADDITIONAL_NAME_PREFIX + columnLabel);
        String[] names = columnLabel.split("\\$");

        QueryResultColumn resultColumn = makeJoinColumn(names, resultSet, columnIndex, additionalName);
        resultColumn.toAdditional();
        return resultColumn;
    }

    private QueryResultColumn makeJoinColumn(String[] names, ResultSet resultSet, int columnIndex, String additionalName) throws SQLException {
        String value = resultSet.getString(columnIndex);
        String sourceTableName = names[1];
        String sourceColumnName = names[2];
        String joinTableName = names[3];
        String auditColumnName = names[4];

        MetaTable joinMetaTable = getMetaTable(joinTableName);
        MetaColumn auditMetaColumn = joinMetaTable.getColumn(auditColumnName);

        QueryResultColumn resultColumn = new QueryResultColumn();
        resultColumn.setSourceTableName(sourceTableName);
        resultColumn.setSourceColumName(sourceColumnName);
        resultColumn.setTableName(joinTableName);
        resultColumn.setName(auditColumnName);
        resultColumn.setAdditionalName(additionalName);
        resultColumn.setValue(value);
        resultColumn.setComment(auditMetaColumn.getComment());

        return resultColumn;
    }
}