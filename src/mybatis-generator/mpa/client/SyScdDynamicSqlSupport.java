package mpa.client;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyScdDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyScd syScd = new SyScd();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> scd = syScd.scd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> scdHir = syScd.scdHir;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> loclNm = syScd.loclNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> abbr = syScd.abbr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd1 = syScd.extCd1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd2 = syScd.extCd2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd3 = syScd.extCd3;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> ord = syScd.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = syScd.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> jnm = syScd.jnm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = syScd.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = syScd.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = syScd.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syScd.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syScd.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syScd.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyScd extends AliasableSqlTable<SyScd> {
        public final SqlColumn<String> scd = column("SCD", JDBCType.VARCHAR);

        public final SqlColumn<String> scdHir = column("SCD_HIR", JDBCType.VARCHAR);

        public final SqlColumn<String> loclNm = column("LOCL_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> abbr = column("ABBR", JDBCType.VARCHAR);

        public final SqlColumn<String> extCd1 = column("EXT_CD1", JDBCType.VARCHAR);

        public final SqlColumn<String> extCd2 = column("EXT_CD2", JDBCType.VARCHAR);

        public final SqlColumn<String> extCd3 = column("EXT_CD3", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> jnm = column("JNM", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public SyScd() {
            super("PHM7_1_QMS_USER.SY_SCD", SyScd::new);
        }
    }
}