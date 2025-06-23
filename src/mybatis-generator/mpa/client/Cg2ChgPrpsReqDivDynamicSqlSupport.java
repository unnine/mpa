package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cg2ChgPrpsReqDivDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cg2ChgPrpsReqDiv cg2ChgPrpsReqDiv = new Cg2ChgPrpsReqDiv();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgPrpsReqDivIdx = cg2ChgPrpsReqDiv.chgPrpsReqDivIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgPrpsReqIdx = cg2ChgPrpsReqDiv.chgPrpsReqIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgDiv = cg2ChgPrpsReqDiv.chgDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgDivEtc = cg2ChgPrpsReqDiv.chgDivEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cg2ChgPrpsReqDiv.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cg2ChgPrpsReqDiv.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cg2ChgPrpsReqDiv.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cg2ChgPrpsReqDiv extends AliasableSqlTable<Cg2ChgPrpsReqDiv> {
        public final SqlColumn<Short> chgPrpsReqDivIdx = column("CHG_PRPS_REQ_DIV_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> chgPrpsReqIdx = column("CHG_PRPS_REQ_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> chgDiv = column("CHG_DIV", JDBCType.VARCHAR);

        public final SqlColumn<String> chgDivEtc = column("CHG_DIV_ETC", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Cg2ChgPrpsReqDiv() {
            super("PHM7_1_QMS_USER.CG2_CHG_PRPS_REQ_DIV", Cg2ChgPrpsReqDiv::new);
        }
    }
}