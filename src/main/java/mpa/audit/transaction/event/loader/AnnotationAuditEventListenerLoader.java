package mpa.audit.transaction.event.loader;

import lombok.RequiredArgsConstructor;
import mpa.audit.transaction.event.AuditTrailListener;
import mpa.audit.transaction.event.ContextAuditEventListener;
import mpa.audit.transaction.event.ScopeAuditEventListener;
import mpa.persistence.context.ApplicationContextAware;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.context.annotation.ScopeName;
import mpa.util.StringUtil;

@RequiredArgsConstructor
public class AnnotationAuditEventListenerLoader implements AuditEventListenerLoader {

    private final ApplicationContextAware contextAware;
    private final ContextAuditEventListener contextAuditEventListener;
    private final ScopeAware scopeAware;


    @Override
    public void loadListenerBeans() {
        contextAware.getBeansOf(AuditTrailListener.class)
                .ifPresent(listeners -> listeners.forEach(this::addEventListener));
    }

    @Override
    public void addEventListener(AuditTrailListener listener) {
        String scopeName = getScopeName(listener);
        contextAuditEventListener.addListener(new ScopeAuditEventListener(scopeName, listener));
    }

    private String getScopeName(AuditTrailListener listener) {
        if (hasNotScopeName(listener)) {
            return Scope.getDefaultName();
        }
        ScopeName scopeNameAnnotation = listener.getClass().getAnnotation(ScopeName.class);
        String scopeName = scopeNameAnnotation.value();

        if (StringUtil.isNotEmpty(scopeName) && scopeAware.exists(scopeName)) {
            return scopeAware.get(scopeName).getName();
        }
        return Scope.getDefaultName();
    }

    private boolean hasNotScopeName(AuditTrailListener listener) {
        return !listener.getClass().isAnnotationPresent(ScopeName.class);
    }
}