package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Rc1RacWrtDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Rc1RacWrt rc1RacWrt = new Rc1RacWrt();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> racWrtIdx = rc1RacWrt.racWrtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = rc1RacWrt.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = rc1RacWrt.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = rc1RacWrt.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = rc1RacWrt.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = rc1RacWrt.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> racWrtAprIdx = rc1RacWrt.racWrtAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> racProc = rc1RacWrt.racProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivCd = rc1RacWrt.modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqDptCd = rc1RacWrt.reqDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqUid = rc1RacWrt.reqUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivEtc = rc1RacWrt.modlDivEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> racTit = rc1RacWrt.racTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> racNcsAtc = rc1RacWrt.racNcsAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> issu = rc1RacWrt.issu;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cmplDt = rc1RacWrt.cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = rc1RacWrt.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = rc1RacWrt.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcs = rc1RacWrt.rcs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = rc1RacWrt.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = rc1RacWrt.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = rc1RacWrt.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = rc1RacWrt.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = rc1RacWrt.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = rc1RacWrt.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> modlTracIdx = rc1RacWrt.modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rc5whyYn = rc1RacWrt.rc5whyYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rc4m1eYn = rc1RacWrt.rc4m1eYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcEtcYn = rc1RacWrt.rcEtcYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcEtc = rc1RacWrt.rcEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Rc1RacWrt extends AliasableSqlTable<Rc1RacWrt> {
        public final SqlColumn<Short> racWrtIdx = column("RAC_WRT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<Short> racWrtAprIdx = column("RAC_WRT_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> racProc = column("RAC_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> modlDivCd = column("MODL_DIV_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> reqDptCd = column("REQ_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> reqUid = column("REQ_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> modlDivEtc = column("MODL_DIV_ETC", JDBCType.VARCHAR);

        public final SqlColumn<String> racTit = column("RAC_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> racNcsAtc = column("RAC_NCS_ATC", JDBCType.VARCHAR);

        public final SqlColumn<String> issu = column("ISSU", JDBCType.VARCHAR);

        public final SqlColumn<String> cmplDt = column("CMPL_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> rcs = column("RCS", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> modlTracIdx = column("MODL_TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> rc5whyYn = column("RC_5WHY_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rc4m1eYn = column("RC_4M1E_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rcEtcYn = column("RC_ETC_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rcEtc = column("RC_ETC", JDBCType.VARCHAR);

        public Rc1RacWrt() {
            super("PHM7_1_QMS_USER.RC1_RAC_WRT", Rc1RacWrt::new);
        }
    }
}