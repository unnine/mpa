package mpa.persistence.event;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class PersistenceMutationsEventListeners implements PersistenceMutationsEventListener {

    private final List<PersistenceMutationsEventListener> listeners = new ArrayList<>();


    @Override
    public void onBefore(Method method, Object[] arguments) {
        listeners.forEach(listener -> listener.onBefore(method, arguments));
    }

    @Override
    public void onAfter(Method method, Object[] arguments, boolean mutated) {
        listeners.forEach(listener -> listener.onAfter(method, arguments, mutated));
    }

    @Override
    public void onThrowsException(Throwable t) {
        listeners.forEach(listener -> listener.onThrowsException(t));
    }

    @Override
    public void onCompletion(Method method, Object[] arguments) {
        listeners.forEach(listener -> listener.onCompletion(method, arguments));
    }

    public void addListener(PersistenceMutationsEventListener listener) {
        this.listeners.add(listener);
    }
}
