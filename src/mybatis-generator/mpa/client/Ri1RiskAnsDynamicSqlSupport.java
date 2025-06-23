package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ri1RiskAnsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ri1RiskAns ri1RiskAns = new Ri1RiskAns();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> riskAnsIdx = ri1RiskAns.riskAnsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = ri1RiskAns.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = ri1RiskAns.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = ri1RiskAns.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = ri1RiskAns.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = ri1RiskAns.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> riskAnsAprIdx = ri1RiskAns.riskAnsAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> riskProc = ri1RiskAns.riskProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> riskElm = ri1RiskAns.riskElm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> riskRcs = ri1RiskAns.riskRcs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pitmDiv = ri1RiskAns.pitmDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> riskCgntYn = ri1RiskAns.riskCgntYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = ri1RiskAns.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = ri1RiskAns.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = ri1RiskAns.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ri1RiskAns.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ri1RiskAns.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ri1RiskAns.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> modlTracIdx = ri1RiskAns.modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ri1RiskAns extends AliasableSqlTable<Ri1RiskAns> {
        public final SqlColumn<Short> riskAnsIdx = column("RISK_ANS_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<Short> riskAnsAprIdx = column("RISK_ANS_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> riskProc = column("RISK_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> riskElm = column("RISK_ELM", JDBCType.VARCHAR);

        public final SqlColumn<String> riskRcs = column("RISK_RCS", JDBCType.VARCHAR);

        public final SqlColumn<String> pitmDiv = column("PITM_DIV", JDBCType.VARCHAR);

        public final SqlColumn<String> riskCgntYn = column("RISK_CGNT_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> modlTracIdx = column("MODL_TRAC_IDX", JDBCType.NUMERIC);

        public Ri1RiskAns() {
            super("PHM7_1_QMS_USER.RI1_RISK_ANS", Ri1RiskAns::new);
        }
    }
}