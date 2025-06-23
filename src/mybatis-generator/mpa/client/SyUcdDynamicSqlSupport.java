package mpa.client;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyUcdDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyUcd syUcd = new SyUcd();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ucd = syUcd.ucd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = syUcd.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ucdHir = syUcd.ucdHir;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> loclNm = syUcd.loclNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> abbr = syUcd.abbr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd1 = syUcd.extCd1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd2 = syUcd.extCd2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd3 = syUcd.extCd3;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> ord = syUcd.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = syUcd.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> jnm = syUcd.jnm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = syUcd.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = syUcd.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = syUcd.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syUcd.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syUcd.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syUcd.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyUcd extends AliasableSqlTable<SyUcd> {
        public final SqlColumn<String> ucd = column("UCD", JDBCType.VARCHAR);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> ucdHir = column("UCD_HIR", JDBCType.VARCHAR);

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

        public SyUcd() {
            super("PHM7_1_QMS_USER.SY_UCD", SyUcd::new);
        }
    }
}