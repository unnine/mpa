package mpa.persistence.database;

import mpa.util.StringUtil;

import java.util.Arrays;
import java.util.NoSuchElementException;

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

    public static DatabaseType getByDriverName(String driverName) {
        if (StringUtil.isEmpty(driverName)) {
            throw new IllegalArgumentException("database driver name is null.");
        }
        return Arrays.stream(values())
                .filter(type -> driverName.toUpperCase().contains(type.name()))
                .findAny()
                .orElseThrow(() -> new NoSuchElementException(String.format("not found database type matched driver name. '%s'", driverName)));
    }


    public MetaDataSQL getMetaDataSQL() {
        return metaDataSQL;
    }

}