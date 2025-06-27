package mpa;

import lombok.RequiredArgsConstructor;
import mpa.audit.executor.AuditEventExecutor;
import mpa.audit.repository.dataaccess.sql.AuditSQLGenerator;
import mpa.audit.transaction.event.AuditTrailListener;
import mpa.audit.transaction.event.loader.AuditEventListenerLoader;
import mpa.persistence.context.PersistenceEnvironmentAttribute;
import mpa.persistence.entity.EntityLoader;

@RequiredArgsConstructor
public class DefaultMybatisPersistenceManager implements MybatisPersistenceManager {

    private final EntityLoader entityLoader;
    private final AuditSQLGenerator auditSQLGenerator;
    private final AuditEventListenerLoader auditEventListenerLoader;


    @Override
    public void refreshCache() {
        entityLoader.load();
        auditSQLGenerator.generate();
    }


    @Override
    public void startAuditing() {
        PersistenceEnvironmentAttribute.startAuditing();
    }

    @Override
    public void stopAuditing() {
        PersistenceEnvironmentAttribute.stopAuditing();
    }

    @Override
    public void registerAuditTrailListener(AuditTrailListener listener) {
        auditEventListenerLoader.addEventListener(listener);
    }

    @Override
    public AuditEventExecutor.Builder createAuditEventExecutor() {
//        new AuditEventExecutorImpl.BuilerImpl();
        return null;
    }
}
