package mpa.fixture;

public interface MybatisPersistenceAssistantConfiguration {

    void addConfigurer(MybatisPersistenceAssistantConfigurer configurer);

    void apply();

}
