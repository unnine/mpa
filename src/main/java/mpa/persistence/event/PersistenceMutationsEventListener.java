package mpa.persistence.event;

import java.lang.reflect.Method;

public interface PersistenceMutationsEventListener {

    default boolean ignore(Method method, Object[] arguments) {
        return false;
    }

    default void onBefore(Method method, Object[] arguments) {};

    default void onAfter(Method method, Object[] arguments, boolean mutated) {};

    default void onThrowsException(Throwable t) {};

    default void onCompletion(Method method, Object[] arguments) {};

}
