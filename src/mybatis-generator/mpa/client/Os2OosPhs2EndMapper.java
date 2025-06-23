package mpa.client;

import static mpa.client.Os2OosPhs2EndDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Os2OosPhs2End;
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

public interface Os2OosPhs2EndMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(oosPhs2EndIdx, tracIdx, docNo, crstPhs2IvgYn, crstHyptEnfoYn, crstRtestEnfoYn, prcsPhs2EndYn, prcsPhs2RprgYn, phs2EndAprIdx, udtIp, udtDs, udtUid, capaTracIdx, capaMngNo, oosPhs2IvstIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Os2OosPhs2EndResult", value = {
        @Result(column="OOS_PHS2_END_IDX", property="oosPhs2EndIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRST_PHS2_IVG_YN", property="crstPhs2IvgYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRST_HYPT_ENFO_YN", property="crstHyptEnfoYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRST_RTEST_ENFO_YN", property="crstRtestEnfoYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRCS_PHS2_END_YN", property="prcsPhs2EndYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRCS_PHS2_RPRG_YN", property="prcsPhs2RprgYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHS2_END_APR_IDX", property="phs2EndAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CAPA_TRAC_IDX", property="capaTracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CAPA_MNG_NO", property="capaMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="OOS_PHS2_IVST_IDX", property="oosPhs2IvstIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Os2OosPhs2End> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Os2OosPhs2EndResult")
    Optional<Os2OosPhs2End> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, os2OosPhs2End, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, os2OosPhs2End, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short oosPhs2EndIdx_) {
        return delete(c -> 
            c.where(oosPhs2EndIdx, isEqualTo(oosPhs2EndIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Os2OosPhs2End row) {
        return MyBatis3Utils.insert(this::insert, row, os2OosPhs2End, c ->
            c.map(oosPhs2EndIdx).toProperty("oosPhs2EndIdx")
            .map(tracIdx).toProperty("tracIdx")
            .map(docNo).toProperty("docNo")
            .map(crstPhs2IvgYn).toProperty("crstPhs2IvgYn")
            .map(crstHyptEnfoYn).toProperty("crstHyptEnfoYn")
            .map(crstRtestEnfoYn).toProperty("crstRtestEnfoYn")
            .map(prcsPhs2EndYn).toProperty("prcsPhs2EndYn")
            .map(prcsPhs2RprgYn).toProperty("prcsPhs2RprgYn")
            .map(phs2EndAprIdx).toProperty("phs2EndAprIdx")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(capaTracIdx).toProperty("capaTracIdx")
            .map(capaMngNo).toProperty("capaMngNo")
            .map(oosPhs2IvstIdx).toProperty("oosPhs2IvstIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs2End> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, os2OosPhs2End, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Os2OosPhs2End> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, os2OosPhs2End, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs2End> findById(Short oosPhs2EndIdx_) {
        return findOne(c ->
            c.where(oosPhs2EndIdx, isEqualTo(oosPhs2EndIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, os2OosPhs2End, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Os2OosPhs2End row) {
        return update(c ->
            c.set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(crstPhs2IvgYn).equalToWhenPresent(row::getCrstPhs2IvgYn)
            .set(crstHyptEnfoYn).equalToWhenPresent(row::getCrstHyptEnfoYn)
            .set(crstRtestEnfoYn).equalToWhenPresent(row::getCrstRtestEnfoYn)
            .set(prcsPhs2EndYn).equalToWhenPresent(row::getPrcsPhs2EndYn)
            .set(prcsPhs2RprgYn).equalToWhenPresent(row::getPrcsPhs2RprgYn)
            .set(phs2EndAprIdx).equalToWhenPresent(row::getPhs2EndAprIdx)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(capaTracIdx).equalToWhenPresent(row::getCapaTracIdx)
            .set(capaMngNo).equalToWhenPresent(row::getCapaMngNo)
            .set(oosPhs2IvstIdx).equalToWhenPresent(row::getOosPhs2IvstIdx)
            .where(oosPhs2EndIdx, isEqualTo(row::getOosPhs2EndIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Os2OosPhs2End> insertStatement);
}