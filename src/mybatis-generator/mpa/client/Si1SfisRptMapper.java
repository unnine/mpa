package mpa.client;

import static mpa.client.Si1SfisRptDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Si1SfisRpt;
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

public interface Si1SfisRptMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(sfisRptIdx, sfisIdx, sfisRst, fileIdx, fileCtt, sfisRptAprIdx, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, tracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Si1SfisRptResult", value = {
        @Result(column="SFIS_RPT_IDX", property="sfisRptIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="SFIS_IDX", property="sfisIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="SFIS_RST", property="sfisRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="FILE_CTT", property="fileCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFIS_RPT_APR_IDX", property="sfisRptAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Si1SfisRpt> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Si1SfisRptResult")
    Optional<Si1SfisRpt> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, si1SfisRpt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, si1SfisRpt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short sfisRptIdx_) {
        return delete(c -> 
            c.where(sfisRptIdx, isEqualTo(sfisRptIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Si1SfisRpt row) {
        return MyBatis3Utils.insert(this::insert, row, si1SfisRpt, c ->
            c.map(sfisRptIdx).toProperty("sfisRptIdx")
            .map(sfisIdx).toProperty("sfisIdx")
            .map(sfisRst).toProperty("sfisRst")
            .map(fileIdx).toProperty("fileIdx")
            .map(fileCtt).toProperty("fileCtt")
            .map(sfisRptAprIdx).toProperty("sfisRptAprIdx")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(tracIdx).toProperty("tracIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Si1SfisRpt> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, si1SfisRpt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Si1SfisRpt> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, si1SfisRpt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Si1SfisRpt> findById(Short sfisRptIdx_) {
        return findOne(c ->
            c.where(sfisRptIdx, isEqualTo(sfisRptIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, si1SfisRpt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Si1SfisRpt row) {
        return update(c ->
            c.set(sfisIdx).equalToWhenPresent(row::getSfisIdx)
            .set(sfisRst).equalToWhenPresent(row::getSfisRst)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(fileCtt).equalToWhenPresent(row::getFileCtt)
            .set(sfisRptAprIdx).equalToWhenPresent(row::getSfisRptAprIdx)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .where(sfisRptIdx, isEqualTo(row::getSfisRptIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Si1SfisRpt> insertStatement);
}