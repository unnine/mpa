package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Os2OosPhs2EndDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Os2OosPhs2End os2OosPhs2End = new Os2OosPhs2End();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosPhs2EndIdx = os2OosPhs2End.oosPhs2EndIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = os2OosPhs2End.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = os2OosPhs2End.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crstPhs2IvgYn = os2OosPhs2End.crstPhs2IvgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crstHyptEnfoYn = os2OosPhs2End.crstHyptEnfoYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crstRtestEnfoYn = os2OosPhs2End.crstRtestEnfoYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> prcsPhs2EndYn = os2OosPhs2End.prcsPhs2EndYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> prcsPhs2RprgYn = os2OosPhs2End.prcsPhs2RprgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> phs2EndAprIdx = os2OosPhs2End.phs2EndAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = os2OosPhs2End.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = os2OosPhs2End.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = os2OosPhs2End.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaTracIdx = os2OosPhs2End.capaTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> capaMngNo = os2OosPhs2End.capaMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosPhs2IvstIdx = os2OosPhs2End.oosPhs2IvstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Os2OosPhs2End extends AliasableSqlTable<Os2OosPhs2End> {
        public final SqlColumn<Short> oosPhs2EndIdx = column("OOS_PHS2_END_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> crstPhs2IvgYn = column("CRST_PHS2_IVG_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crstHyptEnfoYn = column("CRST_HYPT_ENFO_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crstRtestEnfoYn = column("CRST_RTEST_ENFO_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> prcsPhs2EndYn = column("PRCS_PHS2_END_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> prcsPhs2RprgYn = column("PRCS_PHS2_RPRG_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> phs2EndAprIdx = column("PHS2_END_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> capaTracIdx = column("CAPA_TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> capaMngNo = column("CAPA_MNG_NO", JDBCType.VARCHAR);

        public final SqlColumn<Short> oosPhs2IvstIdx = column("OOS_PHS2_IVST_IDX", JDBCType.NUMERIC);

        public Os2OosPhs2End() {
            super("PHM7_1_QMS_USER.OS2_OOS_PHS2_END", Os2OosPhs2End::new);
        }
    }
}