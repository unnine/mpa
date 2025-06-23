package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Jb1JobRsbiDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Jb1JobRsbi jb1JobRsbi = new Jb1JobRsbi();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> jobRsbiIdx = jb1JobRsbi.jobRsbiIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> jobIdx = jb1JobRsbi.jobIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> jobCtt = jb1JobRsbi.jobCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dlgCtt = jb1JobRsbi.dlgCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = jb1JobRsbi.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = jb1JobRsbi.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = jb1JobRsbi.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Jb1JobRsbi extends AliasableSqlTable<Jb1JobRsbi> {
        public final SqlColumn<Short> jobRsbiIdx = column("JOB_RSBI_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> jobIdx = column("JOB_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> jobCtt = column("JOB_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> dlgCtt = column("DLG_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Jb1JobRsbi() {
            super("PHM7_1_QMS_USER.JB1_JOB_RSBI", Jb1JobRsbi::new);
        }
    }
}