package mpa.audit.aop;

import lombok.RequiredArgsConstructor;
import mpa.audit.config.holder.AuditScopeAware;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;

@RequiredArgsConstructor
public class AuditAdvisorFactory {

    private final AuditPointCutFactory pointCutFactory;

    public Advisor create(AuditScopeAware scopeAware, AuditAdvice advice) {
        Pointcut pointcut = pointCutFactory.create(scopeAware.basePackages());
        return new DefaultPointcutAdvisor(pointcut, advice);
    }
}