package mpa.client;

import static mpa.client.MeMneReqDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.MeMneReq;
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

public interface MeMneReqMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(mneIdx, plntCd, sysVerCd, tracIdx, qmsMngNo, docNo, mneAprIdx, mneProc, relModlDivCd, tagt, rea, impt, rmk, cmplDtPrv, cmplDtAft, cttPrv, cttAft, fileIdx, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, relTracIdx, relQmsMngNo, mneDiv, relProcDivNm);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MeMneReqResult", value = {
        @Result(column="MNE_IDX", property="mneIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="MNE_APR_IDX", property="mneAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="MNE_PROC", property="mneProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="REL_MODL_DIV_CD", property="relModlDivCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TAGT", property="tagt", jdbcType=JdbcType.VARCHAR),
        @Result(column="REA", property="rea", jdbcType=JdbcType.VARCHAR),
        @Result(column="IMPT", property="impt", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="CMPL_DT_PRV", property="cmplDtPrv", jdbcType=JdbcType.VARCHAR),
        @Result(column="CMPL_DT_AFT", property="cmplDtAft", jdbcType=JdbcType.VARCHAR),
        @Result(column="CTT_PRV", property="cttPrv", jdbcType=JdbcType.VARCHAR),
        @Result(column="CTT_AFT", property="cttAft", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="REL_TRAC_IDX", property="relTracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="REL_QMS_MNG_NO", property="relQmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="MNE_DIV", property="mneDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="REL_PROC_DIV_NM", property="relProcDivNm", jdbcType=JdbcType.VARCHAR)
    })
    List<MeMneReq> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MeMneReqResult")
    Optional<MeMneReq> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, meMneReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, meMneReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short mneIdx_) {
        return delete(c -> 
            c.where(mneIdx, isEqualTo(mneIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MeMneReq row) {
        return MyBatis3Utils.insert(this::insert, row, meMneReq, c ->
            c.map(mneIdx).toProperty("mneIdx")
            .map(plntCd).toProperty("plntCd")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(tracIdx).toProperty("tracIdx")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(mneAprIdx).toProperty("mneAprIdx")
            .map(mneProc).toProperty("mneProc")
            .map(relModlDivCd).toProperty("relModlDivCd")
            .map(tagt).toProperty("tagt")
            .map(rea).toProperty("rea")
            .map(impt).toProperty("impt")
            .map(rmk).toProperty("rmk")
            .map(cmplDtPrv).toProperty("cmplDtPrv")
            .map(cmplDtAft).toProperty("cmplDtAft")
            .map(cttPrv).toProperty("cttPrv")
            .map(cttAft).toProperty("cttAft")
            .map(fileIdx).toProperty("fileIdx")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(relTracIdx).toProperty("relTracIdx")
            .map(relQmsMngNo).toProperty("relQmsMngNo")
            .map(mneDiv).toProperty("mneDiv")
            .map(relProcDivNm).toProperty("relProcDivNm")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MeMneReq> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, meMneReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MeMneReq> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, meMneReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MeMneReq> findById(Short mneIdx_) {
        return findOne(c ->
            c.where(mneIdx, isEqualTo(mneIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, meMneReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(MeMneReq row) {
        return update(c ->
            c.set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(mneAprIdx).equalToWhenPresent(row::getMneAprIdx)
            .set(mneProc).equalToWhenPresent(row::getMneProc)
            .set(relModlDivCd).equalToWhenPresent(row::getRelModlDivCd)
            .set(tagt).equalToWhenPresent(row::getTagt)
            .set(rea).equalToWhenPresent(row::getRea)
            .set(impt).equalToWhenPresent(row::getImpt)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(cmplDtPrv).equalToWhenPresent(row::getCmplDtPrv)
            .set(cmplDtAft).equalToWhenPresent(row::getCmplDtAft)
            .set(cttPrv).equalToWhenPresent(row::getCttPrv)
            .set(cttAft).equalToWhenPresent(row::getCttAft)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(relTracIdx).equalToWhenPresent(row::getRelTracIdx)
            .set(relQmsMngNo).equalToWhenPresent(row::getRelQmsMngNo)
            .set(mneDiv).equalToWhenPresent(row::getMneDiv)
            .set(relProcDivNm).equalToWhenPresent(row::getRelProcDivNm)
            .where(mneIdx, isEqualTo(row::getMneIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<MeMneReq> insertStatement);
}