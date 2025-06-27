package mpa.persistence.holder;

import lombok.RequiredArgsConstructor;
import mpa.util.Log;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RequiredArgsConstructor
public class Scopable<T> {

    private final Map<Scope, T> instances = new ConcurrentHashMap<>();

    private final RuntimeThreadScope runtimeThreadScope;


    void addInstance(Scope scope, T instance) {
        this.instances.put(scope, instance);
    }

    public T getInstance() {
        Scope scope = runtimeThreadScope.get();
        if (instances.containsKey(scope)) {
            return instances.get(scope);
        }
        throw new IllegalArgumentException(Log.format("invalid scope. '%s'", scope.getName()));
    }

}