package mpa.audit_old.repository.database;

import mpa.audit_old.repository.database.schema.Data;
import mpa.audit_old.repository.database.schema.MetaData;
import mpa.audit_old.repository.database.sql.AuditSQL;
import mpa.audit_old.repository.database.sql.MetaDataSQL;
import mpa.audit_old.repository.database.sql.parameter.Parameter;

public interface DataAccessRepository {

    Data selectData(AuditSQL sql, Parameter parameter);

    MetaData selectMetaData(MetaDataSQL sql);

}
