package mpa.context;

import mpa.audit.event.AuditEventExecutor;
import mpa.audit.event.AuditTrailListener;

public interface MybatisPersistenceAssistant {

    void refreshCache();

    void activateAuditing();

    void deactivateAuditing();

    void registerAuditTrailListener(AuditTrailListener listener);

    AuditEventExecutor.Builder createAuditEventExecutor();
}
