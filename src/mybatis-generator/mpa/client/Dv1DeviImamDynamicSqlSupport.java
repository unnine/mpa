package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Dv1DeviImamDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Dv1DeviImam dv1DeviImam = new Dv1DeviImam();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> deviImamIdx = dv1DeviImam.deviImamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> deviOcrpIdx = dv1DeviImam.deviOcrpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = dv1DeviImam.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> deviImamAprIdx = dv1DeviImam.deviImamAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> prgStrDt = dv1DeviImam.prgStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> prgEndDt = dv1DeviImam.prgEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> deviCcls = dv1DeviImam.deviCcls;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = dv1DeviImam.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = dv1DeviImam.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = dv1DeviImam.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = dv1DeviImam.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = dv1DeviImam.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = dv1DeviImam.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = dv1DeviImam.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Dv1DeviImam extends AliasableSqlTable<Dv1DeviImam> {
        public final SqlColumn<Short> deviImamIdx = column("DEVI_IMAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> deviOcrpIdx = column("DEVI_OCRP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> deviImamAprIdx = column("DEVI_IMAM_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> prgStrDt = column("PRG_STR_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> prgEndDt = column("PRG_END_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> deviCcls = column("DEVI_CCLS", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Dv1DeviImam() {
            super("PHM7_1_QMS_USER.DV1_DEVI_IMAM", Dv1DeviImam::new);
        }
    }
}