package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Ti1AnuTrniDtlCttDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Ti1AnuTrniDtlCtt ti1AnuTrniDtlCtt = new Ti1AnuTrniDtlCtt();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> anuTrniDtlMonIdx = ti1AnuTrniDtlCtt.anuTrniDtlMonIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> anuTrniDtlIdx = ti1AnuTrniDtlCtt.anuTrniDtlIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dtlDocNo = ti1AnuTrniDtlCtt.dtlDocNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> dtlDocTit = ti1AnuTrniDtlCtt.dtlDocTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = ti1AnuTrniDtlCtt.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = ti1AnuTrniDtlCtt.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = ti1AnuTrniDtlCtt.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Ti1AnuTrniDtlCtt extends AliasableSqlTable<Ti1AnuTrniDtlCtt> {
        public final SqlColumn<Short> anuTrniDtlMonIdx = column("ANU_TRNI_DTL_MON_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> anuTrniDtlIdx = column("ANU_TRNI_DTL_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> dtlDocNo = column("DTL_DOC_NO", JDBCType.VARCHAR);

        public final SqlColumn<String> dtlDocTit = column("DTL_DOC_TIT", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Ti1AnuTrniDtlCtt() {
            super("PHM7_1_QMS_USER.TI1_ANU_TRNI_DTL_CTT", Ti1AnuTrniDtlCtt::new);
        }
    }
}