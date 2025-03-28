package mpa.persistence.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class RepositoryInterceptorAdvice implements MethodInterceptor {

    private final RepositoryInterceptor interceptor;


    public RepositoryInterceptorAdvice(RepositoryInterceptor interceptor) {
        this.interceptor = interceptor;
    }


    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Method method = methodInvocation.getMethod();
        Object[] arguments = methodInvocation.getArguments();

        boolean isContinue = interceptor.beforeExecute(method, arguments);
        if (!isContinue) {
            return null;
        }

        Object result = methodInvocation.proceed();

        interceptor.afterExecute(method, arguments, result);

        return result;
    }
}
