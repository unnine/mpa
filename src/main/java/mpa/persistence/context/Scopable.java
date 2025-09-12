package mpa.persistence.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Scopable<T> {

    private final Map<Scope, T> instances = new ConcurrentHashMap<>();


    public boolean hasScope(Scope scope) {
        return instances.containsKey(scope);
    }

    public void addInstance(Scope scope, T instance) {
        this.instances.put(scope, instance);
    }

    public T getInstance(Scope scope) {
        if (hasScope(scope)) {
            return instances.get(scope);
        }
        throw new IllegalArgumentException("invalid scope. " + scope.getName());
    }

}