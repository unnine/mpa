package mpa.client;

import static mpa.client.Rc1RacWrtDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Rc1RacWrt;
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

public interface Rc1RacWrtMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(racWrtIdx, plntCd, sysVerCd, tracIdx, qmsMngNo, docNo, racWrtAprIdx, racProc, modlDivCd, reqDptCd, reqUid, modlDivEtc, racTit, racNcsAtc, issu, cmplDt, rmk, fileIdx, rcs, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, modlTracIdx, rc5whyYn, rc4m1eYn, rcEtcYn, rcEtc);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Rc1RacWrtResult", value = {
        @Result(column="RAC_WRT_IDX", property="racWrtIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="RAC_WRT_APR_IDX", property="racWrtAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RAC_PROC", property="racProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_DIV_CD", property="modlDivCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQ_DPT_CD", property="reqDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="REQ_UID", property="reqUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_DIV_ETC", property="modlDivEtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="RAC_TIT", property="racTit", jdbcType=JdbcType.VARCHAR),
        @Result(column="RAC_NCS_ATC", property="racNcsAtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISSU", property="issu", jdbcType=JdbcType.VARCHAR),
        @Result(column="CMPL_DT", property="cmplDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RCS", property="rcs", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_TRAC_IDX", property="modlTracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RC_5WHY_YN", property="rc5whyYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RC_4M1E_YN", property="rc4m1eYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RC_ETC_YN", property="rcEtcYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RC_ETC", property="rcEtc", jdbcType=JdbcType.VARCHAR)
    })
    List<Rc1RacWrt> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Rc1RacWrtResult")
    Optional<Rc1RacWrt> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, rc1RacWrt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, rc1RacWrt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short racWrtIdx_) {
        return delete(c -> 
            c.where(racWrtIdx, isEqualTo(racWrtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Rc1RacWrt row) {
        return MyBatis3Utils.insert(this::insert, row, rc1RacWrt, c ->
            c.map(racWrtIdx).toProperty("racWrtIdx")
            .map(plntCd).toProperty("plntCd")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(tracIdx).toProperty("tracIdx")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(racWrtAprIdx).toProperty("racWrtAprIdx")
            .map(racProc).toProperty("racProc")
            .map(modlDivCd).toProperty("modlDivCd")
            .map(reqDptCd).toProperty("reqDptCd")
            .map(reqUid).toProperty("reqUid")
            .map(modlDivEtc).toProperty("modlDivEtc")
            .map(racTit).toProperty("racTit")
            .map(racNcsAtc).toProperty("racNcsAtc")
            .map(issu).toProperty("issu")
            .map(cmplDt).toProperty("cmplDt")
            .map(rmk).toProperty("rmk")
            .map(fileIdx).toProperty("fileIdx")
            .map(rcs).toProperty("rcs")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(modlTracIdx).toProperty("modlTracIdx")
            .map(rc5whyYn).toProperty("rc5whyYn")
            .map(rc4m1eYn).toProperty("rc4m1eYn")
            .map(rcEtcYn).toProperty("rcEtcYn")
            .map(rcEtc).toProperty("rcEtc")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Rc1RacWrt> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, rc1RacWrt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Rc1RacWrt> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, rc1RacWrt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Rc1RacWrt> findById(Short racWrtIdx_) {
        return findOne(c ->
            c.where(racWrtIdx, isEqualTo(racWrtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, rc1RacWrt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Rc1RacWrt row) {
        return update(c ->
            c.set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(racWrtAprIdx).equalToWhenPresent(row::getRacWrtAprIdx)
            .set(racProc).equalToWhenPresent(row::getRacProc)
            .set(modlDivCd).equalToWhenPresent(row::getModlDivCd)
            .set(reqDptCd).equalToWhenPresent(row::getReqDptCd)
            .set(reqUid).equalToWhenPresent(row::getReqUid)
            .set(modlDivEtc).equalToWhenPresent(row::getModlDivEtc)
            .set(racTit).equalToWhenPresent(row::getRacTit)
            .set(racNcsAtc).equalToWhenPresent(row::getRacNcsAtc)
            .set(issu).equalToWhenPresent(row::getIssu)
            .set(cmplDt).equalToWhenPresent(row::getCmplDt)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(rcs).equalToWhenPresent(row::getRcs)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(modlTracIdx).equalToWhenPresent(row::getModlTracIdx)
            .set(rc5whyYn).equalToWhenPresent(row::getRc5whyYn)
            .set(rc4m1eYn).equalToWhenPresent(row::getRc4m1eYn)
            .set(rcEtcYn).equalToWhenPresent(row::getRcEtcYn)
            .set(rcEtc).equalToWhenPresent(row::getRcEtc)
            .where(racWrtIdx, isEqualTo(row::getRacWrtIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Rc1RacWrt> insertStatement);
}