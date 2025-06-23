package mpa.client;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class QmModlDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final QmModl qmModl = new QmModl();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlCd = qmModl.modlCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlDivCd = qmModl.modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlNm = qmModl.modlNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> prgOrd = qmModl.prgOrd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> aprYn = qmModl.aprYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = qmModl.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> classify = qmModl.classify;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> backPoint = qmModl.backPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> reviewYn = qmModl.reviewYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ownerModlCd = qmModl.ownerModlCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class QmModl extends AliasableSqlTable<QmModl> {
        public final SqlColumn<String> modlCd = column("MODL_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> modlDivCd = column("MODL_DIV_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> modlNm = column("MODL_NM", JDBCType.VARCHAR);

        public final SqlColumn<Short> prgOrd = column("PRG_ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> aprYn = column("APR_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> classify = column("CLASSIFY", JDBCType.VARCHAR);

        public final SqlColumn<String> backPoint = column("BACK_POINT", JDBCType.VARCHAR);

        public final SqlColumn<String> reviewYn = column("REVIEW_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> ownerModlCd = column("OWNER_MODL_CD", JDBCType.VARCHAR);

        public QmModl() {
            super("PHM7_1_QMS_USER.QM_MODL", QmModl::new);
        }
    }
}