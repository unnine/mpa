package mpa.audit_old.config.annotation;

import mpa.audit_old.config.AuditConfigurer;

public @interface Scope {

    String name() default "";

    String schema() default "";

    String dataSourceRef();

    String[] basePackages();

    Class<? extends AuditConfigurer> configClass() default AuditConfigurer.class;

}