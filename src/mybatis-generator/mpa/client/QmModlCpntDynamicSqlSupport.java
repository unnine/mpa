package mpa.client;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class QmModlCpntDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final QmModlCpnt qmModlCpnt = new QmModlCpnt();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> modlCd = qmModlCpnt.modlCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cpntModlDivCd = qmModlCpnt.cpntModlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> syncYn = qmModlCpnt.syncYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = qmModlCpnt.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> syncByEscalate = qmModlCpnt.syncByEscalate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class QmModlCpnt extends AliasableSqlTable<QmModlCpnt> {
        public final SqlColumn<String> modlCd = column("MODL_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> cpntModlDivCd = column("CPNT_MODL_DIV_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> syncYn = column("SYNC_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> syncByEscalate = column("SYNC_BY_ESCALATE", JDBCType.VARCHAR);

        public QmModlCpnt() {
            super("PHM7_1_QMS_USER.QM_MODL_CPNT", QmModlCpnt::new);
        }
    }
}