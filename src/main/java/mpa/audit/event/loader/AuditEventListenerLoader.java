package mpa.audit.event.loader;

import mpa.audit.event.AuditTrailListener;

public interface AuditEventListenerLoader {

    void loadListenerBeans();

    void addEventListener(AuditTrailListener listener);

}