package mpa.client;

import static mpa.client.Cg2ChgEnfoAtcDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cg2ChgEnfoAtc;
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

public interface Cg2ChgEnfoAtcMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(chgEnfoAtcIdx, chgEnfoIdx, chgEnfoAtc, chgEnfoAtcCtt, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cg2ChgEnfoAtcResult", value = {
        @Result(column="CHG_ENFO_ATC_IDX", property="chgEnfoAtcIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CHG_ENFO_IDX", property="chgEnfoIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CHG_ENFO_ATC", property="chgEnfoAtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_ENFO_ATC_CTT", property="chgEnfoAtcCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Cg2ChgEnfoAtc> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cg2ChgEnfoAtcResult")
    Optional<Cg2ChgEnfoAtc> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cg2ChgEnfoAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cg2ChgEnfoAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short chgEnfoAtcIdx_) {
        return delete(c -> 
            c.where(chgEnfoAtcIdx, isEqualTo(chgEnfoAtcIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cg2ChgEnfoAtc row) {
        return MyBatis3Utils.insert(this::insert, row, cg2ChgEnfoAtc, c ->
            c.map(chgEnfoAtcIdx).toProperty("chgEnfoAtcIdx")
            .map(chgEnfoIdx).toProperty("chgEnfoIdx")
            .map(chgEnfoAtc).toProperty("chgEnfoAtc")
            .map(chgEnfoAtcCtt).toProperty("chgEnfoAtcCtt")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgEnfoAtc> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cg2ChgEnfoAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cg2ChgEnfoAtc> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cg2ChgEnfoAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgEnfoAtc> findById(Short chgEnfoAtcIdx_) {
        return findOne(c ->
            c.where(chgEnfoAtcIdx, isEqualTo(chgEnfoAtcIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cg2ChgEnfoAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cg2ChgEnfoAtc row) {
        return update(c ->
            c.set(chgEnfoIdx).equalToWhenPresent(row::getChgEnfoIdx)
            .set(chgEnfoAtc).equalToWhenPresent(row::getChgEnfoAtc)
            .set(chgEnfoAtcCtt).equalToWhenPresent(row::getChgEnfoAtcCtt)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(chgEnfoAtcIdx, isEqualTo(row::getChgEnfoAtcIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cg2ChgEnfoAtc> insertStatement);
}