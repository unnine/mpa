package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ti1TrniRstDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ti1TrniRst ti1TrniRst = new Ti1TrniRst();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniRstIdx = ti1TrniRst.trniRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniPlnIdx = ti1TrniRst.trniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = ti1TrniRst.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniRst = ti1TrniRst.trniRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniRstRmk = ti1TrniRst.trniRstRmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> asmtRstAprIdx = ti1TrniRst.asmtRstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ti1TrniRst.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ti1TrniRst.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ti1TrniRst.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ti1TrniRst extends AliasableSqlTable<Ti1TrniRst> {
        public final SqlColumn<Short> trniRstIdx = column("TRNI_RST_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> trniPlnIdx = column("TRNI_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> trniRst = column("TRNI_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> trniRstRmk = column("TRNI_RST_RMK", JDBCType.VARCHAR);

        public final SqlColumn<Short> asmtRstAprIdx = column("ASMT_RST_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Ti1TrniRst() {
            super("PHM7_1_QMS_USER.TI1_TRNI_RST", Ti1TrniRst::new);
        }
    }
}