package mpa.client;

import java.math.BigDecimal;
import java.sql.JDBCType;
import java.time.LocalDateTime;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyScdHirDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyScdHir syScdHir = new SyScdHir();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> scdHir = syScdHir.scdHir;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hirNm = syScdHir.hirNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> hirOrd = syScdHir.hirOrd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hirUseYn = syScdHir.hirUseYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> scdDesc = syScdHir.scdDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtIp = syScdHir.udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<LocalDateTime> udtDs = syScdHir.udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> udtUid = syScdHir.udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyScdHir extends AliasableSqlTable<SyScdHir> {
        public final SqlColumn<String> scdHir = column("SCD_HIR", JDBCType.VARCHAR);

        public final SqlColumn<String> hirNm = column("HIR_NM", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> hirOrd = column("HIR_ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> hirUseYn = column("HIR_USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> scdDesc = column("SCD_DESC", JDBCType.VARCHAR);

        public final SqlColumn<String> udtIp = column("UDT_IP", JDBCType.VARCHAR);

        public final SqlColumn<LocalDateTime> udtDs = column("UDT_DS", JDBCType.TIMESTAMP);

        public final SqlColumn<String> udtUid = column("UDT_UID", JDBCType.VARCHAR);

        public SyScdHir() {
            super("PHM7_1_QMS_USER.SY_SCD_HIR", SyScdHir::new);
        }
    }
}