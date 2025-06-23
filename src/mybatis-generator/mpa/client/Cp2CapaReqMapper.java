package mpa.client;

import static mpa.client.Cp2CapaReqDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cp2CapaReq;
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

public interface Cp2CapaReqMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(capaReqIdx, modlDivEtc, tracIdx, modlDivCd, capaTit, rmk, fileIdx, capaReqAprIdx, capaReqProc, reqDptCd, reqUid, plntCd, sysVerCd, docNo, delYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, modlTracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cp2CapaReqResult", value = {
        @Result(column="CAPA_REQ_IDX", property="capaReqIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="MODL_DIV_ETC", property="modlDivEtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="MODL_DIV_CD", property="modlDivCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CAPA_TIT", property="capaTit", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CAPA_REQ_APR_IDX", property="capaReqAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CAPA_REQ_PROC", property="capaReqProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQ_DPT_CD", property="reqDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQ_UID", property="reqUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_TRAC_IDX", property="modlTracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Cp2CapaReq> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cp2CapaReqResult")
    Optional<Cp2CapaReq> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cp2CapaReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cp2CapaReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short capaReqIdx_) {
        return delete(c -> 
            c.where(capaReqIdx, isEqualTo(capaReqIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cp2CapaReq row) {
        return MyBatis3Utils.insert(this::insert, row, cp2CapaReq, c ->
            c.map(capaReqIdx).toProperty("capaReqIdx")
            .map(modlDivEtc).toProperty("modlDivEtc")
            .map(tracIdx).toProperty("tracIdx")
            .map(modlDivCd).toProperty("modlDivCd")
            .map(capaTit).toProperty("capaTit")
            .map(rmk).toProperty("rmk")
            .map(fileIdx).toProperty("fileIdx")
            .map(capaReqAprIdx).toProperty("capaReqAprIdx")
            .map(capaReqProc).toProperty("capaReqProc")
            .map(reqDptCd).toProperty("reqDptCd")
            .map(reqUid).toProperty("reqUid")
            .map(plntCd).toProperty("plntCd")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(docNo).toProperty("docNo")
            .map(delYn).toProperty("delYn")
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
    default Optional<Cp2CapaReq> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cp2CapaReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cp2CapaReq> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cp2CapaReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaReq> findById(Short capaReqIdx_) {
        return findOne(c ->
            c.where(capaReqIdx, isEqualTo(capaReqIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cp2CapaReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cp2CapaReq row) {
        return update(c ->
            c.set(modlDivEtc).equalToWhenPresent(row::getModlDivEtc)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(modlDivCd).equalToWhenPresent(row::getModlDivCd)
            .set(capaTit).equalToWhenPresent(row::getCapaTit)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(capaReqAprIdx).equalToWhenPresent(row::getCapaReqAprIdx)
            .set(capaReqProc).equalToWhenPresent(row::getCapaReqProc)
            .set(reqDptCd).equalToWhenPresent(row::getReqDptCd)
            .set(reqUid).equalToWhenPresent(row::getReqUid)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(modlTracIdx).equalToWhenPresent(row::getModlTracIdx)
            .where(capaReqIdx, isEqualTo(row::getCapaReqIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cp2CapaReq> insertStatement);
}