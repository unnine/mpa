package mpa.client;

import static mpa.client.Os2OosPhs2HyptDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Os2OosPhs2Hypt;
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

public interface Os2OosPhs2HyptMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(oosPhs2HyptIdx, tracIdx, docNo, oosPhs2IvstIdx, dfrIdtsmpuse, dfrTestNo, dfrTestRst, dfrPpsTestRst, dfrTestJdg, dfrPpsJdg, dlgIdtsmpuse, dlgTestNo, dlgTestRst, dlgTestJdg, etcRcsConfYn, etcRcsAtc, etcRcsHyptRsetYn, etcRcsMakTrsmYn, dfrTestFileIdx, phs2HyptAprIdx, udtIp, udtDs, udtUid, dlgTestFileIdx, etcHyptFileIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Os2OosPhs2HyptResult", value = {
        @Result(column="OOS_PHS2_HYPT_IDX", property="oosPhs2HyptIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="OOS_PHS2_IVST_IDX", property="oosPhs2IvstIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DFR_IDTSMPUSE", property="dfrIdtsmpuse", jdbcType=JdbcType.VARCHAR),
        @Result(column="DFR_TEST_NO", property="dfrTestNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DFR_TEST_RST", property="dfrTestRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="DFR_PPS_TEST_RST", property="dfrPpsTestRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="DFR_TEST_JDG", property="dfrTestJdg", jdbcType=JdbcType.VARCHAR),
        @Result(column="DFR_PPS_JDG", property="dfrPpsJdg", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLG_IDTSMPUSE", property="dlgIdtsmpuse", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLG_TEST_NO", property="dlgTestNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLG_TEST_RST", property="dlgTestRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLG_TEST_JDG", property="dlgTestJdg", jdbcType=JdbcType.VARCHAR),
        @Result(column="ETC_RCS_CONF_YN", property="etcRcsConfYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ETC_RCS_ATC", property="etcRcsAtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ETC_RCS_HYPT_RSET_YN", property="etcRcsHyptRsetYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ETC_RCS_MAK_TRSM_YN", property="etcRcsMakTrsmYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="DFR_TEST_FILE_IDX", property="dfrTestFileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PHS2_HYPT_APR_IDX", property="phs2HyptAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLG_TEST_FILE_IDX", property="dlgTestFileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="ETC_HYPT_FILE_IDX", property="etcHyptFileIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Os2OosPhs2Hypt> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Os2OosPhs2HyptResult")
    Optional<Os2OosPhs2Hypt> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, os2OosPhs2Hypt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, os2OosPhs2Hypt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short oosPhs2HyptIdx_) {
        return delete(c -> 
            c.where(oosPhs2HyptIdx, isEqualTo(oosPhs2HyptIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Os2OosPhs2Hypt row) {
        return MyBatis3Utils.insert(this::insert, row, os2OosPhs2Hypt, c ->
            c.map(oosPhs2HyptIdx).toProperty("oosPhs2HyptIdx")
            .map(tracIdx).toProperty("tracIdx")
            .map(docNo).toProperty("docNo")
            .map(oosPhs2IvstIdx).toProperty("oosPhs2IvstIdx")
            .map(dfrIdtsmpuse).toProperty("dfrIdtsmpuse")
            .map(dfrTestNo).toProperty("dfrTestNo")
            .map(dfrTestRst).toProperty("dfrTestRst")
            .map(dfrPpsTestRst).toProperty("dfrPpsTestRst")
            .map(dfrTestJdg).toProperty("dfrTestJdg")
            .map(dfrPpsJdg).toProperty("dfrPpsJdg")
            .map(dlgIdtsmpuse).toProperty("dlgIdtsmpuse")
            .map(dlgTestNo).toProperty("dlgTestNo")
            .map(dlgTestRst).toProperty("dlgTestRst")
            .map(dlgTestJdg).toProperty("dlgTestJdg")
            .map(etcRcsConfYn).toProperty("etcRcsConfYn")
            .map(etcRcsAtc).toProperty("etcRcsAtc")
            .map(etcRcsHyptRsetYn).toProperty("etcRcsHyptRsetYn")
            .map(etcRcsMakTrsmYn).toProperty("etcRcsMakTrsmYn")
            .map(dfrTestFileIdx).toProperty("dfrTestFileIdx")
            .map(phs2HyptAprIdx).toProperty("phs2HyptAprIdx")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(dlgTestFileIdx).toProperty("dlgTestFileIdx")
            .map(etcHyptFileIdx).toProperty("etcHyptFileIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs2Hypt> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, os2OosPhs2Hypt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Os2OosPhs2Hypt> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, os2OosPhs2Hypt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs2Hypt> findById(Short oosPhs2HyptIdx_) {
        return findOne(c ->
            c.where(oosPhs2HyptIdx, isEqualTo(oosPhs2HyptIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, os2OosPhs2Hypt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Os2OosPhs2Hypt row) {
        return update(c ->
            c.set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(oosPhs2IvstIdx).equalToWhenPresent(row::getOosPhs2IvstIdx)
            .set(dfrIdtsmpuse).equalToWhenPresent(row::getDfrIdtsmpuse)
            .set(dfrTestNo).equalToWhenPresent(row::getDfrTestNo)
            .set(dfrTestRst).equalToWhenPresent(row::getDfrTestRst)
            .set(dfrPpsTestRst).equalToWhenPresent(row::getDfrPpsTestRst)
            .set(dfrTestJdg).equalToWhenPresent(row::getDfrTestJdg)
            .set(dfrPpsJdg).equalToWhenPresent(row::getDfrPpsJdg)
            .set(dlgIdtsmpuse).equalToWhenPresent(row::getDlgIdtsmpuse)
            .set(dlgTestNo).equalToWhenPresent(row::getDlgTestNo)
            .set(dlgTestRst).equalToWhenPresent(row::getDlgTestRst)
            .set(dlgTestJdg).equalToWhenPresent(row::getDlgTestJdg)
            .set(etcRcsConfYn).equalToWhenPresent(row::getEtcRcsConfYn)
            .set(etcRcsAtc).equalToWhenPresent(row::getEtcRcsAtc)
            .set(etcRcsHyptRsetYn).equalToWhenPresent(row::getEtcRcsHyptRsetYn)
            .set(etcRcsMakTrsmYn).equalToWhenPresent(row::getEtcRcsMakTrsmYn)
            .set(dfrTestFileIdx).equalToWhenPresent(row::getDfrTestFileIdx)
            .set(phs2HyptAprIdx).equalToWhenPresent(row::getPhs2HyptAprIdx)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(dlgTestFileIdx).equalToWhenPresent(row::getDlgTestFileIdx)
            .set(etcHyptFileIdx).equalToWhenPresent(row::getEtcHyptFileIdx)
            .where(oosPhs2HyptIdx, isEqualTo(row::getOosPhs2HyptIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Os2OosPhs2Hypt> insertStatement);
}