package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class MeMneReqDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final MeMneReq meMneReq = new MeMneReq();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> mneIdx = meMneReq.mneIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = meMneReq.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = meMneReq.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = meMneReq.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = meMneReq.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = meMneReq.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> mneAprIdx = meMneReq.mneAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> mneProc = meMneReq.mneProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> relModlDivCd = meMneReq.relModlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tagt = meMneReq.tagt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rea = meMneReq.rea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> impt = meMneReq.impt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = meMneReq.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cmplDtPrv = meMneReq.cmplDtPrv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cmplDtAft = meMneReq.cmplDtAft;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cttPrv = meMneReq.cttPrv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cttAft = meMneReq.cttAft;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = meMneReq.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = meMneReq.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = meMneReq.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = meMneReq.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = meMneReq.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = meMneReq.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = meMneReq.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> relTracIdx = meMneReq.relTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> relQmsMngNo = meMneReq.relQmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> mneDiv = meMneReq.mneDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> relProcDivNm = meMneReq.relProcDivNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class MeMneReq extends AliasableSqlTable<MeMneReq> {
        public final SqlColumn<Short> mneIdx = column("MNE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<Short> mneAprIdx = column("MNE_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> mneProc = column("MNE_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> relModlDivCd = column("REL_MODL_DIV_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> tagt = column("TAGT", JDBCType.VARCHAR);

        public final SqlColumn<String> rea = column("REA", JDBCType.VARCHAR);

        public final SqlColumn<String> impt = column("IMPT", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<String> cmplDtPrv = column("CMPL_DT_PRV", JDBCType.VARCHAR);

        public final SqlColumn<String> cmplDtAft = column("CMPL_DT_AFT", JDBCType.VARCHAR);

        public final SqlColumn<String> cttPrv = column("CTT_PRV", JDBCType.VARCHAR);

        public final SqlColumn<String> cttAft = column("CTT_AFT", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> relTracIdx = column("REL_TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> relQmsMngNo = column("REL_QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> mneDiv = column("MNE_DIV", JDBCType.VARCHAR);

        public final SqlColumn<String> relProcDivNm = column("REL_PROC_DIV_NM", JDBCType.VARCHAR);

        public MeMneReq() {
            super("PHM7_1_QMS_USER.ME_MNE_REQ", MeMneReq::new);
        }
    }
}