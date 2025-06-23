package mpa.client;

import static mpa.client.Ti1AnuTrniPlnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ti1AnuTrniPln;
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

public interface Ti1AnuTrniPlnMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(anuTrniPlnIdx, hirAnuTrniPlnIdx, rvsNo, rvsYn, rvsRea, rvsDs, sysVerCd, tracIdx, plntCd, qmsMngNo, docNo, anuTrniPlnAprIdx, anuTrniPlnProc, anuTrniTit, trniTypCd, trniDptCd, plnYr, fileIdx, fileCtt, delYn, anuTrniRstAprIdx, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, techPlnYn, modlTracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ti1AnuTrniPlnResult", value = {
        @Result(column="ANU_TRNI_PLN_IDX", property="anuTrniPlnIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="HIR_ANU_TRNI_PLN_IDX", property="hirAnuTrniPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RVS_NO", property="rvsNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_YN", property="rvsYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_REA", property="rvsRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_DS", property="rvsDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="ANU_TRNI_PLN_APR_IDX", property="anuTrniPlnAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="ANU_TRNI_PLN_PROC", property="anuTrniPlnProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ANU_TRNI_TIT", property="anuTrniTit", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_TYP_CD", property="trniTypCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_DPT_CD", property="trniDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLN_YR", property="plnYr", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="FILE_CTT", property="fileCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ANU_TRNI_RST_APR_IDX", property="anuTrniRstAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="TECH_PLN_YN", property="techPlnYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_TRAC_IDX", property="modlTracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Ti1AnuTrniPln> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ti1AnuTrniPlnResult")
    Optional<Ti1AnuTrniPln> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ti1AnuTrniPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ti1AnuTrniPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short anuTrniPlnIdx_) {
        return delete(c -> 
            c.where(anuTrniPlnIdx, isEqualTo(anuTrniPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ti1AnuTrniPln row) {
        return MyBatis3Utils.insert(this::insert, row, ti1AnuTrniPln, c ->
            c.map(anuTrniPlnIdx).toProperty("anuTrniPlnIdx")
            .map(hirAnuTrniPlnIdx).toProperty("hirAnuTrniPlnIdx")
            .map(rvsNo).toProperty("rvsNo")
            .map(rvsYn).toProperty("rvsYn")
            .map(rvsRea).toProperty("rvsRea")
            .map(rvsDs).toProperty("rvsDs")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(tracIdx).toProperty("tracIdx")
            .map(plntCd).toProperty("plntCd")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(anuTrniPlnAprIdx).toProperty("anuTrniPlnAprIdx")
            .map(anuTrniPlnProc).toProperty("anuTrniPlnProc")
            .map(anuTrniTit).toProperty("anuTrniTit")
            .map(trniTypCd).toProperty("trniTypCd")
            .map(trniDptCd).toProperty("trniDptCd")
            .map(plnYr).toProperty("plnYr")
            .map(fileIdx).toProperty("fileIdx")
            .map(fileCtt).toProperty("fileCtt")
            .map(delYn).toProperty("delYn")
            .map(anuTrniRstAprIdx).toProperty("anuTrniRstAprIdx")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(techPlnYn).toProperty("techPlnYn")
            .map(modlTracIdx).toProperty("modlTracIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1AnuTrniPln> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ti1AnuTrniPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ti1AnuTrniPln> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ti1AnuTrniPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1AnuTrniPln> findById(Short anuTrniPlnIdx_) {
        return findOne(c ->
            c.where(anuTrniPlnIdx, isEqualTo(anuTrniPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ti1AnuTrniPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ti1AnuTrniPln row) {
        return update(c ->
            c.set(hirAnuTrniPlnIdx).equalToWhenPresent(row::getHirAnuTrniPlnIdx)
            .set(rvsNo).equalToWhenPresent(row::getRvsNo)
            .set(rvsYn).equalToWhenPresent(row::getRvsYn)
            .set(rvsRea).equalToWhenPresent(row::getRvsRea)
            .set(rvsDs).equalToWhenPresent(row::getRvsDs)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(anuTrniPlnAprIdx).equalToWhenPresent(row::getAnuTrniPlnAprIdx)
            .set(anuTrniPlnProc).equalToWhenPresent(row::getAnuTrniPlnProc)
            .set(anuTrniTit).equalToWhenPresent(row::getAnuTrniTit)
            .set(trniTypCd).equalToWhenPresent(row::getTrniTypCd)
            .set(trniDptCd).equalToWhenPresent(row::getTrniDptCd)
            .set(plnYr).equalToWhenPresent(row::getPlnYr)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(fileCtt).equalToWhenPresent(row::getFileCtt)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(anuTrniRstAprIdx).equalToWhenPresent(row::getAnuTrniRstAprIdx)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(techPlnYn).equalToWhenPresent(row::getTechPlnYn)
            .set(modlTracIdx).equalToWhenPresent(row::getModlTracIdx)
            .where(anuTrniPlnIdx, isEqualTo(row::getAnuTrniPlnIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ti1AnuTrniPln> insertStatement);
}