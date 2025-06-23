package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ea1ExadPlnExmeDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ea1ExadPlnExme ea1ExadPlnExme = new Ea1ExadPlnExme();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadPlnExmeIdx = ea1ExadPlnExme.exadPlnExmeIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadPlnIdx = ea1ExadPlnExme.exadPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> exmeUid = ea1ExadPlnExme.exmeUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> exmeDptNm = ea1ExadPlnExme.exmeDptNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ea1ExadPlnExme.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ea1ExadPlnExme.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ea1ExadPlnExme.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = ea1ExadPlnExme.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ea1ExadPlnExme extends AliasableSqlTable<Ea1ExadPlnExme> {
        public final SqlColumn<Short> exadPlnExmeIdx = column("EXAD_PLN_EXME_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> exadPlnIdx = column("EXAD_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> exmeUid = column("EXME_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> exmeDptNm = column("EXME_DPT_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public Ea1ExadPlnExme() {
            super("PHM7_1_QMS_USER.EA1_EXAD_PLN_EXME", Ea1ExadPlnExme::new);
        }
    }
}