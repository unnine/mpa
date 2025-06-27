package mpa;

import lombok.Getter;
import mpa.config.BaseMybatisPersistenceAssistantConfiguration;
import mpa.config.MybatisPersistenceAssistantConfiguration;
import mpa.config.MybatisPersistenceAssistantConfigurer;
import mpa.persistence.context.*;
import mpa.persistence.entity.*;
import mpa.persistence.event.ContextPersistenceMutationsEventListener;
import mpa.persistence.event.ContextPersistenceTransactionListener;
import org.springframework.context.ApplicationContext;

@Getter
public class MybatisPersistenceAssistantGlobalDependencyFactory extends AbstractDependencyFactory {

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
            scopeRegistry.addDefaultScope();
        }

        setInstance(MybatisPersistenceAssistantConfiguration.class, configuration);
    }

    private void loadPersistenceEventListener() {
        ContextPersistenceTransactionListener persistenceTransactionListener = this.persistenceDependencyFactory.persistenceTransactionListener();
        persistenceTransactionListener.addListener(auditDependencyFactory.auditPersistenceTransactionListener());

        ContextPersistenceMutationsEventListener persistenceMutationsEventListener = this.persistenceDependencyFactory.persistenceMutationsEventListener();
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

    ScopeAware scopeAware() {
        return getInstance(ScopeAware.class, () -> new ScopeAware(applicationContextAware()));
    }

    RuntimeThreadAttribute runtimeThreadAttribute() {
        return getInstance(RuntimeThreadAttribute.class, RuntimeThreadAttribute::new);
    }

    ScopableFactory scopableFactory() {
        return getInstance(ScopableFactory.class, () -> new ScopableFactory(
                scopeAware(),
                runtimeThreadAttribute()
        ));
    }

    ScopeTemplate scopeTemplate() {
        return getInstance(ScopeTemplate.class, () -> new ScopeTemplate(
            scopeAware(),
            runtimeThreadAttribute()
        ));
    }


    /**
     * entity
     */
    public EntityLoader entityLoader() {
        return getInstance(EntityLoader.class, () -> new BootStrapEntityLoader(
                applicationContextAware(),
                scopeTemplate(),
                entityCache(),
                entityMetaDataRepository()
        ));
    }

    private EntityMetaDataRepository entityMetaDataRepository() {
        return getInstance(EntityMetaDataRepository.class, () -> {
            Scopable<EntityMetaDataRepository> repositoryScopable = scopableFactory().create(EntityMetaDataRepositoryImpl::new);
            return new ScopableEntityMetaDataRepository(repositoryScopable);
        });
    }

    EntityCache entityCache() {
        return getInstance(EntityCache.class, () -> {
            Scopable<EntityCache> entityCacheScopable = scopableFactory().create(InMemoryEntityCache::new);
            return new ScopableEntityCache(entityCacheScopable);
        });
    }


    /**
     * util
     */
    MybatisPersistenceManager mybatisPersistenceManager() {
        return getInstance(MybatisPersistenceManager.class, () -> new DefaultMybatisPersistenceManager(
                entityLoader(),
                auditDependencyFactory.auditSQLGenerator(),
                auditDependencyFactory.auditEventListenerLoader()
        ));
    }

}
