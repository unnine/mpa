package mpa.client;

import static mpa.client.Cp2CapaPlnEndDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cp2CapaPlnEnd;
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

public interface Cp2CapaPlnEndMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(capaEndIdx, capaPlnIdx, jdgYn, jdgSplmRea, plnEndAprIdx, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, tracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cp2CapaPlnEndResult", value = {
        @Result(column="CAPA_END_IDX", property="capaEndIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CAPA_PLN_IDX", property="capaPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="JDG_YN", property="jdgYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="JDG_SPLM_REA", property="jdgSplmRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLN_END_APR_IDX", property="plnEndAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Cp2CapaPlnEnd> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cp2CapaPlnEndResult")
    Optional<Cp2CapaPlnEnd> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cp2CapaPlnEnd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cp2CapaPlnEnd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short capaEndIdx_) {
        return delete(c -> 
            c.where(capaEndIdx, isEqualTo(capaEndIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cp2CapaPlnEnd row) {
        return MyBatis3Utils.insert(this::insert, row, cp2CapaPlnEnd, c ->
            c.map(capaEndIdx).toProperty("capaEndIdx")
            .map(capaPlnIdx).toProperty("capaPlnIdx")
            .map(jdgYn).toProperty("jdgYn")
            .map(jdgSplmRea).toProperty("jdgSplmRea")
            .map(plnEndAprIdx).toProperty("plnEndAprIdx")
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
    default Optional<Cp2CapaPlnEnd> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cp2CapaPlnEnd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cp2CapaPlnEnd> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cp2CapaPlnEnd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaPlnEnd> findById(Short capaEndIdx_) {
        return findOne(c ->
            c.where(capaEndIdx, isEqualTo(capaEndIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cp2CapaPlnEnd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cp2CapaPlnEnd row) {
        return update(c ->
            c.set(capaPlnIdx).equalToWhenPresent(row::getCapaPlnIdx)
            .set(jdgYn).equalToWhenPresent(row::getJdgYn)
            .set(jdgSplmRea).equalToWhenPresent(row::getJdgSplmRea)
            .set(plnEndAprIdx).equalToWhenPresent(row::getPlnEndAprIdx)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .where(capaEndIdx, isEqualTo(row::getCapaEndIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cp2CapaPlnEnd> insertStatement);
}