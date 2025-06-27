package mpa.context;

import org.springframework.aop.Advisor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPersistenceAssistantInitializer {

    private final MybatisPersistenceAssistantGlobalDependencyFactory dependencyFactory;


    public MybatisPersistenceAssistantInitializer(ApplicationContext applicationContext) {
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
        return persistenceDependencyFactory.persistenceMutationsEventAdvisor();
    }

    @Bean
    public MybatisPersistenceManager mybatisPersistenceManager() {
        return dependencyFactory.mybatisPersistenceManager();
    }
}
