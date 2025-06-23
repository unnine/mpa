package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class Cg2ChgImamChklDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Cg2ChgImamChkl cg2ChgImamChkl = new Cg2ChgImamChkl();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgImamChklIdx = cg2ChgImamChkl.chgImamChklIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Short> chgImamIdx = cg2ChgImamChkl.chgImamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> imamChklIdx = cg2ChgImamChkl.imamChklIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> imamRst = cg2ChgImamChkl.imamRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> flua = cg2ChgImamChkl.flua;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = cg2ChgImamChkl.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = cg2ChgImamChkl.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = cg2ChgImamChkl.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Cg2ChgImamChkl extends AliasableSqlTable<Cg2ChgImamChkl> {
        public final SqlColumn<Short> chgImamChklIdx = column("CHG_IMAM_CHKL_IDX", JDBCType.NUMERIC);

        public final SqlColumn<Short> chgImamIdx = column("CHG_IMAM_IDX", JDBCType.NUMERIC);

        public final SqlColumn<String> imamChklIdx = column("IMAM_CHKL_IDX", JDBCType.VARCHAR);

        public final SqlColumn<String> imamRst = column("IMAM_RST", JDBCType.VARCHAR);

        public final SqlColumn<String> flua = column("FLUA", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public Cg2ChgImamChkl() {
            super("PHM7_1_QMS_USER.CG2_CHG_IMAM_CHKL", Cg2ChgImamChkl::new);
        }
    }
}