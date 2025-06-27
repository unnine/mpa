package mpa.audit.repository.dataaccess;

import mpa.audit.repository.dataaccess.schema.Data;
import mpa.audit.repository.dataaccess.sql.AuditSQL;
import mpa.audit.repository.dataaccess.sql.argument.Argument;

public interface DataAccessRepository {

    Data selectData(AuditSQL sql, Argument argument);

}
