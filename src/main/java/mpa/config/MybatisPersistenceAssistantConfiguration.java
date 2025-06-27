package mpa.config;

public interface MybatisPersistenceAssistantConfiguration extends MybatisPersistenceAssistantConfigure {

    ScopeRegistry getScopeRegistry();

    AuditConfigure getAuditConfigure();

}
