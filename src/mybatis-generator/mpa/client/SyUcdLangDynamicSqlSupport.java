package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyUcdLangDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyUcdLang syUcdLang = new SyUcdLang();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ucd = syUcdLang.ucd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> langCd = syUcdLang.langCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> langNm = syUcdLang.langNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syUcdLang.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syUcdLang.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syUcdLang.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyUcdLang extends AliasableSqlTable<SyUcdLang> {
        public final SqlColumn<String> ucd = column("UCD", JDBCType.VARCHAR);

        public final SqlColumn<String> langCd = column("LANG_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> langNm = column("LANG_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public SyUcdLang() {
            super("PHM7_1_QMS_USER.SY_UCD_LANG", SyUcdLang::new);
        }
    }
}