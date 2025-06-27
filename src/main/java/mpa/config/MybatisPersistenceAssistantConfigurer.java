package mpa.config;

public interface MybatisPersistenceAssistantConfigurer {

    default void addScope(ScopeRegistry registry) {}

    default void configureAudit(AuditConfigure registry) {}

}