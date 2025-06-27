package mpa;

import lombok.Getter;
import mpa.config.BaseMybatisPersistenceAssistantConfiguration;
import mpa.config.MybatisPersistenceAssistantConfiguration;
import mpa.config.MybatisPersistenceAssistantConfigure;
import mpa.config.MybatisPersistenceAssistantConfigurer;
import mpa.persistence.entity.*;
import mpa.persistence.event.CompositePersistenceMutationsEventListener;
import mpa.persistence.holder.*;
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
        loadPersistenceMutationsListener();
        entityLoader().load();

        auditDependencyFactory.initialize();
    }


    /**
     * configuration
     */
    private void loadConfiguration() {
        DataSourceScopeRegistry scopeRegistry = new DataSourceScopeRegistry(applicationContextAware(), scopeAware());

        MybatisPersistenceAssistantConfigure configuration = new BaseMybatisPersistenceAssistantConfiguration(
                scopeRegistry,
                auditDependencyFactory.configuration()
        );

        applicationContextAware().getBeansOf(MybatisPersistenceAssistantConfigurer.class)
                .ifPresent(configurers -> configurers.forEach(configuration::addConfigurer));

        configuration.apply();

        if (scopeRegistry.isEmptyScope()) {
            scopeRegistry.addDefaultScope();
        }

        setInstance(MybatisPersistenceAssistantConfiguration.class, configuration);
    }

    private void loadPersistenceMutationsListener() {
        CompositePersistenceMutationsEventListener mutationsEventListener = this.persistenceDependencyFactory.persistenceMutationsEventListener();
        mutationsEventListener.addListener(auditDependencyFactory.auditPersistenceMutationsEventListener());
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
        return getInstance(ScopeAware.class, ScopeAware::new);
    }

    RuntimeThreadScope runtimeThreadScope() {
        return getInstance(RuntimeThreadScope.class, RuntimeThreadScope::new);
    }

    ScopableFactory scopableFactory() {
        return getInstance(ScopableFactory.class, () -> new ScopableFactory(
                scopeAware(),
                runtimeThreadScope()
        ));
    }

    ScopeTemplate scopeTemplate() {
        return getInstance(ScopeTemplate.class, () -> new ScopeTemplate(
            scopeAware(),
            runtimeThreadScope()
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

}
