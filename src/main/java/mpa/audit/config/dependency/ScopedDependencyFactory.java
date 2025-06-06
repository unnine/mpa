package mpa.audit.config.dependency;

import mpa.audit.aop.AuditAdvice;
import mpa.audit.config.AuditConfigurer;
import mpa.audit.config.DefaultScopedAuditConfiguration;
import mpa.audit.config.ScopedAuditConfiguration;
import mpa.audit.config.holder.AuditApplicationContextAware;
import mpa.audit.config.holder.AuditScopeAware;
import mpa.audit.config.holder.DataSourceAware;
import mpa.audit.context.AuditTracker;
import mpa.audit.context.DataAccessAuditTracker;
import mpa.audit.context.TrackingAuditTrailFactory;
import mpa.audit.repository.database.DataAccessRepository;
import mpa.audit.repository.database.DatabaseAccessRepository;
import mpa.audit.repository.database.sql.DefaultQueryWriter;
import mpa.audit.repository.database.sql.EntityJoinQueryWriter;
import mpa.audit.repository.database.sql.JoinQueryWriter;
import mpa.audit.repository.database.sql.QueryWriter;
import mpa.audit.repository.database.sql.parameter.QueryArgumentsParser;
import mpa.audit.repository.database.sql.parameter.QueryArgumentsParserProvider;
import mpa.audit.transaction.AuditTransactionListener;
import mpa.audit.transaction.AuditTransactionListenerImpl;
import mpa.audit.transaction.event.AuditEventPublisher;
import mpa.audit.transaction.event.AuditEventPublisherImpl;
import mpa.audit.transaction.event.loader.AnnotationAuditEventListenerLoader;
import mpa.audit.transaction.event.loader.AuditEventListenerLoader;
import mpa.entity.cache.EntityCache;
import mpa.loader.EntityLoader;
import mpa.loader.RuntimeEntityLoader;

public class ScopedDependencyFactory extends AbstractDependencyFactory {

    private final SharedDependencyFactory sharedDependencyFactory;


    public ScopedDependencyFactory(SharedDependencyFactory sharedDependencyFactory, AuditScopeAware scopeAware) {
        super();

        this.sharedDependencyFactory = sharedDependencyFactory;

        AuditApplicationContextAware applicationContextAware = sharedDependencyFactory.applicationContextAware();
        DataSourceAware dataSourceAware = applicationContextAware.createDataSourceAware(scopeAware.dataSourceRef());

        setInstance(AuditApplicationContextAware.class, applicationContextAware);
        setInstance(DataSourceAware.class, dataSourceAware);
        setInstance(AuditScopeAware.class, scopeAware);

        setConfiguration(scopeAware);
    }


    /**
     * context
     */
    private AuditApplicationContextAware applicationContextAware() {
        return getInstance(AuditApplicationContextAware.class);
    }

    private DataSourceAware dataSourceAware() {
        return getInstance(DataSourceAware.class);
    }

    private AuditScopeAware scopeAware() {
        return getInstance(AuditScopeAware.class);
    }

    private AuditTracker auditTracker() {
        return getInstance(AuditTracker.class, () -> new DataAccessAuditTracker(
            sharedDependencyFactory.auditTrailContext(),
            dataAccessRepository(),
            trackingAuditTrailFactory()
        ));
    }

    private TrackingAuditTrailFactory trackingAuditTrailFactory() {
        return getInstance(TrackingAuditTrailFactory.class, () -> new TrackingAuditTrailFactory(
                scopeAware(),
                configuration()
        ));
    }


    /**
     * configuration
     */
    private void setConfiguration(AuditScopeAware scopeAware) {
        ScopedAuditConfiguration auditConfiguration = new DefaultScopedAuditConfiguration();

        AuditConfigurer configurerBean = applicationContextAware().getBean(scopeAware.configurerClass());
        if (configurerBean != null) {
            configurerBean.configure(auditConfiguration);
        }
        setInstance(ScopedAuditConfiguration.class, auditConfiguration);
    }

    private ScopedAuditConfiguration configuration() {
        return getInstance(ScopedAuditConfiguration.class);
    }


    /**
     * entity
     */
    private EntityCache entityCache() {
        return getInstance(EntityCache.class, InMemoryEntityCache::new);
    }

    public EntityLoader entityLoader() {
        return getInstance(EntityLoader.class, () -> new RuntimeEntityLoader(
                applicationContextAware(),
                configuration(),
                scopeAware(),
                entityCache(),
                dataAccessRepository(),
                queryWriter()
        ));
    }


    /**
     * aop
     */
    public AuditAdvice auditAdvice() {
        return getInstance(AuditAdvice.class, () -> new AuditAdvice(
                entityCache(),
                auditTracker(),
                transactionListener(),
                queryArgumentsParser()
        ));
    }


    /**
     * repository
     */
    private DataAccessRepository dataAccessRepository() {
        return getInstance(DataAccessRepository.class, () -> new DatabaseAccessRepository(dataSourceAware()));
    }

    private QueryArgumentsParser queryArgumentsParser() {
        return getInstance(QueryArgumentsParser.class, () -> new QueryArgumentsParserProvider(configuration()));
    }

    private QueryWriter queryWriter() {
        return getInstance(QueryWriter.class, () -> new DefaultQueryWriter(
                configuration(),
                entityCache(),
                new JoinQueryWriter(configuration(), entityCache()),
                new EntityJoinQueryWriter(configuration(), entityCache())
        ));
    }


    /**
     * event
     */
    AuditEventListenerLoader eventListenerLoader() {
        return getInstance(AuditEventListenerLoader.class, () -> new AnnotationAuditEventListenerLoader(
                applicationContextAware(),
                scopeAware()
        ));
    }

    AuditTransactionListener transactionListener() {
        return getInstance(AuditTransactionListener.class, () -> new AuditTransactionListenerImpl(auditTracker(), eventPublisher()));
    }

    AuditEventPublisher eventPublisher() {
        return getInstance(AuditEventPublisher.class, () -> new AuditEventPublisherImpl(eventListenerLoader()));
    }

}