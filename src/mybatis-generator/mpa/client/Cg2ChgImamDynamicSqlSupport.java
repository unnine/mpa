package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cg2ChgImamDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cg2ChgImam cg2ChgImam = new Cg2ChgImam();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgImamIdx = cg2ChgImam.chgImamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgPrpsRcpIdx = cg2ChgImam.chgPrpsRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> exac = cg2ChgImam.exac;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgCclsPrgYn = cg2ChgImam.chgCclsPrgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgCclsStopYn = cg2ChgImam.chgCclsStopYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgRnk = cg2ChgImam.chgRnk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = cg2ChgImam.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = cg2ChgImam.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = cg2ChgImam.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cg2ChgImam.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cg2ChgImam.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cg2ChgImam.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = cg2ChgImam.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgImamAsmtAprIdx = cg2ChgImam.chgImamAsmtAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cg2ChgImam extends AliasableSqlTable<Cg2ChgImam> {
        public final SqlColumn<Short> chgImamIdx = column("CHG_IMAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> chgPrpsRcpIdx = column("CHG_PRPS_RCP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> exac = column("EXAC", JDBCType.VARCHAR);

        public final SqlColumn<String> chgCclsPrgYn = column("CHG_CCLS_PRG_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> chgCclsStopYn = column("CHG_CCLS_STOP_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> chgRnk = column("CHG_RNK", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> chgImamAsmtAprIdx = column("CHG_IMAM_ASMT_APR_IDX", JDBCType.NUMERIC);

        public Cg2ChgImam() {
            super("PHM7_1_QMS_USER.CG2_CHG_IMAM", Cg2ChgImam::new);
        }
    }
}