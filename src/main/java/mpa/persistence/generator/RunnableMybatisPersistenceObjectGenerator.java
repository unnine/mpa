package mpa.persistence.generator;

import lombok.RequiredArgsConstructor;
import mpa.persistence.context.Scope;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class RunnableMybatisPersistenceObjectGenerator {

    private static final Set<MybatisPersistenceGeneratorScope> scopes = new HashSet<>();


    public void generate() {
        JDBCMybatisPersistenceObjectGenerator generator = new JDBCMybatisPersistenceObjectGenerator(scopes);
        generator.generate();
    }

    public ScopeConfigurer addDefaultScope() {
        return addScope(Scope.DEFAULT_NAME);
    }

    public ScopeConfigurer addScope(String name) {
        MybatisPersistenceGeneratorScope scope = new MybatisPersistenceGeneratorScope();
        DataSourceConfigurer dataSourceConfigurer = new DataSourceConfigurer(scope.getDataSource());
        scopes.add(scope);
        ScopeConfigurer scopeConfigurer = new ScopeConfigurer(this, scope, dataSourceConfigurer);
        scopeConfigurer.name(name);
        return scopeConfigurer;
    }


    @RequiredArgsConstructor
    public static class ScopeConfigurer {

        private final RunnableMybatisPersistenceObjectGenerator and;
        private final MybatisPersistenceGeneratorScope scope;
        private final DataSourceConfigurer dataSourceConfigurer;


        public ScopeConfigurer name(String name) {
            scope.setName(name);
            return this;
        }

        public ScopeConfigurer namespace(String namespace) {
            scope.setNamespace(namespace);
            return this;
        }

        public ScopeConfigurer dataSource(Consumer<DataSourceConfigurer> handler) {
            handler.accept(dataSourceConfigurer);
            return this;
        }

        public RunnableMybatisPersistenceObjectGenerator and() {
            return and;
        }
    }


    @RequiredArgsConstructor
    public static class DataSourceConfigurer {

        private final MybatisPersistenceGeneratorDataSource dataSource;


        public DataSourceConfigurer driverClassName(String driverClassName) {
            dataSource.setDriverClassName(driverClassName);
            return this;
        }

        public DataSourceConfigurer connectionURL(String connectionURL) {
            dataSource.setConnectionURL(connectionURL);
            return this;
        }

        public DataSourceConfigurer username(String username) {
            dataSource.setUsername(username);
            return this;
        }

        public DataSourceConfigurer password(String password) {
            dataSource.setPassword(password);
            return this;
        }

        public DataSourceConfigurer schema(String schema) {
            dataSource.setSchema(schema);
            return this;
        }

        private MybatisPersistenceGeneratorDataSource getDataSource() {
            return dataSource;
        }
    }
}
