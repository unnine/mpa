package mpa.audit_old.config.dependency;

public interface DependencyFactory {

    <T> T getInstance(Class<T> dependencyClass);

}
