package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Jb1JobDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Jb1Job jb1Job = new Jb1Job();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> jobIdx = jb1Job.jobIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> hirJobIdx = jb1Job.hirJobIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsNo = jb1Job.rvsNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = jb1Job.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = jb1Job.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qmsMngNo = jb1Job.qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userUid = jb1Job.userUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> jobAprIdx = jb1Job.jobAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> jobProc = jb1Job.jobProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> eduCd = jb1Job.eduCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> joinDt = jb1Job.joinDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> userDptNm = jb1Job.userDptNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsYn = jb1Job.rvsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rvsRea = jb1Job.rvsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> rvsDs = jb1Job.rvsDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> majrNm = jb1Job.majrNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rpo1stUid = jb1Job.rpo1stUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rpo2stUid = jb1Job.rpo2stUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rpo3stUid = jb1Job.rpo3stUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rpo4stUid = jb1Job.rpo4stUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rpo5stUid = jb1Job.rpo5stUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = jb1Job.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = jb1Job.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = jb1Job.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = jb1Job.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = jb1Job.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = jb1Job.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = jb1Job.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = jb1Job.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = jb1Job.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = jb1Job.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Jb1Job extends AliasableSqlTable<Jb1Job> {
        public final SqlColumn<Short> jobIdx = column("JOB_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> hirJobIdx = column("HIR_JOB_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> rvsNo = column("RVS_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> qmsMngNo = column("QMS_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> userUid = column("USER_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> jobAprIdx = column("JOB_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> jobProc = column("JOB_PROC", JDBCType.VARCHAR);

        public final SqlColumn<String> eduCd = column("EDU_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> joinDt = column("JOIN_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> userDptNm = column("USER_DPT_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsYn = column("RVS_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rvsRea = column("RVS_REA", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> rvsDs = column("RVS_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> majrNm = column("MAJR_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> rpo1stUid = column("RPO_1ST_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> rpo2stUid = column("RPO_2ST_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> rpo3stUid = column("RPO_3ST_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> rpo4stUid = column("RPO_4ST_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> rpo5stUid = column("RPO_5ST_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public Jb1Job() {
            super("PHM7_1_QMS_USER.JB1_JOB", Jb1Job::new);
        }
    }
}