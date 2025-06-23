package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cg2ChgEnfoAtcDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cg2ChgEnfoAtc cg2ChgEnfoAtc = new Cg2ChgEnfoAtc();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgEnfoAtcIdx = cg2ChgEnfoAtc.chgEnfoAtcIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgEnfoIdx = cg2ChgEnfoAtc.chgEnfoIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgEnfoAtc = cg2ChgEnfoAtc.chgEnfoAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgEnfoAtcCtt = cg2ChgEnfoAtc.chgEnfoAtcCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cg2ChgEnfoAtc.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cg2ChgEnfoAtc.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cg2ChgEnfoAtc.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cg2ChgEnfoAtc extends AliasableSqlTable<Cg2ChgEnfoAtc> {
        public final SqlColumn<Short> chgEnfoAtcIdx = column("CHG_ENFO_ATC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> chgEnfoIdx = column("CHG_ENFO_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> chgEnfoAtc = column("CHG_ENFO_ATC", JDBCType.VARCHAR);

        public final SqlColumn<String> chgEnfoAtcCtt = column("CHG_ENFO_ATC_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Cg2ChgEnfoAtc() {
            super("PHM7_1_QMS_USER.CG2_CHG_ENFO_ATC", Cg2ChgEnfoAtc::new);
        }
    }
}