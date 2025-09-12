package mpa.audit.repository.sql;

import mpa.persistence.config.CaseConversionStrategy;
import mpa.audit.config.entity.EntityAuditConfigurationContext;
import mpa.audit.repository.sql.join.JoinQueryWriter;
import mpa.persistence.entity.EntityCache;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContextQueryWriter implements QueryWriter {

    private final List<QueryWriter> writers = new ArrayList<>();


    public ContextQueryWriter(CaseConversionStrategy caseConversionStrategy, EntityCache entityCache, EntityAuditConfigurationContext auditConfigurationContext) {
        this.writers.add(new BaseQueryWriter(caseConversionStrategy, entityCache));
        this.writers.add(new JoinQueryWriter(caseConversionStrategy, entityCache, auditConfigurationContext));
    }


    @Override
    public void write(QueryStructure queryStructure, Class<?> entityClass) {
        for (QueryWriter writer : writers) {
            writer.write(queryStructure, entityClass);
        }
    }

    @Override
    public boolean supports(ResultSet resultSet, int columnIndex) throws SQLException {
        return true;
    }

    @Override
    public QueryResultColumn parse(ResultSet resultSet, int columnIndex) throws SQLException {
        for (QueryWriter writer : writers) {
            if (writer.supports(resultSet, columnIndex)) {
                return writer.parse(resultSet, columnIndex);
            }
        }
        return QueryResultColumn.empty();
    }
}
