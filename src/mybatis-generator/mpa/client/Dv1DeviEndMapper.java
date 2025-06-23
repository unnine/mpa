package mpa.client;

import static mpa.client.Dv1DeviEndDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Dv1DeviEnd;
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

public interface Dv1DeviEndMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(deviEndIdx, deviOcrpIdx, tracIdx, deviEndAprIdx, rmk, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Dv1DeviEndResult", value = {
        @Result(column="DEVI_END_IDX", property="deviEndIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="DEVI_OCRP_IDX", property="deviOcrpIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEVI_END_APR_IDX", property="deviEndAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Dv1DeviEnd> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Dv1DeviEndResult")
    Optional<Dv1DeviEnd> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dv1DeviEnd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dv1DeviEnd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short deviEndIdx_) {
        return delete(c -> 
            c.where(deviEndIdx, isEqualTo(deviEndIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Dv1DeviEnd row) {
        return MyBatis3Utils.insert(this::insert, row, dv1DeviEnd, c ->
            c.map(deviEndIdx).toProperty("deviEndIdx")
            .map(deviOcrpIdx).toProperty("deviOcrpIdx")
            .map(tracIdx).toProperty("tracIdx")
            .map(deviEndAprIdx).toProperty("deviEndAprIdx")
            .map(rmk).toProperty("rmk")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Dv1DeviEnd> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, dv1DeviEnd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Dv1DeviEnd> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, dv1DeviEnd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Dv1DeviEnd> findById(Short deviEndIdx_) {
        return findOne(c ->
            c.where(deviEndIdx, isEqualTo(deviEndIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dv1DeviEnd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Dv1DeviEnd row) {
        return update(c ->
            c.set(deviOcrpIdx).equalToWhenPresent(row::getDeviOcrpIdx)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(deviEndAprIdx).equalToWhenPresent(row::getDeviEndAprIdx)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(deviEndIdx, isEqualTo(row::getDeviEndIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Dv1DeviEnd> insertStatement);
}