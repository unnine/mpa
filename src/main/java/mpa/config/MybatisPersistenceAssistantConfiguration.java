package mpa.config;

public interface MybatisPersistenceAssistantConfiguration {

    void addConfigurer(MybatisPersistenceAssistantConfigurer configurer);

    void apply();

}
