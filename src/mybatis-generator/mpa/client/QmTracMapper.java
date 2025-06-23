package mpa.client;

import static mpa.client.QmTracDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.QmTrac;
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

public interface QmTracMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(tracIdx, hirTracIdx, modlCd, modlDivCd, reqDs, reqUid, ncsYn, uncsRea, cmplDt, crgDptCd, crgUid, ncsAtc, reqFdbk, ctt, tracPrgs, udtIp, udtDs, udtUid, classify, fromIdx, qmsMngNo, tit);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QmTracResult", value = {
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="HIR_TRAC_IDX", property="hirTracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="MODL_CD", property="modlCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_DIV_CD", property="modlDivCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQ_DS", property="reqDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="REQ_UID", property="reqUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="NCS_YN", property="ncsYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="UNCS_REA", property="uncsRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="CMPL_DT", property="cmplDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRG_DPT_CD", property="crgDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRG_UID", property="crgUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="NCS_ATC", property="ncsAtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQ_FDBK", property="reqFdbk", jdbcType=JdbcType.VARCHAR),
        @Result(column="CTT", property="ctt", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_PRGS", property="tracPrgs", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLASSIFY", property="classify", jdbcType=JdbcType.VARCHAR),
        @Result(column="FROM_IDX", property="fromIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="TIT", property="tit", jdbcType=JdbcType.VARCHAR)
    })
    List<QmTrac> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("QmTracResult")
    Optional<QmTrac> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, qmTrac, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, qmTrac, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short tracIdx_) {
        return delete(c -> 
            c.where(tracIdx, isEqualTo(tracIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(QmTrac row) {
        return MyBatis3Utils.insert(this::insert, row, qmTrac, c ->
            c.map(tracIdx).toProperty("tracIdx")
            .map(hirTracIdx).toProperty("hirTracIdx")
            .map(modlCd).toProperty("modlCd")
            .map(modlDivCd).toProperty("modlDivCd")
            .map(reqDs).toProperty("reqDs")
            .map(reqUid).toProperty("reqUid")
            .map(ncsYn).toProperty("ncsYn")
            .map(uncsRea).toProperty("uncsRea")
            .map(cmplDt).toProperty("cmplDt")
            .map(crgDptCd).toProperty("crgDptCd")
            .map(crgUid).toProperty("crgUid")
            .map(ncsAtc).toProperty("ncsAtc")
            .map(reqFdbk).toProperty("reqFdbk")
            .map(ctt).toProperty("ctt")
            .map(tracPrgs).toProperty("tracPrgs")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(classify).toProperty("classify")
            .map(fromIdx).toProperty("fromIdx")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(tit).toProperty("tit")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmTrac> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, qmTrac, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<QmTrac> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, qmTrac, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmTrac> findById(Short tracIdx_) {
        return findOne(c ->
            c.where(tracIdx, isEqualTo(tracIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, qmTrac, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(QmTrac row) {
        return update(c ->
            c.set(hirTracIdx).equalToWhenPresent(row::getHirTracIdx)
            .set(modlCd).equalToWhenPresent(row::getModlCd)
            .set(modlDivCd).equalToWhenPresent(row::getModlDivCd)
            .set(reqDs).equalToWhenPresent(row::getReqDs)
            .set(reqUid).equalToWhenPresent(row::getReqUid)
            .set(ncsYn).equalToWhenPresent(row::getNcsYn)
            .set(uncsRea).equalToWhenPresent(row::getUncsRea)
            .set(cmplDt).equalToWhenPresent(row::getCmplDt)
            .set(crgDptCd).equalToWhenPresent(row::getCrgDptCd)
            .set(crgUid).equalToWhenPresent(row::getCrgUid)
            .set(ncsAtc).equalToWhenPresent(row::getNcsAtc)
            .set(reqFdbk).equalToWhenPresent(row::getReqFdbk)
            .set(ctt).equalToWhenPresent(row::getCtt)
            .set(tracPrgs).equalToWhenPresent(row::getTracPrgs)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(classify).equalToWhenPresent(row::getClassify)
            .set(fromIdx).equalToWhenPresent(row::getFromIdx)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(tit).equalToWhenPresent(row::getTit)
            .where(tracIdx, isEqualTo(row::getTracIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<QmTrac> insertStatement);
}