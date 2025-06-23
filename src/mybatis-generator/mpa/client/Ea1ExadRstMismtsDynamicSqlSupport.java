package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ea1ExadRstMismtsDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ea1ExadRstMismts ea1ExadRstMismts = new Ea1ExadRstMismts();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadRstMismtsIdx = ea1ExadRstMismts.exadRstMismtsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadRstIdx = ea1ExadRstMismts.exadRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> riskRnk = ea1ExadRstMismts.riskRnk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> misMtsCtt = ea1ExadRstMismts.misMtsCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ea1ExadRstMismts.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ea1ExadRstMismts.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ea1ExadRstMismts.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ea1ExadRstMismts extends AliasableSqlTable<Ea1ExadRstMismts> {
        public final SqlColumn<Short> exadRstMismtsIdx = column("EXAD_RST_MISMTS_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> exadRstIdx = column("EXAD_RST_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> riskRnk = column("RISK_RNK", JDBCType.VARCHAR);

        public final SqlColumn<String> misMtsCtt = column("MIS_MTS_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Ea1ExadRstMismts() {
            super("PHM7_1_QMS_USER.EA1_EXAD_RST_MISMTS", Ea1ExadRstMismts::new);
        }
    }
}