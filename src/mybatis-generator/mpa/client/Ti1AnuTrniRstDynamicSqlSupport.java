package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ti1AnuTrniRstDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ti1AnuTrniRst ti1AnuTrniRst = new Ti1AnuTrniRst();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> anuTrniRstIdx = ti1AnuTrniRst.anuTrniRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> anuTrniPlnIdx = ti1AnuTrniRst.anuTrniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> anuTrniRstAprIdx = ti1AnuTrniRst.anuTrniRstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = ti1AnuTrniRst.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ti1AnuTrniRst.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ti1AnuTrniRst.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ti1AnuTrniRst.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ti1AnuTrniRst extends AliasableSqlTable<Ti1AnuTrniRst> {
        public final SqlColumn<Short> anuTrniRstIdx = column("ANU_TRNI_RST_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> anuTrniPlnIdx = column("ANU_TRNI_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> anuTrniRstAprIdx = column("ANU_TRNI_RST_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Ti1AnuTrniRst() {
            super("PHM7_1_QMS_USER.TI1_ANU_TRNI_RST", Ti1AnuTrniRst::new);
        }
    }
}