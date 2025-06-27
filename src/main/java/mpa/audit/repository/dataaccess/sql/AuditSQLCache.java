package mpa.audit.repository.dataaccess.sql;

public interface AuditSQLCache {

    AuditSQL getSQLByTableName(String tableName);

    void addSQL(String tableName, AuditSQL sql);

    void clear();

}
