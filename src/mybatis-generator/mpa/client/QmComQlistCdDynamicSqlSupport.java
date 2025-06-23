package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class QmComQlistCdDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final QmComQlistCd qmComQlistCd = new QmComQlistCd();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> comQlistCd = qmComQlistCd.comQlistCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hirQlistCd = qmComQlistCd.hirQlistCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qlistNm = qmComQlistCd.qlistNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = qmComQlistCd.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = qmComQlistCd.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = qmComQlistCd.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = qmComQlistCd.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd1 = qmComQlistCd.extCd1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd2 = qmComQlistCd.extCd2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd3 = qmComQlistCd.extCd3;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd4 = qmComQlistCd.extCd4;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> extCd5 = qmComQlistCd.extCd5;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = qmComQlistCd.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = qmComQlistCd.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = qmComQlistCd.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = qmComQlistCd.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = qmComQlistCd.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = qmComQlistCd.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class QmComQlistCd extends AliasableSqlTable<QmComQlistCd> {
        public final SqlColumn<String> comQlistCd = column("COM_QLIST_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> hirQlistCd = column("HIR_QLIST_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> qlistNm = column("QLIST_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

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

        public QmComQlistCd() {
            super("PHM7_1_QMS_USER.QM_COM_QLIST_CD", QmComQlistCd::new);
        }
    }
}