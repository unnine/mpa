package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cg2ChgVlamDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cg2ChgVlam cg2ChgVlam = new Cg2ChgVlam();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgVlamIdx = cg2ChgVlam.chgVlamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgPrpsRcpIdx = cg2ChgVlam.chgPrpsRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamStrDt = cg2ChgVlam.vlamStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamEndDt = cg2ChgVlam.vlamEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamTagt = cg2ChgVlam.vlamTagt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamOvw = cg2ChgVlam.vlamOvw;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamRst = cg2ChgVlam.vlamRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamCtt = cg2ChgVlam.vlamCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgVlamSytFdbk = cg2ChgVlam.chgVlamSytFdbk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = cg2ChgVlam.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = cg2ChgVlam.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = cg2ChgVlam.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = cg2ChgVlam.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cg2ChgVlam.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cg2ChgVlam.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cg2ChgVlam.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = cg2ChgVlam.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgVlamAprIdx = cg2ChgVlam.chgVlamAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cg2ChgVlam extends AliasableSqlTable<Cg2ChgVlam> {
        public final SqlColumn<Short> chgVlamIdx = column("CHG_VLAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> chgPrpsRcpIdx = column("CHG_PRPS_RCP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> vlamStrDt = column("VLAM_STR_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> vlamEndDt = column("VLAM_END_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> vlamTagt = column("VLAM_TAGT", JDBCType.VARCHAR);

        public final SqlColumn<String> vlamOvw = column("VLAM_OVW", JDBCType.VARCHAR);

        public final SqlColumn<String> vlamRst = column("VLAM_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> vlamCtt = column("VLAM_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> chgVlamSytFdbk = column("CHG_VLAM_SYT_FDBK", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> chgVlamAprIdx = column("CHG_VLAM_APR_IDX", JDBCType.NUMERIC);

        public Cg2ChgVlam() {
            super("PHM7_1_QMS_USER.CG2_CHG_VLAM", Cg2ChgVlam::new);
        }
    }
}