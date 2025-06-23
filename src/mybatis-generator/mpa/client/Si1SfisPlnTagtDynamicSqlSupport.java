package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Si1SfisPlnTagtDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Si1SfisPlnTagt si1SfisPlnTagt = new Si1SfisPlnTagt();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> sfisPlnTagtIdx = si1SfisPlnTagt.sfisPlnTagtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> sfisPlnIdx = si1SfisPlnTagt.sfisPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sfisExpStrDt = si1SfisPlnTagt.sfisExpStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sfisExpEndDt = si1SfisPlnTagt.sfisExpEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sfisTit = si1SfisPlnTagt.sfisTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sfisPsn = si1SfisPlnTagt.sfisPsn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sfisFid = si1SfisPlnTagt.sfisFid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sfisFidEtc = si1SfisPlnTagt.sfisFidEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = si1SfisPlnTagt.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = si1SfisPlnTagt.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = si1SfisPlnTagt.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Si1SfisPlnTagt extends AliasableSqlTable<Si1SfisPlnTagt> {
        public final SqlColumn<Short> sfisPlnTagtIdx = column("SFIS_PLN_TAGT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> sfisPlnIdx = column("SFIS_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> sfisExpStrDt = column("SFIS_EXP_STR_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> sfisExpEndDt = column("SFIS_EXP_END_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> sfisTit = column("SFIS_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> sfisPsn = column("SFIS_PSN", JDBCType.VARCHAR);

        public final SqlColumn<String> sfisFid = column("SFIS_FID", JDBCType.VARCHAR);

        public final SqlColumn<String> sfisFidEtc = column("SFIS_FID_ETC", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Si1SfisPlnTagt() {
            super("PHM7_1_QMS_USER.SI1_SFIS_PLN_TAGT", Si1SfisPlnTagt::new);
        }
    }
}