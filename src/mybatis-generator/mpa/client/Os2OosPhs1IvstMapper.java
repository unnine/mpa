package mpa.client;

import static mpa.client.Os2OosPhs1IvstDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Os2OosPhs1Ivst;
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

public interface Os2OosPhs1IvstMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(oosPhs1IvstIdx, oosRcpIdx, tracIdx, docNo, obvYn, udtIp, udtDs, udtUid, phs1IvstAprIdx, fileIdx, ivgStr, ivgEnd, rtestYn, rtestTestNo, rtestTestRst, rtestJdg, dataCopyAttYn, attEtcYn, attEtc);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Os2OosPhs1IvstResult", value = {
        @Result(column="OOS_PHS1_IVST_IDX", property="oosPhs1IvstIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="OOS_RCP_IDX", property="oosRcpIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBV_YN", property="obvYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHS1_IVST_APR_IDX", property="phs1IvstAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="IVG_STR", property="ivgStr", jdbcType=JdbcType.VARCHAR),
        @Result(column="IVG_END", property="ivgEnd", jdbcType=JdbcType.VARCHAR),
        @Result(column="RTEST_YN", property="rtestYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RTEST_TEST_NO", property="rtestTestNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="RTEST_TEST_RST", property="rtestTestRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="RTEST_JDG", property="rtestJdg", jdbcType=JdbcType.VARCHAR),
        @Result(column="DATA_COPY_ATT_YN", property="dataCopyAttYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ATT_ETC_YN", property="attEtcYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ATT_ETC", property="attEtc", jdbcType=JdbcType.VARCHAR)
    })
    List<Os2OosPhs1Ivst> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Os2OosPhs1IvstResult")
    Optional<Os2OosPhs1Ivst> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, os2OosPhs1Ivst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, os2OosPhs1Ivst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short oosPhs1IvstIdx_) {
        return delete(c -> 
            c.where(oosPhs1IvstIdx, isEqualTo(oosPhs1IvstIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Os2OosPhs1Ivst row) {
        return MyBatis3Utils.insert(this::insert, row, os2OosPhs1Ivst, c ->
            c.map(oosPhs1IvstIdx).toProperty("oosPhs1IvstIdx")
            .map(oosRcpIdx).toProperty("oosRcpIdx")
            .map(tracIdx).toProperty("tracIdx")
            .map(docNo).toProperty("docNo")
            .map(obvYn).toProperty("obvYn")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(phs1IvstAprIdx).toProperty("phs1IvstAprIdx")
            .map(fileIdx).toProperty("fileIdx")
            .map(ivgStr).toProperty("ivgStr")
            .map(ivgEnd).toProperty("ivgEnd")
            .map(rtestYn).toProperty("rtestYn")
            .map(rtestTestNo).toProperty("rtestTestNo")
            .map(rtestTestRst).toProperty("rtestTestRst")
            .map(rtestJdg).toProperty("rtestJdg")
            .map(dataCopyAttYn).toProperty("dataCopyAttYn")
            .map(attEtcYn).toProperty("attEtcYn")
            .map(attEtc).toProperty("attEtc")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs1Ivst> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, os2OosPhs1Ivst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Os2OosPhs1Ivst> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, os2OosPhs1Ivst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs1Ivst> findById(Short oosPhs1IvstIdx_) {
        return findOne(c ->
            c.where(oosPhs1IvstIdx, isEqualTo(oosPhs1IvstIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, os2OosPhs1Ivst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Os2OosPhs1Ivst row) {
        return update(c ->
            c.set(oosRcpIdx).equalToWhenPresent(row::getOosRcpIdx)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(obvYn).equalToWhenPresent(row::getObvYn)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(phs1IvstAprIdx).equalToWhenPresent(row::getPhs1IvstAprIdx)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(ivgStr).equalToWhenPresent(row::getIvgStr)
            .set(ivgEnd).equalToWhenPresent(row::getIvgEnd)
            .set(rtestYn).equalToWhenPresent(row::getRtestYn)
            .set(rtestTestNo).equalToWhenPresent(row::getRtestTestNo)
            .set(rtestTestRst).equalToWhenPresent(row::getRtestTestRst)
            .set(rtestJdg).equalToWhenPresent(row::getRtestJdg)
            .set(dataCopyAttYn).equalToWhenPresent(row::getDataCopyAttYn)
            .set(attEtcYn).equalToWhenPresent(row::getAttEtcYn)
            .set(attEtc).equalToWhenPresent(row::getAttEtc)
            .where(oosPhs1IvstIdx, isEqualTo(row::getOosPhs1IvstIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Os2OosPhs1Ivst> insertStatement);
}