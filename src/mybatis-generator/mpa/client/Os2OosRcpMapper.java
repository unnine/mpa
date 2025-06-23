package mpa.client;

import static mpa.client.Os2OosRcpDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Os2OosRcp;
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

public interface Os2OosRcpMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(oosRcpIdx, oosOcrpIdx, qmsMngNo, docNo, tracIdx, plntCd, oosTit, cmplDt, rcpAprIdx, oosProc, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, rcpVer, rcpDt);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Os2OosRcpResult", value = {
        @Result(column="OOS_RCP_IDX", property="oosRcpIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="OOS_OCRP_IDX", property="oosOcrpIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="OOS_TIT", property="oosTit", jdbcType=JdbcType.VARCHAR),
        @Result(column="CMPL_DT", property="cmplDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_APR_IDX", property="rcpAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="OOS_PROC", property="oosProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_VER", property="rcpVer", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_DT", property="rcpDt", jdbcType=JdbcType.VARCHAR)
    })
    List<Os2OosRcp> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Os2OosRcpResult")
    Optional<Os2OosRcp> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, os2OosRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, os2OosRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short oosRcpIdx_) {
        return delete(c -> 
            c.where(oosRcpIdx, isEqualTo(oosRcpIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Os2OosRcp row) {
        return MyBatis3Utils.insert(this::insert, row, os2OosRcp, c ->
            c.map(oosRcpIdx).toProperty("oosRcpIdx")
            .map(oosOcrpIdx).toProperty("oosOcrpIdx")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(tracIdx).toProperty("tracIdx")
            .map(plntCd).toProperty("plntCd")
            .map(oosTit).toProperty("oosTit")
            .map(cmplDt).toProperty("cmplDt")
            .map(rcpAprIdx).toProperty("rcpAprIdx")
            .map(oosProc).toProperty("oosProc")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(rcpVer).toProperty("rcpVer")
            .map(rcpDt).toProperty("rcpDt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosRcp> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, os2OosRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Os2OosRcp> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, os2OosRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosRcp> findById(Short oosRcpIdx_) {
        return findOne(c ->
            c.where(oosRcpIdx, isEqualTo(oosRcpIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, os2OosRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Os2OosRcp row) {
        return update(c ->
            c.set(oosOcrpIdx).equalToWhenPresent(row::getOosOcrpIdx)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(oosTit).equalToWhenPresent(row::getOosTit)
            .set(cmplDt).equalToWhenPresent(row::getCmplDt)
            .set(rcpAprIdx).equalToWhenPresent(row::getRcpAprIdx)
            .set(oosProc).equalToWhenPresent(row::getOosProc)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(rcpVer).equalToWhenPresent(row::getRcpVer)
            .set(rcpDt).equalToWhenPresent(row::getRcpDt)
            .where(oosRcpIdx, isEqualTo(row::getOosRcpIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Os2OosRcp> insertStatement);
}