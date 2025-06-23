package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Os2OosPhs2HyptDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Os2OosPhs2Hypt os2OosPhs2Hypt = new Os2OosPhs2Hypt();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosPhs2HyptIdx = os2OosPhs2Hypt.oosPhs2HyptIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = os2OosPhs2Hypt.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = os2OosPhs2Hypt.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosPhs2IvstIdx = os2OosPhs2Hypt.oosPhs2IvstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dfrIdtsmpuse = os2OosPhs2Hypt.dfrIdtsmpuse;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dfrTestNo = os2OosPhs2Hypt.dfrTestNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dfrTestRst = os2OosPhs2Hypt.dfrTestRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dfrPpsTestRst = os2OosPhs2Hypt.dfrPpsTestRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dfrTestJdg = os2OosPhs2Hypt.dfrTestJdg;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dfrPpsJdg = os2OosPhs2Hypt.dfrPpsJdg;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dlgIdtsmpuse = os2OosPhs2Hypt.dlgIdtsmpuse;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dlgTestNo = os2OosPhs2Hypt.dlgTestNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dlgTestRst = os2OosPhs2Hypt.dlgTestRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dlgTestJdg = os2OosPhs2Hypt.dlgTestJdg;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> etcRcsConfYn = os2OosPhs2Hypt.etcRcsConfYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> etcRcsAtc = os2OosPhs2Hypt.etcRcsAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> etcRcsHyptRsetYn = os2OosPhs2Hypt.etcRcsHyptRsetYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> etcRcsMakTrsmYn = os2OosPhs2Hypt.etcRcsMakTrsmYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> dfrTestFileIdx = os2OosPhs2Hypt.dfrTestFileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> phs2HyptAprIdx = os2OosPhs2Hypt.phs2HyptAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = os2OosPhs2Hypt.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = os2OosPhs2Hypt.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = os2OosPhs2Hypt.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> dlgTestFileIdx = os2OosPhs2Hypt.dlgTestFileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> etcHyptFileIdx = os2OosPhs2Hypt.etcHyptFileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Os2OosPhs2Hypt extends AliasableSqlTable<Os2OosPhs2Hypt> {
        public final SqlColumn<Short> oosPhs2HyptIdx = column("OOS_PHS2_HYPT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<Short> oosPhs2IvstIdx = column("OOS_PHS2_IVST_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> dfrIdtsmpuse = column("DFR_IDTSMPUSE", JDBCType.VARCHAR);

        public final SqlColumn<String> dfrTestNo = column("DFR_TEST_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> dfrTestRst = column("DFR_TEST_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> dfrPpsTestRst = column("DFR_PPS_TEST_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> dfrTestJdg = column("DFR_TEST_JDG", JDBCType.VARCHAR);

        public final SqlColumn<String> dfrPpsJdg = column("DFR_PPS_JDG", JDBCType.VARCHAR);

        public final SqlColumn<String> dlgIdtsmpuse = column("DLG_IDTSMPUSE", JDBCType.VARCHAR);

        public final SqlColumn<String> dlgTestNo = column("DLG_TEST_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> dlgTestRst = column("DLG_TEST_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> dlgTestJdg = column("DLG_TEST_JDG", JDBCType.VARCHAR);

        public final SqlColumn<String> etcRcsConfYn = column("ETC_RCS_CONF_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> etcRcsAtc = column("ETC_RCS_ATC", JDBCType.VARCHAR);

        public final SqlColumn<String> etcRcsHyptRsetYn = column("ETC_RCS_HYPT_RSET_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> etcRcsMakTrsmYn = column("ETC_RCS_MAK_TRSM_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> dfrTestFileIdx = column("DFR_TEST_FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> phs2HyptAprIdx = column("PHS2_HYPT_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> dlgTestFileIdx = column("DLG_TEST_FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> etcHyptFileIdx = column("ETC_HYPT_FILE_IDX", JDBCType.NUMERIC);

        public Os2OosPhs2Hypt() {
            super("PHM7_1_QMS_USER.OS2_OOS_PHS2_HYPT", Os2OosPhs2Hypt::new);
        }
    }
}