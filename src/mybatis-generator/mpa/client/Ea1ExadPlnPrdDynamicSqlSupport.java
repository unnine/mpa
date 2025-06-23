package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ea1ExadPlnPrdDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ea1ExadPlnPrd ea1ExadPlnPrd = new Ea1ExadPlnPrd();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadPlnPrdIdx = ea1ExadPlnPrd.exadPlnPrdIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadPlnIdx = ea1ExadPlnPrd.exadPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pitmDiv = ea1ExadPlnPrd.pitmDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pitmCd = ea1ExadPlnPrd.pitmCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> pitmNm = ea1ExadPlnPrd.pitmNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ea1ExadPlnPrd.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ea1ExadPlnPrd.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ea1ExadPlnPrd.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = ea1ExadPlnPrd.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ea1ExadPlnPrd extends AliasableSqlTable<Ea1ExadPlnPrd> {
        public final SqlColumn<Short> exadPlnPrdIdx = column("EXAD_PLN_PRD_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> exadPlnIdx = column("EXAD_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> pitmDiv = column("PITM_DIV", JDBCType.VARCHAR);

        public final SqlColumn<String> pitmCd = column("PITM_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> pitmNm = column("PITM_NM", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public Ea1ExadPlnPrd() {
            super("PHM7_1_QMS_USER.EA1_EXAD_PLN_PRD", Ea1ExadPlnPrd::new);
        }
    }
}