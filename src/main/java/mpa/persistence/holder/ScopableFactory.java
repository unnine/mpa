package mpa.persistence.holder;

import lombok.RequiredArgsConstructor;

import java.util.function.Function;
import java.util.function.Supplier;

@RequiredArgsConstructor
public class ScopableFactory {

    private final ScopeAware scopeAware;
    private final RuntimeThreadScope runtimeThreadScope;


    public <T> Scopable<T> create(Supplier<T> instanceFactory) {
        Scopable<T> scopable = new Scopable<>(runtimeThreadScope);
        scopeAware.forEach(scope -> scopable.addInstance(scope, instanceFactory.get()));
        return scopable;
    }

    public <T> Scopable<T> create(Function<Scope, T> instanceFactory) {
        Scopable<T> scopable = new Scopable<>(runtimeThreadScope);
        scopeAware.forEach(scope -> scopable.addInstance(scope, instanceFactory.apply(scope)));
        return scopable;
    }

}
