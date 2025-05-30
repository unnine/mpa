package mpa.audit.transaction.event.loader;

import mpa.audit.transaction.event.AuditEventListener;

import java.util.List;

public interface AuditEventListenerLoader {

    List<AuditEventListener> load();

}