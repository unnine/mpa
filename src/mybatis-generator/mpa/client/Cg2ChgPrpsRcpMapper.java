package mpa.client;

import static mpa.client.Cg2ChgPrpsRcpDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cg2ChgPrpsRcp;
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

public interface Cg2ChgPrpsRcpMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(chgPrpsRcpIdx, chgPrpsReqIdx, rcpVer, plntCd, sysVerCd, tracIdx, qmsMngNo, docNo, rcpDt, rcpDptCd, rcpUid, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, rcpAprIdx, chgPrpsProc);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cg2ChgPrpsRcpResult", value = {
        @Result(column="CHG_PRPS_RCP_IDX", property="chgPrpsRcpIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CHG_PRPS_REQ_IDX", property="chgPrpsReqIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RCP_VER", property="rcpVer", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_DT", property="rcpDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_DPT_CD", property="rcpDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_UID", property="rcpUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_APR_IDX", property="rcpAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CHG_PRPS_PROC", property="chgPrpsProc", jdbcType=JdbcType.VARCHAR)
    })
    List<Cg2ChgPrpsRcp> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cg2ChgPrpsRcpResult")
    Optional<Cg2ChgPrpsRcp> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cg2ChgPrpsRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cg2ChgPrpsRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short chgPrpsRcpIdx_) {
        return delete(c -> 
            c.where(chgPrpsRcpIdx, isEqualTo(chgPrpsRcpIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cg2ChgPrpsRcp row) {
        return MyBatis3Utils.insert(this::insert, row, cg2ChgPrpsRcp, c ->
            c.map(chgPrpsRcpIdx).toProperty("chgPrpsRcpIdx")
            .map(chgPrpsReqIdx).toProperty("chgPrpsReqIdx")
            .map(rcpVer).toProperty("rcpVer")
            .map(plntCd).toProperty("plntCd")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(tracIdx).toProperty("tracIdx")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(rcpDt).toProperty("rcpDt")
            .map(rcpDptCd).toProperty("rcpDptCd")
            .map(rcpUid).toProperty("rcpUid")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(rcpAprIdx).toProperty("rcpAprIdx")
            .map(chgPrpsProc).toProperty("chgPrpsProc")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgPrpsRcp> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cg2ChgPrpsRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cg2ChgPrpsRcp> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cg2ChgPrpsRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgPrpsRcp> findById(Short chgPrpsRcpIdx_) {
        return findOne(c ->
            c.where(chgPrpsRcpIdx, isEqualTo(chgPrpsRcpIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cg2ChgPrpsRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cg2ChgPrpsRcp row) {
        return update(c ->
            c.set(chgPrpsReqIdx).equalToWhenPresent(row::getChgPrpsReqIdx)
            .set(rcpVer).equalToWhenPresent(row::getRcpVer)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(rcpDt).equalToWhenPresent(row::getRcpDt)
            .set(rcpDptCd).equalToWhenPresent(row::getRcpDptCd)
            .set(rcpUid).equalToWhenPresent(row::getRcpUid)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(rcpAprIdx).equalToWhenPresent(row::getRcpAprIdx)
            .set(chgPrpsProc).equalToWhenPresent(row::getChgPrpsProc)
            .where(chgPrpsRcpIdx, isEqualTo(row::getChgPrpsRcpIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cg2ChgPrpsRcp> insertStatement);
}