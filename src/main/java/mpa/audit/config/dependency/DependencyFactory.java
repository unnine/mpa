package mpa.audit.config.dependency;

public interface DependencyFactory {

    <T> T getInstance(Class<T> dependencyClass);

}
