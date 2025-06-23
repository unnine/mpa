package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class AtPwdMngHisDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final AtPwdMngHis atPwdMngHis = new AtPwdMngHis();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> pwdMngSeq = atPwdMngHis.pwdMngSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = atPwdMngHis.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ver = atPwdMngHis.ver;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = atPwdMngHis.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> iniPwd = atPwdMngHis.iniPwd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> pwdMinDigt = atPwdMngHis.pwdMinDigt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cobOptCd = atPwdMngHis.cobOptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> dobLmtCnt = atPwdMngHis.dobLmtCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> rccPosbCnt = atPwdMngHis.rccPosbCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> srlPwdUseYn = atPwdMngHis.srlPwdUseYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pwdChgDudt = atPwdMngHis.pwdChgDudt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> lognFailLockCnt = atPwdMngHis.lognFailLockCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = atPwdMngHis.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = atPwdMngHis.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = atPwdMngHis.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class AtPwdMngHis extends AliasableSqlTable<AtPwdMngHis> {
        public final SqlColumn<Short> pwdMngSeq = column("PWD_MNG_SEQ", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<Short> ver = column("VER", JDBCType.NUMERIC);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> iniPwd = column("INI_PWD", JDBCType.VARCHAR);

        public final SqlColumn<Long> pwdMinDigt = column("PWD_MIN_DIGT", JDBCType.NUMERIC);

        public final SqlColumn<String> cobOptCd = column("COB_OPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<Long> dobLmtCnt = column("DOB_LMT_CNT", JDBCType.NUMERIC);

        public final SqlColumn<Long> rccPosbCnt = column("RCC_POSB_CNT", JDBCType.NUMERIC);

        public final SqlColumn<String> srlPwdUseYn = column("SRL_PWD_USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> pwdChgDudt = column("PWD_CHG_DUDT", JDBCType.VARCHAR);

        public final SqlColumn<Long> lognFailLockCnt = column("LOGN_FAIL_LOCK_CNT", JDBCType.NUMERIC);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public AtPwdMngHis() {
            super("PHM7_1_QMS_USER.AT_PWD_MNG_HIS", AtPwdMngHis::new);
        }
    }
}