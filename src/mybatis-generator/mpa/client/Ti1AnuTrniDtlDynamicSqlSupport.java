package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ti1AnuTrniDtlDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ti1AnuTrniDtl ti1AnuTrniDtl = new Ti1AnuTrniDtl();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> anuTrniDtlIdx = ti1AnuTrniDtl.anuTrniDtlIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> anuTrniPlnIdx = ti1AnuTrniDtl.anuTrniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniUid = ti1AnuTrniDtl.trniUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trnrElamIdx = ti1AnuTrniDtl.trnrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniExpStrDt = ti1AnuTrniDtl.trniExpStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniExpEndDt = ti1AnuTrniDtl.trniExpEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniTit = ti1AnuTrniDtl.trniTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniPrgYn = ti1AnuTrniDtl.trniPrgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = ti1AnuTrniDtl.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ti1AnuTrniDtl.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ti1AnuTrniDtl.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ti1AnuTrniDtl.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ti1AnuTrniDtl extends AliasableSqlTable<Ti1AnuTrniDtl> {
        public final SqlColumn<Short> anuTrniDtlIdx = column("ANU_TRNI_DTL_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> anuTrniPlnIdx = column("ANU_TRNI_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> trniUid = column("TRNI_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> trnrElamIdx = column("TRNR_ELAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> trniExpStrDt = column("TRNI_EXP_STR_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> trniExpEndDt = column("TRNI_EXP_END_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> trniTit = column("TRNI_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> trniPrgYn = column("TRNI_PRG_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Ti1AnuTrniDtl() {
            super("PHM7_1_QMS_USER.TI1_ANU_TRNI_DTL", Ti1AnuTrniDtl::new);
        }
    }
}