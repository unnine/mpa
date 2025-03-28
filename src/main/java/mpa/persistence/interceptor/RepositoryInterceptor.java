package mpa.persistence.interceptor;

import java.lang.reflect.Method;

public interface RepositoryInterceptor {

    boolean beforeExecute(Method method, Object[] arguments);

    void afterExecute(Method method, Object[] arguments, Object result);

}
