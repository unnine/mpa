package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ri1RiskPlnDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ri1RiskPln ri1RiskPln = new Ri1RiskPln();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> riskPlnIdx = ri1RiskPln.riskPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> riskAnsIdx = ri1RiskPln.riskAnsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = ri1RiskPln.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> riskPlnAprIdx = ri1RiskPln.riskPlnAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ocrPosb = ri1RiskPln.ocrPosb;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ocrPosbDesc = ri1RiskPln.ocrPosbDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sev = ri1RiskPln.sev;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sevDesc = ri1RiskPln.sevDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> accpStd = ri1RiskPln.accpStd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = ri1RiskPln.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = ri1RiskPln.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = ri1RiskPln.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ri1RiskPln.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ri1RiskPln.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ri1RiskPln.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> enfoPln = ri1RiskPln.enfoPln;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = ri1RiskPln.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = ri1RiskPln.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cmplDt = ri1RiskPln.cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ri1RiskPln extends AliasableSqlTable<Ri1RiskPln> {
        public final SqlColumn<Short> riskPlnIdx = column("RISK_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> riskAnsIdx = column("RISK_ANS_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> riskPlnAprIdx = column("RISK_PLN_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> ocrPosb = column("OCR_POSB", JDBCType.VARCHAR);

        public final SqlColumn<String> ocrPosbDesc = column("OCR_POSB_DESC", JDBCType.VARCHAR);

        public final SqlColumn<String> sev = column("SEV", JDBCType.VARCHAR);

        public final SqlColumn<String> sevDesc = column("SEV_DESC", JDBCType.VARCHAR);

        public final SqlColumn<String> accpStd = column("ACCP_STD", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> enfoPln = column("ENFO_PLN", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> cmplDt = column("CMPL_DT", JDBCType.VARCHAR);

        public Ri1RiskPln() {
            super("PHM7_1_QMS_USER.RI1_RISK_PLN", Ri1RiskPln::new);
        }
    }
}