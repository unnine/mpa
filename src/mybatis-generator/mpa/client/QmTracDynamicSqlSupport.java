package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class QmTracDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final QmTrac qmTrac = new QmTrac();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = qmTrac.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> hirTracIdx = qmTrac.hirTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlCd = qmTrac.modlCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivCd = qmTrac.modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> reqDs = qmTrac.reqDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqUid = qmTrac.reqUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ncsYn = qmTrac.ncsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> uncsRea = qmTrac.uncsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cmplDt = qmTrac.cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgDptCd = qmTrac.crgDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgUid = qmTrac.crgUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ncsAtc = qmTrac.ncsAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqFdbk = qmTrac.reqFdbk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ctt = qmTrac.ctt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tracPrgs = qmTrac.tracPrgs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = qmTrac.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = qmTrac.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = qmTrac.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> classify = qmTrac.classify;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fromIdx = qmTrac.fromIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = qmTrac.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tit = qmTrac.tit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class QmTrac extends AliasableSqlTable<QmTrac> {
        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> hirTracIdx = column("HIR_TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> modlCd = column("MODL_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> modlDivCd = column("MODL_DIV_CD", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> reqDs = column("REQ_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> reqUid = column("REQ_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> ncsYn = column("NCS_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> uncsRea = column("UNCS_REA", JDBCType.VARCHAR);

        public final SqlColumn<String> cmplDt = column("CMPL_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> crgDptCd = column("CRG_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> crgUid = column("CRG_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> ncsAtc = column("NCS_ATC", JDBCType.VARCHAR);

        public final SqlColumn<String> reqFdbk = column("REQ_FDBK", JDBCType.VARCHAR);

        public final SqlColumn<String> ctt = column("CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> tracPrgs = column("TRAC_PRGS", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> classify = column("CLASSIFY", JDBCType.VARCHAR);

        public final SqlColumn<Short> fromIdx = column("FROM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> tit = column("TIT", JDBCType.VARCHAR);

        public QmTrac() {
            super("PHM7_1_QMS_USER.QM_TRAC", QmTrac::new);
        }
    }
}