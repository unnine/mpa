package mpa.persistence.event;

import mpa.util.Log;
import mpa.util.TypeValidator;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class PersistenceMutationsAdvice implements MethodInterceptor {

    private final PersistenceMutationsEventListener listener;


    public PersistenceMutationsAdvice(PersistenceMutationsEventListener listener) {
        this.listener = listener;
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        Method method = invocation.getMethod();
        Object[] arguments = invocation.getArguments();

        try {
            if (listener.ignore(method, arguments)) {
                return invocation.proceed();
            }
            listener.onBefore(method, arguments);
            Object result = invocation.proceed();
            listener.onAfter(method, arguments, isUpdated(method, result));
            return result;

        } catch (Throwable t) {
            Log.error(t);
            listener.onThrowsException(t);
            throw t;

        } finally {
            listener.onCompletion(method, arguments);
        }
    }

    private boolean isUpdated(Method method, Object result) {
        Class<?> returnType = method.getReturnType();

        if (TypeValidator.isInteger(returnType)) {
            return ((Integer) result) > 0;
        }
        return true;
    }
}
