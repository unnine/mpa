package mpa.persistence;

import mpa.persistence.event.DefaultPersistenceMutationsPointCutFactory;
import mpa.persistence.event.PersistenceMutationsAdvice;
import mpa.persistence.event.PersistenceMutationsEventListeners;
import org.springframework.aop.Advisor;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersistenceInitializer {

    @Bean
    public Advisor persistenceAdvisor() {
        Pointcut pointcut = new DefaultPersistenceMutationsPointCutFactory().create(null);
        PersistenceMutationsAdvice advice = new PersistenceMutationsAdvice(new PersistenceMutationsEventListeners()); // TODO
        return new DefaultPointcutAdvisor(pointcut, advice);
    }

}
