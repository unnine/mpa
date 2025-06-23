package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ti1TrniPlnDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ti1TrniPln ti1TrniPln = new Ti1TrniPln();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniPlnIdx = ti1TrniPln.trniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> anuTrniDtlIdx = ti1TrniPln.anuTrniDtlIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = ti1TrniPln.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = ti1TrniPln.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> modlTracIdx = ti1TrniPln.modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = ti1TrniPln.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = ti1TrniPln.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = ti1TrniPln.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniProc = ti1TrniPln.trniProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivCd = ti1TrniPln.modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqDptCd = ti1TrniPln.reqDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqUid = ti1TrniPln.reqUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivEtc = ti1TrniPln.modlDivEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trnrElamIdx = ti1TrniPln.trnrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniUid = ti1TrniPln.trniUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniTit = ti1TrniPln.trniTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniExpStrDt = ti1TrniPln.trniExpStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniExpEndDt = ti1TrniPln.trniExpEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ti1TrniPln.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ti1TrniPln.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ti1TrniPln.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> plnAprIdx = ti1TrniPln.plnAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ti1TrniPln extends AliasableSqlTable<Ti1TrniPln> {
        public final SqlColumn<Short> trniPlnIdx = column("TRNI_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> anuTrniDtlIdx = column("ANU_TRNI_DTL_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> modlTracIdx = column("MODL_TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> trniProc = column("TRNI_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> modlDivCd = column("MODL_DIV_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> reqDptCd = column("REQ_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> reqUid = column("REQ_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> modlDivEtc = column("MODL_DIV_ETC", JDBCType.VARCHAR);

        public final SqlColumn<Short> trnrElamIdx = column("TRNR_ELAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> trniUid = column("TRNI_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> trniTit = column("TRNI_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> trniExpStrDt = column("TRNI_EXP_STR_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> trniExpEndDt = column("TRNI_EXP_END_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> plnAprIdx = column("PLN_APR_IDX", JDBCType.NUMERIC);

        public Ti1TrniPln() {
            super("PHM7_1_QMS_USER.TI1_TRNI_PLN", Ti1TrniPln::new);
        }
    }
}