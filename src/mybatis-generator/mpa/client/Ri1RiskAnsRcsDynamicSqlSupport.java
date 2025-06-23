package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ri1RiskAnsRcsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ri1RiskAnsRcs ri1RiskAnsRcs = new Ri1RiskAnsRcs();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> riskAnsRcsIdx = ri1RiskAnsRcs.riskAnsRcsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> riskAnsIdx = ri1RiskAnsRcs.riskAnsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> riskElmDiv = ri1RiskAnsRcs.riskElmDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> riskElmEtc = ri1RiskAnsRcs.riskElmEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ri1RiskAnsRcs.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ri1RiskAnsRcs.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ri1RiskAnsRcs.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = ri1RiskAnsRcs.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = ri1RiskAnsRcs.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ri1RiskAnsRcs extends AliasableSqlTable<Ri1RiskAnsRcs> {
        public final SqlColumn<Short> riskAnsRcsIdx = column("RISK_ANS_RCS_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> riskAnsIdx = column("RISK_ANS_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> riskElmDiv = column("RISK_ELM_DIV", JDBCType.VARCHAR);

        public final SqlColumn<String> riskElmEtc = column("RISK_ELM_ETC", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public Ri1RiskAnsRcs() {
            super("PHM7_1_QMS_USER.RI1_RISK_ANS_RCS", Ri1RiskAnsRcs::new);
        }
    }
}