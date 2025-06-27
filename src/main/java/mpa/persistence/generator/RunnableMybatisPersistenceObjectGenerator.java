package mpa.persistence.generator;

import lombok.RequiredArgsConstructor;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class RunnableMybatisPersistenceObjectGenerator implements MybatisPersistenceObjectGenerator {

    private static final Set<MybatisPersistenceGeneratorScope> scopes = new HashSet<>();


    @Override
    public void generate() {
        MybatisPersistenceObjectGenerator generator = new JDBCMybatisPersistenceObjectGenerator(scopes);
        generator.generate();
    }

    public RunnableMybatisPersistenceObjectGenerator addScope(Consumer<ScopeConfigure> scopeConfigurer) {
        MybatisPersistenceGeneratorScope scope = new MybatisPersistenceGeneratorScope();
        DataSourceConfigure dataSourceConfigure = new DataSourceConfigure(scope.getDataSource());
        ScopeConfigure scopeConfigure = new ScopeConfigure(scope, dataSourceConfigure);
        scopeConfigurer.accept(scopeConfigure);
        scopes.add(scope);
        return this;
    }


    @RequiredArgsConstructor
    public static class ScopeConfigure {

        private final MybatisPersistenceGeneratorScope scope;
        private final DataSourceConfigure dataSourceConfigure;


        public ScopeConfigure name(String name) {
            scope.setName(name);
            return this;
        }

        public ScopeConfigure namespace(String namespace) {
            scope.setNamespace(namespace);
            return this;
        }

        public ScopeConfigure dataSource(Consumer<DataSourceConfigure> dataSourceConfigurer) {
            dataSourceConfigurer.accept(dataSourceConfigure);
            return this;
        }
    }


    @RequiredArgsConstructor
    public static class DataSourceConfigure {

        private final MybatisPersistenceGeneratorDataSource dataSource;


        public DataSourceConfigure driverClassName(String driverClassName) {
            dataSource.setDriverClassName(driverClassName);
            return this;
        }

        public DataSourceConfigure connectionURL(String connectionURL) {
            dataSource.setConnectionURL(connectionURL);
            return this;
        }

        public DataSourceConfigure username(String username) {
            dataSource.setUsername(username);
            return this;
        }

        public DataSourceConfigure password(String password) {
            dataSource.setPassword(password);
            return this;
        }

        public DataSourceConfigure schema(String schema) {
            dataSource.setSchema(schema);
            return this;
        }
    }
}
