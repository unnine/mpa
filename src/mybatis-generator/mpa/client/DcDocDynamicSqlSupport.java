package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class DcDocDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final DcDoc dcDoc = new DcDoc();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> docIdx = dcDoc.docIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> hirDocIdx = dcDoc.hirDocIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> docClfIdx = dcDoc.docClfIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = dcDoc.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNm = dcDoc.docNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNmEn = dcDoc.docNmEn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docWrtUid = dcDoc.docWrtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docWrtDptCd = dcDoc.docWrtDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> enmDt = dcDoc.enmDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> enfoDt = dcDoc.enfoDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> expDt = dcDoc.expDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> openYn = dcDoc.openYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> kwd = dcDoc.kwd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dpsDt = dcDoc.dpsDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dpsRea = dcDoc.dpsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docRmk = dcDoc.docRmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = dcDoc.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = dcDoc.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = dcDoc.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = dcDoc.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = dcDoc.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = dcDoc.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = dcDoc.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = dcDoc.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsNo = dcDoc.rvsNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsYn = dcDoc.rvsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsDt = dcDoc.rvsDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsRea = dcDoc.rvsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsSumr = dcDoc.rvsSumr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = dcDoc.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = dcDoc.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = dcDoc.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> docAprReqidx = dcDoc.docAprReqidx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docPrgs = dcDoc.docPrgs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class DcDoc extends AliasableSqlTable<DcDoc> {
        public final SqlColumn<Short> docIdx = column("DOC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> hirDocIdx = column("HIR_DOC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Integer> docClfIdx = column("DOC_CLF_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> docNm = column("DOC_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> docNmEn = column("DOC_NM_EN", JDBCType.VARCHAR);

        public final SqlColumn<String> docWrtUid = column("DOC_WRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> docWrtDptCd = column("DOC_WRT_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> enmDt = column("ENM_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> enfoDt = column("ENFO_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> expDt = column("EXP_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> openYn = column("OPEN_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> kwd = column("KWD", JDBCType.VARCHAR);

        public final SqlColumn<String> dpsDt = column("DPS_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> dpsRea = column("DPS_REA", JDBCType.VARCHAR);

        public final SqlColumn<String> docRmk = column("DOC_RMK", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsNo = column("RVS_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsYn = column("RVS_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsDt = column("RVS_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsRea = column("RVS_REA", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsSumr = column("RVS_SUMR", JDBCType.VARCHAR);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> docAprReqidx = column("DOC_APR_REQIDX", JDBCType.NUMERIC);

        public final SqlColumn<String> docPrgs = column("DOC_PRGS", JDBCType.VARCHAR);

        public DcDoc() {
            super("PHM7_1_QMS_USER.DC_DOC", DcDoc::new);
        }
    }
}