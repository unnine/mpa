package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Si1SfisPsnDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Si1SfisPsn si1SfisPsn = new Si1SfisPsn();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> sfisPsnIdx = si1SfisPsn.sfisPsnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sfisPsnUid = si1SfisPsn.sfisPsnUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = si1SfisPsn.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = si1SfisPsn.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = si1SfisPsn.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> sfisIdx = si1SfisPsn.sfisIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Si1SfisPsn extends AliasableSqlTable<Si1SfisPsn> {
        public final SqlColumn<Short> sfisPsnIdx = column("SFIS_PSN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> sfisPsnUid = column("SFIS_PSN_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> sfisIdx = column("SFIS_IDX", JDBCType.NUMERIC);

        public Si1SfisPsn() {
            super("PHM7_1_QMS_USER.SI1_SFIS_PSN", Si1SfisPsn::new);
        }
    }
}