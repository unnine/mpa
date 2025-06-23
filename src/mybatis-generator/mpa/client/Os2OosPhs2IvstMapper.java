package mpa.client;

import static mpa.client.Os2OosPhs2IvstDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Os2OosPhs2Ivst;
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

public interface Os2OosPhs2IvstMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(oosPhs2IvstIdx, oosRcpIdx, tracIdx, docNo, ivgSpccYn, ivgRst, rcsAtcYn, hyptIndcYn, hyptDfrYn, hyptDlgYn, hyptEtcYn, phs2IvstAprIdx, ver, udtIp, udtDs, udtUid, ivgStr, ivgEnd);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Os2OosPhs2IvstResult", value = {
        @Result(column="OOS_PHS2_IVST_IDX", property="oosPhs2IvstIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="OOS_RCP_IDX", property="oosRcpIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="IVG_SPCC_YN", property="ivgSpccYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="IVG_RST", property="ivgRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCS_ATC_YN", property="rcsAtcYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="HYPT_INDC_YN", property="hyptIndcYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="HYPT_DFR_YN", property="hyptDfrYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="HYPT_DLG_YN", property="hyptDlgYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="HYPT_ETC_YN", property="hyptEtcYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHS2_IVST_APR_IDX", property="phs2IvstAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="VER", property="ver", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="IVG_STR", property="ivgStr", jdbcType=JdbcType.VARCHAR),
        @Result(column="IVG_END", property="ivgEnd", jdbcType=JdbcType.VARCHAR)
    })
    List<Os2OosPhs2Ivst> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Os2OosPhs2IvstResult")
    Optional<Os2OosPhs2Ivst> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, os2OosPhs2Ivst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, os2OosPhs2Ivst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short oosPhs2IvstIdx_) {
        return delete(c -> 
            c.where(oosPhs2IvstIdx, isEqualTo(oosPhs2IvstIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Os2OosPhs2Ivst row) {
        return MyBatis3Utils.insert(this::insert, row, os2OosPhs2Ivst, c ->
            c.map(oosPhs2IvstIdx).toProperty("oosPhs2IvstIdx")
            .map(oosRcpIdx).toProperty("oosRcpIdx")
            .map(tracIdx).toProperty("tracIdx")
            .map(docNo).toProperty("docNo")
            .map(ivgSpccYn).toProperty("ivgSpccYn")
            .map(ivgRst).toProperty("ivgRst")
            .map(rcsAtcYn).toProperty("rcsAtcYn")
            .map(hyptIndcYn).toProperty("hyptIndcYn")
            .map(hyptDfrYn).toProperty("hyptDfrYn")
            .map(hyptDlgYn).toProperty("hyptDlgYn")
            .map(hyptEtcYn).toProperty("hyptEtcYn")
            .map(phs2IvstAprIdx).toProperty("phs2IvstAprIdx")
            .map(ver).toProperty("ver")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(ivgStr).toProperty("ivgStr")
            .map(ivgEnd).toProperty("ivgEnd")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs2Ivst> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, os2OosPhs2Ivst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Os2OosPhs2Ivst> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, os2OosPhs2Ivst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs2Ivst> findById(Short oosPhs2IvstIdx_) {
        return findOne(c ->
            c.where(oosPhs2IvstIdx, isEqualTo(oosPhs2IvstIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, os2OosPhs2Ivst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Os2OosPhs2Ivst row) {
        return update(c ->
            c.set(oosRcpIdx).equalToWhenPresent(row::getOosRcpIdx)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(ivgSpccYn).equalToWhenPresent(row::getIvgSpccYn)
            .set(ivgRst).equalToWhenPresent(row::getIvgRst)
            .set(rcsAtcYn).equalToWhenPresent(row::getRcsAtcYn)
            .set(hyptIndcYn).equalToWhenPresent(row::getHyptIndcYn)
            .set(hyptDfrYn).equalToWhenPresent(row::getHyptDfrYn)
            .set(hyptDlgYn).equalToWhenPresent(row::getHyptDlgYn)
            .set(hyptEtcYn).equalToWhenPresent(row::getHyptEtcYn)
            .set(phs2IvstAprIdx).equalToWhenPresent(row::getPhs2IvstAprIdx)
            .set(ver).equalToWhenPresent(row::getVer)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(ivgStr).equalToWhenPresent(row::getIvgStr)
            .set(ivgEnd).equalToWhenPresent(row::getIvgEnd)
            .where(oosPhs2IvstIdx, isEqualTo(row::getOosPhs2IvstIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Os2OosPhs2Ivst> insertStatement);
}