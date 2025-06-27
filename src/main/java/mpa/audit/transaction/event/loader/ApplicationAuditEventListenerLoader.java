package mpa.audit.transaction.event.loader;

import lombok.RequiredArgsConstructor;
import mpa.audit.transaction.event.AuditTrailListener;
import mpa.audit.transaction.event.CompositeAuditEventListener;
import mpa.audit.transaction.event.ScopeAuditEventListener;
import mpa.persistence.context.ApplicationContextAware;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.context.annotation.ScopeName;
import mpa.util.StringUtil;

@RequiredArgsConstructor
public class ApplicationAuditEventListenerLoader implements AuditEventListenerLoader {

    private final ApplicationContextAware contextAware;
    private final ScopeAware scopeAware;
    private final Scopable<CompositeAuditEventListener> contextAuditEventListener;


    @Override
    public void loadListenerBeans() {
        contextAware.getBeansOf(AuditTrailListener.class)
                .ifPresent(listeners -> listeners.forEach(this::addEventListener));
    }

    @Override
    public void addEventListener(AuditTrailListener listener) {
        Scope scope = getScope(listener);
        contextAuditEventListener.getInstance(scope).addListener(new ScopeAuditEventListener(scope, listener));
    }

    private Scope getScope(AuditTrailListener listener) {
        if (hasNotScopeName(listener)) {
            return Scope.ofDefault();
        }
        ScopeName scopeNameAnnotation = listener.getClass().getAnnotation(ScopeName.class);
        String scopeName = scopeNameAnnotation.value();

        if (StringUtil.isNotEmpty(scopeName) && scopeAware.exists(scopeName)) {
            return scopeAware.get(scopeName);
        }
        return Scope.ofDefault();
    }

    private boolean hasNotScopeName(AuditTrailListener listener) {
        return !listener.getClass().isAnnotationPresent(ScopeName.class);
    }
}