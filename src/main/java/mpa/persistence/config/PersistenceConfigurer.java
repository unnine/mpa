package mpa.persistence.config;

public interface PersistenceConfigurer {

    default void addScope(ScopeRegistry registry) {}

}
