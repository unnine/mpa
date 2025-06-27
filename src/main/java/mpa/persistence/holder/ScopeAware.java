package mpa.persistence.holder;

import mpa.persistence.exception.InvalidScopeStateException;
import mpa.util.Log;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public class ScopeAware implements Iterable<Scope> {

    private final Map<String, Scope> scopes = new HashMap<>();


    public void add(Scope scope) {
        Objects.requireNonNull(scope.getName());
        this.scopes.put(scope.getName(), scope);
    }

    public Scope get(String name) {
        if (scopes.containsKey(name)) {
            return scopes.get(name);
        }
        throw new InvalidScopeStateException(Log.format("scope is null."));
    }

    public Scope getByEntity(Class<?> entityClass) {
        String packageName = entityClass.getPackageName();
        return scopes.values().stream()
                .filter(scope -> packageName.contains(scope.getBasePackage()))
                .findAny()
                .orElseThrow(() -> new InvalidScopeStateException(Log.format("scope is null.")));
    }

    public Scope getDefaultScope() {
        return scopes.values().stream()
                .filter(Scope::isDefault)
                .findAny()
                .orElseThrow(() -> new InvalidScopeStateException(Log.format("default scope is null.")));
    }

    public boolean exists(String name) {
        return scopes.containsKey(name);
    }

    public boolean isEmpty() {
        return scopes.isEmpty();
    }

    @Override
    public Iterator<Scope> iterator() {
        return scopes.values().iterator();
    }
}