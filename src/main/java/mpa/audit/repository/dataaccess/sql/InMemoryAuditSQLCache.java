package mpa.audit.repository.dataaccess.sql;

import lombok.RequiredArgsConstructor;

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

    @Override
    public void clear() {
        sqlByTableName.clear();
    }
}
