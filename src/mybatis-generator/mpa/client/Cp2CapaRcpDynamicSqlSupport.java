package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cp2CapaRcpDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cp2CapaRcp cp2CapaRcp = new Cp2CapaRcp();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaRcpIdx = cp2CapaRcp.capaRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaReqIdx = cp2CapaRcp.capaReqIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = cp2CapaRcp.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = cp2CapaRcp.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = cp2CapaRcp.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = cp2CapaRcp.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = cp2CapaRcp.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcpDptCd = cp2CapaRcp.rcpDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcpUid = cp2CapaRcp.rcpUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> rcpAprIdx = cp2CapaRcp.rcpAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> capaProc = cp2CapaRcp.capaProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcpVer = cp2CapaRcp.rcpVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivCd = cp2CapaRcp.modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivEtc = cp2CapaRcp.modlDivEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> capaTit = cp2CapaRcp.capaTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = cp2CapaRcp.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = cp2CapaRcp.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = cp2CapaRcp.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cp2CapaRcp.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cp2CapaRcp.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cp2CapaRcp.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cp2CapaRcp extends AliasableSqlTable<Cp2CapaRcp> {
        public final SqlColumn<Short> capaRcpIdx = column("CAPA_RCP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> capaReqIdx = column("CAPA_REQ_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> rcpDptCd = column("RCP_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> rcpUid = column("RCP_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> rcpAprIdx = column("RCP_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> capaProc = column("CAPA_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> rcpVer = column("RCP_VER", JDBCType.VARCHAR);

        public final SqlColumn<String> modlDivCd = column("MODL_DIV_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> modlDivEtc = column("MODL_DIV_ETC", JDBCType.VARCHAR);

        public final SqlColumn<String> capaTit = column("CAPA_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Cp2CapaRcp() {
            super("PHM7_1_QMS_USER.CP2_CAPA_RCP", Cp2CapaRcp::new);
        }
    }
}