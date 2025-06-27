package mpa.audit.repository.sql.argument;

import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.event.MutationArgument;
import mpa.persistence.context.Scope;

public class ContextMutationArgumentsParser implements MutationArgumentsParser {

    private final MutationArgumentsParser primitiveMutationArgumentsParser;
    private final MutationArgumentsParser entityMutationArgumentsParser;


    public ContextMutationArgumentsParser(Scope scope) {
        this.primitiveMutationArgumentsParser = new SinglePrimitiveMutationArgumentsParser(scope);
        this.entityMutationArgumentsParser = new SingleEntityMutationArgumentsParser(scope);
    }


    @Override
    public Argument parse(EntityDefinition entityDefinition, MutationArgument mutationArgument) {
        if (mutationArgument.isPrimitive()) {
            return primitiveMutationArgumentsParser.parse(entityDefinition, mutationArgument);
        }
        return entityMutationArgumentsParser.parse(entityDefinition, mutationArgument);
    }
}
