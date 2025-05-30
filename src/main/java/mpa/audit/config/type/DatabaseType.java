package mpa.audit.config.type;

import mpa.audit.repository.database.sql.*;

public enum DatabaseType {
    ORACLE(new OracleMetaDataSQL()),
    MY_SQL(new MysqlMetaDataSQL()),
    MS_SQL(new MssqlMetaDataSQL()),
    POSTGRESQL(new PostgresMetaDataSQL());


    private final MetaDataSQL metaDataSQL;

    DatabaseType(MetaDataSQL metaDataSQL) {
        this.metaDataSQL = metaDataSQL;
    }

    public MetaDataSQL getMetaDataSQL() {
        return metaDataSQL;
    }

}