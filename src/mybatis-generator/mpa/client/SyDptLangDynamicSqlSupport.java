package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyDptLangDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyDptLang syDptLang = new SyDptLang();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dptCd = syDptLang.dptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> langCd = syDptLang.langCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> langNm = syDptLang.langNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syDptLang.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syDptLang.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syDptLang.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyDptLang extends AliasableSqlTable<SyDptLang> {
        public final SqlColumn<String> dptCd = column("DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> langCd = column("LANG_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> langNm = column("LANG_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public SyDptLang() {
            super("PHM7_1_QMS_USER.SY_DPT_LANG", SyDptLang::new);
        }
    }
}