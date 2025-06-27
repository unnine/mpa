package mpa.audit.repository;

import mpa.audit.repository.schema.Data;
import mpa.audit.repository.sql.AuditSQL;
import mpa.audit.repository.sql.argument.Argument;

public interface DataAccessRepository {

    Data selectData(AuditSQL sql, Argument argument);

}
