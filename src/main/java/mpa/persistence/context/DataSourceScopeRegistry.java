package mpa.persistence.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.AuditAttribute;
import mpa.audit.config.AuditConfiguration;
import mpa.audit.config.AuditConfigurer;
import mpa.persistence.config.DataSourceConfigurer;
import mpa.persistence.config.ScopeConfigurer;
import mpa.persistence.config.ScopeRegistry;

import javax.sql.DataSource;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class DataSourceScopeRegistry implements ScopeRegistry {

    private final ApplicationContextAware contextAware;
    private final ScopeAware scopeAware;


    public void addDefaultScope(DataSource dataSource) {
        Scope scope = Scope.ofDefault();
        scope.setDataSourceAware(DataSourceAware.ofDefault(dataSource));
        scope.setAuditAttribute(new AuditAttribute());
        scopeAware.add(scope);
    }

    @Override
    public ScopeConfigurer addDefaultScope() {
        Scope scope = Scope.ofDefault();
        scope.setDataSourceAware(DataSourceAware.create());
        scope.setAuditAttribute(new AuditAttribute());
        scopeAware.add(scope);
        return createScopeConfigurer(scope);
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
