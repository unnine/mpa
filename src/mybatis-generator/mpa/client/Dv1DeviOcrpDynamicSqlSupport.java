package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Dv1DeviOcrpDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Dv1DeviOcrp dv1DeviOcrp = new Dv1DeviOcrp();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> deviOcrpIdx = dv1DeviOcrp.deviOcrpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = dv1DeviOcrp.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = dv1DeviOcrp.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = dv1DeviOcrp.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = dv1DeviOcrp.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = dv1DeviOcrp.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> deviOcrpAprIdx = dv1DeviOcrp.deviOcrpAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deviProc = dv1DeviOcrp.deviProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deviTit = dv1DeviOcrp.deviTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> prdSmpNm = dv1DeviOcrp.prdSmpNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deviPlnYn = dv1DeviOcrp.deviPlnYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> ocrConfDs = dv1DeviOcrp.ocrConfDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dscver = dv1DeviOcrp.dscver;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ocrPla = dv1DeviOcrp.ocrPla;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dscvTestTeamNm = dv1DeviOcrp.dscvTestTeamNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deviKnd = dv1DeviOcrp.deviKnd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> imdActItm = dv1DeviOcrp.imdActItm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eptRcs = dv1DeviOcrp.eptRcs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = dv1DeviOcrp.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = dv1DeviOcrp.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = dv1DeviOcrp.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = dv1DeviOcrp.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = dv1DeviOcrp.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = dv1DeviOcrp.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> modlTracIdx = dv1DeviOcrp.modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Dv1DeviOcrp extends AliasableSqlTable<Dv1DeviOcrp> {
        public final SqlColumn<Short> deviOcrpIdx = column("DEVI_OCRP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<Short> deviOcrpAprIdx = column("DEVI_OCRP_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> deviProc = column("DEVI_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> deviTit = column("DEVI_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> prdSmpNm = column("PRD_SMP_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> deviPlnYn = column("DEVI_PLN_YN", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> ocrConfDs = column("OCR_CONF_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> dscver = column("DSCVER", JDBCType.VARCHAR);

        public final SqlColumn<String> ocrPla = column("OCR_PLA", JDBCType.VARCHAR);

        public final SqlColumn<String> dscvTestTeamNm = column("DSCV_TEST_TEAM_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> deviKnd = column("DEVI_KND", JDBCType.VARCHAR);

        public final SqlColumn<String> imdActItm = column("IMD_ACT_ITM", JDBCType.VARCHAR);

        public final SqlColumn<String> eptRcs = column("EPT_RCS", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> modlTracIdx = column("MODL_TRAC_IDX", JDBCType.NUMERIC);

        public Dv1DeviOcrp() {
            super("PHM7_1_QMS_USER.DV1_DEVI_OCRP", Dv1DeviOcrp::new);
        }
    }
}