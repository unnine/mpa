package mpa.client;

import static mpa.client.Cg2ChgCplAtcDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cg2ChgCplAtc;
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

public interface Cg2ChgCplAtcMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(chgCplAtcIdx, chgCplIdx, chgCplAtc, chgCplAtcCtt, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cg2ChgCplAtcResult", value = {
        @Result(column="CHG_CPL_ATC_IDX", property="chgCplAtcIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CHG_CPL_IDX", property="chgCplIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CHG_CPL_ATC", property="chgCplAtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_CPL_ATC_CTT", property="chgCplAtcCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Cg2ChgCplAtc> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cg2ChgCplAtcResult")
    Optional<Cg2ChgCplAtc> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cg2ChgCplAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cg2ChgCplAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short chgCplAtcIdx_) {
        return delete(c -> 
            c.where(chgCplAtcIdx, isEqualTo(chgCplAtcIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cg2ChgCplAtc row) {
        return MyBatis3Utils.insert(this::insert, row, cg2ChgCplAtc, c ->
            c.map(chgCplAtcIdx).toProperty("chgCplAtcIdx")
            .map(chgCplIdx).toProperty("chgCplIdx")
            .map(chgCplAtc).toProperty("chgCplAtc")
            .map(chgCplAtcCtt).toProperty("chgCplAtcCtt")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgCplAtc> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cg2ChgCplAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cg2ChgCplAtc> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cg2ChgCplAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgCplAtc> findById(Short chgCplAtcIdx_) {
        return findOne(c ->
            c.where(chgCplAtcIdx, isEqualTo(chgCplAtcIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cg2ChgCplAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cg2ChgCplAtc row) {
        return update(c ->
            c.set(chgCplIdx).equalToWhenPresent(row::getChgCplIdx)
            .set(chgCplAtc).equalToWhenPresent(row::getChgCplAtc)
            .set(chgCplAtcCtt).equalToWhenPresent(row::getChgCplAtcCtt)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(chgCplAtcIdx, isEqualTo(row::getChgCplAtcIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cg2ChgCplAtc> insertStatement);
}