package mpa.audit.repository.database.sql;

import mpa.annotation.MPAAnnotations;
import mpa.audit.annotation.AuditAnnotations;
import mpa.audit.config.ScopedAuditConfiguration;
import mpa.audit.config.strategy.StringCaseConverter;
import mpa.audit.repository.database.schema.ColumnImpl;
import mpa.audit.repository.database.sql.parameter.IdParameter;
import mpa.audit.repository.database.sql.parameter.Parameter;
import mpa.util.Log;

import java.lang.reflect.Field;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class PrimaryIdentifierAuditSQL implements AuditSQL {

    private final StringCaseConverter stringCaseConverter;

    private final Class<?> entityClass;
    private final String alias;
    private final QueryWriter queryWriter;
    private final Map<String, Integer> conditionOrder = new HashMap<>();

    private String query;


    public PrimaryIdentifierAuditSQL(ScopedAuditConfiguration configuration, QueryWriter queryWriter, Class<?> entityClass, String alias) {
        this.stringCaseConverter = configuration.stringCaseConverter();
        this.entityClass = entityClass;
        this.alias = alias;
        this.queryWriter = queryWriter;
    }


    @Override
    public void generateQuery() {
        QueryStructure queryStructure = new QueryStructure();

        queryWriter.write(queryStructure, entityClass);

        List<String> idColumnNames = getIdColumnNames(entityClass);
        queryStructure.changeConditionClause(makeConditionClause(idColumnNames));
        queryStructure.changeOrderByClause(makeOrderByClause(idColumnNames));

        this.query = queryStructure.toString();
    }


    private List<String> getIdColumnNames(Class<?> entityClass) {
        Field[] fields = entityClass.getDeclaredFields();
        List<String> idColumnNames = new ArrayList<>();

        for (Field f : fields) {
            if (f.isAnnotationPresent(MPAAnnotations.IDENTIFY)) {
                idColumnNames.add(stringCaseConverter.convert(f.getName()));
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
    public ResultSet execute(PreparedStatement statement, Parameter parameter) throws SQLException {
        IdParameter idParameter = parameter.getId();

        for (Parameter.Entry id : idParameter) {
            statement.setString(getOrder(id.getName()), id.getValue());
        }
        return statement.executeQuery();
    }

    private int getOrder(String parameterName) {
        if (!conditionOrder.containsKey(parameterName)) {
            throw new IllegalArgumentException(Log.format("illegal parameter is detected during execute audit query. parameter: %s", parameterName));
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