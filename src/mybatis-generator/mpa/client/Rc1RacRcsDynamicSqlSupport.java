package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Rc1RacRcsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Rc1RacRcs rc1RacRcs = new Rc1RacRcs();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> racRcsIdx = rc1RacRcs.racRcsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> racWrtIdx = rc1RacRcs.racWrtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcsClf = rc1RacRcs.rcsClf;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rcsClfEtc = rc1RacRcs.rcsClfEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = rc1RacRcs.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = rc1RacRcs.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = rc1RacRcs.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = rc1RacRcs.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = rc1RacRcs.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Rc1RacRcs extends AliasableSqlTable<Rc1RacRcs> {
        public final SqlColumn<Short> racRcsIdx = column("RAC_RCS_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> racWrtIdx = column("RAC_WRT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> rcsClf = column("RCS_CLF", JDBCType.VARCHAR);

        public final SqlColumn<String> rcsClfEtc = column("RCS_CLF_ETC", JDBCType.VARCHAR);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Rc1RacRcs() {
            super("PHM7_1_QMS_USER.RC1_RAC_RCS", Rc1RacRcs::new);
        }
    }
}