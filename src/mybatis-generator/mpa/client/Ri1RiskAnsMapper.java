package mpa.client;

import static mpa.client.Ri1RiskAnsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ri1RiskAns;
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

public interface Ri1RiskAnsMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(riskAnsIdx, plntCd, sysVerCd, tracIdx, qmsMngNo, docNo, riskAnsAprIdx, riskProc, riskElm, riskRcs, pitmDiv, riskCgntYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, modlTracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ri1RiskAnsResult", value = {
        @Result(column="RISK_ANS_IDX", property="riskAnsIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="RISK_ANS_APR_IDX", property="riskAnsAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RISK_PROC", property="riskProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="RISK_ELM", property="riskElm", jdbcType=JdbcType.VARCHAR),
        @Result(column="RISK_RCS", property="riskRcs", jdbcType=JdbcType.VARCHAR),
        @Result(column="PITM_DIV", property="pitmDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="RISK_CGNT_YN", property="riskCgntYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_TRAC_IDX", property="modlTracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Ri1RiskAns> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ri1RiskAnsResult")
    Optional<Ri1RiskAns> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ri1RiskAns, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ri1RiskAns, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short riskAnsIdx_) {
        return delete(c -> 
            c.where(riskAnsIdx, isEqualTo(riskAnsIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ri1RiskAns row) {
        return MyBatis3Utils.insert(this::insert, row, ri1RiskAns, c ->
            c.map(riskAnsIdx).toProperty("riskAnsIdx")
            .map(plntCd).toProperty("plntCd")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(tracIdx).toProperty("tracIdx")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(riskAnsAprIdx).toProperty("riskAnsAprIdx")
            .map(riskProc).toProperty("riskProc")
            .map(riskElm).toProperty("riskElm")
            .map(riskRcs).toProperty("riskRcs")
            .map(pitmDiv).toProperty("pitmDiv")
            .map(riskCgntYn).toProperty("riskCgntYn")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(modlTracIdx).toProperty("modlTracIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ri1RiskAns> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ri1RiskAns, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ri1RiskAns> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ri1RiskAns, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ri1RiskAns> findById(Short riskAnsIdx_) {
        return findOne(c ->
            c.where(riskAnsIdx, isEqualTo(riskAnsIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ri1RiskAns, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ri1RiskAns row) {
        return update(c ->
            c.set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(riskAnsAprIdx).equalToWhenPresent(row::getRiskAnsAprIdx)
            .set(riskProc).equalToWhenPresent(row::getRiskProc)
            .set(riskElm).equalToWhenPresent(row::getRiskElm)
            .set(riskRcs).equalToWhenPresent(row::getRiskRcs)
            .set(pitmDiv).equalToWhenPresent(row::getPitmDiv)
            .set(riskCgntYn).equalToWhenPresent(row::getRiskCgntYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(modlTracIdx).equalToWhenPresent(row::getModlTracIdx)
            .where(riskAnsIdx, isEqualTo(row::getRiskAnsIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ri1RiskAns> insertStatement);
}