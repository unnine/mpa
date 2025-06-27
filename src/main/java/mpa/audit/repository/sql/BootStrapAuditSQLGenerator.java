package mpa.audit.repository.sql;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.strategy.CaseConversionStrategy;
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
            BaseQueryWriter queryWriter = new BaseQueryWriter(caseConversionStrategy, entityCache.getInstance(scope));
            PrimaryIdentifierAuditSQL auditSQL = new PrimaryIdentifierAuditSQL(
                    caseConversionStrategy,
                    queryWriter,
                    entityDefinition.getEntityClass(),
                    entityDefinition.getMetaTable().getAlias()
            );

            auditSQL.generateQuery();

            sqlCacheScopable.getInstance(scope).addSQL(entityDefinition.getTableName(), auditSQL);

            // TODO join 구현
//            queryWriter.addWriter(new JoinQueryWriter(configuration, entityCache));
//            queryWriter.addWriter(new EntityJoinQueryWriter(configuration, entityCache));
        });
    }
}
