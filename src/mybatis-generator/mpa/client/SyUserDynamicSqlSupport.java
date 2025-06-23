package mpa.client;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyUserDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyUser syUser = new SyUser();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userUid = syUser.userUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = syUser.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userHirUid = syUser.userHirUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userVer = syUser.userVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dptCd = syUser.dptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> athCd = syUser.athCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> loclNm = syUser.loclNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> lognId = syUser.lognId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pwd = syUser.pwd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pwdChgDt = syUser.pwdChgDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> gradCd = syUser.gradCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pstnCd = syUser.pstnCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> emid = syUser.emid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> email = syUser.email;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> mobNo = syUser.mobNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tel = syUser.tel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> lognFailCnt = syUser.lognFailCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = syUser.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useChgRea = syUser.useChgRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> useChgDs = syUser.useChgDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> lockYn = syUser.lockYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> lockChgRea = syUser.lockChgRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> lockChgDs = syUser.lockChgDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsRea = syUser.rvsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> rvsDs = syUser.rvsDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> iniYn = syUser.iniYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = syUser.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> revwYn = syUser.revwYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> aprYn = syUser.aprYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = syUser.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = syUser.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = syUser.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syUser.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syUser.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syUser.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> advYn = syUser.advYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userIp = syUser.userIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<byte[]> signFile = syUser.signFile;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyUser extends AliasableSqlTable<SyUser> {
        public final SqlColumn<String> userUid = column("USER_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> userHirUid = column("USER_HIR_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> userVer = column("USER_VER", JDBCType.VARCHAR);

        public final SqlColumn<String> dptCd = column("DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> athCd = column("ATH_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> loclNm = column("LOCL_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> lognId = column("LOGN_ID", JDBCType.VARCHAR);

        public final SqlColumn<String> pwd = column("PWD", JDBCType.VARCHAR);

        public final SqlColumn<String> pwdChgDt = column("PWD_CHG_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> gradCd = column("GRAD_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> pstnCd = column("PSTN_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> emid = column("EMID", JDBCType.VARCHAR);

        public final SqlColumn<String> email = column("EMAIL", JDBCType.VARCHAR);

        public final SqlColumn<String> mobNo = column("MOB_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> tel = column("TEL", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> lognFailCnt = column("LOGN_FAIL_CNT", JDBCType.NUMERIC);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> useChgRea = column("USE_CHG_REA", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> useChgDs = column("USE_CHG_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> lockYn = column("LOCK_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> lockChgRea = column("LOCK_CHG_REA", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> lockChgDs = column("LOCK_CHG_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> rvsRea = column("RVS_REA", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> rvsDs = column("RVS_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> iniYn = column("INI_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> revwYn = column("REVW_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> aprYn = column("APR_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> advYn = column("ADV_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> userIp = column("USER_IP", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> signFile = column("SIGN_FILE", JDBCType.BLOB);

        public SyUser() {
            super("PHM7_1_QMS_USER.SY_USER", SyUser::new);
        }
    }
}