package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cg2ChgPrpsRcpDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cg2ChgPrpsRcp cg2ChgPrpsRcp = new Cg2ChgPrpsRcp();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgPrpsRcpIdx = cg2ChgPrpsRcp.chgPrpsRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgPrpsReqIdx = cg2ChgPrpsRcp.chgPrpsReqIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcpVer = cg2ChgPrpsRcp.rcpVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = cg2ChgPrpsRcp.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = cg2ChgPrpsRcp.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = cg2ChgPrpsRcp.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = cg2ChgPrpsRcp.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = cg2ChgPrpsRcp.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcpDt = cg2ChgPrpsRcp.rcpDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcpDptCd = cg2ChgPrpsRcp.rcpDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcpUid = cg2ChgPrpsRcp.rcpUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = cg2ChgPrpsRcp.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = cg2ChgPrpsRcp.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = cg2ChgPrpsRcp.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cg2ChgPrpsRcp.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cg2ChgPrpsRcp.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cg2ChgPrpsRcp.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> rcpAprIdx = cg2ChgPrpsRcp.rcpAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgPrpsProc = cg2ChgPrpsRcp.chgPrpsProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cg2ChgPrpsRcp extends AliasableSqlTable<Cg2ChgPrpsRcp> {
        public final SqlColumn<Short> chgPrpsRcpIdx = column("CHG_PRPS_RCP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> chgPrpsReqIdx = column("CHG_PRPS_REQ_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> rcpVer = column("RCP_VER", JDBCType.VARCHAR);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> rcpDt = column("RCP_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> rcpDptCd = column("RCP_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> rcpUid = column("RCP_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> rcpAprIdx = column("RCP_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> chgPrpsProc = column("CHG_PRPS_PROC", JDBCType.VARCHAR);

        public Cg2ChgPrpsRcp() {
            super("PHM7_1_QMS_USER.CG2_CHG_PRPS_RCP", Cg2ChgPrpsRcp::new);
        }
    }
}