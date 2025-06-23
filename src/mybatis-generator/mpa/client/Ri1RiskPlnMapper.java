package mpa.client;

import static mpa.client.Ri1RiskPlnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ri1RiskPln;
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

public interface Ri1RiskPlnMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(riskPlnIdx, riskAnsIdx, tracIdx, riskPlnAprIdx, ocrPosb, ocrPosbDesc, sev, sevDesc, accpStd, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, enfoPln, rmk, fileIdx, cmplDt);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ri1RiskPlnResult", value = {
        @Result(column="RISK_PLN_IDX", property="riskPlnIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="RISK_ANS_IDX", property="riskAnsIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RISK_PLN_APR_IDX", property="riskPlnAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="OCR_POSB", property="ocrPosb", jdbcType=JdbcType.VARCHAR),
        @Result(column="OCR_POSB_DESC", property="ocrPosbDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEV", property="sev", jdbcType=JdbcType.VARCHAR),
        @Result(column="SEV_DESC", property="sevDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACCP_STD", property="accpStd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENFO_PLN", property="enfoPln", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CMPL_DT", property="cmplDt", jdbcType=JdbcType.VARCHAR)
    })
    List<Ri1RiskPln> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ri1RiskPlnResult")
    Optional<Ri1RiskPln> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ri1RiskPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ri1RiskPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short riskPlnIdx_) {
        return delete(c -> 
            c.where(riskPlnIdx, isEqualTo(riskPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ri1RiskPln row) {
        return MyBatis3Utils.insert(this::insert, row, ri1RiskPln, c ->
            c.map(riskPlnIdx).toProperty("riskPlnIdx")
            .map(riskAnsIdx).toProperty("riskAnsIdx")
            .map(tracIdx).toProperty("tracIdx")
            .map(riskPlnAprIdx).toProperty("riskPlnAprIdx")
            .map(ocrPosb).toProperty("ocrPosb")
            .map(ocrPosbDesc).toProperty("ocrPosbDesc")
            .map(sev).toProperty("sev")
            .map(sevDesc).toProperty("sevDesc")
            .map(accpStd).toProperty("accpStd")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(enfoPln).toProperty("enfoPln")
            .map(rmk).toProperty("rmk")
            .map(fileIdx).toProperty("fileIdx")
            .map(cmplDt).toProperty("cmplDt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ri1RiskPln> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ri1RiskPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ri1RiskPln> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ri1RiskPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ri1RiskPln> findById(Short riskPlnIdx_) {
        return findOne(c ->
            c.where(riskPlnIdx, isEqualTo(riskPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ri1RiskPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ri1RiskPln row) {
        return update(c ->
            c.set(riskAnsIdx).equalToWhenPresent(row::getRiskAnsIdx)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(riskPlnAprIdx).equalToWhenPresent(row::getRiskPlnAprIdx)
            .set(ocrPosb).equalToWhenPresent(row::getOcrPosb)
            .set(ocrPosbDesc).equalToWhenPresent(row::getOcrPosbDesc)
            .set(sev).equalToWhenPresent(row::getSev)
            .set(sevDesc).equalToWhenPresent(row::getSevDesc)
            .set(accpStd).equalToWhenPresent(row::getAccpStd)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(enfoPln).equalToWhenPresent(row::getEnfoPln)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(cmplDt).equalToWhenPresent(row::getCmplDt)
            .where(riskPlnIdx, isEqualTo(row::getRiskPlnIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ri1RiskPln> insertStatement);
}