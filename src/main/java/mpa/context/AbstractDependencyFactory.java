package mpa.context;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

public abstract class AbstractDependencyFactory implements DependencyFactory {

    private final Map<String, Object> factory = new HashMap<>();


    @Override
    public final void setInstance(Class<?> dependencyClass, Object dependency) {
        String key = getKey(dependencyClass);
        factory.put(key, dependency);
    }

    @Override
    public final <T> T getInstance(Class<T> type, Supplier<T> factory) {
        if (notExistsInstance(type)) {
            setInstance(type, factory.get());
        }
        return getInstance(type);
    }

    @Override
    @SuppressWarnings("unchecked")
    public final <T> T getInstance(Class<T> dependencyClass) {
        if (notExistsInstance(dependencyClass)) {
            throw new NoSuchElementException("not found instance of " + dependencyClass.getName());
        }
        String key = getKey(dependencyClass);
        return (T) factory.get(key);
    }

    private <T> boolean notExistsInstance(Class<T> dependencyClass) {
        String key = getKey(dependencyClass);
        return !factory.containsKey(key);
    }

    protected <T> String getKey(Class<T> dependencyClass) {
        return dependencyClass.getName();
    }
}
