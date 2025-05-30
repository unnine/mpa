package mpa.audit.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuditEntityJoin {

    @AliasFor("joins")
    Join[] value() default {};

    @AliasFor("value")
    Join[] joins() default {};

    boolean chain() default true;

}