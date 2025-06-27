package mpa.audit.repository.sql.cache;

import lombok.RequiredArgsConstructor;
import mpa.audit.repository.sql.AuditSQL;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class InMemoryAuditSQLCache implements AuditSQLCache {

    private final Map<String, AuditSQL> sqlByTableName = new HashMap<>();


    @Override
    public AuditSQL getSQLByTableName(String tableName) {
        return sqlByTableName.get(tableName);
    }

    @Override
    public void addSQL(String tableName, AuditSQL sql) {
        sqlByTableName.put(tableName, sql);
    }

}
