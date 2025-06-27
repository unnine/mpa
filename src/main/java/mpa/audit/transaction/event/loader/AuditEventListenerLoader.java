package mpa.audit.transaction.event.loader;

import mpa.audit.transaction.event.AuditEventListener;
import mpa.persistence.holder.Scope;

import java.util.List;
import java.util.Map;

public interface AuditEventListenerLoader {

    Map<Scope, List<AuditEventListener>> loadListenersByScope();

}