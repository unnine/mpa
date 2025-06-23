package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Os2OosPhs1IvstDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Os2OosPhs1Ivst os2OosPhs1Ivst = new Os2OosPhs1Ivst();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosPhs1IvstIdx = os2OosPhs1Ivst.oosPhs1IvstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosRcpIdx = os2OosPhs1Ivst.oosRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = os2OosPhs1Ivst.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = os2OosPhs1Ivst.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> obvYn = os2OosPhs1Ivst.obvYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = os2OosPhs1Ivst.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = os2OosPhs1Ivst.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = os2OosPhs1Ivst.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> phs1IvstAprIdx = os2OosPhs1Ivst.phs1IvstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = os2OosPhs1Ivst.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ivgStr = os2OosPhs1Ivst.ivgStr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ivgEnd = os2OosPhs1Ivst.ivgEnd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rtestYn = os2OosPhs1Ivst.rtestYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rtestTestNo = os2OosPhs1Ivst.rtestTestNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rtestTestRst = os2OosPhs1Ivst.rtestTestRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rtestJdg = os2OosPhs1Ivst.rtestJdg;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dataCopyAttYn = os2OosPhs1Ivst.dataCopyAttYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> attEtcYn = os2OosPhs1Ivst.attEtcYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> attEtc = os2OosPhs1Ivst.attEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Os2OosPhs1Ivst extends AliasableSqlTable<Os2OosPhs1Ivst> {
        public final SqlColumn<Short> oosPhs1IvstIdx = column("OOS_PHS1_IVST_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> oosRcpIdx = column("OOS_RCP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> obvYn = column("OBV_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> phs1IvstAprIdx = column("PHS1_IVST_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> ivgStr = column("IVG_STR", JDBCType.VARCHAR);

        public final SqlColumn<String> ivgEnd = column("IVG_END", JDBCType.VARCHAR);

        public final SqlColumn<String> rtestYn = column("RTEST_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rtestTestNo = column("RTEST_TEST_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> rtestTestRst = column("RTEST_TEST_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> rtestJdg = column("RTEST_JDG", JDBCType.VARCHAR);

        public final SqlColumn<String> dataCopyAttYn = column("DATA_COPY_ATT_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> attEtcYn = column("ATT_ETC_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> attEtc = column("ATT_ETC", JDBCType.VARCHAR);

        public Os2OosPhs1Ivst() {
            super("PHM7_1_QMS_USER.OS2_OOS_PHS1_IVST", Os2OosPhs1Ivst::new);
        }
    }
}