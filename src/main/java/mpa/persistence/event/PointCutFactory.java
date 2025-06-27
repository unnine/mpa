package mpa.persistence.event;

import org.springframework.aop.Pointcut;

public interface PointCutFactory {

    Pointcut create();

}