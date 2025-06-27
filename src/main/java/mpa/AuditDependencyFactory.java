package mpa;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.AuditConfiguration;
import mpa.audit.config.DefaultAuditConfiguration;
import mpa.audit.context.*;
import mpa.audit.event.AuditPersistenceMutationsEventListener;
import mpa.audit.repository.dataaccess.AuditDataAccessRepository;
import mpa.audit.repository.dataaccess.DataAccessRepository;
import mpa.audit.repository.dataaccess.ScopableDataAccessRepository;
import mpa.audit.repository.dataaccess.sql.*;
import mpa.audit.repository.dataaccess.sql.argument.MutationArgumentsParser;
import mpa.audit.repository.dataaccess.sql.argument.ScopableMutationArgumentsParser;
import mpa.audit.repository.dataaccess.sql.argument.SingleEntityMutationArgumentsParser;
import mpa.audit.transaction.AuditTransactionListener;
import mpa.audit.transaction.AuditTransactionListenerImpl;
import mpa.audit.transaction.event.*;
import mpa.audit.transaction.event.loader.AnnotationAuditEventListenerLoader;
import mpa.audit.transaction.event.loader.AuditEventListenerLoader;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.holder.*;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class AuditDependencyFactory extends AbstractDependencyFactory {

    private final MybatisPersistenceAssistantGlobalDependencyFactory globalDependencyFactory;


    void initialize() {
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
     * configuration
     */
    AuditConfiguration configuration() {
        return getInstance(AuditConfiguration.class, DefaultAuditConfiguration::new);
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
                trackingAuditTrailFactory()
        ));
    }

    private TrackingAuditTrailFactory trackingAuditTrailFactory() {
        return getInstance(TrackingAuditTrailFactory.class, () -> new TrackingAuditTrailFactory(configuration().trackingStrategy()));
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
            Scopable<MutationArgumentsParser> parserScopable = scopableFactory().create(SingleEntityMutationArgumentsParser::new);
            return new ScopableMutationArgumentsParser(parserScopable);
        });
    }

    private AuditSQLGenerator auditSQLGenerator() {
        return getInstance(AuditSQLGenerator.class, () -> new BootStrapAuditSQLGenerator(
            scopeTemplate(),
            entityCache(),
            sqlCache()
        ));
    }

    private AuditSQLCache sqlCache() {
        return getInstance(AuditSQLCache.class, () -> {
            Scopable<AuditSQLCache> auditSQLCacheScopable = scopableFactory().create(InMemoryAuditSQLCache::new);
            return new ScopableAuditSQLCache(auditSQLCacheScopable);
        });
    }


    /**
     * event
     */
    AuditPersistenceMutationsEventListener auditPersistenceMutationsEventListener() {
        return getInstance(AuditPersistenceMutationsEventListener.class, () -> new AuditPersistenceMutationsEventListener(
                entityCache(),
                auditTracker(),
                mutationArgumentsParser(),
                transactionListener()
        ));
    }

    private AuditEventListenerLoader eventListenerLoader() {
        return getInstance(AuditEventListenerLoader.class, () -> new AnnotationAuditEventListenerLoader(
                applicationContextAware(),
                scopeAware()
        ));
    }

    private AuditTransactionListener transactionListener() {
        return getInstance(AuditTransactionListener.class, () -> new AuditTransactionListenerImpl(auditTracker(), eventPublisher()));
    }

    private AuditEventPublisher eventPublisher() {
        return getInstance(AuditEventPublisher.class, () -> {
            AuditEventListenerLoader eventListenerLoader = eventListenerLoader();
            Map<Scope, List<AuditEventListener>> listenersByScope = eventListenerLoader.loadListenersByScope();
            Scopable<AuditEventListener> eventListenerScopable = scopableFactory()
                    .create(scope -> new CompositeAuditEventListener(listenersByScope.get(scope)));
            return new AuditEventPublisherImpl(new ScopableAuditEventListener(eventListenerScopable));
        });
    }

}