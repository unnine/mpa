package mpa.persistence.interceptor;

import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

public class RepositoryInterceptorAdvisorFactory {

    public Advisor create() {
        RepositoryInterceptorPointcutFactory pointcutFactory = new RepositoryInterceptorPointcutFactory();
        Pointcut pointcut = pointcutFactory.create();

        RepositoryInterceptorAdvice advice = new RepositoryInterceptorAdvice(new RootRepositoryInterceptor());

        return new DefaultPointcutAdvisor(pointcut, advice);
    }
}
