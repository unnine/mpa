package mpa.audit.repository.database;

import mpa.audit.repository.database.schema.Data;
import mpa.audit.repository.database.schema.MetaData;
import mpa.audit.repository.database.sql.AuditSQL;
import mpa.audit.repository.database.sql.MetaDataSQL;
import mpa.audit.repository.database.sql.parameter.Parameter;

public interface DataAccessRepository {

    Data selectData(AuditSQL sql, Parameter parameter);

    MetaData selectMetaData(MetaDataSQL sql);

}
