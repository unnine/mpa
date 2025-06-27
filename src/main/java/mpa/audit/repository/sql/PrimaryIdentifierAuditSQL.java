package mpa.audit.repository.sql;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.audit.repository.schema.ColumnImpl;
import mpa.audit.repository.sql.argument.Argument;
import mpa.audit.repository.sql.argument.IdArgument;
import mpa.persistence.entity.annotation.EntityAnnotations;

import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@RequiredArgsConstructor
public class PrimaryIdentifierAuditSQL implements AuditSQL {

    private String query;
    private final Map<String, Integer> conditionOrder = new HashMap<>();

    private final CaseConversionStrategy caseConversionStrategy;
    private final QueryWriter queryWriter;
    private final Class<?> entityClass;
    private final String alias;


    @Override
    public void generateQuery() {
        QueryStructure queryStructure = new QueryStructure();

        queryWriter.write(queryStructure, entityClass);

        List<String> idColumnNames = getIdColumnNames(entityClass);
        queryStructure.changeConditionClause(makeConditionClause(idColumnNames));
        queryStructure.changeOrderByClause(makeOrderByClause(idColumnNames));

        this.query = queryStructure.generateQuery();
    }


    private List<String> getIdColumnNames(Class<?> entityClass) {
        Field[] fields = entityClass.getDeclaredFields();
        List<String> idColumnNames = new ArrayList<>();

        for (Field f : fields) {
            if (f.isAnnotationPresent(EntityAnnotations.IDENTIFY)) {
                idColumnNames.add(caseConversionStrategy.convert(f.getName()));
            }
        }
        idColumnNames.sort(Comparator.naturalOrder());
        return idColumnNames;
    }

    private String makeConditionClause(List<String> idColumnNames) {
        StringBuilder clause = new StringBuilder(" WHERE ");

        int i = 0;
        for (String idColumnName : idColumnNames) {
            if (i > 0) {
                clause.append(" AND ");
            }
            clause
                    .append(alias)
                    .append(".")
                    .append(idColumnName)
                    .append(" = ? ");

            conditionOrder.put(idColumnName, conditionOrder.size() + 1);

            i++;
        }
        return clause.toString();
    }

    private String makeOrderByClause(List<String> idColumnNames) {
        StringJoiner clause = new StringJoiner(", ", " ORDER BY ", "");

        for (String idColumnName : idColumnNames) {
            clause.add(alias + "." + idColumnName);
        }
        return clause.toString();
    }

    @Override
    public ResultSet execute(PreparedStatement statement, Argument argument) throws SQLException {
        IdArgument idArgument = argument.getId();

        for (Argument.Entry id : idArgument) {
            statement.setString(getOrder(id.getName()), id.getValue());
        }
        return statement.executeQuery();
    }

    private int getOrder(String parameterName) {
        if (!conditionOrder.containsKey(parameterName)) {
            throw new IllegalArgumentException("illegal parameter is detected during execute audit query. parameter: " + parameterName);
        }
        return conditionOrder.get(parameterName);
    }

    @Override
    public boolean parseableColumn(ResultSet resultSet, int columnIndex) throws SQLException {
        return queryWriter.supports(resultSet, columnIndex);
    }

    @Override
    public ColumnImpl getColumn(ResultSet resultSet, int columnIndex) throws SQLException {
        QueryResultColumn resultColumn = queryWriter.parse(resultSet, columnIndex);
        return resultColumn.toColumn();
    }

    @Override
    public String toString() {
        return query;
    }
}