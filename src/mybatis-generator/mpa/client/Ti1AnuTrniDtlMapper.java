package mpa.client;

import static mpa.client.Ti1AnuTrniDtlDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ti1AnuTrniDtl;
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

public interface Ti1AnuTrniDtlMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(anuTrniDtlIdx, anuTrniPlnIdx, trniUid, trnrElamIdx, trniExpStrDt, trniExpEndDt, trniTit, trniPrgYn, rmk, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ti1AnuTrniDtlResult", value = {
        @Result(column="ANU_TRNI_DTL_IDX", property="anuTrniDtlIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="ANU_TRNI_PLN_IDX", property="anuTrniPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRNI_UID", property="trniUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNR_ELAM_IDX", property="trnrElamIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRNI_EXP_STR_DT", property="trniExpStrDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_EXP_END_DT", property="trniExpEndDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_TIT", property="trniTit", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_PRG_YN", property="trniPrgYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Ti1AnuTrniDtl> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ti1AnuTrniDtlResult")
    Optional<Ti1AnuTrniDtl> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ti1AnuTrniDtl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ti1AnuTrniDtl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short anuTrniDtlIdx_) {
        return delete(c -> 
            c.where(anuTrniDtlIdx, isEqualTo(anuTrniDtlIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ti1AnuTrniDtl row) {
        return MyBatis3Utils.insert(this::insert, row, ti1AnuTrniDtl, c ->
            c.map(anuTrniDtlIdx).toProperty("anuTrniDtlIdx")
            .map(anuTrniPlnIdx).toProperty("anuTrniPlnIdx")
            .map(trniUid).toProperty("trniUid")
            .map(trnrElamIdx).toProperty("trnrElamIdx")
            .map(trniExpStrDt).toProperty("trniExpStrDt")
            .map(trniExpEndDt).toProperty("trniExpEndDt")
            .map(trniTit).toProperty("trniTit")
            .map(trniPrgYn).toProperty("trniPrgYn")
            .map(rmk).toProperty("rmk")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1AnuTrniDtl> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ti1AnuTrniDtl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ti1AnuTrniDtl> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ti1AnuTrniDtl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1AnuTrniDtl> findById(Short anuTrniDtlIdx_) {
        return findOne(c ->
            c.where(anuTrniDtlIdx, isEqualTo(anuTrniDtlIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ti1AnuTrniDtl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ti1AnuTrniDtl row) {
        return update(c ->
            c.set(anuTrniPlnIdx).equalToWhenPresent(row::getAnuTrniPlnIdx)
            .set(trniUid).equalToWhenPresent(row::getTrniUid)
            .set(trnrElamIdx).equalToWhenPresent(row::getTrnrElamIdx)
            .set(trniExpStrDt).equalToWhenPresent(row::getTrniExpStrDt)
            .set(trniExpEndDt).equalToWhenPresent(row::getTrniExpEndDt)
            .set(trniTit).equalToWhenPresent(row::getTrniTit)
            .set(trniPrgYn).equalToWhenPresent(row::getTrniPrgYn)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(anuTrniDtlIdx, isEqualTo(row::getAnuTrniDtlIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ti1AnuTrniDtl> insertStatement);
}