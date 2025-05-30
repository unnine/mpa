package mpa.audit.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface Join {

    Class<?> entity();

    String auditName();

    String definition();

    String joinProperty();

    String[] withProperties() default {};

    boolean chain() default true;

}