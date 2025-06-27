package mpa.fixture;

import mpa.MybatisPersistenceManager;
import org.junit.jupiter.api.extension.AfterAllCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

public class RepositoryTestExtension implements BeforeAllCallback, AfterAllCallback {

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
        ApplicationContext applicationContext = SpringExtension.getApplicationContext(extensionContext);
        generateSchema(applicationContext);
        initializeData(applicationContext);
//        generateRepository(applicationContext);
        refreshCache(applicationContext);
    }

    private void generateSchema(ApplicationContext applicationContext) {
        TestSchemaInitializer schemaInitializer = applicationContext.getBean(TestSchemaInitializer.class);
        schemaInitializer.createMemberTable();
    }

    private void initializeData(ApplicationContext applicationContext) {
        TestDataInitializer dataInitializer = applicationContext.getBean(TestDataInitializer.class);
        dataInitializer.initMemberTable();
    }

    private void generateRepository(ApplicationContext applicationContext) {
        TestRepositoryGenerator repositoryGenerator = applicationContext.getBean(TestRepositoryGenerator.class);
        repositoryGenerator.generate();
    }

    private void refreshCache(ApplicationContext applicationContext) {
        MybatisPersistenceManager manager = applicationContext.getBean(MybatisPersistenceManager.class);
        manager.refreshCache();
    }

    @Override
    public void afterAll(ExtensionContext extensionContext) {
        ApplicationContext applicationContext = SpringExtension.getApplicationContext(extensionContext);
//        clearSchema(applicationContext);
    }

    private void clearSchema(ApplicationContext applicationContext) {
        TestSchemaInitializer schemaInitializer = applicationContext.getBean(TestSchemaInitializer.class);
        schemaInitializer.dropMemberTable();
    }
}
