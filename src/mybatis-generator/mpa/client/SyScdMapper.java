package mpa.client;

import static mpa.client.SyScdDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyScd;
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

public interface SyScdMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(scd, scdHir, loclNm, abbr, extCd1, extCd2, extCd3, ord, useYn, jnm, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyScdResult", value = {
        @Result(column="SCD", property="scd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="SCD_HIR", property="scdHir", jdbcType=JdbcType.VARCHAR),
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
    List<SyScd> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyScdResult")
    Optional<SyScd> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syScd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syScd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String scd_) {
        return delete(c -> 
            c.where(scd, isEqualTo(scd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyScd row) {
        return MyBatis3Utils.insert(this::insert, row, syScd, c ->
            c.map(scd).toProperty("scd")
            .map(scdHir).toProperty("scdHir")
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
    default Optional<SyScd> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syScd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyScd> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syScd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyScd> findById(String scd_) {
        return findOne(c ->
            c.where(scd, isEqualTo(scd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syScd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyScd row) {
        return update(c ->
            c.set(scdHir).equalToWhenPresent(row::getScdHir)
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
            .where(scd, isEqualTo(row::getScd))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyScd> insertStatement);
}