package mpa.audit.aop;

import org.springframework.aop.Pointcut;

public interface AuditPointCutFactory {

    Pointcut create(String[] packageLocations);

}