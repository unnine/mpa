package mpa.client;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyRptVerDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyRptVer syRptVer = new SyRptVer();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> rptVerIdx = syRptVer.rptVerIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> rptIdx = syRptVer.rptIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rptRdPath = syRptVer.rptRdPath;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rptNm = syRptVer.rptNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = syRptVer.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rptVer = syRptVer.rptVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsDt = syRptVer.rvsDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = syRptVer.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> ord = syRptVer.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useVerYn = syRptVer.useVerYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> strDt = syRptVer.strDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> endDt = syRptVer.endDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = syRptVer.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syRptVer.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syRptVer.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syRptVer.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyRptVer extends AliasableSqlTable<SyRptVer> {
        public final SqlColumn<Short> rptVerIdx = column("RPT_VER_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> rptIdx = column("RPT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> rptRdPath = column("RPT_RD_PATH", JDBCType.VARCHAR);

        public final SqlColumn<String> rptNm = column("RPT_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> rptVer = column("RPT_VER", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsDt = column("RVS_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> useVerYn = column("USE_VER_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> strDt = column("STR_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> endDt = column("END_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public SyRptVer() {
            super("PHM7_1_QMS_USER.SY_RPT_VER", SyRptVer::new);
        }
    }
}