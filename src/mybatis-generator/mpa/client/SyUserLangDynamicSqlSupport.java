package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyUserLangDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyUserLang syUserLang = new SyUserLang();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userUid = syUserLang.userUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> langCd = syUserLang.langCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> langNm = syUserLang.langNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syUserLang.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syUserLang.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syUserLang.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyUserLang extends AliasableSqlTable<SyUserLang> {
        public final SqlColumn<String> userUid = column("USER_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> langCd = column("LANG_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> langNm = column("LANG_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public SyUserLang() {
            super("PHM7_1_QMS_USER.SY_USER_LANG", SyUserLang::new);
        }
    }
}