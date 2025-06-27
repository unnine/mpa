package mpa.context;

import java.util.function.Supplier;

public interface DependencyFactory {

    void setInstance(Class<?> dependencyClass, Object dependency);

    <T> T getInstance(Class<T> dependencyClass);

    <T> T getInstance(Class<T> type, Supplier<T> factory);

}
