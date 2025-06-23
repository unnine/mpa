package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyLangComDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyLangCom syLangCom = new SyLangCom();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> msgCd = syLangCom.msgCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> langCd = syLangCom.langCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysComDiv = syLangCom.sysComDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> langNm = syLangCom.langNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syLangCom.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syLangCom.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syLangCom.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyLangCom extends AliasableSqlTable<SyLangCom> {
        public final SqlColumn<String> msgCd = column("MSG_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> langCd = column("LANG_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> sysComDiv = column("SYS_COM_DIV", JDBCType.VARCHAR);

        public final SqlColumn<String> langNm = column("LANG_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public SyLangCom() {
            super("PHM7_1_QMS_USER.SY_LANG_COM", SyLangCom::new);
        }
    }
}