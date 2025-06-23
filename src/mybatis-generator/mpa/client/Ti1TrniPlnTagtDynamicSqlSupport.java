package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ti1TrniPlnTagtDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ti1TrniPlnTagt ti1TrniPlnTagt = new Ti1TrniPlnTagt();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniPlnTagtIdx = ti1TrniPlnTagt.trniPlnTagtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniPlnIdx = ti1TrniPlnTagt.trniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniTagtUid = ti1TrniPlnTagt.trniTagtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ti1TrniPlnTagt.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ti1TrniPlnTagt.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ti1TrniPlnTagt.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ti1TrniPlnTagt extends AliasableSqlTable<Ti1TrniPlnTagt> {
        public final SqlColumn<Short> trniPlnTagtIdx = column("TRNI_PLN_TAGT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> trniPlnIdx = column("TRNI_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> trniTagtUid = column("TRNI_TAGT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Ti1TrniPlnTagt() {
            super("PHM7_1_QMS_USER.TI1_TRNI_PLN_TAGT", Ti1TrniPlnTagt::new);
        }
    }
}