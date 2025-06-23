package mpa.client;

import static mpa.client.At1AdtrElamDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.At1AdtrElam;
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

public interface At1AdtrElamMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(adtrElamIdx, hirAdtrElamIdx, rvsNo, rvsYn, rvsRea, rvsDs, sysVerCd, plntCd, qmsMngNo, adtrUid, adtrDptNm, adtrElamAprIdx, adtrElamProc, trniNo, elamDt, trniCplCosYn, testScr1st, testScr2st, rmk, adtrElamYn, fileIdx, delYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, useYn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="At1AdtrElamResult", value = {
        @Result(column="ADTR_ELAM_IDX", property="adtrElamIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="HIR_ADTR_ELAM_IDX", property="hirAdtrElamIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RVS_NO", property="rvsNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_YN", property="rvsYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_REA", property="rvsRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_DS", property="rvsDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADTR_UID", property="adtrUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADTR_DPT_NM", property="adtrDptNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADTR_ELAM_APR_IDX", property="adtrElamAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="ADTR_ELAM_PROC", property="adtrElamProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_NO", property="trniNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="ELAM_DT", property="elamDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_CPL_COS_YN", property="trniCplCosYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEST_SCR_1ST", property="testScr1st", jdbcType=JdbcType.NUMERIC),
        @Result(column="TEST_SCR_2ST", property="testScr2st", jdbcType=JdbcType.NUMERIC),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADTR_ELAM_YN", property="adtrElamYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR)
    })
    List<At1AdtrElam> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("At1AdtrElamResult")
    Optional<At1AdtrElam> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, at1AdtrElam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, at1AdtrElam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short adtrElamIdx_) {
        return delete(c -> 
            c.where(adtrElamIdx, isEqualTo(adtrElamIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(At1AdtrElam row) {
        return MyBatis3Utils.insert(this::insert, row, at1AdtrElam, c ->
            c.map(adtrElamIdx).toProperty("adtrElamIdx")
            .map(hirAdtrElamIdx).toProperty("hirAdtrElamIdx")
            .map(rvsNo).toProperty("rvsNo")
            .map(rvsYn).toProperty("rvsYn")
            .map(rvsRea).toProperty("rvsRea")
            .map(rvsDs).toProperty("rvsDs")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(plntCd).toProperty("plntCd")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(adtrUid).toProperty("adtrUid")
            .map(adtrDptNm).toProperty("adtrDptNm")
            .map(adtrElamAprIdx).toProperty("adtrElamAprIdx")
            .map(adtrElamProc).toProperty("adtrElamProc")
            .map(trniNo).toProperty("trniNo")
            .map(elamDt).toProperty("elamDt")
            .map(trniCplCosYn).toProperty("trniCplCosYn")
            .map(testScr1st).toProperty("testScr1st")
            .map(testScr2st).toProperty("testScr2st")
            .map(rmk).toProperty("rmk")
            .map(adtrElamYn).toProperty("adtrElamYn")
            .map(fileIdx).toProperty("fileIdx")
            .map(delYn).toProperty("delYn")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(useYn).toProperty("useYn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<At1AdtrElam> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, at1AdtrElam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<At1AdtrElam> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, at1AdtrElam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<At1AdtrElam> findById(Short adtrElamIdx_) {
        return findOne(c ->
            c.where(adtrElamIdx, isEqualTo(adtrElamIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, at1AdtrElam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(At1AdtrElam row) {
        return update(c ->
            c.set(hirAdtrElamIdx).equalToWhenPresent(row::getHirAdtrElamIdx)
            .set(rvsNo).equalToWhenPresent(row::getRvsNo)
            .set(rvsYn).equalToWhenPresent(row::getRvsYn)
            .set(rvsRea).equalToWhenPresent(row::getRvsRea)
            .set(rvsDs).equalToWhenPresent(row::getRvsDs)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(adtrUid).equalToWhenPresent(row::getAdtrUid)
            .set(adtrDptNm).equalToWhenPresent(row::getAdtrDptNm)
            .set(adtrElamAprIdx).equalToWhenPresent(row::getAdtrElamAprIdx)
            .set(adtrElamProc).equalToWhenPresent(row::getAdtrElamProc)
            .set(trniNo).equalToWhenPresent(row::getTrniNo)
            .set(elamDt).equalToWhenPresent(row::getElamDt)
            .set(trniCplCosYn).equalToWhenPresent(row::getTrniCplCosYn)
            .set(testScr1st).equalToWhenPresent(row::getTestScr1st)
            .set(testScr2st).equalToWhenPresent(row::getTestScr2st)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(adtrElamYn).equalToWhenPresent(row::getAdtrElamYn)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .where(adtrElamIdx, isEqualTo(row::getAdtrElamIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<At1AdtrElam> insertStatement);
}