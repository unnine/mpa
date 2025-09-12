package mpa.audit.repository.sql;

import lombok.RequiredArgsConstructor;
import mpa.persistence.config.CaseConversionStrategy;
import mpa.audit.config.entity.EntityAuditConfigurationContext;
import mpa.audit.repository.sql.cache.AuditSQLCache;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.EntityCache;

@RequiredArgsConstructor
public class BootStrapAuditSQLGenerator implements AuditSQLGenerator {

    private final ScopeAware scopeAware;
    private final Scopable<EntityCache> entityCache;
    private final Scopable<AuditSQLCache> sqlCacheScopable;
    private final Scopable<EntityAuditConfigurationContext> entityAuditConfigurationContextScopable;


    @Override
    public void generate() {
        caching();
    }

    private void caching() {
        scopeAware.forEach(scope -> {
            if (scope.getAuditAttribute().isAuditing()) {
                cachingAuditSQL(scope);
            }
        });
    }

    private void cachingAuditSQL(Scope scope) {
        entityCache.getInstance(scope).forEach(entityDefinition -> {
            CaseConversionStrategy caseConversionStrategy = scope.getDataSourceAware().getCaseConversionStrategy();

            ContextQueryWriter queryWriter = new ContextQueryWriter(
                    caseConversionStrategy,
                    entityCache.getInstance(scope),
                    entityAuditConfigurationContextScopable.getInstance(scope)
            );

            PrimaryIdentifierAuditSQL auditSQL = new PrimaryIdentifierAuditSQL(
                    caseConversionStrategy,
                    queryWriter,
                    entityDefinition.getEntityClass(),
                    entityDefinition.getMetaTable()
            );

            auditSQL.generateQuery();

            sqlCacheScopable.getInstance(scope).addSQL(entityDefinition.getTableName(), auditSQL);
        });
    }
}
