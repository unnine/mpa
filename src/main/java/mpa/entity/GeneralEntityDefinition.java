package mpa.entity;

import lombok.Getter;
import mpa.audit_old.repository.database.schema.MetaTable;
import mpa.audit_old.repository.database.sql.AuditSQL;

@Getter
public class GeneralEntityDefinition implements EntityDefinition {

    private final MetaTable metaTable;
    private final Class<?> entityClass;
    private final String tableName;
    private final AuditSQL auditSQL;

    public GeneralEntityDefinition(MetaTable metaTable, Class<?> entityClass, String tableName, AuditSQL sql) {
        this.metaTable = metaTable;
        this.entityClass = entityClass;
        this.tableName = tableName;
        this.auditSQL = sql;
    }
}