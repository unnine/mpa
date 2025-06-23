package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cp2CapaReqCrgDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cp2CapaReqCrg cp2CapaReqCrg = new Cp2CapaReqCrg();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaReqCrgIdx = cp2CapaReqCrg.capaReqCrgIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgDptCd = cp2CapaReqCrg.crgDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgUid = cp2CapaReqCrg.crgUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ncsAtc = cp2CapaReqCrg.ncsAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqFdbk = cp2CapaReqCrg.reqFdbk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ctt = cp2CapaReqCrg.ctt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = cp2CapaReqCrg.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = cp2CapaReqCrg.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaReqIdx = cp2CapaReqCrg.capaReqIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cp2CapaReqCrg.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cp2CapaReqCrg.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cp2CapaReqCrg.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cp2CapaReqCrg extends AliasableSqlTable<Cp2CapaReqCrg> {
        public final SqlColumn<Short> capaReqCrgIdx = column("CAPA_REQ_CRG_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crgDptCd = column("CRG_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> crgUid = column("CRG_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> ncsAtc = column("NCS_ATC", JDBCType.VARCHAR);

        public final SqlColumn<String> reqFdbk = column("REQ_FDBK", JDBCType.VARCHAR);

        public final SqlColumn<String> ctt = column("CTT", JDBCType.VARCHAR);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> capaReqIdx = column("CAPA_REQ_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Cp2CapaReqCrg() {
            super("PHM7_1_QMS_USER.CP2_CAPA_REQ_CRG", Cp2CapaReqCrg::new);
        }
    }
}