package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyAthLangDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyAthLang syAthLang = new SyAthLang();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> athCd = syAthLang.athCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> langCd = syAthLang.langCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> langNm = syAthLang.langNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syAthLang.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syAthLang.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syAthLang.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyAthLang extends AliasableSqlTable<SyAthLang> {
        public final SqlColumn<String> athCd = column("ATH_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> langCd = column("LANG_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> langNm = column("LANG_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public SyAthLang() {
            super("PHM7_1_QMS_USER.SY_ATH_LANG", SyAthLang::new);
        }
    }
}