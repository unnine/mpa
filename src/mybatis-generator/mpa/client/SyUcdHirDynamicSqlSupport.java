package mpa.client;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyUcdHirDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyUcdHir syUcdHir = new SyUcdHir();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> plntCd = syUcdHir.plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ucdHir = syUcdHir.ucdHir;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hirNm = syUcdHir.hirNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> hirOrd = syUcdHir.hirOrd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hirYn = syUcdHir.hirYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> ucdDesc = syUcdHir.ucdDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyUcdHir extends AliasableSqlTable<SyUcdHir> {
        public final SqlColumn<String> plntCd = column("PLNT_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> ucdHir = column("UCD_HIR", JDBCType.VARCHAR);

        public final SqlColumn<String> hirNm = column("HIR_NM", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> hirOrd = column("HIR_ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> hirYn = column("HIR_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> ucdDesc = column("UCD_DESC", JDBCType.VARCHAR);

        public SyUcdHir() {
            super("PHM7_1_QMS_USER.SY_UCD_HIR", SyUcdHir::new);
        }
    }
}