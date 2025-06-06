package mpa.audit.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface AuditJoinDefinitions {

    @AliasFor("definitions")
    AuditJoinDefinition[] value() default {};

    @AliasFor("value")
    AuditJoinDefinition[] definitions() default {};

}