package mpa.persistence.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.persistence.context.Scope;
import mpa.persistence.entity.EntityDefinition;

@Getter
@RequiredArgsConstructor
public class MutationEvent {

    private final Scope scope;
    private final EntityDefinition entityDefinition;
    private final MutationType mutationType;
    private final MutationArgument argument;

}
