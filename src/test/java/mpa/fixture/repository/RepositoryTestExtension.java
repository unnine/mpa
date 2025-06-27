package mpa.fixture.repository;

import mpa.MybatisPersistenceManager;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

public class RepositoryTestExtension implements BeforeAllCallback {

    @Override
    public void beforeAll(ExtensionContext extensionContext) {
        ApplicationContext applicationContext = SpringExtension.getApplicationContext(extensionContext);
        generateSchema(applicationContext);
        initializeData(applicationContext);
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

    private void refreshCache(ApplicationContext applicationContext) {
        MybatisPersistenceManager manager = applicationContext.getBean(MybatisPersistenceManager.class);
        manager.refreshCache();
    }

}
