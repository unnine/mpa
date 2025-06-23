package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cp2CapaRcpCrgDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cp2CapaRcpCrg cp2CapaRcpCrg = new Cp2CapaRcpCrg();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaRcpCrgIdx = cp2CapaRcpCrg.capaRcpCrgIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaRcpIdx = cp2CapaRcpCrg.capaRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgDptCd = cp2CapaRcpCrg.crgDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgUid = cp2CapaRcpCrg.crgUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cmplDt = cp2CapaRcpCrg.cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ncsAtc = cp2CapaRcpCrg.ncsAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqFdbk = cp2CapaRcpCrg.reqFdbk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ctt = cp2CapaRcpCrg.ctt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = cp2CapaRcpCrg.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = cp2CapaRcpCrg.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cp2CapaRcpCrg.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cp2CapaRcpCrg.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cp2CapaRcpCrg.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cp2CapaRcpCrg extends AliasableSqlTable<Cp2CapaRcpCrg> {
        public final SqlColumn<Short> capaRcpCrgIdx = column("CAPA_RCP_CRG_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> capaRcpIdx = column("CAPA_RCP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crgDptCd = column("CRG_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> crgUid = column("CRG_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> cmplDt = column("CMPL_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> ncsAtc = column("NCS_ATC", JDBCType.VARCHAR);

        public final SqlColumn<String> reqFdbk = column("REQ_FDBK", JDBCType.VARCHAR);

        public final SqlColumn<String> ctt = column("CTT", JDBCType.VARCHAR);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Cp2CapaRcpCrg() {
            super("PHM7_1_QMS_USER.CP2_CAPA_RCP_CRG", Cp2CapaRcpCrg::new);
        }
    }
}