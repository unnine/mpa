package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyUserPwdHisDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyUserPwdHis syUserPwdHis = new SyUserPwdHis();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userUid = syUserPwdHis.userUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgSeq = syUserPwdHis.chgSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pwd = syUserPwdHis.pwd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgYn = syUserPwdHis.chgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> rccCnt = syUserPwdHis.rccCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> failDt = syUserPwdHis.failDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = syUserPwdHis.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = syUserPwdHis.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = syUserPwdHis.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyUserPwdHis extends AliasableSqlTable<SyUserPwdHis> {
        public final SqlColumn<String> userUid = column("USER_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> chgSeq = column("CHG_SEQ", JDBCType.NUMERIC);

        public final SqlColumn<String> pwd = column("PWD", JDBCType.VARCHAR);

        public final SqlColumn<String> chgYn = column("CHG_YN", JDBCType.VARCHAR);

        public final SqlColumn<Long> rccCnt = column("RCC_CNT", JDBCType.NUMERIC);

        public final SqlColumn<String> failDt = column("FAIL_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public SyUserPwdHis() {
            super("PHM7_1_QMS_USER.SY_USER_PWD_HIS", SyUserPwdHis::new);
        }
    }
}