package mpa.audit.repository.dataaccess.sql;

import lombok.RequiredArgsConstructor;
import mpa.persistence.context.Scopable;

@RequiredArgsConstructor
public class ScopableAuditSQLCache implements AuditSQLCache {

    private final Scopable<AuditSQLCache> proxy;


    private AuditSQLCache getInstance() {
        return proxy.getInstance();
    }

    @Override
    public AuditSQL getSQLByTableName(String tableName) {
        return getInstance().getSQLByTableName(tableName);
    }

    @Override
    public void addSQL(String tableName, AuditSQL sql) {
        getInstance().addSQL(tableName, sql);
    }

    @Override
    public void clear() {
        getInstance().clear();
    }
}
