package mpa.client;

import static mpa.client.Os2OosPhs2IvstIvgaDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Os2OosPhs2IvstIvga;
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

public interface Os2OosPhs2IvstIvgaMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(oosPhs2IvstIvgaIdx, oosPhs2IvstIdx, ivgaIdx, ivgaAns, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Os2OosPhs2IvstIvgaResult", value = {
        @Result(column="OOS_PHS2_IVST_IVGA_IDX", property="oosPhs2IvstIvgaIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="OOS_PHS2_IVST_IDX", property="oosPhs2IvstIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="IVGA_IDX", property="ivgaIdx", jdbcType=JdbcType.VARCHAR),
        @Result(column="IVGA_ANS", property="ivgaAns", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Os2OosPhs2IvstIvga> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Os2OosPhs2IvstIvgaResult")
    Optional<Os2OosPhs2IvstIvga> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, os2OosPhs2IvstIvga, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, os2OosPhs2IvstIvga, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short oosPhs2IvstIvgaIdx_) {
        return delete(c -> 
            c.where(oosPhs2IvstIvgaIdx, isEqualTo(oosPhs2IvstIvgaIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Os2OosPhs2IvstIvga row) {
        return MyBatis3Utils.insert(this::insert, row, os2OosPhs2IvstIvga, c ->
            c.map(oosPhs2IvstIvgaIdx).toProperty("oosPhs2IvstIvgaIdx")
            .map(oosPhs2IvstIdx).toProperty("oosPhs2IvstIdx")
            .map(ivgaIdx).toProperty("ivgaIdx")
            .map(ivgaAns).toProperty("ivgaAns")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs2IvstIvga> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, os2OosPhs2IvstIvga, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Os2OosPhs2IvstIvga> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, os2OosPhs2IvstIvga, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs2IvstIvga> findById(Short oosPhs2IvstIvgaIdx_) {
        return findOne(c ->
            c.where(oosPhs2IvstIvgaIdx, isEqualTo(oosPhs2IvstIvgaIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, os2OosPhs2IvstIvga, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Os2OosPhs2IvstIvga row) {
        return update(c ->
            c.set(oosPhs2IvstIdx).equalToWhenPresent(row::getOosPhs2IvstIdx)
            .set(ivgaIdx).equalToWhenPresent(row::getIvgaIdx)
            .set(ivgaAns).equalToWhenPresent(row::getIvgaAns)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(oosPhs2IvstIvgaIdx, isEqualTo(row::getOosPhs2IvstIvgaIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Os2OosPhs2IvstIvga> insertStatement);
}