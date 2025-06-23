package mpa.audit_old.aop;

import lombok.RequiredArgsConstructor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;

@RequiredArgsConstructor
public class DefaultAuditPointCutFactory implements AuditPointCutFactory {

    @Override
    public Pointcut create(String[] packageLocations) {
        AspectJExpressionPointcut annotationPointcut = new AspectJExpressionPointcut();
        annotationPointcut.setExpression("execution(public * *(..))");
        return annotationPointcut;
    }
}