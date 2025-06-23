package mpa.entity;

import mpa.audit_old.repository.database.schema.MetaTable;
import mpa.audit_old.repository.database.sql.AuditSQL;

public interface EntityDefinition {

    MetaTable getMetaTable();

    Class<?> getEntityClass();

    String getTableName();

    AuditSQL getAuditSQL();
}
