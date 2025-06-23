package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Jb1JobHisDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Jb1JobHis jb1JobHis = new Jb1JobHis();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> jobHisIdx = jb1JobHis.jobHisIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> jobIdx = jb1JobHis.jobIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> compNm = jb1JobHis.compNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> afatDpt = jb1JobHis.afatDpt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> work = jb1JobHis.work;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trm = jb1JobHis.trm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = jb1JobHis.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = jb1JobHis.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = jb1JobHis.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = jb1JobHis.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Jb1JobHis extends AliasableSqlTable<Jb1JobHis> {
        public final SqlColumn<Short> jobHisIdx = column("JOB_HIS_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> jobIdx = column("JOB_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> compNm = column("COMP_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> afatDpt = column("AFAT_DPT", JDBCType.VARCHAR);

        public final SqlColumn<String> work = column("WORK", JDBCType.VARCHAR);

        public final SqlColumn<String> trm = column("TRM", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Jb1JobHis() {
            super("PHM7_1_QMS_USER.JB1_JOB_HIS", Jb1JobHis::new);
        }
    }
}