package mpa.client;

import static mpa.client.SyScdHirDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyScdHir;
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

public interface SyScdHirMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(scdHir, hirNm, hirOrd, hirUseYn, scdDesc, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyScdHirResult", value = {
        @Result(column="SCD_HIR", property="scdHir", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="HIR_NM", property="hirNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="HIR_ORD", property="hirOrd", jdbcType=JdbcType.NUMERIC),
        @Result(column="HIR_USE_YN", property="hirUseYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="SCD_DESC", property="scdDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<SyScdHir> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyScdHirResult")
    Optional<SyScdHir> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syScdHir, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syScdHir, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String scdHir_) {
        return delete(c -> 
            c.where(scdHir, isEqualTo(scdHir_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyScdHir row) {
        return MyBatis3Utils.insert(this::insert, row, syScdHir, c ->
            c.map(scdHir).toProperty("scdHir")
            .map(hirNm).toProperty("hirNm")
            .map(hirOrd).toProperty("hirOrd")
            .map(hirUseYn).toProperty("hirUseYn")
            .map(scdDesc).toProperty("scdDesc")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyScdHir> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syScdHir, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyScdHir> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syScdHir, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyScdHir> findById(String scdHir_) {
        return findOne(c ->
            c.where(scdHir, isEqualTo(scdHir_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syScdHir, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyScdHir row) {
        return update(c ->
            c.set(hirNm).equalToWhenPresent(row::getHirNm)
            .set(hirOrd).equalToWhenPresent(row::getHirOrd)
            .set(hirUseYn).equalToWhenPresent(row::getHirUseYn)
            .set(scdDesc).equalToWhenPresent(row::getScdDesc)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(scdHir, isEqualTo(row::getScdHir))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyScdHir> insertStatement);
}