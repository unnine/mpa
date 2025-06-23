package mpa.client;

import static mpa.client.Cg2ChgPrpsReqDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cg2ChgPrpsReq;
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

public interface Cg2ChgPrpsReqMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(chgPrpsReqIdx, modlDivEtc, tracIdx, reqDptCd, reqUid, plntCd, sysVerCd, docNo, chgTit, prpsDptCd, chgPps, chgRea, chgHopeDt, aptmPrmtYn, aptmTmprYn, aptmTmprTrm, chgPrv, chgAft, fileIdx, fileDesc, fileAttYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, delYn, chgPrpsReqAprIdx, modlDivCd, chgPrpsReqProc, modlTracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cg2ChgPrpsReqResult", value = {
        @Result(column="CHG_PRPS_REQ_IDX", property="chgPrpsReqIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="MODL_DIV_ETC", property="modlDivEtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="REQ_DPT_CD", property="reqDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQ_UID", property="reqUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_TIT", property="chgTit", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRPS_DPT_CD", property="prpsDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_PPS", property="chgPps", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_REA", property="chgRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_HOPE_DT", property="chgHopeDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="APTM_PRMT_YN", property="aptmPrmtYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="APTM_TMPR_YN", property="aptmTmprYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="APTM_TMPR_TRM", property="aptmTmprTrm", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_PRV", property="chgPrv", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_AFT", property="chgAft", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="FILE_DESC", property="fileDesc", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_ATT_YN", property="fileAttYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_PRPS_REQ_APR_IDX", property="chgPrpsReqAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="MODL_DIV_CD", property="modlDivCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_PRPS_REQ_PROC", property="chgPrpsReqProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_TRAC_IDX", property="modlTracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Cg2ChgPrpsReq> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cg2ChgPrpsReqResult")
    Optional<Cg2ChgPrpsReq> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cg2ChgPrpsReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cg2ChgPrpsReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short chgPrpsReqIdx_) {
        return delete(c -> 
            c.where(chgPrpsReqIdx, isEqualTo(chgPrpsReqIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cg2ChgPrpsReq row) {
        return MyBatis3Utils.insert(this::insert, row, cg2ChgPrpsReq, c ->
            c.map(chgPrpsReqIdx).toProperty("chgPrpsReqIdx")
            .map(modlDivEtc).toProperty("modlDivEtc")
            .map(tracIdx).toProperty("tracIdx")
            .map(reqDptCd).toProperty("reqDptCd")
            .map(reqUid).toProperty("reqUid")
            .map(plntCd).toProperty("plntCd")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(docNo).toProperty("docNo")
            .map(chgTit).toProperty("chgTit")
            .map(prpsDptCd).toProperty("prpsDptCd")
            .map(chgPps).toProperty("chgPps")
            .map(chgRea).toProperty("chgRea")
            .map(chgHopeDt).toProperty("chgHopeDt")
            .map(aptmPrmtYn).toProperty("aptmPrmtYn")
            .map(aptmTmprYn).toProperty("aptmTmprYn")
            .map(aptmTmprTrm).toProperty("aptmTmprTrm")
            .map(chgPrv).toProperty("chgPrv")
            .map(chgAft).toProperty("chgAft")
            .map(fileIdx).toProperty("fileIdx")
            .map(fileDesc).toProperty("fileDesc")
            .map(fileAttYn).toProperty("fileAttYn")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(delYn).toProperty("delYn")
            .map(chgPrpsReqAprIdx).toProperty("chgPrpsReqAprIdx")
            .map(modlDivCd).toProperty("modlDivCd")
            .map(chgPrpsReqProc).toProperty("chgPrpsReqProc")
            .map(modlTracIdx).toProperty("modlTracIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgPrpsReq> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cg2ChgPrpsReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cg2ChgPrpsReq> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cg2ChgPrpsReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgPrpsReq> findById(Short chgPrpsReqIdx_) {
        return findOne(c ->
            c.where(chgPrpsReqIdx, isEqualTo(chgPrpsReqIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cg2ChgPrpsReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cg2ChgPrpsReq row) {
        return update(c ->
            c.set(modlDivEtc).equalToWhenPresent(row::getModlDivEtc)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(reqDptCd).equalToWhenPresent(row::getReqDptCd)
            .set(reqUid).equalToWhenPresent(row::getReqUid)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(chgTit).equalToWhenPresent(row::getChgTit)
            .set(prpsDptCd).equalToWhenPresent(row::getPrpsDptCd)
            .set(chgPps).equalToWhenPresent(row::getChgPps)
            .set(chgRea).equalToWhenPresent(row::getChgRea)
            .set(chgHopeDt).equalToWhenPresent(row::getChgHopeDt)
            .set(aptmPrmtYn).equalToWhenPresent(row::getAptmPrmtYn)
            .set(aptmTmprYn).equalToWhenPresent(row::getAptmTmprYn)
            .set(aptmTmprTrm).equalToWhenPresent(row::getAptmTmprTrm)
            .set(chgPrv).equalToWhenPresent(row::getChgPrv)
            .set(chgAft).equalToWhenPresent(row::getChgAft)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(fileDesc).equalToWhenPresent(row::getFileDesc)
            .set(fileAttYn).equalToWhenPresent(row::getFileAttYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(chgPrpsReqAprIdx).equalToWhenPresent(row::getChgPrpsReqAprIdx)
            .set(modlDivCd).equalToWhenPresent(row::getModlDivCd)
            .set(chgPrpsReqProc).equalToWhenPresent(row::getChgPrpsReqProc)
            .set(modlTracIdx).equalToWhenPresent(row::getModlTracIdx)
            .where(chgPrpsReqIdx, isEqualTo(row::getChgPrpsReqIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cg2ChgPrpsReq> insertStatement);
}