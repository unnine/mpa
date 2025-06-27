package mpa.config;

import java.util.function.Consumer;

public interface ScopeRegistry {

    ScopeConfigurer addScope(String name);


    interface ScopeConfigurer {

        ScopeConfigurer basePackage(String basePackage);

        ScopeConfigurer database(Consumer<DataSourceConfigurer> configurer);

        ScopeRegistry and();

    }

}
