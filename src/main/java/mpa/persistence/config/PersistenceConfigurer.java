package mpa.persistence.config;

public interface PersistenceConfigurer {

    default void registerScope(ScopeRegistry registry) {}

}
