package mpa.persistence.config;

public interface ScopeRegistry {

    ScopeConfigurer addDefaultScope();

    ScopeConfigurer addScope(String name);

}
