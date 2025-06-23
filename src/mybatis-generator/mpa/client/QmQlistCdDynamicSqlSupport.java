package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class QmQlistCdDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final QmQlistCd qmQlistCd = new QmQlistCd();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qlistCd = qmQlistCd.qlistCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hirQlistCd = qmQlistCd.hirQlistCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = qmQlistCd.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qlistDiv = qmQlistCd.qlistDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qlistVer = qmQlistCd.qlistVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> loclQlistNm = qmQlistCd.loclQlistNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = qmQlistCd.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = qmQlistCd.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = qmQlistCd.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd1 = qmQlistCd.extCd1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd2 = qmQlistCd.extCd2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd3 = qmQlistCd.extCd3;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd4 = qmQlistCd.extCd4;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd5 = qmQlistCd.extCd5;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = qmQlistCd.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = qmQlistCd.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = qmQlistCd.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = qmQlistCd.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = qmQlistCd.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = qmQlistCd.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = qmQlistCd.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class QmQlistCd extends AliasableSqlTable<QmQlistCd> {
        public final SqlColumn<String> qlistCd = column("QLIST_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> hirQlistCd = column("HIR_QLIST_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> qlistDiv = column("QLIST_DIV", JDBCType.VARCHAR);

        public final SqlColumn<String> qlistVer = column("QLIST_VER", JDBCType.VARCHAR);

        public final SqlColumn<String> loclQlistNm = column("LOCL_QLIST_NM", JDBCType.VARCHAR);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> extCd1 = column("EXT_CD1", JDBCType.VARCHAR);

        public final SqlColumn<String> extCd2 = column("EXT_CD2", JDBCType.VARCHAR);

        public final SqlColumn<String> extCd3 = column("EXT_CD3", JDBCType.VARCHAR);

        public final SqlColumn<String> extCd4 = column("EXT_CD4", JDBCType.VARCHAR);

        public final SqlColumn<String> extCd5 = column("EXT_CD5", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public QmQlistCd() {
            super("PHM7_1_QMS_USER.QM_QLIST_CD", QmQlistCd::new);
        }
    }
}