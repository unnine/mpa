package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Jb1JobQufDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Jb1JobQuf jb1JobQuf = new Jb1JobQuf();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> jobQufIdx = jb1JobQuf.jobQufIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> jobIdx = jb1JobQuf.jobIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qufDivCd = jb1JobQuf.qufDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qufAqstDt = jb1JobQuf.qufAqstDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = jb1JobQuf.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = jb1JobQuf.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = jb1JobQuf.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = jb1JobQuf.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = jb1JobQuf.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Jb1JobQuf extends AliasableSqlTable<Jb1JobQuf> {
        public final SqlColumn<Short> jobQufIdx = column("JOB_QUF_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> jobIdx = column("JOB_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> qufDivCd = column("QUF_DIV_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> qufAqstDt = column("QUF_AQST_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Jb1JobQuf() {
            super("PHM7_1_QMS_USER.JB1_JOB_QUF", Jb1JobQuf::new);
        }
    }
}