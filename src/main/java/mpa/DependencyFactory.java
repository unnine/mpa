package mpa;

import java.util.function.Supplier;

public interface DependencyFactory {

    <T> T getInstance(Class<T> dependencyClass);

    <T> T getInstance(Class<T> type, Supplier<T> action);

    <T> T getScopableInstance(Class<T> dependencyClass);

    void setInstance(Class<?> dependencyClass, Object dependency);

    void setScopableInstance(Class<?> dependencyClass, Object dependency);

}
