package mpa.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.context.AuditTracker;
import mpa.audit.executor.AuditEventExecutor;
import mpa.audit.executor.BasicAuditEventExecutor;
import mpa.audit.repository.sql.AuditSQLGenerator;
import mpa.audit.repository.sql.argument.MutationArgumentsParser;
import mpa.audit.transaction.event.AuditEventPublisher;
import mpa.audit.transaction.event.AuditTrailListener;
import mpa.audit.transaction.event.loader.AuditEventListenerLoader;
import mpa.persistence.context.PersistenceEnvironmentAttribute;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityLoader;
import mpa.persistence.holder.MutationsAnnotationHolder;

@RequiredArgsConstructor
public class BasicMybatisPersistenceManager implements MybatisPersistenceManager {

    private final EntityLoader entityLoader;
    private final ScopeAware scopeAware;
    private final Scopable<EntityCache> entityCacheScopable;
    private final AuditDependencyFactory auditDependencyFactory;
    private final PersistenceDependencyFactory persistenceDependencyFactory;


    @Override
    public void refreshCache() {
        entityLoader.load();
        auditDependencyFactory.auditSQLGenerator().generate();
    }


    @Override
    public void startAuditing() {
        PersistenceEnvironmentAttribute.activateAuditing();
    }

    @Override
    public void stopAuditing() {
        PersistenceEnvironmentAttribute.deactivateAuditing();
    }

    @Override
    public void registerAuditTrailListener(AuditTrailListener listener) {
        auditDependencyFactory.auditEventListenerLoader().addEventListener(listener);
    }

    @Override
    public AuditEventExecutor.Builder createAuditEventExecutor() {
        return new BasicAuditEventExecutor.BuilderImpl(
                scopeAware,
                entityCacheScopable,
                auditDependencyFactory.auditTracker(),
                auditDependencyFactory.eventPublisher(),
                auditDependencyFactory.mutationArgumentsParser(),
                persistenceDependencyFactory.mutationsHolder()
        );
    }
}
