package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Si1SfisRstDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Si1SfisRst si1SfisRst = new Si1SfisRst();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> sfisRstIdx = si1SfisRst.sfisRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> sfisIdx = si1SfisRst.sfisIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ispCtt = si1SfisRst.ispCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sfisRst = si1SfisRst.sfisRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = si1SfisRst.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = si1SfisRst.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = si1SfisRst.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = si1SfisRst.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Si1SfisRst extends AliasableSqlTable<Si1SfisRst> {
        public final SqlColumn<Short> sfisRstIdx = column("SFIS_RST_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> sfisIdx = column("SFIS_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> ispCtt = column("ISP_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> sfisRst = column("SFIS_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Si1SfisRst() {
            super("PHM7_1_QMS_USER.SI1_SFIS_RST", Si1SfisRst::new);
        }
    }
}