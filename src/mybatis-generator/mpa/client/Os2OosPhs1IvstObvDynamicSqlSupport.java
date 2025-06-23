package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Os2OosPhs1IvstObvDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Os2OosPhs1IvstObv os2OosPhs1IvstObv = new Os2OosPhs1IvstObv();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosPhs1IvstObvIdx = os2OosPhs1IvstObv.oosPhs1IvstObvIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosPhs1IvstIdx = os2OosPhs1IvstObv.oosPhs1IvstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> obvEtc = os2OosPhs1IvstObv.obvEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> obvCd = os2OosPhs1IvstObv.obvCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = os2OosPhs1IvstObv.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = os2OosPhs1IvstObv.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = os2OosPhs1IvstObv.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> obvSltYn = os2OosPhs1IvstObv.obvSltYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Os2OosPhs1IvstObv extends AliasableSqlTable<Os2OosPhs1IvstObv> {
        public final SqlColumn<Short> oosPhs1IvstObvIdx = column("OOS_PHS1_IVST_OBV_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> oosPhs1IvstIdx = column("OOS_PHS1_IVST_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> obvEtc = column("OBV_ETC", JDBCType.VARCHAR);

        public final SqlColumn<String> obvCd = column("OBV_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> obvSltYn = column("OBV_SLT_YN", JDBCType.VARCHAR);

        public Os2OosPhs1IvstObv() {
            super("PHM7_1_QMS_USER.OS2_OOS_PHS1_IVST_OBV", Os2OosPhs1IvstObv::new);
        }
    }
}