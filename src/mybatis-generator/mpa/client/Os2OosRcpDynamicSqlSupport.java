package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Os2OosRcpDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Os2OosRcp os2OosRcp = new Os2OosRcp();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosRcpIdx = os2OosRcp.oosRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosOcrpIdx = os2OosRcp.oosOcrpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = os2OosRcp.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = os2OosRcp.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = os2OosRcp.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = os2OosRcp.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> oosTit = os2OosRcp.oosTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cmplDt = os2OosRcp.cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> rcpAprIdx = os2OosRcp.rcpAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> oosProc = os2OosRcp.oosProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = os2OosRcp.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = os2OosRcp.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = os2OosRcp.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = os2OosRcp.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = os2OosRcp.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = os2OosRcp.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcpVer = os2OosRcp.rcpVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcpDt = os2OosRcp.rcpDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Os2OosRcp extends AliasableSqlTable<Os2OosRcp> {
        public final SqlColumn<Short> oosRcpIdx = column("OOS_RCP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> oosOcrpIdx = column("OOS_OCRP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> oosTit = column("OOS_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> cmplDt = column("CMPL_DT", JDBCType.VARCHAR);

        public final SqlColumn<Short> rcpAprIdx = column("RCP_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> oosProc = column("OOS_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> rcpVer = column("RCP_VER", JDBCType.VARCHAR);

        public final SqlColumn<String> rcpDt = column("RCP_DT", JDBCType.VARCHAR);

        public Os2OosRcp() {
            super("PHM7_1_QMS_USER.OS2_OOS_RCP", Os2OosRcp::new);
        }
    }
}