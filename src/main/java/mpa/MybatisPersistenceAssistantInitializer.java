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

    @Bean
    public MybatisPersistenceManager mybatisPersistenceManager() {
        MybatisPersistenceAssistantGlobalDependencyFactory globalDependencyFactory = mybatisPersistenceAssistantSharedDependencyFactory();
        return globalDependencyFactory.mybatisPersistenceManager();
    }

    // TODO
//            AuditProvider.addFactory(scopeAware, scopedDependencyFactory);

}
