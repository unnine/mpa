package mpa.audit.repository.sql.cache;

import mpa.audit.repository.sql.AuditSQL;

public interface AuditSQLCache {

    AuditSQL getSQLByTableName(String tableName);

    void addSQL(String tableName, AuditSQL sql);

}
