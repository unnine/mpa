package mpa.context;

import lombok.Getter;
import mpa.config.BaseMybatisPersistenceAssistantConfiguration;
import mpa.config.MybatisPersistenceAssistantConfiguration;
import mpa.config.MybatisPersistenceAssistantConfigurer;
import mpa.persistence.context.ApplicationContextAware;
import mpa.persistence.context.DataSourceScopeRegistry;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.*;
import mpa.persistence.event.CompositePersistenceMutationsEventListener;
import mpa.persistence.event.CompositePersistenceTransactionListener;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

@Getter
public class MybatisPersistenceAssistantGlobalDependencyFactory extends ScopableDependencyFactory {

    private final PersistenceDependencyFactory persistenceDependencyFactory;
    private final AuditDependencyFactory auditDependencyFactory;


    public MybatisPersistenceAssistantGlobalDependencyFactory(ApplicationContext applicationContext) {
        this.persistenceDependencyFactory = new PersistenceDependencyFactory(this);
        this.auditDependencyFactory = new AuditDependencyFactory(this);

        setApplicationContext(applicationContext);
        loadConfiguration();
        loadPersistenceEventListener();
        entityLoader().load();

        auditDependencyFactory.initialize();
    }


    /**
     * configuration
     */
    private void loadConfiguration() {
        DataSourceScopeRegistry scopeRegistry = new DataSourceScopeRegistry(applicationContextAware(), scopeAware());

        MybatisPersistenceAssistantConfiguration configuration = new BaseMybatisPersistenceAssistantConfiguration(scopeRegistry);

        applicationContextAware().getBeansOf(MybatisPersistenceAssistantConfigurer.class)
                .ifPresent(configurers -> configurers.forEach(configuration::addConfigurer));

        configuration.apply();

        if (scopeRegistry.isEmptyScope()) {
            DataSource dataSource = applicationContextAware().getBean(DataSource.class);
            scopeRegistry.addDefaultScope(dataSource);
        }

        ScopeAware scopes = scopeAware();

        setInstance(MybatisPersistenceAssistantConfiguration.class, configuration);
    }

    private void loadPersistenceEventListener() {
        CompositePersistenceTransactionListener persistenceTransactionListener = persistenceDependencyFactory.persistenceTransactionListener();
        persistenceTransactionListener.addListener(auditDependencyFactory.auditPersistenceTransactionListener());

        CompositePersistenceMutationsEventListener persistenceMutationsEventListener = persistenceDependencyFactory.persistenceMutationsEventListener();
        persistenceMutationsEventListener.addListener(auditDependencyFactory.auditPersistenceMutationsEventListener());
    }


    /**
     * holder
     */
    private void setApplicationContext(ApplicationContext applicationContext) {
        setInstance(ApplicationContextAware.class, new ApplicationContextAware(applicationContext));
    }

    ApplicationContextAware applicationContextAware() {
        return getInstance(ApplicationContextAware.class);
    }

    @Override
    protected ScopeAware scopeAware() {
        return getInstance(ScopeAware.class, ScopeAware::new);
    }

    /**
     * entity
     */
    public EntityLoader entityLoader() {
        return getInstance(EntityLoader.class, () -> new BootStrapEntityLoader(
                applicationContextAware(),
                scopeAware(),
                entityCache(),
                entityMetaDataRepository()
        ));
    }

    private Scopable<EntityMetaDataRepository> entityMetaDataRepository() {
        return getScopableInstance(EntityMetaDataRepository.class, BasicEntityMetaDataRepository::new);
    }

    Scopable<EntityCache> entityCache() {
        return getScopableInstance(EntityCache.class, InMemoryEntityCache::new);
    }


    /**
     * util
     */
    MybatisPersistenceManager mybatisPersistenceManager() {
        return getInstance(MybatisPersistenceManager.class, () -> new BasicMybatisPersistenceManager(
                entityLoader(),
                scopeAware(),
                entityCache(),
                auditDependencyFactory,
                persistenceDependencyFactory
        ));
    }

}
