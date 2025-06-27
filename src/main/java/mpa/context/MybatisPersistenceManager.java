package mpa.context;

import mpa.audit.executor.AuditEventExecutor;
import mpa.audit.transaction.event.AuditTrailListener;

public interface MybatisPersistenceManager {

    void refreshCache();

    void startAuditing();

    void stopAuditing();

    void registerAuditTrailListener(AuditTrailListener listener);

    AuditEventExecutor.Builder createAuditEventExecutor();
}
