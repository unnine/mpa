package mpa.client;

import static mpa.client.Ea1ExadPlnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ea1ExadPln;
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

public interface Ea1ExadPlnMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(exadPlnIdx, sysVerCd, plntCd, qmsMngNo, adtComp, adtPps, adtrInfo, adtExpStrDt, adtExpEndDt, cplTrm, rmk, exadPlnAprIdx, exadProc, adtKnd, fileIdx, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, delYn, tracIdx, modlTracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ea1ExadPlnResult", value = {
        @Result(column="EXAD_PLN_IDX", property="exadPlnIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADT_COMP", property="adtComp", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADT_PPS", property="adtPps", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADTR_INFO", property="adtrInfo", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADT_EXP_STR_DT", property="adtExpStrDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADT_EXP_END_DT", property="adtExpEndDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="CPL_TRM", property="cplTrm", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXAD_PLN_APR_IDX", property="exadPlnAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="EXAD_PROC", property="exadProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADT_KND", property="adtKnd", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="MODL_TRAC_IDX", property="modlTracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Ea1ExadPln> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ea1ExadPlnResult")
    Optional<Ea1ExadPln> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ea1ExadPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ea1ExadPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short exadPlnIdx_) {
        return delete(c -> 
            c.where(exadPlnIdx, isEqualTo(exadPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ea1ExadPln row) {
        return MyBatis3Utils.insert(this::insert, row, ea1ExadPln, c ->
            c.map(exadPlnIdx).toProperty("exadPlnIdx")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(plntCd).toProperty("plntCd")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(adtComp).toProperty("adtComp")
            .map(adtPps).toProperty("adtPps")
            .map(adtrInfo).toProperty("adtrInfo")
            .map(adtExpStrDt).toProperty("adtExpStrDt")
            .map(adtExpEndDt).toProperty("adtExpEndDt")
            .map(cplTrm).toProperty("cplTrm")
            .map(rmk).toProperty("rmk")
            .map(exadPlnAprIdx).toProperty("exadPlnAprIdx")
            .map(exadProc).toProperty("exadProc")
            .map(adtKnd).toProperty("adtKnd")
            .map(fileIdx).toProperty("fileIdx")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(delYn).toProperty("delYn")
            .map(tracIdx).toProperty("tracIdx")
            .map(modlTracIdx).toProperty("modlTracIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ea1ExadPln> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ea1ExadPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ea1ExadPln> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ea1ExadPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ea1ExadPln> findById(Short exadPlnIdx_) {
        return findOne(c ->
            c.where(exadPlnIdx, isEqualTo(exadPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ea1ExadPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ea1ExadPln row) {
        return update(c ->
            c.set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(adtComp).equalToWhenPresent(row::getAdtComp)
            .set(adtPps).equalToWhenPresent(row::getAdtPps)
            .set(adtrInfo).equalToWhenPresent(row::getAdtrInfo)
            .set(adtExpStrDt).equalToWhenPresent(row::getAdtExpStrDt)
            .set(adtExpEndDt).equalToWhenPresent(row::getAdtExpEndDt)
            .set(cplTrm).equalToWhenPresent(row::getCplTrm)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(exadPlnAprIdx).equalToWhenPresent(row::getExadPlnAprIdx)
            .set(exadProc).equalToWhenPresent(row::getExadProc)
            .set(adtKnd).equalToWhenPresent(row::getAdtKnd)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(modlTracIdx).equalToWhenPresent(row::getModlTracIdx)
            .where(exadPlnIdx, isEqualTo(row::getExadPlnIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ea1ExadPln> insertStatement);
}