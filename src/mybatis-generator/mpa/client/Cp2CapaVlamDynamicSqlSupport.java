package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cp2CapaVlamDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cp2CapaVlam cp2CapaVlam = new Cp2CapaVlam();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaVlamIdx = cp2CapaVlam.capaVlamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaPlnIdx = cp2CapaVlam.capaPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamStrDt = cp2CapaVlam.vlamStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamEndDt = cp2CapaVlam.vlamEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamTagt = cp2CapaVlam.vlamTagt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamOvw = cp2CapaVlam.vlamOvw;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamCtt = cp2CapaVlam.vlamCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamRst = cp2CapaVlam.vlamRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> capaVlamSytFdbk = cp2CapaVlam.capaVlamSytFdbk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = cp2CapaVlam.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaVlamAprIdx = cp2CapaVlam.capaVlamAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = cp2CapaVlam.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = cp2CapaVlam.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = cp2CapaVlam.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cp2CapaVlam.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cp2CapaVlam.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cp2CapaVlam.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = cp2CapaVlam.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cp2CapaVlam extends AliasableSqlTable<Cp2CapaVlam> {
        public final SqlColumn<Short> capaVlamIdx = column("CAPA_VLAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> capaPlnIdx = column("CAPA_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> vlamStrDt = column("VLAM_STR_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> vlamEndDt = column("VLAM_END_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> vlamTagt = column("VLAM_TAGT", JDBCType.VARCHAR);

        public final SqlColumn<String> vlamOvw = column("VLAM_OVW", JDBCType.VARCHAR);

        public final SqlColumn<String> vlamCtt = column("VLAM_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> vlamRst = column("VLAM_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> capaVlamSytFdbk = column("CAPA_VLAM_SYT_FDBK", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> capaVlamAprIdx = column("CAPA_VLAM_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public Cp2CapaVlam() {
            super("PHM7_1_QMS_USER.CP2_CAPA_VLAM", Cp2CapaVlam::new);
        }
    }
}