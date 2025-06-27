package mpa.persistence.event;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class CompositePersistenceMutationsEventListener implements PersistenceMutationsEventListener {

    private final List<PersistenceMutationsEventListener> listeners = new ArrayList<>();


    @Override
    public void onBefore(MutationEvent event) {
        onEvent(event, listener -> listener.onBefore(event));
    }

    @Override
    public void onAfter(MutationEvent event, boolean mutated) {
        onEvent(event, listener -> listener.onAfter(event, mutated));
    }

    @Override
    public void onThrowsException(MutationEvent event, Throwable t) {
        onEvent(event, listener -> listener.onThrowsException(event, t));
    }

    @Override
    public void onAfterCompletion(MutationEvent event) {
        onEvent(event, listener -> listener.onAfterCompletion(event));
    }

    private void onEvent(MutationEvent event, Consumer<PersistenceMutationsEventListener> action) {
        listeners.forEach(listener -> {
            if (listener.ignore(event)) {
                return;
            }
            action.accept(listener);
        });
    }

    public void addListener(PersistenceMutationsEventListener listener) {
        this.listeners.add(listener);
    }
}
