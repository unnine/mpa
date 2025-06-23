package mpa.client;

import static mpa.client.Si1SfisPlnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Si1SfisPln;
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

public interface Si1SfisPlnMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(sfisPlnIdx, hirSfisPlnIdx, rvsNo, rvsYn, rvsRea, rvsDs, sysVerCd, plntCd, qmsMngNo, docNo, tracIdx, sfisPlnAprIdx, sfisPlnProc, sfisPps, rmk, fileIdx, fileCtt, delYn, useYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, modlTracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Si1SfisPlnResult", value = {
        @Result(column="SFIS_PLN_IDX", property="sfisPlnIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="HIR_SFIS_PLN_IDX", property="hirSfisPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RVS_NO", property="rvsNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_YN", property="rvsYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_REA", property="rvsRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_DS", property="rvsDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="SFIS_PLN_APR_IDX", property="sfisPlnAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="SFIS_PLN_PROC", property="sfisPlnProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFIS_PPS", property="sfisPps", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="FILE_CTT", property="fileCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_TRAC_IDX", property="modlTracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Si1SfisPln> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Si1SfisPlnResult")
    Optional<Si1SfisPln> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, si1SfisPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, si1SfisPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short sfisPlnIdx_) {
        return delete(c -> 
            c.where(sfisPlnIdx, isEqualTo(sfisPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Si1SfisPln row) {
        return MyBatis3Utils.insert(this::insert, row, si1SfisPln, c ->
            c.map(sfisPlnIdx).toProperty("sfisPlnIdx")
            .map(hirSfisPlnIdx).toProperty("hirSfisPlnIdx")
            .map(rvsNo).toProperty("rvsNo")
            .map(rvsYn).toProperty("rvsYn")
            .map(rvsRea).toProperty("rvsRea")
            .map(rvsDs).toProperty("rvsDs")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(plntCd).toProperty("plntCd")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(tracIdx).toProperty("tracIdx")
            .map(sfisPlnAprIdx).toProperty("sfisPlnAprIdx")
            .map(sfisPlnProc).toProperty("sfisPlnProc")
            .map(sfisPps).toProperty("sfisPps")
            .map(rmk).toProperty("rmk")
            .map(fileIdx).toProperty("fileIdx")
            .map(fileCtt).toProperty("fileCtt")
            .map(delYn).toProperty("delYn")
            .map(useYn).toProperty("useYn")
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
    default Optional<Si1SfisPln> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, si1SfisPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Si1SfisPln> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, si1SfisPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Si1SfisPln> findById(Short sfisPlnIdx_) {
        return findOne(c ->
            c.where(sfisPlnIdx, isEqualTo(sfisPlnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, si1SfisPln, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Si1SfisPln row) {
        return update(c ->
            c.set(hirSfisPlnIdx).equalToWhenPresent(row::getHirSfisPlnIdx)
            .set(rvsNo).equalToWhenPresent(row::getRvsNo)
            .set(rvsYn).equalToWhenPresent(row::getRvsYn)
            .set(rvsRea).equalToWhenPresent(row::getRvsRea)
            .set(rvsDs).equalToWhenPresent(row::getRvsDs)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(sfisPlnAprIdx).equalToWhenPresent(row::getSfisPlnAprIdx)
            .set(sfisPlnProc).equalToWhenPresent(row::getSfisPlnProc)
            .set(sfisPps).equalToWhenPresent(row::getSfisPps)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(fileCtt).equalToWhenPresent(row::getFileCtt)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(modlTracIdx).equalToWhenPresent(row::getModlTracIdx)
            .where(sfisPlnIdx, isEqualTo(row::getSfisPlnIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Si1SfisPln> insertStatement);
}