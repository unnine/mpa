package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cg2ChgCplAtcDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cg2ChgCplAtc cg2ChgCplAtc = new Cg2ChgCplAtc();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgCplAtcIdx = cg2ChgCplAtc.chgCplAtcIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgCplIdx = cg2ChgCplAtc.chgCplIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgCplAtc = cg2ChgCplAtc.chgCplAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgCplAtcCtt = cg2ChgCplAtc.chgCplAtcCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cg2ChgCplAtc.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cg2ChgCplAtc.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cg2ChgCplAtc.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cg2ChgCplAtc extends AliasableSqlTable<Cg2ChgCplAtc> {
        public final SqlColumn<Short> chgCplAtcIdx = column("CHG_CPL_ATC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> chgCplIdx = column("CHG_CPL_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> chgCplAtc = column("CHG_CPL_ATC", JDBCType.VARCHAR);

        public final SqlColumn<String> chgCplAtcCtt = column("CHG_CPL_ATC_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Cg2ChgCplAtc() {
            super("PHM7_1_QMS_USER.CG2_CHG_CPL_ATC", Cg2ChgCplAtc::new);
        }
    }
}