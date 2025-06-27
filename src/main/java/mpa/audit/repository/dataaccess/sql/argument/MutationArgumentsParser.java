package mpa.audit.repository.dataaccess.sql.argument;

import mpa.persistence.entity.EntityDefinition;
import mpa.persistence.event.MutationArgument;

public interface MutationArgumentsParser {

    Argument parse(EntityDefinition entityDefinition, MutationArgument mutationArgument);

}
