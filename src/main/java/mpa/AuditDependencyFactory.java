package mpa;

import lombok.RequiredArgsConstructor;
import mpa.audit.context.*;
import mpa.audit.filter.AllColumnsFilter;
import mpa.audit.filter.ColumnsFilter;
import mpa.audit.filter.ContextColumnsFilter;
import mpa.audit.filter.OnlyChangedColumnsFilter;
import mpa.audit.event.AuditPersistenceMutationsEventListener;
import mpa.audit.repository.dataaccess.AuditDataAccessRepository;
import mpa.audit.repository.dataaccess.DataAccessRepository;
import mpa.audit.repository.dataaccess.sql.AuditSQLCache;
import mpa.audit.repository.dataaccess.sql.AuditSQLGenerator;
import mpa.audit.repository.dataaccess.sql.BootStrapAuditSQLGenerator;
import mpa.audit.repository.dataaccess.sql.InMemoryAuditSQLCache;
import mpa.audit.repository.dataaccess.sql.argument.ContextMutationArgumentsParser;
import mpa.audit.repository.dataaccess.sql.argument.MutationArgumentsParser;
import mpa.audit.transaction.AuditPersistenceTransactionListener;
import mpa.audit.transaction.event.AuditEventPublisher;
import mpa.audit.transaction.event.AuditEventPublisherImpl;
import mpa.audit.transaction.event.ContextAuditEventListener;
import mpa.audit.transaction.event.ContextAuditEventListenerImpl;
import mpa.audit.transaction.event.loader.ApplicationAuditEventListenerLoader;
import mpa.audit.transaction.event.loader.AuditEventListenerLoader;
import mpa.persistence.context.ApplicationContextAware;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.EntityCache;

@RequiredArgsConstructor
public class AuditDependencyFactory extends ScopableDependencyFactory {

    private final MybatisPersistenceAssistantGlobalDependencyFactory globalDependencyFactory;


    void initialize() {
        auditEventListenerLoader().loadListenerBeans();
        auditSQLGenerator().generate();
    }


    /**
     * global dependency
     */
    private ApplicationContextAware applicationContextAware() {
        return globalDependencyFactory.applicationContextAware();
    }

    private Scopable<EntityCache> entityCache() {
        return globalDependencyFactory.entityCache();
    }

    @Override
    protected ScopeAware scopeAware() {
        return globalDependencyFactory.scopeAware();
    }


    /**
     * context
     */
    private AuditTrailContext auditTrailContext() {
        return getInstance(AuditTrailContext.class, ThreadAuditTrailContext::new);
    }

    private AuditTracker auditTracker() {
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

    private Scopable<MutationArgumentsParser> mutationArgumentsParser() {
        return getScopableInstance(MutationArgumentsParser.class, ContextMutationArgumentsParser::new);
    }

    AuditSQLGenerator auditSQLGenerator() {
        return getInstance(AuditSQLGenerator.class, () -> new BootStrapAuditSQLGenerator(
            scopeAware(),
            entityCache(),
            auditSqlCache()
        ));
    }

    private Scopable<AuditSQLCache> auditSqlCache() {
        return getScopableInstance(AuditSQLCache.class, scope -> new InMemoryAuditSQLCache());
    }


    /**
     * event
     */
    AuditPersistenceTransactionListener auditPersistenceTransactionListener() {
        return getInstance(AuditPersistenceTransactionListener.class, () -> new AuditPersistenceTransactionListener(
           auditTracker(),
           eventPublisher()
        ));
    }

    AuditPersistenceMutationsEventListener auditPersistenceMutationsEventListener() {
        return getInstance(AuditPersistenceMutationsEventListener.class, () -> new AuditPersistenceMutationsEventListener(
                entityCache(),
                auditTracker(),
                mutationArgumentsParser()
        ));
    }

    AuditEventListenerLoader auditEventListenerLoader() {
        return getInstance(AuditEventListenerLoader.class, () -> new ApplicationAuditEventListenerLoader(
                applicationContextAware(),
                scopeAware(),
                auditEventListener()
        ));
    }

    private AuditEventPublisher eventPublisher() {
        return getInstance(AuditEventPublisher.class, () -> new AuditEventPublisherImpl(
                scopeAware(),
                auditEventListener()
        ));
    }

    private Scopable<ContextAuditEventListener> auditEventListener() {
        return getScopableInstance(ContextAuditEventListener.class, scope -> new ContextAuditEventListenerImpl());
    }

}