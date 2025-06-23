package mpa.client;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SpringSessionDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SpringSession springSession = new SpringSession();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> primaryId = springSession.primaryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sessionId = springSession.sessionId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> creationTime = springSession.creationTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> lastAccessTime = springSession.lastAccessTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> maxInactiveInterval = springSession.maxInactiveInterval;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> expiryTime = springSession.expiryTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> principalName = springSession.principalName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SpringSession extends AliasableSqlTable<SpringSession> {
        public final SqlColumn<String> primaryId = column("PRIMARY_ID", JDBCType.CHAR);

        public final SqlColumn<String> sessionId = column("SESSION_ID", JDBCType.CHAR);

        public final SqlColumn<BigDecimal> creationTime = column("CREATION_TIME", JDBCType.NUMERIC);

        public final SqlColumn<BigDecimal> lastAccessTime = column("LAST_ACCESS_TIME", JDBCType.NUMERIC);

        public final SqlColumn<Long> maxInactiveInterval = column("MAX_INACTIVE_INTERVAL", JDBCType.NUMERIC);

        public final SqlColumn<BigDecimal> expiryTime = column("EXPIRY_TIME", JDBCType.NUMERIC);

        public final SqlColumn<String> principalName = column("PRINCIPAL_NAME", JDBCType.VARCHAR);

        public SpringSession() {
            super("PHM7_1_QMS_USER.SPRING_SESSION", SpringSession::new);
        }
    }
}