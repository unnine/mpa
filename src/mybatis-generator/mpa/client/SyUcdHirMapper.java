package mpa.client;

import static mpa.client.SyUcdHirDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyUcdHir;
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

public interface SyUcdHirMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(plntCd, ucdHir, hirNm, hirOrd, hirYn, ucdDesc);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyUcdHirResult", value = {
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="UCD_HIR", property="ucdHir", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="HIR_NM", property="hirNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="HIR_ORD", property="hirOrd", jdbcType=JdbcType.NUMERIC),
        @Result(column="HIR_YN", property="hirYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="UCD_DESC", property="ucdDesc", jdbcType=JdbcType.VARCHAR)
    })
    List<SyUcdHir> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyUcdHirResult")
    Optional<SyUcdHir> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syUcdHir, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syUcdHir, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String plntCd_, String ucdHir_) {
        return delete(c -> 
            c.where(plntCd, isEqualTo(plntCd_))
            .and(ucdHir, isEqualTo(ucdHir_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyUcdHir row) {
        return MyBatis3Utils.insert(this::insert, row, syUcdHir, c ->
            c.map(plntCd).toProperty("plntCd")
            .map(ucdHir).toProperty("ucdHir")
            .map(hirNm).toProperty("hirNm")
            .map(hirOrd).toProperty("hirOrd")
            .map(hirYn).toProperty("hirYn")
            .map(ucdDesc).toProperty("ucdDesc")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUcdHir> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syUcdHir, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyUcdHir> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syUcdHir, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUcdHir> findById(String plntCd_, String ucdHir_) {
        return findOne(c ->
            c.where(plntCd, isEqualTo(plntCd_))
            .and(ucdHir, isEqualTo(ucdHir_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syUcdHir, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyUcdHir row) {
        return update(c ->
            c.set(hirNm).equalToWhenPresent(row::getHirNm)
            .set(hirOrd).equalToWhenPresent(row::getHirOrd)
            .set(hirYn).equalToWhenPresent(row::getHirYn)
            .set(ucdDesc).equalToWhenPresent(row::getUcdDesc)
            .where(plntCd, isEqualTo(row::getPlntCd))
            .and(ucdHir, isEqualTo(row::getUcdHir))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyUcdHir> insertStatement);
}