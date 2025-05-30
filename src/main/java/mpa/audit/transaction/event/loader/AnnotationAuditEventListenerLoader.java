package mpa.audit.transaction.event.loader;

import lombok.RequiredArgsConstructor;
import mpa.audit.annotation.AuditAnnotations;
import mpa.audit.config.holder.AuditApplicationContextAware;
import mpa.audit.config.holder.AuditScopeAware;
import mpa.audit.transaction.event.AuditEventListener;
import mpa.audit.transaction.event.AuditEventListenerProxy;
import mpa.audit.transaction.event.annotation.AuditTrailListener;
import mpa.util.Log;
import org.springframework.core.annotation.AnnotationConfigurationException;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class AnnotationAuditEventListenerLoader implements AuditEventListenerLoader {

    private final AuditApplicationContextAware contextAware;
    private final AuditScopeAware scopeAware;


    @Override
    public List<AuditEventListener> load() {
        if (scopeAware.isDefaultScope()) {
            return getAllListeners();
        }
        return getListenersByScope();
    }

    private List<AuditEventListener> getAllListeners() {
        Map<String, Object> allListeners = contextAware.getBeansWithAnnotation(AuditAnnotations.AUDIT_TRAIL_LISTENER);
        return allListeners.values().stream().map(AuditEventListenerProxy::new).collect(Collectors.toList());
    }

    private List<AuditEventListener> getListenersByScope() {
        Map<String, Object> allListeners = contextAware.getBeansWithAnnotation(AuditAnnotations.AUDIT_TRAIL_LISTENER);
        AuditTrailListener auditTrailListenerAnnotation;
        String listenerScopeName;

        List<AuditEventListener> listenersByScope = new ArrayList<>();

        for (Object listener : allListeners.values()) {
            auditTrailListenerAnnotation = AnnotationUtils.findAnnotation(listener.getClass(), AuditAnnotations.AUDIT_TRAIL_LISTENER);

            if (auditTrailListenerAnnotation == null) {
                Log.info("not registered AuditTrailListener. {}", listener.getClass().getName());
                continue;
            }

            listenerScopeName = auditTrailListenerAnnotation.scopeName();

            assertExistsScopeName(listenerScopeName);

            if (listenerScopeName.equals(scopeAware.name())) {
                listenersByScope.add(new AuditEventListenerProxy(listener));
            }
        }
        assertExistsScopedAuditTrailListener(listenersByScope);
        return listenersByScope;
    }

    private void assertExistsScopedAuditTrailListener(List<AuditEventListener> listeners) {
        if (listeners.isEmpty()) {
            Log.warn("empty scoped audit trail listeners.");
        }
    }

    private void assertExistsScopeName(String listenerScopeName) {
        if (!StringUtils.hasText(listenerScopeName)) {
            throw new AnnotationConfigurationException(Log.format("in environment with multiple scopes, audit transaction event listener's scope name cannot be omitted."));
        }
    }
}