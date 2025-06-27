package mpa.persistence.event;

import org.springframework.aop.Pointcut;

public interface PersistenceMutationsPointCutFactory {

    Pointcut create(String[] packageLocations);

}