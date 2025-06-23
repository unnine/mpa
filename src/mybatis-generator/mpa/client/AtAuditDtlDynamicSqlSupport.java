package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class AtAuditDtlDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final AtAuditDtl atAuditDtl = new AtAuditDtl();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> auditSeq = atAuditDtl.auditSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgPrv = atAuditDtl.chgPrv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgAft = atAuditDtl.chgAft;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> evtNm = atAuditDtl.evtNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cudDiv = atAuditDtl.cudDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = atAuditDtl.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> auditIdx = atAuditDtl.auditIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> managementNumber = atAuditDtl.managementNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<byte[]> chgAftBlob = atAuditDtl.chgAftBlob;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<byte[]> chgPrvBlob = atAuditDtl.chgPrvBlob;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class AtAuditDtl extends AliasableSqlTable<AtAuditDtl> {
        public final SqlColumn<Short> auditSeq = column("AUDIT_SEQ", JDBCType.NUMERIC);

        public final SqlColumn<String> chgPrv = column("CHG_PRV", JDBCType.VARCHAR);

        public final SqlColumn<String> chgAft = column("CHG_AFT", JDBCType.VARCHAR);

        public final SqlColumn<String> evtNm = column("EVT_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> cudDiv = column("CUD_DIV", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<Short> auditIdx = column("AUDIT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> managementNumber = column("MANAGEMENT_NUMBER", JDBCType.VARCHAR);

        public final SqlColumn<byte[]> chgAftBlob = column("CHG_AFT_BLOB", JDBCType.BLOB);

        public final SqlColumn<byte[]> chgPrvBlob = column("CHG_PRV_BLOB", JDBCType.BLOB);

        public AtAuditDtl() {
            super("PHM7_1_QMS_USER.AT_AUDIT_DTL", AtAuditDtl::new);
        }
    }
}