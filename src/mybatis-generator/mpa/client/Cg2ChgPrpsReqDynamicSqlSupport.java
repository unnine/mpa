package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cg2ChgPrpsReqDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cg2ChgPrpsReq cg2ChgPrpsReq = new Cg2ChgPrpsReq();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgPrpsReqIdx = cg2ChgPrpsReq.chgPrpsReqIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivEtc = cg2ChgPrpsReq.modlDivEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = cg2ChgPrpsReq.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqDptCd = cg2ChgPrpsReq.reqDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reqUid = cg2ChgPrpsReq.reqUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = cg2ChgPrpsReq.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = cg2ChgPrpsReq.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = cg2ChgPrpsReq.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgTit = cg2ChgPrpsReq.chgTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> prpsDptCd = cg2ChgPrpsReq.prpsDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgPps = cg2ChgPrpsReq.chgPps;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgRea = cg2ChgPrpsReq.chgRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgHopeDt = cg2ChgPrpsReq.chgHopeDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> aptmPrmtYn = cg2ChgPrpsReq.aptmPrmtYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> aptmTmprYn = cg2ChgPrpsReq.aptmTmprYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> aptmTmprTrm = cg2ChgPrpsReq.aptmTmprTrm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgPrv = cg2ChgPrpsReq.chgPrv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgAft = cg2ChgPrpsReq.chgAft;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = cg2ChgPrpsReq.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> fileDesc = cg2ChgPrpsReq.fileDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> fileAttYn = cg2ChgPrpsReq.fileAttYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = cg2ChgPrpsReq.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = cg2ChgPrpsReq.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = cg2ChgPrpsReq.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cg2ChgPrpsReq.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cg2ChgPrpsReq.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cg2ChgPrpsReq.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = cg2ChgPrpsReq.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgPrpsReqAprIdx = cg2ChgPrpsReq.chgPrpsReqAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivCd = cg2ChgPrpsReq.modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgPrpsReqProc = cg2ChgPrpsReq.chgPrpsReqProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> modlTracIdx = cg2ChgPrpsReq.modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cg2ChgPrpsReq extends AliasableSqlTable<Cg2ChgPrpsReq> {
        public final SqlColumn<Short> chgPrpsReqIdx = column("CHG_PRPS_REQ_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> modlDivEtc = column("MODL_DIV_ETC", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> reqDptCd = column("REQ_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> reqUid = column("REQ_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> chgTit = column("CHG_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> prpsDptCd = column("PRPS_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> chgPps = column("CHG_PPS", JDBCType.VARCHAR);

        public final SqlColumn<String> chgRea = column("CHG_REA", JDBCType.VARCHAR);

        public final SqlColumn<String> chgHopeDt = column("CHG_HOPE_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> aptmPrmtYn = column("APTM_PRMT_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> aptmTmprYn = column("APTM_TMPR_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> aptmTmprTrm = column("APTM_TMPR_TRM", JDBCType.VARCHAR);

        public final SqlColumn<String> chgPrv = column("CHG_PRV", JDBCType.VARCHAR);

        public final SqlColumn<String> chgAft = column("CHG_AFT", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> fileDesc = column("FILE_DESC", JDBCType.VARCHAR);

        public final SqlColumn<String> fileAttYn = column("FILE_ATT_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> chgPrpsReqAprIdx = column("CHG_PRPS_REQ_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> modlDivCd = column("MODL_DIV_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> chgPrpsReqProc = column("CHG_PRPS_REQ_PROC", JDBCType.VARCHAR);

        public final SqlColumn<Short> modlTracIdx = column("MODL_TRAC_IDX", JDBCType.NUMERIC);

        public Cg2ChgPrpsReq() {
            super("PHM7_1_QMS_USER.CG2_CHG_PRPS_REQ", Cg2ChgPrpsReq::new);
        }
    }
}