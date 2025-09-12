package mpa.audit.config.entity;

import lombok.RequiredArgsConstructor;
import mpa.persistence.context.ApplicationContextAware;
import mpa.persistence.context.Scopable;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;
import mpa.persistence.context.annotation.ScopeName;
import mpa.util.ClassUtil;
import mpa.util.StringUtil;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@RequiredArgsConstructor
public class BootStrapEntityAuditConfigurationLoader implements EntityAuditConfigurationLoader {

    private final ApplicationContextAware contextAware;
    private final ScopeAware scopeAware;
    private final Scopable<EntityAuditConfigurationContext> configurationContextScopable;


    @Override
    public void load() {
        Map<Scope, Set<EntityAuditConfigurer<?>>> configurersByScope = loadAuditConfigurers();

        scopeAware.forEach(scope -> {
            if (!configurersByScope.containsKey(scope)) {
                return;
            }
            configurersByScope.get(scope).forEach(configurer -> configurationContextScopable
                    .getInstance(scope)
                    .apply(configurer));
        });
    }

    private Map<Scope, Set<EntityAuditConfigurer<?>>> loadAuditConfigurers() {
        return contextAware.getBeansOf(EntityAuditConfigurer.class)
                .map(configurers -> {
                    Map<Scope, Set<EntityAuditConfigurer<?>>> result = new HashMap<>();

                    configurers.forEach(configurer -> {
                        Scope scope = getScope(configurer);
                        result.putIfAbsent(scope, new HashSet<>());
                        result.get(scope).add(configurer);
                    });

                    return result;
                })
                .orElse(new HashMap<>());
    }

    private Scope getScope(EntityAuditConfigurer<?> configurer) {
        Class<?> configurerClass = ClassUtil.getOriginalClass(configurer.getClass());

        ScopeName scopeNameAnnotation = ClassUtil.getAnnotation(configurerClass, ScopeName.class);

        if (scopeNameAnnotation == null) {
            return Scope.ofDefault();
        }

        String scopeName = scopeNameAnnotation.value();

        if (StringUtil.isNotEmpty(scopeName) && scopeAware.exists(scopeName)) {
            return scopeAware.get(scopeName);
        }
        return Scope.ofDefault();
    }

}
