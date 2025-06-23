package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ea1ExadRstDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ea1ExadRst ea1ExadRst = new Ea1ExadRst();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadRstIdx = ea1ExadRst.exadRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadPlnIdx = ea1ExadRst.exadPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtEnfoStrDt = ea1ExadRst.adtEnfoStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtEnfoEndDt = ea1ExadRst.adtEnfoEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtRstRevDt = ea1ExadRst.adtRstRevDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtRst = ea1ExadRst.adtRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> siteIspMts = ea1ExadRst.siteIspMts;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> docIspMts = ea1ExadRst.docIspMts;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = ea1ExadRst.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = ea1ExadRst.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = ea1ExadRst.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = ea1ExadRst.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = ea1ExadRst.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = ea1ExadRst.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ea1ExadRst.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ea1ExadRst.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ea1ExadRst.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadRstAprIdx = ea1ExadRst.exadRstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = ea1ExadRst.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ea1ExadRst extends AliasableSqlTable<Ea1ExadRst> {
        public final SqlColumn<Short> exadRstIdx = column("EXAD_RST_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> exadPlnIdx = column("EXAD_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> adtEnfoStrDt = column("ADT_ENFO_STR_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> adtEnfoEndDt = column("ADT_ENFO_END_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> adtRstRevDt = column("ADT_RST_REV_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> adtRst = column("ADT_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> siteIspMts = column("SITE_ISP_MTS", JDBCType.VARCHAR);

        public final SqlColumn<String> docIspMts = column("DOC_ISP_MTS", JDBCType.VARCHAR);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> exadRstAprIdx = column("EXAD_RST_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public Ea1ExadRst() {
            super("PHM7_1_QMS_USER.EA1_EXAD_RST", Ea1ExadRst::new);
        }
    }
}