package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Dv1DeviImamActDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Dv1DeviImamAct dv1DeviImamAct = new Dv1DeviImamAct();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> deviImamActIdx = dv1DeviImamAct.deviImamActIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> deviImamIdx = dv1DeviImamAct.deviImamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgDptCd = dv1DeviImamAct.crgDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> crgUid = dv1DeviImamAct.crgUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> act = dv1DeviImamAct.act;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> rst = dv1DeviImamAct.rst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = dv1DeviImamAct.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = dv1DeviImamAct.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = dv1DeviImamAct.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> ord = dv1DeviImamAct.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = dv1DeviImamAct.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Dv1DeviImamAct extends AliasableSqlTable<Dv1DeviImamAct> {
        public final SqlColumn<Short> deviImamActIdx = column("DEVI_IMAM_ACT_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> deviImamIdx = column("DEVI_IMAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> crgDptCd = column("CRG_DPT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> crgUid = column("CRG_UID", JDBCType.VARCHAR);

        public final SqlColumn<String> act = column("ACT", JDBCType.VARCHAR);

        public final SqlColumn<String> rst = column("RST", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public final SqlColumn<Short> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public Dv1DeviImamAct() {
            super("PHM7_1_QMS_USER.DV1_DEVI_IMAM_ACT", Dv1DeviImamAct::new);
        }
    }
}