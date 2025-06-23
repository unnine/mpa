package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class QmQlistDivDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final QmQlistDiv qmQlistDiv = new QmQlistDiv();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = qmQlistDiv.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qlistDiv = qmQlistDiv.qlistDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qlistVer = qmQlistDiv.qlistVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qlistDivNm = qmQlistDiv.qlistDivNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qlistDivUseYn = qmQlistDiv.qlistDivUseYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> qlistDivOrd = qmQlistDiv.qlistDivOrd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> qlistDivDelYn = qmQlistDiv.qlistDivDelYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = qmQlistDiv.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = qmQlistDiv.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = qmQlistDiv.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = qmQlistDiv.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class QmQlistDiv extends AliasableSqlTable<QmQlistDiv> {
        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> qlistDiv = column("QLIST_DIV", JDBCType.VARCHAR);

        public final SqlColumn<String> qlistVer = column("QLIST_VER", JDBCType.VARCHAR);

        public final SqlColumn<String> qlistDivNm = column("QLIST_DIV_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> qlistDivUseYn = column("QLIST_DIV_USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> qlistDivOrd = column("QLIST_DIV_ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> qlistDivDelYn = column("QLIST_DIV_DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public QmQlistDiv() {
            super("PHM7_1_QMS_USER.QM_QLIST_DIV", QmQlistDiv::new);
        }
    }
}