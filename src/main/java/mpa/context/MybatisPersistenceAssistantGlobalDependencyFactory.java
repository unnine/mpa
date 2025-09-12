package mpa.context;

import lombok.Getter;
import mpa.audit.context.AuditDependencyFactory;
import mpa.config.MybatisPersistenceAssistantConfiguration;
import mpa.persistence.context.*;
import mpa.persistence.entity.*;
import org.springframework.context.support.GenericApplicationContext;

@Getter
public class MybatisPersistenceAssistantGlobalDependencyFactory extends ScopableDependencyFactory {

    private final ApplicationContextAware contextAware;
    private final PersistenceDependencyFactory persistenceDependencyFactory;


    public MybatisPersistenceAssistantGlobalDependencyFactory(GenericApplicationContext applicationContext) {
        this.contextAware = new ApplicationContextAware(applicationContext);
        this.persistenceDependencyFactory = new PersistenceDependencyFactory(this);

        initialize();

        AuditDependencyFactory auditDependencyFactory = new AuditDependencyFactory(contextAware, this, persistenceDependencyFactory);
        auditDependencyFactory.initialize();

        setInstance(MybatisPersistenceAssistant.class, new MybatisPersistenceAssistantImpl(
                environment(),
                entityLoader(),
                scopeAware(),
                entityCache(),
                auditDependencyFactory
        ));
    }


    public void initialize() {
        loadConfiguration();
        entityLoader().load();
    }


    /**
     * environment
     */

    public PersistenceEnvironment environment() {
        return getInstance(PersistenceEnvironment.class, PersistenceEnvironment::new);
    }


    /**
     * configuration
     */

    private void loadConfiguration() {
        DataSourceScopeRegistry scopeRegistry = new DataSourceScopeRegistry(contextAware, scopeAware());
        MybatisPersistenceAssistantConfiguration configuration = new MybatisPersistenceAssistantConfiguration(contextAware, scopeRegistry);
        configuration.apply();

        RepositoryBeanRegister beanRegister = new RepositoryBeanRegister(contextAware, scopeAware());
        beanRegister.registerMapperBeans();
    }


    /**
     * holder
     */

    @Override
    public ScopeAware scopeAware() {
        return getInstance(ScopeAware.class, ScopeAware::new);
    }


    /**
     * entity
     */

    public EntityLoader entityLoader() {
        return getInstance(EntityLoader.class, () -> new BootStrapEntityLoader(
                scopeAware(),
                entityCache(),
                entityMetaDataRepository()
        ));
    }

    private Scopable<EntityMetaDataRepository> entityMetaDataRepository() {
        return getScopableInstance(EntityMetaDataRepository.class, BasicEntityMetaDataRepository::new);
    }

    public Scopable<EntityCache> entityCache() {
        return getScopableInstance(EntityCache.class, InMemoryEntityCache::new);
    }


    /**
     * util
     */

    MybatisPersistenceAssistant mybatisPersistenceAssistant() {
        return getInstance(MybatisPersistenceAssistant.class);
    }

}
