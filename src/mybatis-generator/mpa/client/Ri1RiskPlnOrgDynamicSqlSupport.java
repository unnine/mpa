package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ri1RiskPlnOrgDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ri1RiskPlnOrg ri1RiskPlnOrg = new Ri1RiskPlnOrg();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> riskPlnOrgIdx = ri1RiskPlnOrg.riskPlnOrgIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> riskPlnIdx = ri1RiskPlnOrg.riskPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgDptCd = ri1RiskPlnOrg.crgDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgUid = ri1RiskPlnOrg.crgUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> role = ri1RiskPlnOrg.role;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = ri1RiskPlnOrg.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = ri1RiskPlnOrg.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ri1RiskPlnOrg.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ri1RiskPlnOrg.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ri1RiskPlnOrg.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ri1RiskPlnOrg extends AliasableSqlTable<Ri1RiskPlnOrg> {
        public final SqlColumn<Short> riskPlnOrgIdx = column("RISK_PLN_ORG_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> riskPlnIdx = column("RISK_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crgDptCd = column("CRG_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> crgUid = column("CRG_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> role = column("ROLE", JDBCType.VARCHAR);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Ri1RiskPlnOrg() {
            super("PHM7_1_QMS_USER.RI1_RISK_PLN_ORG", Ri1RiskPlnOrg::new);
        }
    }
}