package mpa.client;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyEaprLineInfoDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyEaprLineInfo syEaprLineInfo = new SyEaprLineInfo();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> eaprLineInfoIdx = syEaprLineInfo.eaprLineInfoIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> eaprLineIdx = syEaprLineInfo.eaprLineIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprReqDiv = syEaprLineInfo.eaprReqDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> aprDegr = syEaprLineInfo.aprDegr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ncsYn = syEaprLineInfo.ncsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = syEaprLineInfo.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = syEaprLineInfo.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = syEaprLineInfo.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syEaprLineInfo.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syEaprLineInfo.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syEaprLineInfo.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprUid = syEaprLineInfo.eaprUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyEaprLineInfo extends AliasableSqlTable<SyEaprLineInfo> {
        public final SqlColumn<Short> eaprLineInfoIdx = column("EAPR_LINE_INFO_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> eaprLineIdx = column("EAPR_LINE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> eaprReqDiv = column("EAPR_REQ_DIV", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> aprDegr = column("APR_DEGR", JDBCType.NUMERIC);

        public final SqlColumn<String> ncsYn = column("NCS_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> eaprUid = column("EAPR_UID", JDBCType.VARCHAR);

        public SyEaprLineInfo() {
            super("PHM7_1_QMS_USER.SY_EAPR_LINE_INFO", SyEaprLineInfo::new);
        }
    }
}