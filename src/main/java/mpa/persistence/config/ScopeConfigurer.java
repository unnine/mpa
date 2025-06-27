package mpa.persistence.config;

import mpa.audit.config.AuditConfigurer;

import java.util.function.Consumer;

public interface ScopeConfigurer {

    ScopeConfigurer basePackage(String basePackage);

    ScopeConfigurer database(Consumer<DataSourceConfigurer> configurer);

    ScopeConfigurer audit(Consumer<AuditConfigurer> configurer);

    ScopeRegistry and();

}
