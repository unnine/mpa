package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cp2CapaReqDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cp2CapaReq cp2CapaReq = new Cp2CapaReq();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaReqIdx = cp2CapaReq.capaReqIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivEtc = cp2CapaReq.modlDivEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = cp2CapaReq.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivCd = cp2CapaReq.modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> capaTit = cp2CapaReq.capaTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = cp2CapaReq.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = cp2CapaReq.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaReqAprIdx = cp2CapaReq.capaReqAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> capaReqProc = cp2CapaReq.capaReqProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqDptCd = cp2CapaReq.reqDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqUid = cp2CapaReq.reqUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = cp2CapaReq.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = cp2CapaReq.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = cp2CapaReq.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = cp2CapaReq.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = cp2CapaReq.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = cp2CapaReq.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = cp2CapaReq.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cp2CapaReq.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cp2CapaReq.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cp2CapaReq.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> modlTracIdx = cp2CapaReq.modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cp2CapaReq extends AliasableSqlTable<Cp2CapaReq> {
        public final SqlColumn<Short> capaReqIdx = column("CAPA_REQ_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> modlDivEtc = column("MODL_DIV_ETC", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> modlDivCd = column("MODL_DIV_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> capaTit = column("CAPA_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> capaReqAprIdx = column("CAPA_REQ_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> capaReqProc = column("CAPA_REQ_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> reqDptCd = column("REQ_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> reqUid = column("REQ_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> modlTracIdx = column("MODL_TRAC_IDX", JDBCType.NUMERIC);

        public Cp2CapaReq() {
            super("PHM7_1_QMS_USER.CP2_CAPA_REQ", Cp2CapaReq::new);
        }
    }
}