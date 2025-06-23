package mpa.client;

import static mpa.client.SyEaprLineInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyEaprLineInfo;
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

public interface SyEaprLineInfoMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(eaprLineInfoIdx, eaprLineIdx, eaprReqDiv, aprDegr, ncsYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, eaprUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyEaprLineInfoResult", value = {
        @Result(column="EAPR_LINE_INFO_IDX", property="eaprLineInfoIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="EAPR_LINE_IDX", property="eaprLineIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="EAPR_REQ_DIV", property="eaprReqDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="APR_DEGR", property="aprDegr", jdbcType=JdbcType.NUMERIC),
        @Result(column="NCS_YN", property="ncsYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="EAPR_UID", property="eaprUid", jdbcType=JdbcType.VARCHAR)
    })
    List<SyEaprLineInfo> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyEaprLineInfoResult")
    Optional<SyEaprLineInfo> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syEaprLineInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syEaprLineInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short eaprLineInfoIdx_) {
        return delete(c -> 
            c.where(eaprLineInfoIdx, isEqualTo(eaprLineInfoIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyEaprLineInfo row) {
        return MyBatis3Utils.insert(this::insert, row, syEaprLineInfo, c ->
            c.map(eaprLineInfoIdx).toProperty("eaprLineInfoIdx")
            .map(eaprLineIdx).toProperty("eaprLineIdx")
            .map(eaprReqDiv).toProperty("eaprReqDiv")
            .map(aprDegr).toProperty("aprDegr")
            .map(ncsYn).toProperty("ncsYn")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(eaprUid).toProperty("eaprUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyEaprLineInfo> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syEaprLineInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyEaprLineInfo> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syEaprLineInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyEaprLineInfo> findById(Short eaprLineInfoIdx_) {
        return findOne(c ->
            c.where(eaprLineInfoIdx, isEqualTo(eaprLineInfoIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syEaprLineInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyEaprLineInfo row) {
        return update(c ->
            c.set(eaprLineIdx).equalToWhenPresent(row::getEaprLineIdx)
            .set(eaprReqDiv).equalToWhenPresent(row::getEaprReqDiv)
            .set(aprDegr).equalToWhenPresent(row::getAprDegr)
            .set(ncsYn).equalToWhenPresent(row::getNcsYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(eaprUid).equalToWhenPresent(row::getEaprUid)
            .where(eaprLineInfoIdx, isEqualTo(row::getEaprLineInfoIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyEaprLineInfo> insertStatement);
}