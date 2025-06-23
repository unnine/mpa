package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class At1AdtrElamAtcDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final At1AdtrElamAtc at1AdtrElamAtc = new At1AdtrElamAtc();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> adtrElamAtcIdx = at1AdtrElamAtc.adtrElamAtcIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> adtrElamIdx = at1AdtrElamAtc.adtrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> adtrElamAtc = at1AdtrElamAtc.adtrElamAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> elamScr = at1AdtrElamAtc.elamScr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = at1AdtrElamAtc.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = at1AdtrElamAtc.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = at1AdtrElamAtc.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = at1AdtrElamAtc.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class At1AdtrElamAtc extends AliasableSqlTable<At1AdtrElamAtc> {
        public final SqlColumn<Short> adtrElamAtcIdx = column("ADTR_ELAM_ATC_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> adtrElamIdx = column("ADTR_ELAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> adtrElamAtc = column("ADTR_ELAM_ATC", JDBCType.VARCHAR);

        public final SqlColumn<Short> elamScr = column("ELAM_SCR", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public At1AdtrElamAtc() {
            super("PHM7_1_QMS_USER.AT1_ADTR_ELAM_ATC", At1AdtrElamAtc::new);
        }
    }
}