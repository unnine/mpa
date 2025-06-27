package mpa;

public interface DependencyFactory {

    <T> T getInstance(Class<T> dependencyClass);

}
