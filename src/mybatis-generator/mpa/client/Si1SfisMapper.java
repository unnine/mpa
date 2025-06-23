package mpa.client;

import static mpa.client.Si1SfisDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Si1Sfis;
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

public interface Si1SfisMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(sfisIdx, sfisPlnTagtIdx, tracIdx, qmsMngNo, docNo, sfisEnfoDt, sfisRstAprIdx, sfisRstProc, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Si1SfisResult", value = {
        @Result(column="SFIS_IDX", property="sfisIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="SFIS_PLN_TAGT_IDX", property="sfisPlnTagtIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFIS_ENFO_DT", property="sfisEnfoDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFIS_RST_APR_IDX", property="sfisRstAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="SFIS_RST_PROC", property="sfisRstProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Si1Sfis> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Si1SfisResult")
    Optional<Si1Sfis> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, si1Sfis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, si1Sfis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short sfisIdx_) {
        return delete(c -> 
            c.where(sfisIdx, isEqualTo(sfisIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Si1Sfis row) {
        return MyBatis3Utils.insert(this::insert, row, si1Sfis, c ->
            c.map(sfisIdx).toProperty("sfisIdx")
            .map(sfisPlnTagtIdx).toProperty("sfisPlnTagtIdx")
            .map(tracIdx).toProperty("tracIdx")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(sfisEnfoDt).toProperty("sfisEnfoDt")
            .map(sfisRstAprIdx).toProperty("sfisRstAprIdx")
            .map(sfisRstProc).toProperty("sfisRstProc")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Si1Sfis> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, si1Sfis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Si1Sfis> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, si1Sfis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Si1Sfis> findById(Short sfisIdx_) {
        return findOne(c ->
            c.where(sfisIdx, isEqualTo(sfisIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, si1Sfis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Si1Sfis row) {
        return update(c ->
            c.set(sfisPlnTagtIdx).equalToWhenPresent(row::getSfisPlnTagtIdx)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(sfisEnfoDt).equalToWhenPresent(row::getSfisEnfoDt)
            .set(sfisRstAprIdx).equalToWhenPresent(row::getSfisRstAprIdx)
            .set(sfisRstProc).equalToWhenPresent(row::getSfisRstProc)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(sfisIdx, isEqualTo(row::getSfisIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Si1Sfis> insertStatement);
}