package mpa.persistence.holder;

import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class ScopeTemplate {

    private final ScopeAware scopeAware;
    private final RuntimeThreadScope runtimeThreadScope;


    public void run(Runnable processor) {
        for (Scope scope : scopeAware) {
            run(scope, processor);
        }
    }

    public void run(Consumer<Scope> processor) {
        for (Scope scope : scopeAware) {
            run(scope, () -> processor.accept(scope));
        }
    }

    private void run(Scope scope, Runnable processorRunner) {
        if (runtimeThreadScope.exists()) {
            processorRunner.run();
            return;
        }
        runtimeThreadScope.set(scope);
        processorRunner.run();
        runtimeThreadScope.clear();
    }
}
