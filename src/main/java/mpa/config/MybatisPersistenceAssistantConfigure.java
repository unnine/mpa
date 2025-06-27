package mpa.config;

public interface MybatisPersistenceAssistantConfigure {

    void addConfigurer(MybatisPersistenceAssistantConfigurer configurer);

    void apply();

}
