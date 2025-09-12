package mpa.context;

import org.springframework.aop.Advisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

@Configuration
public class MybatisPersistenceAssistantInitializer {

    private final MybatisPersistenceAssistantGlobalDependencyFactory dependencyFactory;


    public MybatisPersistenceAssistantInitializer(GenericApplicationContext applicationContext) {
        this.dependencyFactory = new MybatisPersistenceAssistantGlobalDependencyFactory(applicationContext);
    }


    @Bean
    public Advisor mutationsAnnotationsAdvisor() {
        PersistenceDependencyFactory persistenceDependencyFactory = dependencyFactory.getPersistenceDependencyFactory();
        return persistenceDependencyFactory.mutationsAnnotationsAdvisor();
    }

    @Bean
    public Advisor persistenceMutationsEventAdvisor() {
        PersistenceDependencyFactory persistenceDependencyFactory = dependencyFactory.getPersistenceDependencyFactory();
        return persistenceDependencyFactory.persistenceMutationsTranctionEventAdvisor();
    }

    @Bean
    public MybatisPersistenceAssistant mybatisPersistenceAssistant() {
        return dependencyFactory.mybatisPersistenceAssistant();
    }

}
