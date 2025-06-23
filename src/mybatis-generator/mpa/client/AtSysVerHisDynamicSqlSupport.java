package mpa.client;

import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class AtSysVerHisDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final AtSysVerHis atSysVerHis = new AtSysVerHis();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVerCd = atSysVerHis.sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> sysVer = atSysVerHis.sysVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgRmk = atSysVerHis.chgRmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgDt = atSysVerHis.chgDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> chgCrg = atSysVerHis.chgCrg;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = atSysVerHis.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> delYn = atSysVerHis.delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = atSysVerHis.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = atSysVerHis.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = atSysVerHis.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class AtSysVerHis extends AliasableSqlTable<AtSysVerHis> {
        public final SqlColumn<String> sysVerCd = column("SYS_VER_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> sysVer = column("SYS_VER", JDBCType.VARCHAR);

        public final SqlColumn<String> chgRmk = column("CHG_RMK", JDBCType.VARCHAR);

        public final SqlColumn<String> chgDt = column("CHG_DT", JDBCType.VARCHAR);

        public final SqlColumn<String> chgCrg = column("CHG_CRG", JDBCType.VARCHAR);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> delYn = column("DEL_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public AtSysVerHis() {
            super("PHM7_1_QMS_USER.AT_SYS_VER_HIS", AtSysVerHis::new);
        }
    }
}