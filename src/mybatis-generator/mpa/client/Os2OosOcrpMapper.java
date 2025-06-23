package mpa.client;

import static mpa.client.Os2OosOcrpDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Os2OosOcrp;
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

public interface Os2OosOcrpMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(oosOcrpIdx, plntCd, sysVerCd, pitmDiv, ocrCtt, prdSmpNm, pitmCd, testNo, lotNo, batchNo, lotDt, initTestTeamNm, initTestrNm, ocrPla, testAtc, testStd, testRst, testMtd, fileIdx, rpoAprIdx, udtIp, udtDs, udtUid, crtIp, crtDs, crtUid, rcpCanlRea, rcpCanlDs, rcpCanlUid, ocrConfDs, ocrpProc, initTestStrDt, tracIdx, etcRcd, modlTracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Os2OosOcrpResult", value = {
        @Result(column="OOS_OCRP_IDX", property="oosOcrpIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PITM_DIV", property="pitmDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="OCR_CTT", property="ocrCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRD_SMP_NM", property="prdSmpNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="PITM_CD", property="pitmCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEST_NO", property="testNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOT_NO", property="lotNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="BATCH_NO", property="batchNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOT_DT", property="lotDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="INIT_TEST_TEAM_NM", property="initTestTeamNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="INIT_TESTR_NM", property="initTestrNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="OCR_PLA", property="ocrPla", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEST_ATC", property="testAtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEST_STD", property="testStd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEST_RST", property="testRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEST_MTD", property="testMtd", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RPO_APR_IDX", property="rpoAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_CANL_REA", property="rcpCanlRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_CANL_DS", property="rcpCanlDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RCP_CANL_UID", property="rcpCanlUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="OCR_CONF_DS", property="ocrConfDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="OCRP_PROC", property="ocrpProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="INIT_TEST_STR_DT", property="initTestStrDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="ETC_RCD", property="etcRcd", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_TRAC_IDX", property="modlTracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Os2OosOcrp> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Os2OosOcrpResult")
    Optional<Os2OosOcrp> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, os2OosOcrp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, os2OosOcrp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short oosOcrpIdx_) {
        return delete(c -> 
            c.where(oosOcrpIdx, isEqualTo(oosOcrpIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Os2OosOcrp row) {
        return MyBatis3Utils.insert(this::insert, row, os2OosOcrp, c ->
            c.map(oosOcrpIdx).toProperty("oosOcrpIdx")
            .map(plntCd).toProperty("plntCd")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(pitmDiv).toProperty("pitmDiv")
            .map(ocrCtt).toProperty("ocrCtt")
            .map(prdSmpNm).toProperty("prdSmpNm")
            .map(pitmCd).toProperty("pitmCd")
            .map(testNo).toProperty("testNo")
            .map(lotNo).toProperty("lotNo")
            .map(batchNo).toProperty("batchNo")
            .map(lotDt).toProperty("lotDt")
            .map(initTestTeamNm).toProperty("initTestTeamNm")
            .map(initTestrNm).toProperty("initTestrNm")
            .map(ocrPla).toProperty("ocrPla")
            .map(testAtc).toProperty("testAtc")
            .map(testStd).toProperty("testStd")
            .map(testRst).toProperty("testRst")
            .map(testMtd).toProperty("testMtd")
            .map(fileIdx).toProperty("fileIdx")
            .map(rpoAprIdx).toProperty("rpoAprIdx")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(rcpCanlRea).toProperty("rcpCanlRea")
            .map(rcpCanlDs).toProperty("rcpCanlDs")
            .map(rcpCanlUid).toProperty("rcpCanlUid")
            .map(ocrConfDs).toProperty("ocrConfDs")
            .map(ocrpProc).toProperty("ocrpProc")
            .map(initTestStrDt).toProperty("initTestStrDt")
            .map(tracIdx).toProperty("tracIdx")
            .map(etcRcd).toProperty("etcRcd")
            .map(modlTracIdx).toProperty("modlTracIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosOcrp> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, os2OosOcrp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Os2OosOcrp> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, os2OosOcrp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosOcrp> findById(Short oosOcrpIdx_) {
        return findOne(c ->
            c.where(oosOcrpIdx, isEqualTo(oosOcrpIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, os2OosOcrp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Os2OosOcrp row) {
        return update(c ->
            c.set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(pitmDiv).equalToWhenPresent(row::getPitmDiv)
            .set(ocrCtt).equalToWhenPresent(row::getOcrCtt)
            .set(prdSmpNm).equalToWhenPresent(row::getPrdSmpNm)
            .set(pitmCd).equalToWhenPresent(row::getPitmCd)
            .set(testNo).equalToWhenPresent(row::getTestNo)
            .set(lotNo).equalToWhenPresent(row::getLotNo)
            .set(batchNo).equalToWhenPresent(row::getBatchNo)
            .set(lotDt).equalToWhenPresent(row::getLotDt)
            .set(initTestTeamNm).equalToWhenPresent(row::getInitTestTeamNm)
            .set(initTestrNm).equalToWhenPresent(row::getInitTestrNm)
            .set(ocrPla).equalToWhenPresent(row::getOcrPla)
            .set(testAtc).equalToWhenPresent(row::getTestAtc)
            .set(testStd).equalToWhenPresent(row::getTestStd)
            .set(testRst).equalToWhenPresent(row::getTestRst)
            .set(testMtd).equalToWhenPresent(row::getTestMtd)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(rpoAprIdx).equalToWhenPresent(row::getRpoAprIdx)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(rcpCanlRea).equalToWhenPresent(row::getRcpCanlRea)
            .set(rcpCanlDs).equalToWhenPresent(row::getRcpCanlDs)
            .set(rcpCanlUid).equalToWhenPresent(row::getRcpCanlUid)
            .set(ocrConfDs).equalToWhenPresent(row::getOcrConfDs)
            .set(ocrpProc).equalToWhenPresent(row::getOcrpProc)
            .set(initTestStrDt).equalToWhenPresent(row::getInitTestStrDt)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(etcRcd).equalToWhenPresent(row::getEtcRcd)
            .set(modlTracIdx).equalToWhenPresent(row::getModlTracIdx)
            .where(oosOcrpIdx, isEqualTo(row::getOosOcrpIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Os2OosOcrp> insertStatement);
}