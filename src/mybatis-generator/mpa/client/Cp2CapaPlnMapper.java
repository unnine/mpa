package mpa.client;

import static mpa.client.Cp2CapaPlnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cp2CapaPln;
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

public interface Cp2CapaPlnMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(capaPlnIdx, capaRcpCrgIdx, plnVer, plntCd, tracIdx, plnMngNo, docNo, crgDptCd, crgUid, cmplDt, capaPln, fileIdx, plnAprIdx, capaPlnProc, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, changeTracIdx, changeMngNo);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cp2CapaPlnResult", value = {
        @Result(column="CAPA_PLN_IDX", property="capaPlnIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CAPA_RCP_CRG_IDX", property="capaRcpCrgIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PLN_VER", property="plnVer", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PLN_MNG_NO", property="plnMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRG_DPT_CD", property="crgDptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRG_UID", property="crgUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CMPL_DT", property="cmplDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="CAPA_PLN", property="capaPln", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PLN_APR_IDX", property="plnAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CAPA_PLN_PROC", property="capaPlnProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHANGE_TRAC_IDX", property="changeTracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CHANGE_MNG_NO", property="changeMngNo", jdbcType=JdbcType.VARCHAR)
    })
    List<Cp2CapaPln> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cp2CapaPlnResult")
    Optional<Cp2CapaPln> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cp2CapaPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cp2CapaPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short capaPlnIdx_) {
        return delete(c -> 
            c.where(capaPlnIdx, isEqualTo(capaPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cp2CapaPln row) {
        return MyBatis3Utils.insert(this::insert, row, cp2CapaPln, c ->
            c.map(capaPlnIdx).toProperty("capaPlnIdx")
            .map(capaRcpCrgIdx).toProperty("capaRcpCrgIdx")
            .map(plnVer).toProperty("plnVer")
            .map(plntCd).toProperty("plntCd")
            .map(tracIdx).toProperty("tracIdx")
            .map(plnMngNo).toProperty("plnMngNo")
            .map(docNo).toProperty("docNo")
            .map(crgDptCd).toProperty("crgDptCd")
            .map(crgUid).toProperty("crgUid")
            .map(cmplDt).toProperty("cmplDt")
            .map(capaPln).toProperty("capaPln")
            .map(fileIdx).toProperty("fileIdx")
            .map(plnAprIdx).toProperty("plnAprIdx")
            .map(capaPlnProc).toProperty("capaPlnProc")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(changeTracIdx).toProperty("changeTracIdx")
            .map(changeMngNo).toProperty("changeMngNo")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaPln> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cp2CapaPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cp2CapaPln> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cp2CapaPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaPln> findById(Short capaPlnIdx_) {
        return findOne(c ->
            c.where(capaPlnIdx, isEqualTo(capaPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cp2CapaPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cp2CapaPln row) {
        return update(c ->
            c.set(capaRcpCrgIdx).equalToWhenPresent(row::getCapaRcpCrgIdx)
            .set(plnVer).equalToWhenPresent(row::getPlnVer)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(plnMngNo).equalToWhenPresent(row::getPlnMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(crgDptCd).equalToWhenPresent(row::getCrgDptCd)
            .set(crgUid).equalToWhenPresent(row::getCrgUid)
            .set(cmplDt).equalToWhenPresent(row::getCmplDt)
            .set(capaPln).equalToWhenPresent(row::getCapaPln)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(plnAprIdx).equalToWhenPresent(row::getPlnAprIdx)
            .set(capaPlnProc).equalToWhenPresent(row::getCapaPlnProc)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(changeTracIdx).equalToWhenPresent(row::getChangeTracIdx)
            .set(changeMngNo).equalToWhenPresent(row::getChangeMngNo)
            .where(capaPlnIdx, isEqualTo(row::getCapaPlnIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cp2CapaPln> insertStatement);
}