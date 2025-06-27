package mpa;

import lombok.RequiredArgsConstructor;
import mpa.audit.context.*;
import mpa.audit.context.filter.ColumnsFilter;
import mpa.audit.context.filter.ScopableColumnsFilter;
import mpa.audit.event.AuditPersistenceMutationsEventListener;
import mpa.audit.repository.dataaccess.AuditDataAccessRepository;
import mpa.audit.repository.dataaccess.DataAccessRepository;
import mpa.audit.repository.dataaccess.ScopableDataAccessRepository;
import mpa.audit.repository.dataaccess.sql.*;
import mpa.audit.repository.dataaccess.sql.argument.ContextMutationArgumentsParser;
import mpa.audit.repository.dataaccess.sql.argument.MutationArgumentsParser;
import mpa.audit.repository.dataaccess.sql.argument.ScopableMutationArgumentsParser;
import mpa.audit.transaction.AuditPersistenceTransactionListener;
import mpa.audit.transaction.event.*;
import mpa.audit.transaction.event.loader.AnnotationAuditEventListenerLoader;
import mpa.audit.transaction.event.loader.AuditEventListenerLoader;
import mpa.persistence.context.*;
import mpa.persistence.entity.EntityCache;

@RequiredArgsConstructor
public class AuditDependencyFactory extends AbstractDependencyFactory {

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

    private EntityCache entityCache() {
        return globalDependencyFactory.entityCache();
    }

    private ScopeAware scopeAware() {
        return globalDependencyFactory.scopeAware();
    }

    private ScopableFactory scopableFactory(){
        return globalDependencyFactory.scopableFactory();
    }

    private ScopeTemplate scopeTemplate() {
        return globalDependencyFactory.scopeTemplate();
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
                dataAccessRepository(),
                trackingAuditTrailFactory(),
                auditSqlCache()
        ));
    }

    private TrackingAuditTrailFactory trackingAuditTrailFactory() {
        return getInstance(TrackingAuditTrailFactory.class, () -> new TrackingAuditTrailFactory(columnsFilter()));
    }

    private ColumnsFilter columnsFilter() {
        return getInstance(ColumnsFilter.class, () -> {
            Scopable<ColumnsFilter> repositoryScopable = scopableFactory().create(scope -> scope.getAuditAttribute().getTrackingStrategy().getColumnsFilter());
            return new ScopableColumnsFilter(repositoryScopable);
        });
    }


    /**
     * repository
     */
    private DataAccessRepository dataAccessRepository() {
        return getInstance(DataAccessRepository.class, () -> {
            Scopable<DataAccessRepository> repositoryScopable = scopableFactory().create(AuditDataAccessRepository::new);
            return new ScopableDataAccessRepository(repositoryScopable);
        });
    }

    private MutationArgumentsParser mutationArgumentsParser() {
        return getInstance(MutationArgumentsParser.class, () -> {
            Scopable<MutationArgumentsParser> parserScopable = scopableFactory().create(ContextMutationArgumentsParser::new);
            return new ScopableMutationArgumentsParser(parserScopable);
        });
    }

    AuditSQLGenerator auditSQLGenerator() {
        return getInstance(AuditSQLGenerator.class, () -> new BootStrapAuditSQLGenerator(
            scopeTemplate(),
            entityCache(),
            auditSqlCache()
        ));
    }

    private AuditSQLCache auditSqlCache() {
        return getInstance(AuditSQLCache.class, () -> {
            Scopable<AuditSQLCache> auditSQLCacheScopable = scopableFactory().create(InMemoryAuditSQLCache::new);
            return new ScopableAuditSQLCache(auditSQLCacheScopable);
        });
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
        return getInstance(AuditEventListenerLoader.class, () -> new AnnotationAuditEventListenerLoader(
                applicationContextAware(),
                auditEventListener(),
                scopeAware()
        ));
    }

    private AuditEventPublisher eventPublisher() {
        return getInstance(AuditEventPublisher.class, () -> new AuditEventPublisherImpl(auditEventListener()));
    }

    private ContextAuditEventListener auditEventListener() {
        return getInstance(ContextAuditEventListener.class, () -> new ScopableAuditEventListener(
                scopableFactory().create(scope -> new ContextAuditEventListenerImpl())
        ));
    }

}