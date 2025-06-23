package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Rc1Rac4m1eDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Rc1Rac4m1e rc1Rac4m1e = new Rc1Rac4m1e();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> rac4m1eIdx = rc1Rac4m1e.rac4m1eIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> racWrtIdx = rc1Rac4m1e.racWrtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> man = rc1Rac4m1e.man;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> mch = rc1Rac4m1e.mch;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> mtr = rc1Rac4m1e.mtr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> mtd = rc1Rac4m1e.mtd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> evm = rc1Rac4m1e.evm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> etc = rc1Rac4m1e.etc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = rc1Rac4m1e.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = rc1Rac4m1e.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = rc1Rac4m1e.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Rc1Rac4m1e extends AliasableSqlTable<Rc1Rac4m1e> {
        public final SqlColumn<Short> rac4m1eIdx = column("RAC_4M1E_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> racWrtIdx = column("RAC_WRT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> man = column("MAN", JDBCType.VARCHAR);

        public final SqlColumn<String> mch = column("MCH", JDBCType.VARCHAR);

        public final SqlColumn<String> mtr = column("MTR", JDBCType.VARCHAR);

        public final SqlColumn<String> mtd = column("MTD", JDBCType.VARCHAR);

        public final SqlColumn<String> evm = column("EVM", JDBCType.VARCHAR);

        public final SqlColumn<String> etc = column("ETC", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Rc1Rac4m1e() {
            super("PHM7_1_QMS_USER.RC1_RAC_4M1E", Rc1Rac4m1e::new);
        }
    }
}