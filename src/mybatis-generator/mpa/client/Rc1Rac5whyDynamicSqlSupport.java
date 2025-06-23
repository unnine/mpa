package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Rc1Rac5whyDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Rc1Rac5why rc1Rac5why = new Rc1Rac5why();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> rac5whyIdx = rc1Rac5why.rac5whyIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> racWrtIdx = rc1Rac5why.racWrtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> why = rc1Rac5why.why;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = rc1Rac5why.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = rc1Rac5why.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = rc1Rac5why.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = rc1Rac5why.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = rc1Rac5why.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Rc1Rac5why extends AliasableSqlTable<Rc1Rac5why> {
        public final SqlColumn<Short> rac5whyIdx = column("RAC_5WHY_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> racWrtIdx = column("RAC_WRT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> why = column("WHY", JDBCType.VARCHAR);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Rc1Rac5why() {
            super("PHM7_1_QMS_USER.RC1_RAC_5WHY", Rc1Rac5why::new);
        }
    }
}