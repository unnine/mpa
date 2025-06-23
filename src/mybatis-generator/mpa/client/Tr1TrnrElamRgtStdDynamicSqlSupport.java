package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Tr1TrnrElamRgtStdDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Tr1TrnrElamRgtStd tr1TrnrElamRgtStd = new Tr1TrnrElamRgtStd();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trnrElamRgtStdIdx = tr1TrnrElamRgtStd.trnrElamRgtStdIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> trnrElamIdx = tr1TrnrElamRgtStd.trnrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> asmtStdIdx = tr1TrnrElamRgtStd.asmtStdIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> asmtRst = tr1TrnrElamRgtStd.asmtRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = tr1TrnrElamRgtStd.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = tr1TrnrElamRgtStd.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = tr1TrnrElamRgtStd.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Tr1TrnrElamRgtStd extends AliasableSqlTable<Tr1TrnrElamRgtStd> {
        public final SqlColumn<Short> trnrElamRgtStdIdx = column("TRNR_ELAM_RGT_STD_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> trnrElamIdx = column("TRNR_ELAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> asmtStdIdx = column("ASMT_STD_IDX", JDBCType.VARCHAR);

        public final SqlColumn<String> asmtRst = column("ASMT_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Tr1TrnrElamRgtStd() {
            super("PHM7_1_QMS_USER.TR1_TRNR_ELAM_RGT_STD", Tr1TrnrElamRgtStd::new);
        }
    }
}