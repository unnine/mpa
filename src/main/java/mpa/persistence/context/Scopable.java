package mpa.persistence.context;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Scopable<T> {

    private final Map<Scope, T> instances = new ConcurrentHashMap<>();


    void addInstance(Scope scope, T instance) {
        this.instances.put(scope, instance);
    }

    public T getInstance(Scope scope) {
        if (instances.containsKey(scope)) {
            return instances.get(scope);
        }
        throw new IllegalArgumentException("invalid scope. " + scope.getName());
    }

}