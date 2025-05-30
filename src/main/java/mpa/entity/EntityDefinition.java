package mpa.entity;

import mpa.audit.repository.database.schema.MetaTable;
import mpa.audit.repository.database.sql.AuditSQL;

public interface EntityDefinition {

    MetaTable getMetaTable();

    Class<?> getEntityClass();

    String getTableName();

    AuditSQL getAuditSQL();
}
