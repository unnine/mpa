package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class AtErrLogDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final AtErrLog atErrLog = new AtErrLog();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> errLogIdx = atErrLog.errLogIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> url = atErrLog.url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> excp = atErrLog.excp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> msg = atErrLog.msg;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> strace = atErrLog.strace;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = atErrLog.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class AtErrLog extends AliasableSqlTable<AtErrLog> {
        public final SqlColumn<Short> errLogIdx = column("ERR_LOG_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> url = column("URL", JDBCType.VARCHAR);

        public final SqlColumn<String> excp = column("EXCP", JDBCType.VARCHAR);

        public final SqlColumn<String> msg = column("MSG", JDBCType.VARCHAR);

        public final SqlColumn<String> strace = column("STRACE", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public AtErrLog() {
            super("PHM7_1_QMS_USER.AT_ERR_LOG", AtErrLog::new);
        }
    }
}