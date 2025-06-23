package mpa.client;

import static mpa.client.Cp2CapaRcpDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cp2CapaRcp;
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

public interface Cp2CapaRcpMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(capaRcpIdx, capaReqIdx, plntCd, sysVerCd, tracIdx, qmsMngNo, docNo, rcpDptCd, rcpUid, rcpAprIdx, capaProc, rcpVer, modlDivCd, modlDivEtc, capaTit, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cp2CapaRcpResult", value = {
        @Result(column="CAPA_RCP_IDX", property="capaRcpIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CAPA_REQ_IDX", property="capaReqIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_DPT_CD", property="rcpDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_UID", property="rcpUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_APR_IDX", property="rcpAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CAPA_PROC", property="capaProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCP_VER", property="rcpVer", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_DIV_CD", property="modlDivCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_DIV_ETC", property="modlDivEtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="CAPA_TIT", property="capaTit", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Cp2CapaRcp> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cp2CapaRcpResult")
    Optional<Cp2CapaRcp> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cp2CapaRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cp2CapaRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short capaRcpIdx_) {
        return delete(c -> 
            c.where(capaRcpIdx, isEqualTo(capaRcpIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cp2CapaRcp row) {
        return MyBatis3Utils.insert(this::insert, row, cp2CapaRcp, c ->
            c.map(capaRcpIdx).toProperty("capaRcpIdx")
            .map(capaReqIdx).toProperty("capaReqIdx")
            .map(plntCd).toProperty("plntCd")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(tracIdx).toProperty("tracIdx")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(rcpDptCd).toProperty("rcpDptCd")
            .map(rcpUid).toProperty("rcpUid")
            .map(rcpAprIdx).toProperty("rcpAprIdx")
            .map(capaProc).toProperty("capaProc")
            .map(rcpVer).toProperty("rcpVer")
            .map(modlDivCd).toProperty("modlDivCd")
            .map(modlDivEtc).toProperty("modlDivEtc")
            .map(capaTit).toProperty("capaTit")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaRcp> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cp2CapaRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cp2CapaRcp> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cp2CapaRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaRcp> findById(Short capaRcpIdx_) {
        return findOne(c ->
            c.where(capaRcpIdx, isEqualTo(capaRcpIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cp2CapaRcp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cp2CapaRcp row) {
        return update(c ->
            c.set(capaReqIdx).equalToWhenPresent(row::getCapaReqIdx)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(rcpDptCd).equalToWhenPresent(row::getRcpDptCd)
            .set(rcpUid).equalToWhenPresent(row::getRcpUid)
            .set(rcpAprIdx).equalToWhenPresent(row::getRcpAprIdx)
            .set(capaProc).equalToWhenPresent(row::getCapaProc)
            .set(rcpVer).equalToWhenPresent(row::getRcpVer)
            .set(modlDivCd).equalToWhenPresent(row::getModlDivCd)
            .set(modlDivEtc).equalToWhenPresent(row::getModlDivEtc)
            .set(capaTit).equalToWhenPresent(row::getCapaTit)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(capaRcpIdx, isEqualTo(row::getCapaRcpIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cp2CapaRcp> insertStatement);
}