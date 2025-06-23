package mpa.client;

import static mpa.client.SyMenuDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyMenu;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

public interface SyMenuMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(menuCd, hirMenuCd, menuUrl, menuDesc, ord, useYn, aprPageYn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyMenuResult", value = {
        @Result(column="MENU_CD", property="menuCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="HIR_MENU_CD", property="hirMenuCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_URL", property="menuUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_DESC", property="menuDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="APR_PAGE_YN", property="aprPageYn", jdbcType=JdbcType.VARCHAR)
    })
    List<SyMenu> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyMenuResult")
    Optional<SyMenu> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String menuCd_) {
        return delete(c -> 
            c.where(menuCd, isEqualTo(menuCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyMenu row) {
        return MyBatis3Utils.insert(this::insert, row, syMenu, c ->
            c.map(menuCd).toProperty("menuCd")
            .map(hirMenuCd).toProperty("hirMenuCd")
            .map(menuUrl).toProperty("menuUrl")
            .map(menuDesc).toProperty("menuDesc")
            .map(ord).toProperty("ord")
            .map(useYn).toProperty("useYn")
            .map(aprPageYn).toProperty("aprPageYn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyMenu> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyMenu> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyMenu> findById(String menuCd_) {
        return findOne(c ->
            c.where(menuCd, isEqualTo(menuCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syMenu, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyMenu row) {
        return update(c ->
            c.set(hirMenuCd).equalToWhenPresent(row::getHirMenuCd)
            .set(menuUrl).equalToWhenPresent(row::getMenuUrl)
            .set(menuDesc).equalToWhenPresent(row::getMenuDesc)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(aprPageYn).equalToWhenPresent(row::getAprPageYn)
            .where(menuCd, isEqualTo(row::getMenuCd))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyMenu> insertStatement);
}