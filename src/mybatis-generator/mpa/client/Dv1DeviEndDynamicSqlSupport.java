package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Dv1DeviEndDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Dv1DeviEnd dv1DeviEnd = new Dv1DeviEnd();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> deviEndIdx = dv1DeviEnd.deviEndIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> deviOcrpIdx = dv1DeviEnd.deviOcrpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = dv1DeviEnd.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> deviEndAprIdx = dv1DeviEnd.deviEndAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = dv1DeviEnd.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = dv1DeviEnd.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = dv1DeviEnd.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = dv1DeviEnd.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = dv1DeviEnd.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = dv1DeviEnd.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = dv1DeviEnd.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Dv1DeviEnd extends AliasableSqlTable<Dv1DeviEnd> {
        public final SqlColumn<Short> deviEndIdx = column("DEVI_END_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> deviOcrpIdx = column("DEVI_OCRP_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> deviEndAprIdx = column("DEVI_END_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Dv1DeviEnd() {
            super("PHM7_1_QMS_USER.DV1_DEVI_END", Dv1DeviEnd::new);
        }
    }
}