package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class AtAuditDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final AtAudit atAudit = new AtAudit();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> auditIdx = atAudit.auditIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = atAudit.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuCd = atAudit.menuCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> httpMtd = atAudit.httpMtd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> evtUrl = atAudit.evtUrl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> esignYn = atAudit.esignYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rea = atAudit.rea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = atAudit.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = atAudit.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = atAudit.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class AtAudit extends AliasableSqlTable<AtAudit> {
        public final SqlColumn<Short> auditIdx = column("AUDIT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> menuCd = column("MENU_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> httpMtd = column("HTTP_MTD", JDBCType.VARCHAR);

        public final SqlColumn<String> evtUrl = column("EVT_URL", JDBCType.VARCHAR);

        public final SqlColumn<String> esignYn = column("ESIGN_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> rea = column("REA", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public AtAudit() {
            super("PHM7_1_QMS_USER.AT_AUDIT", AtAudit::new);
        }
    }
}