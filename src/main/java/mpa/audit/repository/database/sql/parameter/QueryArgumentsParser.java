package mpa.audit.repository.database.sql.parameter;

import mpa.persistence.entity.EntityDefinition;

public interface QueryArgumentsParser {

    Parameter parse(EntityDefinition entityDefinition, Object[] queryArguments);

}
