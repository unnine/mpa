package mpa.persistence;

import mpa.persistence.aop.PersistenceRepositoryAdvisor;
import org.springframework.aop.Advisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceInitializer {

    @Bean
    public Advisor persistenceAdvisor() {
        return new PersistenceRepositoryAdvisor();
    }

}
