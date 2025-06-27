package mpa.persistence.context;

import lombok.RequiredArgsConstructor;

import java.util.function.Consumer;

@RequiredArgsConstructor
public class ScopeTemplate {

    private final ScopeAware scopeAware;
    private final RuntimeThreadAttribute runtimeThreadAttribute;


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
        if (runtimeThreadAttribute.exists()) {
            processorRunner.run();
            return;
        }
        runtimeThreadAttribute.set(new RuntimeAttribute(scope));
        processorRunner.run();
        runtimeThreadAttribute.clear();
    }
}
