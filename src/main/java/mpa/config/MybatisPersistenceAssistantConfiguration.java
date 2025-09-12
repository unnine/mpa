package mpa.config;

import lombok.RequiredArgsConstructor;
import mpa.persistence.context.ApplicationContextAware;
import mpa.persistence.context.DataSourceScopeRegistry;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class MybatisPersistenceAssistantConfiguration {

    private final List<MybatisPersistenceAssistantConfigurer> configurers = new ArrayList<>();

    private final ApplicationContextAware contextAware;
    private final DataSourceScopeRegistry scopeRegistry;


    public void apply() {
        loadConfigurers();
        applyConfiguration();

        if (scopeRegistry.isEmptyScope()) {
            addDefaultScope();
        }
    }

    private void loadConfigurers() {
        List<MybatisPersistenceAssistantConfigurer> configurers = contextAware.getBeansOf(MybatisPersistenceAssistantConfigurer.class).orElseGet(ArrayList::new);
        this.configurers.addAll(configurers);
    }

    private void applyConfiguration() {
        configurers.forEach(configurer -> configurer.registerScope(scopeRegistry));
    }

    private void addDefaultScope() {
        List<SqlSessionFactory> factories = contextAware.getBeansOf(SqlSessionFactory.class)
                .orElseThrow(() -> new RuntimeException("not found SqlSessionFactory bean."));

        if (factories.size() > 1) {
            throw new RuntimeException("two or more SqlSessionFactory. not specified SqlSessionFactory.");
        }

        scopeRegistry.addDefaultScope(factories.get(0));
    }

}
