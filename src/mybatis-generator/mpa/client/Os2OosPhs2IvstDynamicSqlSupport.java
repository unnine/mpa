package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Os2OosPhs2IvstDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Os2OosPhs2Ivst os2OosPhs2Ivst = new Os2OosPhs2Ivst();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosPhs2IvstIdx = os2OosPhs2Ivst.oosPhs2IvstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosRcpIdx = os2OosPhs2Ivst.oosRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = os2OosPhs2Ivst.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = os2OosPhs2Ivst.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ivgSpccYn = os2OosPhs2Ivst.ivgSpccYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ivgRst = os2OosPhs2Ivst.ivgRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcsAtcYn = os2OosPhs2Ivst.rcsAtcYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hyptIndcYn = os2OosPhs2Ivst.hyptIndcYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hyptDfrYn = os2OosPhs2Ivst.hyptDfrYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hyptDlgYn = os2OosPhs2Ivst.hyptDlgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hyptEtcYn = os2OosPhs2Ivst.hyptEtcYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> phs2IvstAprIdx = os2OosPhs2Ivst.phs2IvstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ver = os2OosPhs2Ivst.ver;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = os2OosPhs2Ivst.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = os2OosPhs2Ivst.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = os2OosPhs2Ivst.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ivgStr = os2OosPhs2Ivst.ivgStr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ivgEnd = os2OosPhs2Ivst.ivgEnd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Os2OosPhs2Ivst extends AliasableSqlTable<Os2OosPhs2Ivst> {
        public final SqlColumn<Short> oosPhs2IvstIdx = column("OOS_PHS2_IVST_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> oosRcpIdx = column("OOS_RCP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> ivgSpccYn = column("IVG_SPCC_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> ivgRst = column("IVG_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> rcsAtcYn = column("RCS_ATC_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> hyptIndcYn = column("HYPT_INDC_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> hyptDfrYn = column("HYPT_DFR_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> hyptDlgYn = column("HYPT_DLG_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> hyptEtcYn = column("HYPT_ETC_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> phs2IvstAprIdx = column("PHS2_IVST_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> ver = column("VER", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> ivgStr = column("IVG_STR", JDBCType.VARCHAR);

        public final SqlColumn<String> ivgEnd = column("IVG_END", JDBCType.VARCHAR);

        public Os2OosPhs2Ivst() {
            super("PHM7_1_QMS_USER.OS2_OOS_PHS2_IVST", Os2OosPhs2Ivst::new);
        }
    }
}