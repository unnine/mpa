package mpa.client;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyEaprInfoDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyEaprInfo syEaprInfo = new SyEaprInfo();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> eaprIdx = syEaprInfo.eaprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> eaprReqDegr = syEaprInfo.eaprReqDegr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> seq = syEaprInfo.seq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprDiv = syEaprInfo.eaprDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprUid = syEaprInfo.eaprUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dlgEaprUid = syEaprInfo.dlgEaprUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ncsYn = syEaprInfo.ncsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> aprDegr = syEaprInfo.aprDegr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> eaprDs = syEaprInfo.eaprDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprIp = syEaprInfo.eaprIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprRmk = syEaprInfo.eaprRmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprYn = syEaprInfo.eaprYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprCttCd = syEaprInfo.eaprCttCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyEaprInfo extends AliasableSqlTable<SyEaprInfo> {
        public final SqlColumn<Short> eaprIdx = column("EAPR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<BigDecimal> eaprReqDegr = column("EAPR_REQ_DEGR", JDBCType.NUMERIC);

        public final SqlColumn<Short> seq = column("SEQ", JDBCType.NUMERIC);

        public final SqlColumn<String> eaprDiv = column("EAPR_DIV", JDBCType.VARCHAR);

        public final SqlColumn<String> eaprUid = column("EAPR_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> dlgEaprUid = column("DLG_EAPR_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> ncsYn = column("NCS_YN", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> aprDegr = column("APR_DEGR", JDBCType.NUMERIC);

        public final SqlColumn<LocalDateTime> eaprDs = column("EAPR_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> eaprIp = column("EAPR_IP", JDBCType.VARCHAR);

        public final SqlColumn<String> eaprRmk = column("EAPR_RMK", JDBCType.VARCHAR);

        public final SqlColumn<String> eaprYn = column("EAPR_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> eaprCttCd = column("EAPR_CTT_CD", JDBCType.VARCHAR);

        public SyEaprInfo() {
            super("PHM7_1_QMS_USER.SY_EAPR_INFO", SyEaprInfo::new);
        }
    }
}