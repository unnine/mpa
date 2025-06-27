package mpa.persistence.event;

public interface PersistenceMutationsEventListener {

    default boolean ignore(MutationEvent event) {
        return false;
    }

    default void onBefore(MutationEvent event) {}

    default void onAfter(MutationEvent event, boolean mutated) {}

    default void onThrowsException(MutationEvent event, Throwable t) {}

    default void onAfterCompletion(MutationEvent event) {}

}
