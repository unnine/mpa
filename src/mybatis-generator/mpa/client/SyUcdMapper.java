package mpa.client;

import static mpa.client.SyUcdDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyUcd;
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

public interface SyUcdMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(ucd, plntCd, ucdHir, loclNm, abbr, extCd1, extCd2, extCd3, ord, useYn, jnm, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyUcdResult", value = {
        @Result(column="UCD", property="ucd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="UCD_HIR", property="ucdHir", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCL_NM", property="loclNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="ABBR", property="abbr", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_CD1", property="extCd1", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_CD2", property="extCd2", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_CD3", property="extCd3", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="JNM", property="jnm", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<SyUcd> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyUcdResult")
    Optional<SyUcd> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syUcd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syUcd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String ucd_) {
        return delete(c -> 
            c.where(ucd, isEqualTo(ucd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyUcd row) {
        return MyBatis3Utils.insert(this::insert, row, syUcd, c ->
            c.map(ucd).toProperty("ucd")
            .map(plntCd).toProperty("plntCd")
            .map(ucdHir).toProperty("ucdHir")
            .map(loclNm).toProperty("loclNm")
            .map(abbr).toProperty("abbr")
            .map(extCd1).toProperty("extCd1")
            .map(extCd2).toProperty("extCd2")
            .map(extCd3).toProperty("extCd3")
            .map(ord).toProperty("ord")
            .map(useYn).toProperty("useYn")
            .map(jnm).toProperty("jnm")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUcd> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syUcd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyUcd> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syUcd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUcd> findById(String ucd_) {
        return findOne(c ->
            c.where(ucd, isEqualTo(ucd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syUcd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyUcd row) {
        return update(c ->
            c.set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(ucdHir).equalToWhenPresent(row::getUcdHir)
            .set(loclNm).equalToWhenPresent(row::getLoclNm)
            .set(abbr).equalToWhenPresent(row::getAbbr)
            .set(extCd1).equalToWhenPresent(row::getExtCd1)
            .set(extCd2).equalToWhenPresent(row::getExtCd2)
            .set(extCd3).equalToWhenPresent(row::getExtCd3)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(jnm).equalToWhenPresent(row::getJnm)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(ucd, isEqualTo(row::getUcd))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyUcd> insertStatement);
}