package mpa.context;

import lombok.RequiredArgsConstructor;
import mpa.audit.context.AuditDependencyFactory;
import mpa.audit.event.AuditEventExecutor;
import mpa.audit.event.AuditTrailListener;
import mpa.audit.event.BasicAuditEventExecutor;
import mpa.persistence.context.PersistenceEnvironment;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.entity.EntityCache;
import mpa.persistence.entity.EntityLoader;

@RequiredArgsConstructor
public class MybatisPersistenceAssistantImpl implements MybatisPersistenceAssistant {

    private final PersistenceEnvironment environment;
    private final EntityLoader entityLoader;
    private final ScopeAware scopeAware;
    private final Scopable<EntityCache> entityCacheScopable;
    private final AuditDependencyFactory auditDependencyFactory;


    @Override
    public void refreshCache() {
        entityLoader.load();
        auditDependencyFactory.cachingSQL();
    }

    @Override
    public void startAuditing() {
        environment.activateAuditing();
    }

    @Override
    public void stopAuditing() {
        environment.deactivateAuditing();
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
                auditDependencyFactory.mutationArgumentsParser()
        );
    }
}
