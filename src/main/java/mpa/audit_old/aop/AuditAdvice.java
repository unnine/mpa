package mpa.audit_old.aop;

import lombok.RequiredArgsConstructor;
import mpa.audit_old.annotation.AuditAnnotations;
import mpa.audit_old.aop.invocation.AnnotationAuditMethodInvocation;
import mpa.audit_old.context.AuditTracker;
import mpa.audit_old.repository.database.sql.parameter.QueryArgumentsParser;
import mpa.audit_old.transaction.AuditTransactionListener;
import mpa.audit_old.transaction.AuditTransactionManager;
import mpa.entity.cache.EntityCache;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

@RequiredArgsConstructor
public class AuditAdvice implements MethodInterceptor {

    private final EntityCache entityCache;
    private final AuditTracker auditTracker;
    private final AuditTransactionListener transactionListener;
    private final QueryArgumentsParser queryArgumentsParser;


    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        try {
            if (isNotAuditMethod(invocation)) {
                return invocation.proceed();
            }
            synchronizeTransaction();
            return auditInvocation(invocation).proceed();

        } catch (Throwable t) {
            AuditTransactionManager.clear();
            throw t;
        }
    }

    private boolean isNotAuditMethod(MethodInvocation invocation) {
        Method method = invocation.getMethod();
        return !method.isAnnotationPresent(AuditAnnotations.AUDIT);
    }

    private void synchronizeTransaction() {
        AuditTransactionManager.synchronizeTransaction(transactionListener);
    }

    private MethodInvocation auditInvocation(MethodInvocation invocation) {
        return new AnnotationAuditMethodInvocation(
                invocation,
                entityCache,
                auditTracker,
                queryArgumentsParser
        );
    }
}