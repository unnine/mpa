package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class DcOpenTagtDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final DcOpenTagt dcOpenTagt = new DcOpenTagt();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> openTagtIdx = dcOpenTagt.openTagtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> docIdx = dcOpenTagt.docIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useruid = dcOpenTagt.useruid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> initReadDt = dcOpenTagt.initReadDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> readCnt = dcOpenTagt.readCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> readDt = dcOpenTagt.readDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = dcOpenTagt.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = dcOpenTagt.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rmk = dcOpenTagt.rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = dcOpenTagt.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = dcOpenTagt.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = dcOpenTagt.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class DcOpenTagt extends AliasableSqlTable<DcOpenTagt> {
        public final SqlColumn<Short> openTagtIdx = column("OPEN_TAGT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> docIdx = column("DOC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> useruid = column("USERUID", JDBCType.VARCHAR);

        public final SqlColumn<String> initReadDt = column("INIT_READ_DT", JDBCType.VARCHAR);

        public final SqlColumn<Long> readCnt = column("READ_CNT", JDBCType.NUMERIC);

        public final SqlColumn<String> readDt = column("READ_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> rmk = column("RMK", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public DcOpenTagt() {
            super("PHM7_1_QMS_USER.DC_OPEN_TAGT", DcOpenTagt::new);
        }
    }
}