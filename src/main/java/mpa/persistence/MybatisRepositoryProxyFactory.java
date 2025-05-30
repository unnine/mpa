package mpa.persistence;

import mpa.persistence.invocation.RepositoryMethodsInvocationHandler;
import org.springframework.cglib.proxy.Proxy;

public class MybatisRepositoryProxyFactory {

    private final Object repository;

    private final RepositoryMethodsInvocationHandler repositoryMethodsInvocationHandler;


    public MybatisRepositoryProxyFactory(Object repository, RepositoryMethodsInvocationHandler repositoryMethodsInvocationHandler) {
        this.repository = repository;
        this.repositoryMethodsInvocationHandler = repositoryMethodsInvocationHandler;
    }


    public Object getProxy() {
        return Proxy.newProxyInstance(
                repository.getClass().getClassLoader(),
                new Class[]{ repository.getClass() },
                repositoryMethodsInvocationHandler
        );
    }
}
