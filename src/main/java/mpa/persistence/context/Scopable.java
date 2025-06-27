package mpa.persistence.context;

import lombok.RequiredArgsConstructor;
import mpa.util.Log;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RequiredArgsConstructor
public class Scopable<T> {

    private final Map<Scope, T> instances = new ConcurrentHashMap<>();

    private final RuntimeThreadAttribute runtimeThreadAttribute;


    void addInstance(Scope scope, T instance) {
        this.instances.put(scope, instance);
    }

    public T getInstance() {
        RuntimeAttribute runtimeAttribute = runtimeThreadAttribute.get();
        Scope scope = runtimeAttribute.getScope();
        if (instances.containsKey(scope)) {
            return instances.get(scope);
        }
        throw new IllegalArgumentException(Log.format("invalid scope. '%s'", scope.getName()));
    }

    public T getInstanceByName(String scopeName) {
        for (Map.Entry<Scope, T> entry : instances.entrySet()) {
            if (entry.getKey().getName().equals(scopeName)) {
                return entry.getValue();
            }
        }
        throw new IllegalArgumentException(Log.format("invalid scope name. '%s'", scopeName));
    }

}