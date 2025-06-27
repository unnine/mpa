package mpa.persistence.event;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.holder.Scope;

@Getter
@RequiredArgsConstructor
public class MutationEvent {

    private final Scope scope;
    private final EntityDefinition entityDefinition;
    private final MutationType mutationType;
    private final MutationArgument argument;


    public boolean isInvalidState() {
        if (scope == null) {
            return true;
        }
        return argument.isInvalid();
    }

}
