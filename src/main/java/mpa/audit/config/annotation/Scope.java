package mpa.audit.config.annotation;

import mpa.audit.config.AuditConfigurer;

public @interface Scope {

    String name() default "";

    String schema() default "";

    String dataSourceRef();

    String[] basePackages();

    Class<? extends AuditConfigurer> configClass() default AuditConfigurer.class;

}