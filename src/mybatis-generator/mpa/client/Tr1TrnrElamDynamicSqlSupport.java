package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Tr1TrnrElamDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Tr1TrnrElam tr1TrnrElam = new Tr1TrnrElam();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trnrElamIdx = tr1TrnrElam.trnrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> hirTrnrElamIdx = tr1TrnrElam.hirTrnrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = tr1TrnrElam.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsNo = tr1TrnrElam.rvsNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = tr1TrnrElam.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = tr1TrnrElam.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trnrElamAprIdx = tr1TrnrElam.trnrElamAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trnrElamProc = tr1TrnrElam.trnrElamProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trnrDptNm = tr1TrnrElam.trnrDptNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trnrElamYn = tr1TrnrElam.trnrElamYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = tr1TrnrElam.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trnrUid = tr1TrnrElam.trnrUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = tr1TrnrElam.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = tr1TrnrElam.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = tr1TrnrElam.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = tr1TrnrElam.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = tr1TrnrElam.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = tr1TrnrElam.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = tr1TrnrElam.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = tr1TrnrElam.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = tr1TrnrElam.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsYn = tr1TrnrElam.rvsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsRea = tr1TrnrElam.rvsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> rvsDs = tr1TrnrElam.rvsDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = tr1TrnrElam.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Tr1TrnrElam extends AliasableSqlTable<Tr1TrnrElam> {
        public final SqlColumn<Short> trnrElamIdx = column("TRNR_ELAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> hirTrnrElamIdx = column("HIR_TRNR_ELAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsNo = column("RVS_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<Short> trnrElamAprIdx = column("TRNR_ELAM_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> trnrElamProc = column("TRNR_ELAM_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> trnrDptNm = column("TRNR_DPT_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> trnrElamYn = column("TRNR_ELAM_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<String> trnrUid = column("TRNR_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsYn = column("RVS_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsRea = column("RVS_REA", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> rvsDs = column("RVS_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public Tr1TrnrElam() {
            super("PHM7_1_QMS_USER.TR1_TRNR_ELAM", Tr1TrnrElam::new);
        }
    }
}