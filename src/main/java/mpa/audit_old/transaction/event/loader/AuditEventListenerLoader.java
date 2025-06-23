package mpa.audit_old.transaction.event.loader;

import mpa.audit_old.transaction.event.AuditEventListener;

import java.util.List;

public interface AuditEventListenerLoader {

    List<AuditEventListener> load();

}