package mpa.audit.repository.dataaccess.sql;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeTemplate;

@RequiredArgsConstructor
public class BootStrapAuditSQLGenerator implements AuditSQLGenerator {

    private final ScopeTemplate scopeTemplate;
    private final EntityCache entityCache;
    private final AuditSQLCache auditSQLCache;


    @Override
    public void generate() {
        caching();
    }


    private void caching() {
        scopeTemplate.run(scope -> {
            if (scope.getAuditAttribute().isAuditing()) {
                cachingAuditSQL(scope);
            }
        });
    }

    private void cachingAuditSQL(Scope scope) {
        entityCache.forEach(entityDefinition -> {
            CaseConversionStrategy caseConversionStrategy = scope.getDataSourceAware().getCaseConversionStrategy();
            DataAccessQueryWriter baseQueryWriter = new DataAccessQueryWriter(caseConversionStrategy, entityCache);
            PrimaryIdentifierAuditSQL auditSQL = new PrimaryIdentifierAuditSQL(
                    caseConversionStrategy,
                    baseQueryWriter,
                    entityDefinition.getEntityClass(),
                    entityDefinition.getMetaTable().getAlias()
            );

            auditSQL.generateQuery();

            auditSQLCache.addSQL(entityDefinition.getTableName(), auditSQL);

            // TODO join 구현
//            queryWriter.addWriter(new JoinQueryWriter(configuration, entityCache));
//            queryWriter.addWriter(new EntityJoinQueryWriter(configuration, entityCache));
        });
    }
}
