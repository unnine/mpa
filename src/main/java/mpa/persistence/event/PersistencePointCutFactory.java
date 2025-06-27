package mpa.persistence.event;

import org.springframework.aop.Pointcut;

public interface PersistencePointCutFactory {

    Pointcut create(String[] packageLocations);

}