package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ti1AnuTrniPlnDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ti1AnuTrniPln ti1AnuTrniPln = new Ti1AnuTrniPln();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> anuTrniPlnIdx = ti1AnuTrniPln.anuTrniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> hirAnuTrniPlnIdx = ti1AnuTrniPln.hirAnuTrniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsNo = ti1AnuTrniPln.rvsNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsYn = ti1AnuTrniPln.rvsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsRea = ti1AnuTrniPln.rvsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> rvsDs = ti1AnuTrniPln.rvsDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = ti1AnuTrniPln.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = ti1AnuTrniPln.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = ti1AnuTrniPln.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = ti1AnuTrniPln.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = ti1AnuTrniPln.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> anuTrniPlnAprIdx = ti1AnuTrniPln.anuTrniPlnAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> anuTrniPlnProc = ti1AnuTrniPln.anuTrniPlnProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> anuTrniTit = ti1AnuTrniPln.anuTrniTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniTypCd = ti1AnuTrniPln.trniTypCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniDptCd = ti1AnuTrniPln.trniDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plnYr = ti1AnuTrniPln.plnYr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = ti1AnuTrniPln.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> fileCtt = ti1AnuTrniPln.fileCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = ti1AnuTrniPln.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> anuTrniRstAprIdx = ti1AnuTrniPln.anuTrniRstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = ti1AnuTrniPln.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = ti1AnuTrniPln.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = ti1AnuTrniPln.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ti1AnuTrniPln.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ti1AnuTrniPln.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ti1AnuTrniPln.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> techPlnYn = ti1AnuTrniPln.techPlnYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> modlTracIdx = ti1AnuTrniPln.modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ti1AnuTrniPln extends AliasableSqlTable<Ti1AnuTrniPln> {
        public final SqlColumn<Short> anuTrniPlnIdx = column("ANU_TRNI_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> hirAnuTrniPlnIdx = column("HIR_ANU_TRNI_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> rvsNo = column("RVS_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsYn = column("RVS_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsRea = column("RVS_REA", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> rvsDs = column("RVS_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<Short> anuTrniPlnAprIdx = column("ANU_TRNI_PLN_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> anuTrniPlnProc = column("ANU_TRNI_PLN_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> anuTrniTit = column("ANU_TRNI_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> trniTypCd = column("TRNI_TYP_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> trniDptCd = column("TRNI_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> plnYr = column("PLN_YR", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> fileCtt = column("FILE_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> anuTrniRstAprIdx = column("ANU_TRNI_RST_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> techPlnYn = column("TECH_PLN_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> modlTracIdx = column("MODL_TRAC_IDX", JDBCType.NUMERIC);

        public Ti1AnuTrniPln() {
            super("PHM7_1_QMS_USER.TI1_ANU_TRNI_PLN", Ti1AnuTrniPln::new);
        }
    }
}