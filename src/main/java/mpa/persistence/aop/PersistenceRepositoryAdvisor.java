package mpa.persistence.aop;

import org.springframework.aop.support.DefaultPointcutAdvisor;

public class PersistenceRepositoryAdvisor extends DefaultPointcutAdvisor {

    public PersistenceRepositoryAdvisor() {
        super(new DefaultPersistenceRepositoryPointCutFactory().create(null), new PersistenceRepositoryAdvice());
    }

}
