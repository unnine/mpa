package mpa.client;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyEaprReqDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyEaprReq syEaprReq = new SyEaprReq();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> eaprIdx = syEaprReq.eaprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> eaprReqDegr = syEaprReq.eaprReqDegr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprReqUid = syEaprReq.eaprReqUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> eaprReqDs = syEaprReq.eaprReqDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprReqIp = syEaprReq.eaprReqIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprReqCtt = syEaprReq.eaprReqCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eaprPrgs = syEaprReq.eaprPrgs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyEaprReq extends AliasableSqlTable<SyEaprReq> {
        public final SqlColumn<Short> eaprIdx = column("EAPR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<BigDecimal> eaprReqDegr = column("EAPR_REQ_DEGR", JDBCType.NUMERIC);

        public final SqlColumn<String> eaprReqUid = column("EAPR_REQ_UID", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> eaprReqDs = column("EAPR_REQ_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> eaprReqIp = column("EAPR_REQ_IP", JDBCType.VARCHAR);

        public final SqlColumn<String> eaprReqCtt = column("EAPR_REQ_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> eaprPrgs = column("EAPR_PRGS", JDBCType.VARCHAR);

        public SyEaprReq() {
            super("PHM7_1_QMS_USER.SY_EAPR_REQ", SyEaprReq::new);
        }
    }
}