package mpa.config;

import mpa.persistence.config.ScopeRegistry;

public interface MybatisPersistenceAssistantConfigurer {

    default void registerScope(ScopeRegistry registry) {}

}