package mpa.persistence.aop;

import org.springframework.aop.Pointcut;

public interface PersistenceRepositoryPointCutFactory {

    Pointcut create(String[] packageLocations);

}