package mpa.persistence.interceptor;

import java.lang.reflect.Method;

public class RootRepositoryInterceptor implements RepositoryInterceptor {

    @Override
    public boolean beforeExecute(Method method, Object[] arguments) {
        return true;
    }

    @Override
    public void afterExecute(Method method, Object[] arguments, Object result) {
    }
}
