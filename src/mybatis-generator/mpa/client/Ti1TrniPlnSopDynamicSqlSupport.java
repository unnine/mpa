package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ti1TrniPlnSopDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ti1TrniPlnSop ti1TrniPlnSop = new Ti1TrniPlnSop();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniPlnSopIdx = ti1TrniPlnSop.trniPlnSopIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniPlnIdx = ti1TrniPlnSop.trniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = ti1TrniPlnSop.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = ti1TrniPlnSop.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sopDocNo = ti1TrniPlnSop.sopDocNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sopDocTit = ti1TrniPlnSop.sopDocTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ti1TrniPlnSop.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ti1TrniPlnSop.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ti1TrniPlnSop.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ti1TrniPlnSop extends AliasableSqlTable<Ti1TrniPlnSop> {
        public final SqlColumn<Short> trniPlnSopIdx = column("TRNI_PLN_SOP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> trniPlnIdx = column("TRNI_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> sopDocNo = column("SOP_DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> sopDocTit = column("SOP_DOC_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Ti1TrniPlnSop() {
            super("PHM7_1_QMS_USER.TI1_TRNI_PLN_SOP", Ti1TrniPlnSop::new);
        }
    }
}