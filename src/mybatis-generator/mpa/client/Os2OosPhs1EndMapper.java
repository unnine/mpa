package mpa.client;

import static mpa.client.Os2OosPhs1EndDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Os2OosPhs1End;
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

public interface Os2OosPhs1EndMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(oosPhs1EndIdx, oosRcpIdx, tracIdx, docNo, crstPhs1Yn, crstRtestAttYn, prcsPhs1EndYn, prcsPhs2PrgYn, phs1EndAprIdx, udtIp, udtDs, udtUid, capaTracIdx, capaMngNo);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Os2OosPhs1EndResult", value = {
        @Result(column="OOS_PHS1_END_IDX", property="oosPhs1EndIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="OOS_RCP_IDX", property="oosRcpIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRST_PHS1_YN", property="crstPhs1Yn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRST_RTEST_ATT_YN", property="crstRtestAttYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRCS_PHS1_END_YN", property="prcsPhs1EndYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRCS_PHS2_PRG_YN", property="prcsPhs2PrgYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="PHS1_END_APR_IDX", property="phs1EndAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CAPA_TRAC_IDX", property="capaTracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CAPA_MNG_NO", property="capaMngNo", jdbcType=JdbcType.VARCHAR)
    })
    List<Os2OosPhs1End> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Os2OosPhs1EndResult")
    Optional<Os2OosPhs1End> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, os2OosPhs1End, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, os2OosPhs1End, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short oosPhs1EndIdx_) {
        return delete(c -> 
            c.where(oosPhs1EndIdx, isEqualTo(oosPhs1EndIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Os2OosPhs1End row) {
        return MyBatis3Utils.insert(this::insert, row, os2OosPhs1End, c ->
            c.map(oosPhs1EndIdx).toProperty("oosPhs1EndIdx")
            .map(oosRcpIdx).toProperty("oosRcpIdx")
            .map(tracIdx).toProperty("tracIdx")
            .map(docNo).toProperty("docNo")
            .map(crstPhs1Yn).toProperty("crstPhs1Yn")
            .map(crstRtestAttYn).toProperty("crstRtestAttYn")
            .map(prcsPhs1EndYn).toProperty("prcsPhs1EndYn")
            .map(prcsPhs2PrgYn).toProperty("prcsPhs2PrgYn")
            .map(phs1EndAprIdx).toProperty("phs1EndAprIdx")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(capaTracIdx).toProperty("capaTracIdx")
            .map(capaMngNo).toProperty("capaMngNo")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs1End> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, os2OosPhs1End, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Os2OosPhs1End> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, os2OosPhs1End, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs1End> findById(Short oosPhs1EndIdx_) {
        return findOne(c ->
            c.where(oosPhs1EndIdx, isEqualTo(oosPhs1EndIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, os2OosPhs1End, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Os2OosPhs1End row) {
        return update(c ->
            c.set(oosRcpIdx).equalToWhenPresent(row::getOosRcpIdx)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(crstPhs1Yn).equalToWhenPresent(row::getCrstPhs1Yn)
            .set(crstRtestAttYn).equalToWhenPresent(row::getCrstRtestAttYn)
            .set(prcsPhs1EndYn).equalToWhenPresent(row::getPrcsPhs1EndYn)
            .set(prcsPhs2PrgYn).equalToWhenPresent(row::getPrcsPhs2PrgYn)
            .set(phs1EndAprIdx).equalToWhenPresent(row::getPhs1EndAprIdx)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(capaTracIdx).equalToWhenPresent(row::getCapaTracIdx)
            .set(capaMngNo).equalToWhenPresent(row::getCapaMngNo)
            .where(oosPhs1EndIdx, isEqualTo(row::getOosPhs1EndIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Os2OosPhs1End> insertStatement);
}