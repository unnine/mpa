package mpa.client;

import static mpa.client.Cp2CapaPlnRstDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cp2CapaPlnRst;
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

public interface Cp2CapaPlnRstMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(capaRstIdx, capaPlnIdx, capaRst, cplDt, trniYn, fileIdx, plnRstAprIdx, chgYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, tracIdx, vlamNcsYn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cp2CapaPlnRstResult", value = {
        @Result(column="CAPA_RST_IDX", property="capaRstIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CAPA_PLN_IDX", property="capaPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CAPA_RST", property="capaRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="CPL_DT", property="cplDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_YN", property="trniYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PLN_RST_APR_IDX", property="plnRstAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CHG_YN", property="chgYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="VLAM_NCS_YN", property="vlamNcsYn", jdbcType=JdbcType.VARCHAR)
    })
    List<Cp2CapaPlnRst> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cp2CapaPlnRstResult")
    Optional<Cp2CapaPlnRst> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cp2CapaPlnRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cp2CapaPlnRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short capaRstIdx_) {
        return delete(c -> 
            c.where(capaRstIdx, isEqualTo(capaRstIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cp2CapaPlnRst row) {
        return MyBatis3Utils.insert(this::insert, row, cp2CapaPlnRst, c ->
            c.map(capaRstIdx).toProperty("capaRstIdx")
            .map(capaPlnIdx).toProperty("capaPlnIdx")
            .map(capaRst).toProperty("capaRst")
            .map(cplDt).toProperty("cplDt")
            .map(trniYn).toProperty("trniYn")
            .map(fileIdx).toProperty("fileIdx")
            .map(plnRstAprIdx).toProperty("plnRstAprIdx")
            .map(chgYn).toProperty("chgYn")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(tracIdx).toProperty("tracIdx")
            .map(vlamNcsYn).toProperty("vlamNcsYn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaPlnRst> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cp2CapaPlnRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cp2CapaPlnRst> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cp2CapaPlnRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaPlnRst> findById(Short capaRstIdx_) {
        return findOne(c ->
            c.where(capaRstIdx, isEqualTo(capaRstIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cp2CapaPlnRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cp2CapaPlnRst row) {
        return update(c ->
            c.set(capaPlnIdx).equalToWhenPresent(row::getCapaPlnIdx)
            .set(capaRst).equalToWhenPresent(row::getCapaRst)
            .set(cplDt).equalToWhenPresent(row::getCplDt)
            .set(trniYn).equalToWhenPresent(row::getTrniYn)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(plnRstAprIdx).equalToWhenPresent(row::getPlnRstAprIdx)
            .set(chgYn).equalToWhenPresent(row::getChgYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(vlamNcsYn).equalToWhenPresent(row::getVlamNcsYn)
            .where(capaRstIdx, isEqualTo(row::getCapaRstIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cp2CapaPlnRst> insertStatement);
}