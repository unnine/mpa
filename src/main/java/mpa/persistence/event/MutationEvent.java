package mpa.persistence.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.context.RuntimeAttribute;

@Getter
@RequiredArgsConstructor
public class MutationEvent {

    private final RuntimeAttribute runtimeAttribute;
    private final EntityDefinition entityDefinition;
    private final MutationType mutationType;
    private final MutationArgument argument;

}
