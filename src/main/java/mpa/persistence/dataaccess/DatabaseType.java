package mpa.persistence.dataaccess;

public enum DatabaseType {
    ORACLE(new OracleMetaDataSQL()),
    MY_SQL(new MysqlMetaDataSQL()),
    MS_SQL(new MssqlMetaDataSQL()),
    POSTGRESQL(new PostgresMetaDataSQL()),
    H2(new H2MetaDataSQL()),
    ;


    private final MetaDataSQL metaDataSQL;

    DatabaseType(MetaDataSQL metaDataSQL) {
        this.metaDataSQL = metaDataSQL;
    }

    public MetaDataSQL getMetaDataSQL() {
        return metaDataSQL;
    }

}