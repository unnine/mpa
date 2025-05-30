package mpa.audit.config;

import mpa.audit.aop.AuditAdvisorBeanPostProcessor;
import mpa.audit.aop.AuditAdvisorFactory;
import mpa.audit.aop.AuditPointCutFactory;
import mpa.audit.config.dependency.ScopedDependencyFactory;
import mpa.audit.config.dependency.SharedDependencyFactory;
import mpa.audit.config.holder.AuditApplicationContextAware;
import mpa.audit.config.holder.AuditScopeAware;
import mpa.audit.config.scope.AuditScopeDefinition;
import mpa.loader.EntityLoader;
import org.springframework.aop.Advisor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

public class AuditInitializer {

    private final AuditScopeDefinition scopeDefinition;
    private final AuditPointCutFactory pointCutFactory;

    public AuditInitializer(AuditScopeDefinition scopeDefinition, AuditPointCutFactory pointCutFactory) {
        this.scopeDefinition = scopeDefinition;
        this.pointCutFactory = pointCutFactory;
    }

    @Bean
    public BeanPostProcessor auditAdvisorBeanPostProcessor(ApplicationContext context) {
        AuditApplicationContextAware applicationContextAware = new AuditApplicationContextAware(context);
        SharedDependencyFactory sharedDependencyFactory = new SharedDependencyFactory(applicationContextAware);
        AuditAdvisorFactory auditAdvisorFactory = new AuditAdvisorFactory(pointCutFactory);

        Map<AuditScopeAware, Advisor> advisors = createAdvisors(sharedDependencyFactory, auditAdvisorFactory);

        return new AuditAdvisorBeanPostProcessor(advisors);
    }

    private Map<AuditScopeAware, Advisor> createAdvisors(SharedDependencyFactory sharedDependencyFactory, AuditAdvisorFactory advisorFactory) {
        Map<AuditScopeAware, Advisor> map = new HashMap<>();

        scopeDefinition.forEach(scope -> {
            AuditScopeAware scopeAware = scope.toAware();
            ScopedDependencyFactory scopedDependencyFactory = new ScopedDependencyFactory(sharedDependencyFactory, scopeAware);

            EntityLoader entityLoader = scopedDependencyFactory.entityLoader();
            entityLoader.load();

            AuditProvider.addFactory(scopeAware, scopedDependencyFactory);

            Advisor advisor = advisorFactory.create(scopeAware, scopedDependencyFactory.auditAdvice());
            map.put(scopeAware, advisor);
        });
        return map;
    }
}