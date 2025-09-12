package mpa.audit.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.entity.BootStrapEntityAuditConfigurationLoader;
import mpa.audit.config.entity.EntityAuditConfigurationContext;
import mpa.audit.config.entity.EntityAuditConfigurationLoader;
import mpa.audit.event.*;
import mpa.audit.event.loader.ApplicationAuditTrailListenerLoader;
import mpa.audit.event.loader.AuditEventListenerLoader;
import mpa.audit.filter.AllColumnsFilter;
import mpa.audit.filter.ColumnsFilter;
import mpa.audit.filter.ContextColumnsFilter;
import mpa.audit.filter.OnlyChangedColumnsFilter;
import mpa.audit.repository.AuditDataAccessRepository;
import mpa.audit.repository.DataAccessRepository;
import mpa.audit.repository.sql.AuditSQLGenerator;
import mpa.audit.repository.sql.BootStrapAuditSQLGenerator;
import mpa.audit.repository.sql.argument.ContextMutationArgumentsParser;
import mpa.audit.repository.sql.argument.MutationArgumentsParser;
import mpa.audit.repository.sql.cache.AuditSQLCache;
import mpa.audit.repository.sql.cache.InMemoryAuditSQLCache;
import mpa.context.MybatisPersistenceAssistantGlobalDependencyFactory;
import mpa.context.PersistenceDependencyFactory;
import mpa.context.ScopableDependencyFactory;
import mpa.persistence.context.ApplicationContextAware;
import mpa.persistence.context.PersistenceEnvironment;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.event.CompositePersistenceMutationsEventListener;
import mpa.persistence.event.CompositePersistenceTransactionListener;

@RequiredArgsConstructor
public class AuditDependencyFactory extends ScopableDependencyFactory {

    private final ApplicationContextAware contextAware;
    private final MybatisPersistenceAssistantGlobalDependencyFactory globalDependencyFactory;
    private final PersistenceDependencyFactory persistenceDependencyFactory;


    public void initialize() {
        loadPersistenceEventListener();
        entityAuditConfigurationLoader().load();
        cachingSQL();
        auditEventListenerLoader().loadListenerBeans();
    }

    public void cachingSQL() {
        auditSQLGenerator().generate();
    }

    private void loadPersistenceEventListener() {
        CompositePersistenceTransactionListener transactionListener = persistenceDependencyFactory.persistenceTransactionListener();
        transactionListener.addListener(auditTransactionListener());

        CompositePersistenceMutationsEventListener mutationsEventListener = persistenceDependencyFactory.persistenceMutationsEventListener();
        mutationsEventListener.addListener(auditMutationsEventListener());
    }


    /**
     * global dependency
     */

    @Override
    protected ScopeAware scopeAware() {
        return globalDependencyFactory.scopeAware();
    }

    private Scopable<EntityCache> entityCacheScopable() {
        return globalDependencyFactory.entityCache();
    }

    private PersistenceEnvironment environment() {
        return globalDependencyFactory.environment();
    }


    /**
     * configuration
     */

    private Scopable<EntityAuditConfigurationContext> entityAuditConfigurationContext() {
        return getScopableInstance(EntityAuditConfigurationContext.class, scope -> new EntityAuditConfigurationContext());
    }

    private EntityAuditConfigurationLoader entityAuditConfigurationLoader() {
        return getInstance(EntityAuditConfigurationLoader.class, () -> new BootStrapEntityAuditConfigurationLoader(
                contextAware,
                scopeAware(),
                entityAuditConfigurationContext()
        ));
    }


    /**
     * context
     */

    private AuditTrailContext auditTrailContext() {
        return getInstance(AuditTrailContext.class, ThreadAuditTrailContext::new);
    }

    public AuditTracker auditTracker() {
        return getInstance(AuditTracker.class, () -> new DataAccessAuditTracker(
                auditTrailContext(),
                trackingAuditTrailFactory(),
                auditSqlCache(),
                dataAccessRepository()
        ));
    }

    private TrackingAuditTrailFactory trackingAuditTrailFactory() {
        return getInstance(TrackingAuditTrailFactory.class, () -> new TrackingAuditTrailFactory(columnsFilter()));
    }

    private ColumnsFilter columnsFilter() {
        return getInstance(ColumnsFilter.class, () -> {
            ContextColumnsFilter filter = new ContextColumnsFilter();
            filter.addFilter(new AllColumnsFilter());
            filter.addFilter(new OnlyChangedColumnsFilter());
            return filter;
        });
    }


    /**
     * repository
     */

    private Scopable<DataAccessRepository> dataAccessRepository() {
        return getScopableInstance(DataAccessRepository.class, AuditDataAccessRepository::new);
    }

    public Scopable<MutationArgumentsParser> mutationArgumentsParser() {
        return getScopableInstance(MutationArgumentsParser.class, ContextMutationArgumentsParser::new);
    }

    public AuditSQLGenerator auditSQLGenerator() {
        return getInstance(AuditSQLGenerator.class, () -> new BootStrapAuditSQLGenerator(
            scopeAware(),
            entityCacheScopable(),
            auditSqlCache(),
            entityAuditConfigurationContext()
        ));
    }

    private Scopable<AuditSQLCache> auditSqlCache() {
        return getScopableInstance(AuditSQLCache.class, scope -> new InMemoryAuditSQLCache());
    }


    /**
     * event
     */

    public AuditTransactionListener auditTransactionListener() {
        return getInstance(AuditTransactionListener.class, () -> new AuditTransactionListener(
           auditTracker(),
           eventPublisher()
        ));
    }

    public AuditMutationsEventListener auditMutationsEventListener() {
        return getInstance(AuditMutationsEventListener.class, () -> new AuditMutationsEventListener(
                environment(),
                auditTracker(),
                entityCacheScopable(),
                mutationArgumentsParser()
        ));
    }

    public AuditEventListenerLoader auditEventListenerLoader() {
        return getInstance(AuditEventListenerLoader.class, () -> new ApplicationAuditTrailListenerLoader(
                contextAware,
                scopeAware(),
                auditEventHandler()
        ));
    }

    public AuditEventPublisher eventPublisher() {
        return getInstance(AuditEventPublisher.class, () -> new ScopableAuditEventPublisher(
                scopeAware(),
                auditEventHandler()
        ));
    }

    private Scopable<CompositeAuditEventHandler> auditEventHandler() {
        return getScopableInstance(CompositeAuditEventHandler.class, scope -> new CompositeAuditEventHandler());
    }

}