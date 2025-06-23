package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyJntLogDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyJntLog syJntLog = new SyJntLog();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userUid = syJntLog.userUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> lognSeq = syJntLog.lognSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> acssDiv = syJntLog.acssDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> acssDs = syJntLog.acssDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> acssIp = syJntLog.acssIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyJntLog extends AliasableSqlTable<SyJntLog> {
        public final SqlColumn<String> userUid = column("USER_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> lognSeq = column("LOGN_SEQ", JDBCType.NUMERIC);

        public final SqlColumn<String> acssDiv = column("ACSS_DIV", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> acssDs = column("ACSS_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> acssIp = column("ACSS_IP", JDBCType.VARCHAR);

        public SyJntLog() {
            super("PHM7_1_QMS_USER.SY_JNT_LOG", SyJntLog::new);
        }
    }
}