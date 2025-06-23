package mpa.client;

import static mpa.client.Cp2CapaRcpCrgDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cp2CapaRcpCrg;
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

public interface Cp2CapaRcpCrgMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(capaRcpCrgIdx, capaRcpIdx, crgDptCd, crgUid, cmplDt, ncsAtc, reqFdbk, ctt, ord, delYn, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cp2CapaRcpCrgResult", value = {
        @Result(column="CAPA_RCP_CRG_IDX", property="capaRcpCrgIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CAPA_RCP_IDX", property="capaRcpIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRG_DPT_CD", property="crgDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRG_UID", property="crgUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CMPL_DT", property="cmplDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="NCS_ATC", property="ncsAtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQ_FDBK", property="reqFdbk", jdbcType=JdbcType.VARCHAR),
        @Result(column="CTT", property="ctt", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Cp2CapaRcpCrg> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cp2CapaRcpCrgResult")
    Optional<Cp2CapaRcpCrg> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cp2CapaRcpCrg, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cp2CapaRcpCrg, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short capaRcpCrgIdx_) {
        return delete(c -> 
            c.where(capaRcpCrgIdx, isEqualTo(capaRcpCrgIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cp2CapaRcpCrg row) {
        return MyBatis3Utils.insert(this::insert, row, cp2CapaRcpCrg, c ->
            c.map(capaRcpCrgIdx).toProperty("capaRcpCrgIdx")
            .map(capaRcpIdx).toProperty("capaRcpIdx")
            .map(crgDptCd).toProperty("crgDptCd")
            .map(crgUid).toProperty("crgUid")
            .map(cmplDt).toProperty("cmplDt")
            .map(ncsAtc).toProperty("ncsAtc")
            .map(reqFdbk).toProperty("reqFdbk")
            .map(ctt).toProperty("ctt")
            .map(ord).toProperty("ord")
            .map(delYn).toProperty("delYn")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaRcpCrg> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cp2CapaRcpCrg, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cp2CapaRcpCrg> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cp2CapaRcpCrg, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaRcpCrg> findById(Short capaRcpCrgIdx_) {
        return findOne(c ->
            c.where(capaRcpCrgIdx, isEqualTo(capaRcpCrgIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cp2CapaRcpCrg, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cp2CapaRcpCrg row) {
        return update(c ->
            c.set(capaRcpIdx).equalToWhenPresent(row::getCapaRcpIdx)
            .set(crgDptCd).equalToWhenPresent(row::getCrgDptCd)
            .set(crgUid).equalToWhenPresent(row::getCrgUid)
            .set(cmplDt).equalToWhenPresent(row::getCmplDt)
            .set(ncsAtc).equalToWhenPresent(row::getNcsAtc)
            .set(reqFdbk).equalToWhenPresent(row::getReqFdbk)
            .set(ctt).equalToWhenPresent(row::getCtt)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(capaRcpCrgIdx, isEqualTo(row::getCapaRcpCrgIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cp2CapaRcpCrg> insertStatement);
}