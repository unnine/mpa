package mpa.persistence.holder;

import mpa.persistence.exception.InvalidScopeStateException;
import mpa.util.Log;

public class RuntimeThreadScope {

    private static final ThreadLocal<Scope> threadScope = new ThreadLocal<>();


    public boolean exists() {
        return threadScope.get() != null;
    }

    public void set(Scope scope) {
        threadScope.set(scope);
    }

    public Scope get() {
        Scope scope = threadScope.get();
        if (scope == null) {
            throw new InvalidScopeStateException(Log.format("scope is null"));
        }
        return scope;
    }

    public void clear() {
        threadScope.remove();
    }

}
