package mpa.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class BaseMybatisPersistenceAssistantConfiguration implements MybatisPersistenceAssistantConfiguration {

    private final List<MybatisPersistenceAssistantConfigurer> configurers = new ArrayList<>();

    private final ScopeRegistry scopeRegistry;
    private final AuditConfigure auditConfigure;


    @Override
    public void addConfigurer(MybatisPersistenceAssistantConfigurer configurer) {
        this.configurers.add(configurer);
    }

    @Override
    public void apply() {
        configurers.forEach(configurer -> {
            configurer.addScope(scopeRegistry);
            configurer.configureAudit(auditConfigure);
        });
    }

}
