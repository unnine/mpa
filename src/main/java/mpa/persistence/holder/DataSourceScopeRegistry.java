package mpa.persistence.holder;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.strategy.CaseConversionStrategy;
import mpa.config.DataSourceConfigurer;
import mpa.config.ScopeRegistry;
import mpa.persistence.dataaccess.DatabaseType;

import javax.sql.DataSource;
import java.util.Objects;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class DataSourceScopeRegistry implements ScopeRegistry {

    private final ApplicationContextAware contextAware;
    private final ScopeAware scopeAware;


    @Override
    public ScopeConfigurer addScope(String name) {
        Scope scope = new Scope();
        scope.setName(name);
        scope.setDataSourceAware(new DataSourceAware());
        scopeAware.add(scope);
        return new DataSourceScopeConfigurer(this, scope, new DataSourceAwareConfigurer(contextAware, scope.getDataSourceAware()));
    }

    public boolean isEmptyScope() {
        return scopeAware.isEmpty();
    }

    public void addDefaultScope() {
        DataSource dataSource = contextAware.getBean(DataSource.class);
        Objects.requireNonNull(dataSource);
        DataSourceAware dataSourceAware = DataSourceAware.ofDefault(dataSource);
        Scope scope = Scope.ofDefault(dataSourceAware);
        scopeAware.add(scope);
    }


    @RequiredArgsConstructor
    private static class DataSourceScopeConfigurer implements ScopeConfigurer {

        private final DataSourceScopeRegistry scopeRegistry;
        private final Scope scope;
        private final DataSourceConfigurer dataSourceConfigurer;


        @Override
        public ScopeConfigurer basePackage(String basePackage) {
            scope.setBasePackage(basePackage);
            return this;
        }

        @Override
        public ScopeConfigurer database(Consumer<DataSourceConfigurer> configurer) {
            configurer.accept(dataSourceConfigurer);
            return this;
        }

        @Override
        public ScopeRegistry and() {
            return scopeRegistry;
        }
    }


    @RequiredArgsConstructor
    private static class DataSourceAwareConfigurer implements DataSourceConfigurer {

        private final ApplicationContextAware contextAware;
        private final DataSourceAware aware;


        @Override
        public DataSourceConfigurer dataSourceRef(String dataSourceRef) {
            DataSource dataSource = getDataSourceByRefName(dataSourceRef);
            aware.setRef(dataSourceRef);
            aware.setDataSource(dataSource);
            return this;
        }

        private DataSource getDataSourceByRefName(String dataSourceRef) {
            return contextAware.getDataSourceByRefName(dataSourceRef);
        }

        @Override
        public DataSourceConfigurer databaseType(DatabaseType databaseType) {
            aware.setDatabaseType(databaseType);
            return this;
        }

        @Override
        public DataSourceConfigurer caseConversionStrategy(CaseConversionStrategy caseConversionStrategy) {
            aware.setCaseConversionStrategy(caseConversionStrategy);
            return this;
        }
    }
}
