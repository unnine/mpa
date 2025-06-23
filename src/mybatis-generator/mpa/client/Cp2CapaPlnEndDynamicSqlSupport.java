package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cp2CapaPlnEndDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cp2CapaPlnEnd cp2CapaPlnEnd = new Cp2CapaPlnEnd();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaEndIdx = cp2CapaPlnEnd.capaEndIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaPlnIdx = cp2CapaPlnEnd.capaPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> jdgYn = cp2CapaPlnEnd.jdgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> jdgSplmRea = cp2CapaPlnEnd.jdgSplmRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> plnEndAprIdx = cp2CapaPlnEnd.plnEndAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = cp2CapaPlnEnd.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = cp2CapaPlnEnd.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = cp2CapaPlnEnd.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cp2CapaPlnEnd.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cp2CapaPlnEnd.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cp2CapaPlnEnd.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = cp2CapaPlnEnd.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cp2CapaPlnEnd extends AliasableSqlTable<Cp2CapaPlnEnd> {
        public final SqlColumn<Short> capaEndIdx = column("CAPA_END_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> capaPlnIdx = column("CAPA_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> jdgYn = column("JDG_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> jdgSplmRea = column("JDG_SPLM_REA", JDBCType.VARCHAR);

        public final SqlColumn<Short> plnEndAprIdx = column("PLN_END_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public Cp2CapaPlnEnd() {
            super("PHM7_1_QMS_USER.CP2_CAPA_PLN_END", Cp2CapaPlnEnd::new);
        }
    }
}