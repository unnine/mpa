package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ti1TrniPlnAsmtDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ti1TrniPlnAsmt ti1TrniPlnAsmt = new Ti1TrniPlnAsmt();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniPlnAsmtIdx = ti1TrniPlnAsmt.trniPlnAsmtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniPlnIdx = ti1TrniPlnAsmt.trniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = ti1TrniPlnAsmt.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> trniAsmtDegr = ti1TrniPlnAsmt.trniAsmtDegr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniAsmtMtd = ti1TrniPlnAsmt.trniAsmtMtd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniDiv = ti1TrniPlnAsmt.trniDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniMtd = ti1TrniPlnAsmt.trniMtd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniPla = ti1TrniPlnAsmt.trniPla;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniDat = ti1TrniPlnAsmt.trniDat;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniRmk = ti1TrniPlnAsmt.trniRmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trniDatFileIdx = ti1TrniPlnAsmt.trniDatFileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> trniDatCtt = ti1TrniPlnAsmt.trniDatCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> asmtEnfoDt = ti1TrniPlnAsmt.asmtEnfoDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> asmtRst = ti1TrniPlnAsmt.asmtRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> asmtRmk = ti1TrniPlnAsmt.asmtRmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> asmtFileIdx = ti1TrniPlnAsmt.asmtFileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> asmtEndYn = ti1TrniPlnAsmt.asmtEndYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> asmtAprIdx = ti1TrniPlnAsmt.asmtAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ti1TrniPlnAsmt.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ti1TrniPlnAsmt.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ti1TrniPlnAsmt.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ctftRt = ti1TrniPlnAsmt.ctftRt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ti1TrniPlnAsmt extends AliasableSqlTable<Ti1TrniPlnAsmt> {
        public final SqlColumn<Short> trniPlnAsmtIdx = column("TRNI_PLN_ASMT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> trniPlnIdx = column("TRNI_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Long> trniAsmtDegr = column("TRNI_ASMT_DEGR", JDBCType.NUMERIC);

        public final SqlColumn<String> trniAsmtMtd = column("TRNI_ASMT_MTD", JDBCType.VARCHAR);

        public final SqlColumn<String> trniDiv = column("TRNI_DIV", JDBCType.VARCHAR);

        public final SqlColumn<String> trniMtd = column("TRNI_MTD", JDBCType.VARCHAR);

        public final SqlColumn<String> trniPla = column("TRNI_PLA", JDBCType.VARCHAR);

        public final SqlColumn<String> trniDat = column("TRNI_DAT", JDBCType.VARCHAR);

        public final SqlColumn<String> trniRmk = column("TRNI_RMK", JDBCType.VARCHAR);

        public final SqlColumn<Short> trniDatFileIdx = column("TRNI_DAT_FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> trniDatCtt = column("TRNI_DAT_CTT", JDBCType.VARCHAR);

        public final SqlColumn<String> asmtEnfoDt = column("ASMT_ENFO_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> asmtRst = column("ASMT_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> asmtRmk = column("ASMT_RMK", JDBCType.VARCHAR);

        public final SqlColumn<Short> asmtFileIdx = column("ASMT_FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> asmtEndYn = column("ASMT_END_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> asmtAprIdx = column("ASMT_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> ctftRt = column("CTFT_RT", JDBCType.NUMERIC);

        public Ti1TrniPlnAsmt() {
            super("PHM7_1_QMS_USER.TI1_TRNI_PLN_ASMT", Ti1TrniPlnAsmt::new);
        }
    }
}