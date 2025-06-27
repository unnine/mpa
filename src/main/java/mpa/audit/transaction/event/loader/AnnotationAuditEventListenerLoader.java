package mpa.audit.transaction.event.loader;

import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.AuditAnnotations;
import mpa.audit.transaction.event.AuditEventListener;
import mpa.audit.transaction.event.AuditEventListenerProxy;
import mpa.audit.transaction.event.annotation.AuditTrailListener;
import mpa.persistence.holder.ApplicationContextAware;
import mpa.persistence.holder.Scope;
import mpa.persistence.holder.ScopeAware;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class AnnotationAuditEventListenerLoader implements AuditEventListenerLoader {

    private final ApplicationContextAware contextAware;
    private final ScopeAware scopeAware;


    @Override
    public Map<Scope, List<AuditEventListener>> loadListenersByScope() {
        List<AuditEventListener> eventListeners = loadAllListeners();
        return groupingByScopeName(eventListeners);
    }

    private List<AuditEventListener> loadAllListeners() {
        Map<String, Object> listeners = contextAware.getBeansWithAnnotation(AuditAnnotations.AUDIT_TRAIL_LISTENER);
        return listeners.values().stream().map(AuditEventListenerProxy::new).collect(Collectors.toList());
    }

    private Map<Scope, List<AuditEventListener>> groupingByScopeName(List<AuditEventListener> allListeners) {
        Map<Scope, List<AuditEventListener>> listenersByScope = new HashMap<>();
        Scope scope;

        for (AuditEventListener listener : allListeners) {
            scope = getScope(listener.getClass());

            if (scope == null) {
                continue;
            }
            List<AuditEventListener> listeners = listenersByScope.getOrDefault(scope, new ArrayList<>());
            listeners.add(listener);
            listenersByScope.putIfAbsent(scope, listeners);
        }
        return listenersByScope;
    }

    private Scope getScope(Class<?> listenerClass) {
        String scopeName = getScopeName(listenerClass);

        if (!StringUtils.hasText(scopeName)) {
            return scopeAware.getDefaultScope();
        }
        if (scopeAware.exists(scopeName)) {
            return scopeAware.get(scopeName);
        }
        return null;
    }

    private String getScopeName(Class<?> listenerClass) {
        AuditTrailListener eventListenerAnnotation = AuditAnnotations.getEventListener(listenerClass);
        return eventListenerAnnotation.scopeName();
    }
}