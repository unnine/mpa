package mpa.audit.transaction.event;

import mpa.audit.AuditTrail;
import mpa.audit.annotation.AuditAnnotations;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class AuditEventListenerProxy implements AuditEventListener {

    private final Object auditEventListener;
    private final Method beforeCommitMethod;
    private final Method afterCommitMethod;
    private final Method manuallyCommitMethod;


    public AuditEventListenerProxy(Object auditEventListener) {
        this.auditEventListener = auditEventListener;
        this.beforeCommitMethod = getBeforeCommitMethod(auditEventListener);
        this.afterCommitMethod  = getAfterCommitMethod(auditEventListener);
        this.manuallyCommitMethod = getManuallyCommitMethod(auditEventListener);
    }


    @Override
    public void beforeCommit(List<AuditTrail> auditTrails) {
        if (beforeCommitMethod == null || CollectionUtils.isEmpty(auditTrails)) {
            return;
        }
        invoke(beforeCommitMethod, auditTrails);
    }

    @Override
    public void afterCommit(List<AuditTrail> auditTrails) {
        if (afterCommitMethod == null || CollectionUtils.isEmpty(auditTrails)) {
            return;
        }
        invoke(afterCommitMethod, auditTrails);
    }

    @Override
    public void manuallyCommit(List<AuditTrail> auditTrails) {
        if (manuallyCommitMethod == null || CollectionUtils.isEmpty(auditTrails)) {
            return;
        }
        invoke(manuallyCommitMethod, auditTrails);
    }

    private Method getBeforeCommitMethod(Object auditEventListener) {
        Method[] methods = auditEventListener.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(AuditAnnotations.AUDIT_TRAIL_LISTENER_BEFORE_COMMIT)) {
                return method;
            }
        }
        return null;
    }

    private Method getAfterCommitMethod(Object auditEventListener) {
        Method[] methods = auditEventListener.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(AuditAnnotations.AUDIT_TRAIL_LISTENER_AFTER_COMMIT)) {
                return method;
            }
        }
        return null;
    }

    private Method getManuallyCommitMethod(Object auditEventListener) {
        Method[] methods = auditEventListener.getClass().getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(AuditAnnotations.AUDIT_TRAIL_LISTENER_MANUALLY_COMMIT)) {
                return method;
            }
        }
        return null;
    }

    private void invoke(Method method, List<AuditTrail> auditTrails) {
        try {
            method.invoke(auditEventListener, auditTrails);

        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}