package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cp2CapaPlnRstDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cp2CapaPlnRst cp2CapaPlnRst = new Cp2CapaPlnRst();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaRstIdx = cp2CapaPlnRst.capaRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> capaPlnIdx = cp2CapaPlnRst.capaPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> capaRst = cp2CapaPlnRst.capaRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> cplDt = cp2CapaPlnRst.cplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniYn = cp2CapaPlnRst.trniYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = cp2CapaPlnRst.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> plnRstAprIdx = cp2CapaPlnRst.plnRstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgYn = cp2CapaPlnRst.chgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = cp2CapaPlnRst.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = cp2CapaPlnRst.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = cp2CapaPlnRst.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cp2CapaPlnRst.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cp2CapaPlnRst.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cp2CapaPlnRst.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = cp2CapaPlnRst.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> vlamNcsYn = cp2CapaPlnRst.vlamNcsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cp2CapaPlnRst extends AliasableSqlTable<Cp2CapaPlnRst> {
        public final SqlColumn<Short> capaRstIdx = column("CAPA_RST_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> capaPlnIdx = column("CAPA_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> capaRst = column("CAPA_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> cplDt = column("CPL_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> trniYn = column("TRNI_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> plnRstAprIdx = column("PLN_RST_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> chgYn = column("CHG_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> vlamNcsYn = column("VLAM_NCS_YN", JDBCType.VARCHAR);

        public Cp2CapaPlnRst() {
            super("PHM7_1_QMS_USER.CP2_CAPA_PLN_RST", Cp2CapaPlnRst::new);
        }
    }
}