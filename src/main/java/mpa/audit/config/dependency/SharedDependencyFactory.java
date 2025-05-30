package mpa.audit.config.dependency;

import mpa.audit.config.holder.AuditApplicationContextAware;
import mpa.audit.context.AuditTrailContext;
import mpa.audit.context.ThreadAuditTrailContext;

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
