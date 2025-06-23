package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Os2OosPhs1EndDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Os2OosPhs1End os2OosPhs1End = new Os2OosPhs1End();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosPhs1EndIdx = os2OosPhs1End.oosPhs1EndIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> oosRcpIdx = os2OosPhs1End.oosRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = os2OosPhs1End.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docNo = os2OosPhs1End.docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crstPhs1Yn = os2OosPhs1End.crstPhs1Yn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crstRtestAttYn = os2OosPhs1End.crstRtestAttYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> prcsPhs1EndYn = os2OosPhs1End.prcsPhs1EndYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> prcsPhs2PrgYn = os2OosPhs1End.prcsPhs2PrgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> phs1EndAprIdx = os2OosPhs1End.phs1EndAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = os2OosPhs1End.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = os2OosPhs1End.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = os2OosPhs1End.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaTracIdx = os2OosPhs1End.capaTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> capaMngNo = os2OosPhs1End.capaMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Os2OosPhs1End extends AliasableSqlTable<Os2OosPhs1End> {
        public final SqlColumn<Short> oosPhs1EndIdx = column("OOS_PHS1_END_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> oosRcpIdx = column("OOS_RCP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> docNo = column("DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> crstPhs1Yn = column("CRST_PHS1_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crstRtestAttYn = column("CRST_RTEST_ATT_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> prcsPhs1EndYn = column("PRCS_PHS1_END_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> prcsPhs2PrgYn = column("PRCS_PHS2_PRG_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> phs1EndAprIdx = column("PHS1_END_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> capaTracIdx = column("CAPA_TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> capaMngNo = column("CAPA_MNG_NO", JDBCType.VARCHAR);

        public Os2OosPhs1End() {
            super("PHM7_1_QMS_USER.OS2_OOS_PHS1_END", Os2OosPhs1End::new);
        }
    }
}