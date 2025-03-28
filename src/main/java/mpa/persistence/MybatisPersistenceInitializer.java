package mpa.persistence;

import mpa.persistence.interceptor.RepositoryInterceptorAdvice;
import mpa.persistence.interceptor.RepositoryInterceptorPointcutFactory;
import mpa.persistence.interceptor.RootRepositoryInterceptor;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPersistenceInitializer {

    @Bean
    public Advisor mybatisRepositoryInterceptor() {
        RepositoryInterceptorPointcutFactory pointcutFactory = new RepositoryInterceptorPointcutFactory();
        Pointcut pointcut = pointcutFactory.create();

        RepositoryInterceptorAdvice advice = new RepositoryInterceptorAdvice(new RootRepositoryInterceptor());

        return new DefaultPointcutAdvisor(pointcut, advice);
    }

}
