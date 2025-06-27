package mpa;

import mpa.util.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Supplier;

public abstract class AbstractDependencyFactory implements DependencyFactory {

    private final Map<String, Object> factory = new HashMap<>();


    public void setInstance(Class<?> dependencyClass, Object dependency) {
        String key = getKey(dependencyClass);
        factory.put(key, dependency);
    }

    protected <T> T getInstance(Class<T> type, Supplier<T> action) {
        if (notExistsInstance(type)) {
            setInstance(type, action.get());
        }
        return getInstance(type);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T getInstance(Class<T> dependencyClass) {
        if (notExistsInstance(dependencyClass)) {
            throw new NoSuchElementException(Log.format("not found instance of '%s'", dependencyClass.getName()));
        }
        String key = getKey(dependencyClass);
        return (T) factory.get(key);
    }

    private <T> String getKey(Class<T> dependencyClass) {
        return dependencyClass.getName();
    }

    private <T> boolean notExistsInstance(Class<T> dependencyClass) {
        String key = getKey(dependencyClass);
        return !factory.containsKey(key);
    }

}
