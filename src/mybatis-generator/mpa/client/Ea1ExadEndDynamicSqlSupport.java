package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ea1ExadEndDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ea1ExadEnd ea1ExadEnd = new Ea1ExadEnd();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadEndIdx = ea1ExadEnd.exadEndIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadPlnIdx = ea1ExadEnd.exadPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = ea1ExadEnd.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> fileIdx = ea1ExadEnd.fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> exadEndAprIdx = ea1ExadEnd.exadEndAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtIp = ea1ExadEnd.crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> crtDs = ea1ExadEnd.crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crtUid = ea1ExadEnd.crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ea1ExadEnd.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ea1ExadEnd.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ea1ExadEnd.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> tracIdx = ea1ExadEnd.tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ea1ExadEnd extends AliasableSqlTable<Ea1ExadEnd> {
        public final SqlColumn<Short> exadEndIdx = column("EXAD_END_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> exadPlnIdx = column("EXAD_PLN_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<Short> fileIdx = column("FILE_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> exadEndAprIdx = column("EXAD_END_APR_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crtIp = column("CRT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> crtDs = column("CRT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> crtUid = column("CRT_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> tracIdx = column("TRAC_IDX", JDBCType.NUMERIC);

        public Ea1ExadEnd() {
            super("PHM7_1_QMS_USER.EA1_EXAD_END", Ea1ExadEnd::new);
        }
    }
}