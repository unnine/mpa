package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Os2OosPhs2IvstIvgaDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Os2OosPhs2IvstIvga os2OosPhs2IvstIvga = new Os2OosPhs2IvstIvga();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosPhs2IvstIvgaIdx = os2OosPhs2IvstIvga.oosPhs2IvstIvgaIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosPhs2IvstIdx = os2OosPhs2IvstIvga.oosPhs2IvstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ivgaIdx = os2OosPhs2IvstIvga.ivgaIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ivgaAns = os2OosPhs2IvstIvga.ivgaAns;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = os2OosPhs2IvstIvga.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = os2OosPhs2IvstIvga.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = os2OosPhs2IvstIvga.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Os2OosPhs2IvstIvga extends AliasableSqlTable<Os2OosPhs2IvstIvga> {
        public final SqlColumn<Short> oosPhs2IvstIvgaIdx = column("OOS_PHS2_IVST_IVGA_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> oosPhs2IvstIdx = column("OOS_PHS2_IVST_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> ivgaIdx = column("IVGA_IDX", JDBCType.VARCHAR);

        public final SqlColumn<String> ivgaAns = column("IVGA_ANS", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Os2OosPhs2IvstIvga() {
            super("PHM7_1_QMS_USER.OS2_OOS_PHS2_IVST_IVGA", Os2OosPhs2IvstIvga::new);
        }
    }
}