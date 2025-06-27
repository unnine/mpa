package mpa.persistence.event;

import lombok.Builder;
import lombok.Getter;
import mpa.persistence.context.Scope;
import mpa.persistence.entity.EntityDefinition;

import java.util.Objects;

@Getter
public class MutationEvent {

    private final Scope scope;
    private final EntityDefinition entityDefinition;
    private final MutationType mutationType;
    private final MutationArgument argument;
    private final String label;


    @Builder
    public MutationEvent(Scope scope, EntityDefinition entityDefinition, MutationType mutationType, MutationArgument argument, String label) {
        Objects.requireNonNull(scope);
        Objects.requireNonNull(entityDefinition);
        Objects.requireNonNull(mutationType);
        Objects.requireNonNull(argument);

        this.scope = scope;
        this.entityDefinition = entityDefinition;
        this.mutationType = mutationType;
        this.argument = argument;
        this.label = label;
    }
}
