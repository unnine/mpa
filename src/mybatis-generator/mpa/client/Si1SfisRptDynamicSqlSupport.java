package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Si1SfisRptDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Si1SfisRpt si1SfisRpt = new Si1SfisRpt();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> sfisRptIdx = si1SfisRpt.sfisRptIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> sfisIdx = si1SfisRpt.sfisIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sfisRst = si1SfisRpt.sfisRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = si1SfisRpt.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> fileCtt = si1SfisRpt.fileCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> sfisRptAprIdx = si1SfisRpt.sfisRptAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = si1SfisRpt.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = si1SfisRpt.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = si1SfisRpt.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = si1SfisRpt.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = si1SfisRpt.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = si1SfisRpt.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = si1SfisRpt.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Si1SfisRpt extends AliasableSqlTable<Si1SfisRpt> {
        public final SqlColumn<Short> sfisRptIdx = column("SFIS_RPT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> sfisIdx = column("SFIS_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> sfisRst = column("SFIS_RST", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> fileCtt = column("FILE_CTT", JDBCType.VARCHAR);

        public final SqlColumn<Short> sfisRptAprIdx = column("SFIS_RPT_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public Si1SfisRpt() {
            super("PHM7_1_QMS_USER.SI1_SFIS_RPT", Si1SfisRpt::new);
        }
    }
}