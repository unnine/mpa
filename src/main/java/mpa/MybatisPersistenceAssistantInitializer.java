package mpa;

import lombok.RequiredArgsConstructor;
import org.springframework.aop.Advisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MybatisPersistenceAssistantInitializer {

    private final ApplicationContext applicationContext;


    @Bean
    public MybatisPersistenceAssistantGlobalDependencyFactory mybatisPersistenceAssistantSharedDependencyFactory() {
        return new MybatisPersistenceAssistantGlobalDependencyFactory(applicationContext);
    }

    @Bean
    public Advisor persistenceMutationsEventAdvisor() {
        MybatisPersistenceAssistantGlobalDependencyFactory globalDependencyFactory = mybatisPersistenceAssistantSharedDependencyFactory();
        PersistenceDependencyFactory persistenceDependencyFactory = globalDependencyFactory.getPersistenceDependencyFactory();
        return persistenceDependencyFactory.persistenceMutationsEventAdvisor();
    }

//    private Map<AuditScope, Advisor> createAdvisors(SharedDependencyFactory sharedDependencyFactory, AuditAdvisorFactory advisorFactory) {
//        Map<AuditScope, Advisor> map = new HashMap<>();
//
//        scopeDefinition.forEach(scope -> {
//            AuditScope scopeAware = scope.toAware();
//            AuditDependencyFactory scopedDependencyFactory = new AuditDependencyFactory(sharedDependencyFactory, scopeAware);
//
//            EntityLoader entityLoader = scopedDependencyFactory.entityLoader();
//            entityLoader.load();
//
//            AuditProvider.addFactory(scopeAware, scopedDependencyFactory);
//
//            Advisor advisor = advisorFactory.create(scopeAware, scopedDependencyFactory.auditAdvice());
//            map.put(scopeAware, advisor);
//        });
//        return map;
//    }

}
