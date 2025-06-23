package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ea1ExadPlnDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ea1ExadPln ea1ExadPln = new Ea1ExadPln();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadPlnIdx = ea1ExadPln.exadPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = ea1ExadPln.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = ea1ExadPln.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = ea1ExadPln.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtComp = ea1ExadPln.adtComp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtPps = ea1ExadPln.adtPps;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtrInfo = ea1ExadPln.adtrInfo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtExpStrDt = ea1ExadPln.adtExpStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtExpEndDt = ea1ExadPln.adtExpEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cplTrm = ea1ExadPln.cplTrm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = ea1ExadPln.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadPlnAprIdx = ea1ExadPln.exadPlnAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> exadProc = ea1ExadPln.exadProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtKnd = ea1ExadPln.adtKnd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = ea1ExadPln.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = ea1ExadPln.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = ea1ExadPln.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = ea1ExadPln.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ea1ExadPln.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ea1ExadPln.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ea1ExadPln.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = ea1ExadPln.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = ea1ExadPln.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> modlTracIdx = ea1ExadPln.modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ea1ExadPln extends AliasableSqlTable<Ea1ExadPln> {
        public final SqlColumn<Short> exadPlnIdx = column("EXAD_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> adtComp = column("ADT_COMP", JDBCType.VARCHAR);

        public final SqlColumn<String> adtPps = column("ADT_PPS", JDBCType.VARCHAR);

        public final SqlColumn<String> adtrInfo = column("ADTR_INFO", JDBCType.VARCHAR);

        public final SqlColumn<String> adtExpStrDt = column("ADT_EXP_STR_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> adtExpEndDt = column("ADT_EXP_END_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> cplTrm = column("CPL_TRM", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<Short> exadPlnAprIdx = column("EXAD_PLN_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> exadProc = column("EXAD_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> adtKnd = column("ADT_KND", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> modlTracIdx = column("MODL_TRAC_IDX", JDBCType.NUMERIC);

        public Ea1ExadPln() {
            super("PHM7_1_QMS_USER.EA1_EXAD_PLN", Ea1ExadPln::new);
        }
    }
}