package mpa.context;

import lombok.Getter;
import mpa.audit.context.AuditDependencyFactory;
import mpa.config.BaseMybatisPersistenceAssistantConfiguration;
import mpa.config.MybatisPersistenceAssistantConfiguration;
import mpa.config.MybatisPersistenceAssistantConfigurer;
import mpa.persistence.context.*;
import mpa.persistence.entity.*;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;

@Getter
public class MybatisPersistenceAssistantGlobalDependencyFactory extends ScopableDependencyFactory {

    private final ApplicationContextAware contextAware;
    private final PersistenceDependencyFactory persistenceDependencyFactory;


    public MybatisPersistenceAssistantGlobalDependencyFactory(ApplicationContext applicationContext) {
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

        MybatisPersistenceAssistantConfiguration configuration = new BaseMybatisPersistenceAssistantConfiguration(scopeRegistry);

        contextAware.getBeansOf(MybatisPersistenceAssistantConfigurer.class)
                .ifPresent(configurers -> configurers.forEach(configuration::addConfigurer));

        configuration.apply();

        if (scopeRegistry.isEmptyScope()) {
            DataSource dataSource = contextAware.getBean(DataSource.class);
            scopeRegistry.addDefaultScope(dataSource);
        }

        setInstance(MybatisPersistenceAssistantConfiguration.class, configuration);
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
                contextAware,
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
