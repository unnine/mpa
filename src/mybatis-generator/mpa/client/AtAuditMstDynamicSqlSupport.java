package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class AtAuditMstDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final AtAuditMst atAuditMst = new AtAuditMst();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuCd = atAuditMst.menuCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> menuSeq = atAuditMst.menuSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> tabNm = atAuditMst.tabNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> colNm = atAuditMst.colNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> colHedNm = atAuditMst.colHedNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> colComt = atAuditMst.colComt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = atAuditMst.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = atAuditMst.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = atAuditMst.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = atAuditMst.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = atAuditMst.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = atAuditMst.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> joinColNm = atAuditMst.joinColNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> joinDisplayColNm = atAuditMst.joinDisplayColNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> joinTabNm = atAuditMst.joinTabNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class AtAuditMst extends AliasableSqlTable<AtAuditMst> {
        public final SqlColumn<String> menuCd = column("MENU_CD", JDBCType.VARCHAR);

        public final SqlColumn<Short> menuSeq = column("MENU_SEQ", JDBCType.NUMERIC);

        public final SqlColumn<String> tabNm = column("TAB_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> colNm = column("COL_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> colHedNm = column("COL_HED_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> colComt = column("COL_COMT", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> joinColNm = column("JOIN_COL_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> joinDisplayColNm = column("JOIN_DISPLAY_COL_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> joinTabNm = column("JOIN_TAB_NM", JDBCType.VARCHAR);

        public AtAuditMst() {
            super("PHM7_1_QMS_USER.AT_AUDIT_MST", AtAuditMst::new);
        }
    }
}