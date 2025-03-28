package mpa.persistence.interceptor;

import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

public class RepositoryInterceptorPointcutFactory {

    public Pointcut create() {
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(getExpression());
        return pointcut;
    }

    private String getExpression() {
        return "target(mpa.persistence.MybatisRepository)";
    }
}
