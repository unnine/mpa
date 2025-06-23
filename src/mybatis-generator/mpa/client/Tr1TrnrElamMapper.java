package mpa.client;

import static mpa.client.Tr1TrnrElamDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Tr1TrnrElam;
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

public interface Tr1TrnrElamMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(trnrElamIdx, hirTrnrElamIdx, plntCd, rvsNo, qmsMngNo, docNo, trnrElamAprIdx, trnrElamProc, trnrDptNm, trnrElamYn, rmk, trnrUid, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, fileIdx, delYn, sysVerCd, rvsYn, rvsRea, rvsDs, useYn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Tr1TrnrElamResult", value = {
        @Result(column="TRNR_ELAM_IDX", property="trnrElamIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="HIR_TRNR_ELAM_IDX", property="hirTrnrElamIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_NO", property="rvsNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNR_ELAM_APR_IDX", property="trnrElamAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRNR_ELAM_PROC", property="trnrElamProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNR_DPT_NM", property="trnrDptNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNR_ELAM_YN", property="trnrElamYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNR_UID", property="trnrUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_YN", property="rvsYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_REA", property="rvsRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_DS", property="rvsDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR)
    })
    List<Tr1TrnrElam> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Tr1TrnrElamResult")
    Optional<Tr1TrnrElam> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tr1TrnrElam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tr1TrnrElam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short trnrElamIdx_) {
        return delete(c -> 
            c.where(trnrElamIdx, isEqualTo(trnrElamIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Tr1TrnrElam row) {
        return MyBatis3Utils.insert(this::insert, row, tr1TrnrElam, c ->
            c.map(trnrElamIdx).toProperty("trnrElamIdx")
            .map(hirTrnrElamIdx).toProperty("hirTrnrElamIdx")
            .map(plntCd).toProperty("plntCd")
            .map(rvsNo).toProperty("rvsNo")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(trnrElamAprIdx).toProperty("trnrElamAprIdx")
            .map(trnrElamProc).toProperty("trnrElamProc")
            .map(trnrDptNm).toProperty("trnrDptNm")
            .map(trnrElamYn).toProperty("trnrElamYn")
            .map(rmk).toProperty("rmk")
            .map(trnrUid).toProperty("trnrUid")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(fileIdx).toProperty("fileIdx")
            .map(delYn).toProperty("delYn")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(rvsYn).toProperty("rvsYn")
            .map(rvsRea).toProperty("rvsRea")
            .map(rvsDs).toProperty("rvsDs")
            .map(useYn).toProperty("useYn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Tr1TrnrElam> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, tr1TrnrElam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Tr1TrnrElam> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, tr1TrnrElam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Tr1TrnrElam> findById(Short trnrElamIdx_) {
        return findOne(c ->
            c.where(trnrElamIdx, isEqualTo(trnrElamIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tr1TrnrElam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Tr1TrnrElam row) {
        return update(c ->
            c.set(hirTrnrElamIdx).equalToWhenPresent(row::getHirTrnrElamIdx)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(rvsNo).equalToWhenPresent(row::getRvsNo)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(trnrElamAprIdx).equalToWhenPresent(row::getTrnrElamAprIdx)
            .set(trnrElamProc).equalToWhenPresent(row::getTrnrElamProc)
            .set(trnrDptNm).equalToWhenPresent(row::getTrnrDptNm)
            .set(trnrElamYn).equalToWhenPresent(row::getTrnrElamYn)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(trnrUid).equalToWhenPresent(row::getTrnrUid)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(rvsYn).equalToWhenPresent(row::getRvsYn)
            .set(rvsRea).equalToWhenPresent(row::getRvsRea)
            .set(rvsDs).equalToWhenPresent(row::getRvsDs)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .where(trnrElamIdx, isEqualTo(row::getTrnrElamIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Tr1TrnrElam> insertStatement);
}