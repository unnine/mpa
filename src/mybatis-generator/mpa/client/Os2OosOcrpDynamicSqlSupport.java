package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Os2OosOcrpDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Os2OosOcrp os2OosOcrp = new Os2OosOcrp();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosOcrpIdx = os2OosOcrp.oosOcrpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = os2OosOcrp.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = os2OosOcrp.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pitmDiv = os2OosOcrp.pitmDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ocrCtt = os2OosOcrp.ocrCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> prdSmpNm = os2OosOcrp.prdSmpNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pitmCd = os2OosOcrp.pitmCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> testNo = os2OosOcrp.testNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> lotNo = os2OosOcrp.lotNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> batchNo = os2OosOcrp.batchNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> lotDt = os2OosOcrp.lotDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> initTestTeamNm = os2OosOcrp.initTestTeamNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> initTestrNm = os2OosOcrp.initTestrNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ocrPla = os2OosOcrp.ocrPla;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> testAtc = os2OosOcrp.testAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> testStd = os2OosOcrp.testStd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> testRst = os2OosOcrp.testRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> testMtd = os2OosOcrp.testMtd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = os2OosOcrp.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> rpoAprIdx = os2OosOcrp.rpoAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = os2OosOcrp.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = os2OosOcrp.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = os2OosOcrp.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = os2OosOcrp.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = os2OosOcrp.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = os2OosOcrp.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcpCanlRea = os2OosOcrp.rcpCanlRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> rcpCanlDs = os2OosOcrp.rcpCanlDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcpCanlUid = os2OosOcrp.rcpCanlUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> ocrConfDs = os2OosOcrp.ocrConfDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ocrpProc = os2OosOcrp.ocrpProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> initTestStrDt = os2OosOcrp.initTestStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = os2OosOcrp.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> etcRcd = os2OosOcrp.etcRcd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> modlTracIdx = os2OosOcrp.modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Os2OosOcrp extends AliasableSqlTable<Os2OosOcrp> {
        public final SqlColumn<Short> oosOcrpIdx = column("OOS_OCRP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> pitmDiv = column("PITM_DIV", JDBCType.VARCHAR);

        public final SqlColumn<String> ocrCtt = column("OCR_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> prdSmpNm = column("PRD_SMP_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> pitmCd = column("PITM_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> testNo = column("TEST_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> lotNo = column("LOT_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> batchNo = column("BATCH_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> lotDt = column("LOT_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> initTestTeamNm = column("INIT_TEST_TEAM_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> initTestrNm = column("INIT_TESTR_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> ocrPla = column("OCR_PLA", JDBCType.VARCHAR);

        public final SqlColumn<String> testAtc = column("TEST_ATC", JDBCType.VARCHAR);

        public final SqlColumn<String> testStd = column("TEST_STD", JDBCType.VARCHAR);

        public final SqlColumn<String> testRst = column("TEST_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> testMtd = column("TEST_MTD", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> rpoAprIdx = column("RPO_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> rcpCanlRea = column("RCP_CANL_REA", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> rcpCanlDs = column("RCP_CANL_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> rcpCanlUid = column("RCP_CANL_UID", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> ocrConfDs = column("OCR_CONF_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> ocrpProc = column("OCRP_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> initTestStrDt = column("INIT_TEST_STR_DT", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> etcRcd = column("ETC_RCD", JDBCType.VARCHAR);

        public final SqlColumn<Short> modlTracIdx = column("MODL_TRAC_IDX", JDBCType.NUMERIC);

        public Os2OosOcrp() {
            super("PHM7_1_QMS_USER.OS2_OOS_OCRP", Os2OosOcrp::new);
        }
    }
}