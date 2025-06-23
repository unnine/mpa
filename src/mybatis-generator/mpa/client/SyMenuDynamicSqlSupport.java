package mpa.client;

import java.math.BigDecimal;
import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class SyMenuDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SyMenu syMenu = new SyMenu();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuCd = syMenu.menuCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> hirMenuCd = syMenu.hirMenuCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuUrl = syMenu.menuUrl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> menuDesc = syMenu.menuDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<BigDecimal> ord = syMenu.ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> useYn = syMenu.useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> aprPageYn = syMenu.aprPageYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class SyMenu extends AliasableSqlTable<SyMenu> {
        public final SqlColumn<String> menuCd = column("MENU_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> hirMenuCd = column("HIR_MENU_CD", JDBCType.VARCHAR);

        public final SqlColumn<String> menuUrl = column("MENU_URL", JDBCType.VARCHAR);

        public final SqlColumn<String> menuDesc = column("MENU_DESC", JDBCType.VARCHAR);

        public final SqlColumn<BigDecimal> ord = column("ORD", JDBCType.NUMERIC);

        public final SqlColumn<String> useYn = column("USE_YN", JDBCType.VARCHAR);

        public final SqlColumn<String> aprPageYn = column("APR_PAGE_YN", JDBCType.VARCHAR);

        public SyMenu() {
            super("PHM7_1_QMS_USER.SY_MENU", SyMenu::new);
        }
    }
}