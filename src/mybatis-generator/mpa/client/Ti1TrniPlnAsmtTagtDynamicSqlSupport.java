package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ti1TrniPlnAsmtTagtDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ti1TrniPlnAsmtTagt ti1TrniPlnAsmtTagt = new Ti1TrniPlnAsmtTagt();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniPlnAsmtTagtIdx = ti1TrniPlnAsmtTagt.trniPlnAsmtTagtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniPlnAsmtIdx = ti1TrniPlnAsmtTagt.trniPlnAsmtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniTagtUid = ti1TrniPlnAsmtTagt.trniTagtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniAsmtRst = ti1TrniPlnAsmtTagt.trniAsmtRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = ti1TrniPlnAsmtTagt.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = ti1TrniPlnAsmtTagt.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ti1TrniPlnAsmtTagt.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ti1TrniPlnAsmtTagt.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ti1TrniPlnAsmtTagt.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ti1TrniPlnAsmtTagt extends AliasableSqlTable<Ti1TrniPlnAsmtTagt> {
        public final SqlColumn<Short> trniPlnAsmtTagtIdx = column("TRNI_PLN_ASMT_TAGT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> trniPlnAsmtIdx = column("TRNI_PLN_ASMT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> trniTagtUid = column("TRNI_TAGT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> trniAsmtRst = column("TRNI_ASMT_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Ti1TrniPlnAsmtTagt() {
            super("PHM7_1_QMS_USER.TI1_TRNI_PLN_ASMT_TAGT", Ti1TrniPlnAsmtTagt::new);
        }
    }
}