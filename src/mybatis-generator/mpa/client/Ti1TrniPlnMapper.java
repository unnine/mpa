package mpa.client;

import static mpa.client.Ti1TrniPlnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ti1TrniPln;
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

public interface Ti1TrniPlnMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(trniPlnIdx, anuTrniDtlIdx, sysVerCd, tracIdx, modlTracIdx, plntCd, qmsMngNo, docNo, trniProc, modlDivCd, reqDptCd, reqUid, modlDivEtc, trnrElamIdx, trniUid, trniTit, trniExpStrDt, trniExpEndDt, udtIp, udtDs, udtUid, plnAprIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ti1TrniPlnResult", value = {
        @Result(column="TRNI_PLN_IDX", property="trniPlnIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="ANU_TRNI_DTL_IDX", property="anuTrniDtlIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="MODL_TRAC_IDX", property="modlTracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_PROC", property="trniProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_DIV_CD", property="modlDivCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQ_DPT_CD", property="reqDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQ_UID", property="reqUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_DIV_ETC", property="modlDivEtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNR_ELAM_IDX", property="trnrElamIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRNI_UID", property="trniUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_TIT", property="trniTit", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_EXP_STR_DT", property="trniExpStrDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_EXP_END_DT", property="trniExpEndDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLN_APR_IDX", property="plnAprIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Ti1TrniPln> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ti1TrniPlnResult")
    Optional<Ti1TrniPln> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ti1TrniPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ti1TrniPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short trniPlnIdx_) {
        return delete(c -> 
            c.where(trniPlnIdx, isEqualTo(trniPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ti1TrniPln row) {
        return MyBatis3Utils.insert(this::insert, row, ti1TrniPln, c ->
            c.map(trniPlnIdx).toProperty("trniPlnIdx")
            .map(anuTrniDtlIdx).toProperty("anuTrniDtlIdx")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(tracIdx).toProperty("tracIdx")
            .map(modlTracIdx).toProperty("modlTracIdx")
            .map(plntCd).toProperty("plntCd")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(trniProc).toProperty("trniProc")
            .map(modlDivCd).toProperty("modlDivCd")
            .map(reqDptCd).toProperty("reqDptCd")
            .map(reqUid).toProperty("reqUid")
            .map(modlDivEtc).toProperty("modlDivEtc")
            .map(trnrElamIdx).toProperty("trnrElamIdx")
            .map(trniUid).toProperty("trniUid")
            .map(trniTit).toProperty("trniTit")
            .map(trniExpStrDt).toProperty("trniExpStrDt")
            .map(trniExpEndDt).toProperty("trniExpEndDt")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(plnAprIdx).toProperty("plnAprIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1TrniPln> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ti1TrniPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ti1TrniPln> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ti1TrniPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1TrniPln> findById(Short trniPlnIdx_) {
        return findOne(c ->
            c.where(trniPlnIdx, isEqualTo(trniPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ti1TrniPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ti1TrniPln row) {
        return update(c ->
            c.set(anuTrniDtlIdx).equalToWhenPresent(row::getAnuTrniDtlIdx)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(modlTracIdx).equalToWhenPresent(row::getModlTracIdx)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(trniProc).equalToWhenPresent(row::getTrniProc)
            .set(modlDivCd).equalToWhenPresent(row::getModlDivCd)
            .set(reqDptCd).equalToWhenPresent(row::getReqDptCd)
            .set(reqUid).equalToWhenPresent(row::getReqUid)
            .set(modlDivEtc).equalToWhenPresent(row::getModlDivEtc)
            .set(trnrElamIdx).equalToWhenPresent(row::getTrnrElamIdx)
            .set(trniUid).equalToWhenPresent(row::getTrniUid)
            .set(trniTit).equalToWhenPresent(row::getTrniTit)
            .set(trniExpStrDt).equalToWhenPresent(row::getTrniExpStrDt)
            .set(trniExpEndDt).equalToWhenPresent(row::getTrniExpEndDt)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(plnAprIdx).equalToWhenPresent(row::getPlnAprIdx)
            .where(trniPlnIdx, isEqualTo(row::getTrniPlnIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ti1TrniPln> insertStatement);
}