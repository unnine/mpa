package mpa.client;

import static mpa.client.DcDocDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.DcDoc;
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

public interface DcDocMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(docIdx, hirDocIdx, docClfIdx, plntCd, docNm, docNmEn, docWrtUid, docWrtDptCd, enmDt, enfoDt, expDt, openYn, kwd, dpsDt, dpsRea, docRmk, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, fileIdx, sysVerCd, rvsNo, rvsYn, rvsDt, rvsRea, rvsSumr, qmsMngNo, useYn, delYn, docAprReqidx, docPrgs);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DcDocResult", value = {
        @Result(column="DOC_IDX", property="docIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="HIR_DOC_IDX", property="hirDocIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DOC_CLF_IDX", property="docClfIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NM", property="docNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NM_EN", property="docNmEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_WRT_UID", property="docWrtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_WRT_DPT_CD", property="docWrtDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENM_DT", property="enmDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENFO_DT", property="enfoDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXP_DT", property="expDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="OPEN_YN", property="openYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="KWD", property="kwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="DPS_DT", property="dpsDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="DPS_REA", property="dpsRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_RMK", property="docRmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_NO", property="rvsNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_YN", property="rvsYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_DT", property="rvsDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_REA", property="rvsRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_SUMR", property="rvsSumr", jdbcType=JdbcType.VARCHAR),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_APR_REQIDX", property="docAprReqidx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DOC_PRGS", property="docPrgs", jdbcType=JdbcType.VARCHAR)
    })
    List<DcDoc> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DcDocResult")
    Optional<DcDoc> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dcDoc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dcDoc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short docIdx_) {
        return delete(c -> 
            c.where(docIdx, isEqualTo(docIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(DcDoc row) {
        return MyBatis3Utils.insert(this::insert, row, dcDoc, c ->
            c.map(docIdx).toProperty("docIdx")
            .map(hirDocIdx).toProperty("hirDocIdx")
            .map(docClfIdx).toProperty("docClfIdx")
            .map(plntCd).toProperty("plntCd")
            .map(docNm).toProperty("docNm")
            .map(docNmEn).toProperty("docNmEn")
            .map(docWrtUid).toProperty("docWrtUid")
            .map(docWrtDptCd).toProperty("docWrtDptCd")
            .map(enmDt).toProperty("enmDt")
            .map(enfoDt).toProperty("enfoDt")
            .map(expDt).toProperty("expDt")
            .map(openYn).toProperty("openYn")
            .map(kwd).toProperty("kwd")
            .map(dpsDt).toProperty("dpsDt")
            .map(dpsRea).toProperty("dpsRea")
            .map(docRmk).toProperty("docRmk")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(fileIdx).toProperty("fileIdx")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(rvsNo).toProperty("rvsNo")
            .map(rvsYn).toProperty("rvsYn")
            .map(rvsDt).toProperty("rvsDt")
            .map(rvsRea).toProperty("rvsRea")
            .map(rvsSumr).toProperty("rvsSumr")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(useYn).toProperty("useYn")
            .map(delYn).toProperty("delYn")
            .map(docAprReqidx).toProperty("docAprReqidx")
            .map(docPrgs).toProperty("docPrgs")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DcDoc> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, dcDoc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<DcDoc> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, dcDoc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DcDoc> findById(Short docIdx_) {
        return findOne(c ->
            c.where(docIdx, isEqualTo(docIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dcDoc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(DcDoc row) {
        return update(c ->
            c.set(hirDocIdx).equalToWhenPresent(row::getHirDocIdx)
            .set(docClfIdx).equalToWhenPresent(row::getDocClfIdx)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(docNm).equalToWhenPresent(row::getDocNm)
            .set(docNmEn).equalToWhenPresent(row::getDocNmEn)
            .set(docWrtUid).equalToWhenPresent(row::getDocWrtUid)
            .set(docWrtDptCd).equalToWhenPresent(row::getDocWrtDptCd)
            .set(enmDt).equalToWhenPresent(row::getEnmDt)
            .set(enfoDt).equalToWhenPresent(row::getEnfoDt)
            .set(expDt).equalToWhenPresent(row::getExpDt)
            .set(openYn).equalToWhenPresent(row::getOpenYn)
            .set(kwd).equalToWhenPresent(row::getKwd)
            .set(dpsDt).equalToWhenPresent(row::getDpsDt)
            .set(dpsRea).equalToWhenPresent(row::getDpsRea)
            .set(docRmk).equalToWhenPresent(row::getDocRmk)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(rvsNo).equalToWhenPresent(row::getRvsNo)
            .set(rvsYn).equalToWhenPresent(row::getRvsYn)
            .set(rvsDt).equalToWhenPresent(row::getRvsDt)
            .set(rvsRea).equalToWhenPresent(row::getRvsRea)
            .set(rvsSumr).equalToWhenPresent(row::getRvsSumr)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(docAprReqidx).equalToWhenPresent(row::getDocAprReqidx)
            .set(docPrgs).equalToWhenPresent(row::getDocPrgs)
            .where(docIdx, isEqualTo(row::getDocIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<DcDoc> insertStatement);
}