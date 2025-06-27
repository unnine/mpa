package mpa.context;

import mpa.persistence.context.Scopable;
import mpa.persistence.context.ScopableFactory;
import mpa.persistence.context.Scope;
import mpa.persistence.context.ScopeAware;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public abstract class ScopableDependencyFactory extends AbstractDependencyFactory {

    private final Map<String, Scopable<?>> scopableFactory = new HashMap<>();


    protected abstract ScopeAware scopeAware();

    private <T> void setScopableInstance(Class<?> dependencyClass, Function<Scope, T> factory) {
        String key = getKey(dependencyClass);
        scopableFactory.put(key, scopableFactory().create(factory));
    }

    @SuppressWarnings("unchecked")
    public final <T> Scopable<T> getScopableInstance(Class<T> type, Function<Scope, T> factory) {
        if (notExistsScopableInstance(type)) {
            setScopableInstance(type, factory);
        }
        String key = getKey(type);
        return (Scopable<T>) scopableFactory.get(key);
    }

    private <T> boolean notExistsScopableInstance(Class<T> dependencyClass) {
        String key = getKey(dependencyClass);
        return !scopableFactory.containsKey(key);
    }

    private ScopableFactory scopableFactory() {
        return getInstance(ScopableFactory.class, () -> new ScopableFactory(scopeAware()));
    }

}
