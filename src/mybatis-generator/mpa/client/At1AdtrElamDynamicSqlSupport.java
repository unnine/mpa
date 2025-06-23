package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class At1AdtrElamDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final At1AdtrElam at1AdtrElam = new At1AdtrElam();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> adtrElamIdx = at1AdtrElam.adtrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> hirAdtrElamIdx = at1AdtrElam.hirAdtrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsNo = at1AdtrElam.rvsNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsYn = at1AdtrElam.rvsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsRea = at1AdtrElam.rvsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> rvsDs = at1AdtrElam.rvsDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = at1AdtrElam.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = at1AdtrElam.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = at1AdtrElam.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtrUid = at1AdtrElam.adtrUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtrDptNm = at1AdtrElam.adtrDptNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> adtrElamAprIdx = at1AdtrElam.adtrElamAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtrElamProc = at1AdtrElam.adtrElamProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniNo = at1AdtrElam.trniNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> elamDt = at1AdtrElam.elamDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniCplCosYn = at1AdtrElam.trniCplCosYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> testScr1st = at1AdtrElam.testScr1st;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> testScr2st = at1AdtrElam.testScr2st;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = at1AdtrElam.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtrElamYn = at1AdtrElam.adtrElamYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = at1AdtrElam.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = at1AdtrElam.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = at1AdtrElam.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = at1AdtrElam.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = at1AdtrElam.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = at1AdtrElam.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = at1AdtrElam.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = at1AdtrElam.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = at1AdtrElam.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class At1AdtrElam extends AliasableSqlTable<At1AdtrElam> {
        public final SqlColumn<Short> adtrElamIdx = column("ADTR_ELAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> hirAdtrElamIdx = column("HIR_ADTR_ELAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> rvsNo = column("RVS_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsYn = column("RVS_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsRea = column("RVS_REA", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> rvsDs = column("RVS_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> adtrUid = column("ADTR_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> adtrDptNm = column("ADTR_DPT_NM", JDBCType.VARCHAR);

        public final SqlColumn<Short> adtrElamAprIdx = column("ADTR_ELAM_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> adtrElamProc = column("ADTR_ELAM_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> trniNo = column("TRNI_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> elamDt = column("ELAM_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> trniCplCosYn = column("TRNI_CPL_COS_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> testScr1st = column("TEST_SCR_1ST", JDBCType.NUMERIC);

        public final SqlColumn<Short> testScr2st = column("TEST_SCR_2ST", JDBCType.NUMERIC);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<String> adtrElamYn = column("ADTR_ELAM_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public At1AdtrElam() {
            super("PHM7_1_QMS_USER.AT1_ADTR_ELAM", At1AdtrElam::new);
        }
    }
}