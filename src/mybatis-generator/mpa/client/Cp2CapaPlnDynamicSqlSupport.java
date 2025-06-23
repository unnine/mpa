package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cp2CapaPlnDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cp2CapaPln cp2CapaPln = new Cp2CapaPln();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaPlnIdx = cp2CapaPln.capaPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaRcpCrgIdx = cp2CapaPln.capaRcpCrgIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plnVer = cp2CapaPln.plnVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = cp2CapaPln.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = cp2CapaPln.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plnMngNo = cp2CapaPln.plnMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = cp2CapaPln.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgDptCd = cp2CapaPln.crgDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgUid = cp2CapaPln.crgUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cmplDt = cp2CapaPln.cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> capaPln = cp2CapaPln.capaPln;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = cp2CapaPln.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> plnAprIdx = cp2CapaPln.plnAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> capaPlnProc = cp2CapaPln.capaPlnProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = cp2CapaPln.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = cp2CapaPln.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = cp2CapaPln.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cp2CapaPln.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cp2CapaPln.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cp2CapaPln.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> changeTracIdx = cp2CapaPln.changeTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> changeMngNo = cp2CapaPln.changeMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cp2CapaPln extends AliasableSqlTable<Cp2CapaPln> {
        public final SqlColumn<Short> capaPlnIdx = column("CAPA_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> capaRcpCrgIdx = column("CAPA_RCP_CRG_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plnVer = column("PLN_VER", JDBCType.VARCHAR);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plnMngNo = column("PLN_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> crgDptCd = column("CRG_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> crgUid = column("CRG_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> cmplDt = column("CMPL_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> capaPln = column("CAPA_PLN", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> plnAprIdx = column("PLN_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> capaPlnProc = column("CAPA_PLN_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> changeTracIdx = column("CHANGE_TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> changeMngNo = column("CHANGE_MNG_NO", JDBCType.VARCHAR);

        public Cp2CapaPln() {
            super("PHM7_1_QMS_USER.CP2_CAPA_PLN", Cp2CapaPln::new);
        }
    }
}