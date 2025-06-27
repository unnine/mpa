package mpa.audit_old.repository.database.sql.parameter;

import mpa.persistence.entity.EntityDefinition;

public interface QueryArgumentsParser {

    Parameter parse(EntityDefinition entityDefinition, Object[] queryArguments);

}
