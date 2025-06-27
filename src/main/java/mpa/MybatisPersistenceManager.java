package mpa;

import mpa.audit.transaction.event.AuditTrailListener;

public interface MybatisPersistenceManager {

    void refreshCache();

    void startAuditing();

    void stopAuditing();

    void registerAuditTrailListener(AuditTrailListener listener);
}
