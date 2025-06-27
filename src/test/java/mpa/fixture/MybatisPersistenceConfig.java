package mpa.fixture;

import mpa.config.MybatisPersistenceAssistantConfigurer;
import mpa.persistence.config.ScopeRegistry;
import mpa.persistence.dataaccess.DatabaseType;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPersistenceConfig implements MybatisPersistenceAssistantConfigurer {

    @Override
    public void addScope(ScopeRegistry registry) {
        registry
                .addScope("test_db")
                .database(dataSourceConfigurer -> dataSourceConfigurer
                        .dataSourceRef("dataSource")
                        .databaseType(DatabaseType.H2)
                );
    }

}
