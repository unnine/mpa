package mpa.audit.transaction.event.loader;

import mpa.audit.transaction.event.AuditTrailListener;

public interface AuditEventListenerLoader {

    void loadListenerBeans();

    void addEventListener(AuditTrailListener listener);

}