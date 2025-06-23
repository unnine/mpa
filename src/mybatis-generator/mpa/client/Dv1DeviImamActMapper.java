package mpa.client;

import static mpa.client.Dv1DeviImamActDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Dv1DeviImamAct;
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

public interface Dv1DeviImamActMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(deviImamActIdx, deviImamIdx, crgDptCd, crgUid, act, rst, udtIp, udtDs, udtUid, ord, delYn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Dv1DeviImamActResult", value = {
        @Result(column="DEVI_IMAM_ACT_IDX", property="deviImamActIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="DEVI_IMAM_IDX", property="deviImamIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRG_DPT_CD", property="crgDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRG_UID", property="crgUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACT", property="act", jdbcType=JdbcType.VARCHAR),
        @Result(column="RST", property="rst", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR)
    })
    List<Dv1DeviImamAct> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Dv1DeviImamActResult")
    Optional<Dv1DeviImamAct> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dv1DeviImamAct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dv1DeviImamAct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short deviImamActIdx_) {
        return delete(c -> 
            c.where(deviImamActIdx, isEqualTo(deviImamActIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Dv1DeviImamAct row) {
        return MyBatis3Utils.insert(this::insert, row, dv1DeviImamAct, c ->
            c.map(deviImamActIdx).toProperty("deviImamActIdx")
            .map(deviImamIdx).toProperty("deviImamIdx")
            .map(crgDptCd).toProperty("crgDptCd")
            .map(crgUid).toProperty("crgUid")
            .map(act).toProperty("act")
            .map(rst).toProperty("rst")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(ord).toProperty("ord")
            .map(delYn).toProperty("delYn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Dv1DeviImamAct> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, dv1DeviImamAct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Dv1DeviImamAct> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, dv1DeviImamAct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Dv1DeviImamAct> findById(Short deviImamActIdx_) {
        return findOne(c ->
            c.where(deviImamActIdx, isEqualTo(deviImamActIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dv1DeviImamAct, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Dv1DeviImamAct row) {
        return update(c ->
            c.set(deviImamIdx).equalToWhenPresent(row::getDeviImamIdx)
            .set(crgDptCd).equalToWhenPresent(row::getCrgDptCd)
            .set(crgUid).equalToWhenPresent(row::getCrgUid)
            .set(act).equalToWhenPresent(row::getAct)
            .set(rst).equalToWhenPresent(row::getRst)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .where(deviImamActIdx, isEqualTo(row::getDeviImamActIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Dv1DeviImamAct> insertStatement);
}