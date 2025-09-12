package mpa.audit.repository.sql.join;

import mpa.audit.config.entity.AuditJoinContext;
import mpa.audit.config.entity.EntityAuditConfigurationContext;
import mpa.audit.repository.sql.ColumnWriter;
import mpa.audit.repository.sql.QueryResultColumn;
import mpa.audit.repository.sql.QueryStructure;
import mpa.audit.repository.sql.QueryWriter;
import mpa.persistence.config.CaseConversionStrategy;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.entity.schema.MetaTable;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JoinQueryWriter implements QueryWriter {

    private final List<ColumnWriter> columnWriters = new ArrayList<>();

    private final CaseConversionStrategy caseConversionStrategy;
    private final EntityCache entityCache;
    private final EntityAuditConfigurationContext auditConfigurationContext;


    public JoinQueryWriter(CaseConversionStrategy caseConversionStrategy, EntityCache entityCache, EntityAuditConfigurationContext auditConfigurationContext) {
        this.entityCache = entityCache;
        this.auditConfigurationContext = auditConfigurationContext;
        this.caseConversionStrategy = caseConversionStrategy;

        this.columnWriters.add(new ChangeValueJoinColumnWriter(entityCache));
        this.columnWriters.add(new AdditionalJoinColumnWriter(entityCache));
    }


    @Override
    public void write(QueryStructure queryStructure, Class<?> entityClass) {
        if (!entityCache.existsByEntity(entityClass)) {
            return;
        }

        EntityDefinition entityDefinition = entityCache.getByEntity(entityClass);
        MetaTable baseTable = entityDefinition.getMetaTable();

        getJoinContext(entityClass).ifPresent(joinContext -> joinContext.forEach(join -> {
            writeSelectClause(queryStructure, entityClass, join);
            writeFromClause(queryStructure, baseTable, join);
        }));
    }

    private MetaTable getJoinTable(EntityCache entityCache, Join join) {
        EntityDefinition joinEntityDefinition = entityCache.getByEntity(join.getJoinEntityClass());
        return joinEntityDefinition.getMetaTable();
    }

    private Optional<AuditJoinContext<?>> getJoinContext(Class<?> entityClass) {
        EntityDefinition entityDefinition = entityCache.getByEntity(entityClass);
        return auditConfigurationContext.getJoinContext(entityDefinition.getEntityClass());
    }

    private void writeSelectClause(QueryStructure queryStructure, Class<?> entityClass, Join join) {
        columnWriters.forEach(writer -> writer.write(queryStructure, entityClass, join));
    }

    private void writeFromClause(QueryStructure queryStructure, MetaTable baseTable, Join join) {
        String joinClause = join.generateJoinClause(
                caseConversionStrategy,
                baseTable,
                getJoinTable(entityCache, join)
        );
        queryStructure.addFromClause(joinClause);
    }

    @Override
    public boolean supports(ResultSet resultSet, int columnIndex) throws SQLException {
        return true;
    }

    @Override
    public QueryResultColumn parse(ResultSet resultSet, int columnIndex) throws SQLException {
        for (ColumnWriter columnWriter : columnWriters) {
            if (columnWriter.supports(resultSet, columnIndex)) {
                return columnWriter.parse(resultSet, columnIndex);
            }
        }
        return QueryResultColumn.empty();
    }

}
