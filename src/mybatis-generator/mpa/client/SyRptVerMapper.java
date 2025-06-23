package mpa.client;

import static mpa.client.SyRptVerDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyRptVer;
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

public interface SyRptVerMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(rptVerIdx, rptIdx, rptRdPath, rptNm, docNo, rptVer, rvsDt, rmk, ord, useVerYn, strDt, endDt, useYn, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyRptVerResult", value = {
        @Result(column="RPT_VER_IDX", property="rptVerIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="RPT_IDX", property="rptIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RPT_RD_PATH", property="rptRdPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPT_NM", property="rptNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPT_VER", property="rptVer", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_DT", property="rvsDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="USE_VER_YN", property="useVerYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="STR_DT", property="strDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="END_DT", property="endDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<SyRptVer> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyRptVerResult")
    Optional<SyRptVer> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syRptVer, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syRptVer, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short rptVerIdx_) {
        return delete(c -> 
            c.where(rptVerIdx, isEqualTo(rptVerIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyRptVer row) {
        return MyBatis3Utils.insert(this::insert, row, syRptVer, c ->
            c.map(rptVerIdx).toProperty("rptVerIdx")
            .map(rptIdx).toProperty("rptIdx")
            .map(rptRdPath).toProperty("rptRdPath")
            .map(rptNm).toProperty("rptNm")
            .map(docNo).toProperty("docNo")
            .map(rptVer).toProperty("rptVer")
            .map(rvsDt).toProperty("rvsDt")
            .map(rmk).toProperty("rmk")
            .map(ord).toProperty("ord")
            .map(useVerYn).toProperty("useVerYn")
            .map(strDt).toProperty("strDt")
            .map(endDt).toProperty("endDt")
            .map(useYn).toProperty("useYn")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyRptVer> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syRptVer, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyRptVer> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syRptVer, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyRptVer> findById(Short rptVerIdx_) {
        return findOne(c ->
            c.where(rptVerIdx, isEqualTo(rptVerIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syRptVer, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyRptVer row) {
        return update(c ->
            c.set(rptIdx).equalToWhenPresent(row::getRptIdx)
            .set(rptRdPath).equalToWhenPresent(row::getRptRdPath)
            .set(rptNm).equalToWhenPresent(row::getRptNm)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(rptVer).equalToWhenPresent(row::getRptVer)
            .set(rvsDt).equalToWhenPresent(row::getRvsDt)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(useVerYn).equalToWhenPresent(row::getUseVerYn)
            .set(strDt).equalToWhenPresent(row::getStrDt)
            .set(endDt).equalToWhenPresent(row::getEndDt)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(rptVerIdx, isEqualTo(row::getRptVerIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyRptVer> insertStatement);
}