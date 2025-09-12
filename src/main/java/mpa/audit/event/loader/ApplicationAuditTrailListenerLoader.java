package mpa.audit.event.loader;

import lombok.RequiredArgsConstructor;
import mpa.audit.event.AuditTrailListener;
import mpa.audit.event.CompositeAuditEventHandler;
import mpa.audit.event.ScopeAuditEventHandler;
import mpa.persistence.context.ApplicationContextAware;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.context.annotation.ScopeName;
import mpa.util.ClassUtil;
import mpa.util.StringUtil;

@RequiredArgsConstructor
public class ApplicationAuditTrailListenerLoader implements AuditEventListenerLoader {

    private final ApplicationContextAware contextAware;
    private final ScopeAware scopeAware;
    private final Scopable<CompositeAuditEventHandler> auditEventHandlerScopable;


    @Override
    public void loadListenerBeans() {
        contextAware.getBeansOf(AuditTrailListener.class)
                .ifPresent(listeners -> listeners.forEach(this::addEventListener));
    }

    @Override
    public void addEventListener(AuditTrailListener listener) {
        Scope scope = getScope(listener);
        if (!auditEventHandlerScopable.hasScope(scope)) {
            throw new IllegalArgumentException("not found scope. check the scope annotation declared in the listener.");
        }
        auditEventHandlerScopable.getInstance(scope).addHandler(new ScopeAuditEventHandler(scope, listener));
    }

    private Scope getScope(AuditTrailListener listener) {
        ScopeName scopeNameAnnotation = ClassUtil.getAnnotation(listener.getClass(), ScopeName.class);

        if (scopeNameAnnotation == null) {
            return Scope.ofDefault();
        }

        String scopeName = scopeNameAnnotation.value();

        if (StringUtil.isNotEmpty(scopeName) && scopeAware.exists(scopeName)) {
            return scopeAware.get(scopeName);
        }
        return Scope.ofDefault();
    }

}