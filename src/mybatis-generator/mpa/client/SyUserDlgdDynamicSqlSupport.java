package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyUserDlgdDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyUserDlgd syUserDlgd = new SyUserDlgd();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userUid = syUserDlgd.userUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> dlgdSeq = syUserDlgd.dlgdSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reprUid = syUserDlgd.reprUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dlgdDt = syUserDlgd.dlgdDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> gbkDt = syUserDlgd.gbkDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dlgdRea = syUserDlgd.dlgdRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dlgdPrgsCd = syUserDlgd.dlgdPrgsCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dlgdSttscd = syUserDlgd.dlgdSttscd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> dlgdAprReqIdx = syUserDlgd.dlgdAprReqIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syUserDlgd.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syUserDlgd.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syUserDlgd.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyUserDlgd extends AliasableSqlTable<SyUserDlgd> {
        public final SqlColumn<String> userUid = column("USER_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> dlgdSeq = column("DLGD_SEQ", JDBCType.NUMERIC);

        public final SqlColumn<String> reprUid = column("REPR_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> dlgdDt = column("DLGD_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> gbkDt = column("GBK_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> dlgdRea = column("DLGD_REA", JDBCType.VARCHAR);

        public final SqlColumn<String> dlgdPrgsCd = column("DLGD_PRGS_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> dlgdSttscd = column("DLGD_STTSCD", JDBCType.VARCHAR);

        public final SqlColumn<Short> dlgdAprReqIdx = column("DLGD_APR_REQ_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public SyUserDlgd() {
            super("PHM7_1_QMS_USER.SY_USER_DLGD", SyUserDlgd::new);
        }
    }
}