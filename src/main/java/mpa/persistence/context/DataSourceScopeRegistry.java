package mpa.persistence.context;

import lombok.RequiredArgsConstructor;
import mpa.persistence.config.DataSourceConfigurer;
import mpa.persistence.config.ScopeConfigurer;
import mpa.persistence.config.ScopeRegistry;
import mpa.persistence.config.audit.AuditAttribute;
import mpa.persistence.config.audit.AuditConfiguration;
import mpa.persistence.config.audit.AuditConfigurer;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class DataSourceScopeRegistry implements ScopeRegistry {

    private final ApplicationContextAware contextAware;
    private final ScopeAware scopeAware;


    public void addDefaultScope(SqlSessionFactory sqlSessionFactory) {
        Scope scope = Scope.ofDefault();
        scope.setDataSourceAware(DataSourceAware.ofDefault(sqlSessionFactory));
        scope.setAuditAttribute(new AuditAttribute());
        scopeAware.add(scope);
    }

    @Override
    public ScopeConfigurer addDefaultScope() {
        Scope scope = Scope.ofDefault();
        scope.setDataSourceAware(DataSourceAware.create());
        scope.setAuditAttribute(new AuditAttribute());
        scopeAware.add(scope);
        ScopeConfigurer scopeConfigurer = createScopeConfigurer(scope);
        return scopeConfigurer.database(dataSourceConfigurer -> dataSourceConfigurer
                .sqlSessionFactoryName("sqlSessionFactory")
        );
    }

    @Override
    public ScopeConfigurer addScope(String name) {
        Scope scope = new Scope();
        scope.setName(name);
        scope.setDataSourceAware(DataSourceAware.create());
        scope.setAuditAttribute(new AuditAttribute());
        scopeAware.add(scope);
        return createScopeConfigurer(scope);
    }

    private ScopeConfigurer createScopeConfigurer(Scope scope) {
        return new DataSourceScopeConfigurer(
                this,
                scope,
                new DataSourceConfiguration(contextAware, scope.getDataSourceAware()),
                new AuditConfiguration(scope.getAuditAttribute())
        );
    }

    public boolean isEmptyScope() {
        return scopeAware.isEmpty();
    }


    @RequiredArgsConstructor
    public static class DataSourceScopeConfigurer implements ScopeConfigurer {

        private final DataSourceScopeRegistry scopeRegistry;
        private final Scope scope;
        private final DataSourceConfiguration dataSourceConfiguration;
        private final AuditConfiguration auditConfiguration;


        @Override
        public ScopeConfigurer basePackage(String basePackage) {
            scope.setBasePackage(basePackage);
            return this;
        }

        @Override
        public ScopeConfigurer database(Consumer<DataSourceConfigurer> configurer) {
            configurer.accept(dataSourceConfiguration);
            return this;
        }

        @Override
        public ScopeConfigurer audit(Consumer<AuditConfigurer> configurer) {
            configurer.accept(auditConfiguration);
            return this;
        }

        @Override
        public ScopeRegistry and() {
            return scopeRegistry;
        }

    }
}
