package mpa.persistence.invocation;

import org.mybatis.spring.SqlSessionTemplate;

import java.lang.reflect.Method;
import java.util.List;

public class RepositoryMethodsInvocationHandler implements MethodInvocationHandler {

    private final List<MethodInvocationHandler> invocationHandlers;

    private final SqlSessionTemplate sqlSessionTemplate;


    public RepositoryMethodsInvocationHandler(List<MethodInvocationHandler> invocationHandlers, SqlSessionTemplate sqlSessionTemplate) {
        this.invocationHandlers = invocationHandlers;
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public boolean supports(Method method) {
        return true;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        for (MethodInvocationHandler invocationHandler : invocationHandlers) {
            if (invocationHandler.supports(method)) {
                invocationHandler.invoke(o, method, objects);
            }
        }

        return null;
    }
}
