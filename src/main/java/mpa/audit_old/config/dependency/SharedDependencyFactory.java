package mpa.audit_old.config.dependency;

import mpa.audit_old.config.holder.AuditApplicationContextAware;
import mpa.audit_old.context.AuditTrailContext;
import mpa.audit_old.context.ThreadAuditTrailContext;

public class SharedDependencyFactory extends AbstractDependencyFactory {

    public SharedDependencyFactory(AuditApplicationContextAware contextAware) {
        super();

        setInstance(AuditApplicationContextAware.class, contextAware);
    }


    /**
     * context
     */
    public AuditApplicationContextAware applicationContextAware() {
        return getInstance(AuditApplicationContextAware.class);
    }


    /**
     * context
     */
    public AuditTrailContext auditTrailContext() {
        return getInstance(AuditTrailContext.class, ThreadAuditTrailContext::new);
    }
}
