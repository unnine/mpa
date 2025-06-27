package mpa.fixture.repository.generator;

import mpa.persistence.generator.RunnableMybatisPersistenceObjectGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestRepositoryGenerator {

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.url}")
    private String connectionURL;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;


    public void generate() {
        RunnableMybatisPersistenceObjectGenerator generator = new RunnableMybatisPersistenceObjectGenerator();
        generator.addScope(scopeConfigure -> scopeConfigure
                .name("testdb")
                .dataSource(dataSourceConfigure -> dataSourceConfigure
                        .driverClassName(driverClassName)
                        .connectionURL(connectionURL)
                        .username(username)
                        .password(password)
                        .schema("PUBLIC")));
        generator.generate();
    }
}
