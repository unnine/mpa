package mpa.client;

import static mpa.client.QmComQlistCdDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.QmComQlistCd;
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

public interface QmComQlistCdMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(comQlistCd, hirQlistCd, qlistNm, rmk, ord, useYn, delYn, extCd1, extCd2, extCd3, extCd4, extCd5, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QmComQlistCdResult", value = {
        @Result(column="COM_QLIST_CD", property="comQlistCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="HIR_QLIST_CD", property="hirQlistCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="QLIST_NM", property="qlistNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_CD1", property="extCd1", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_CD2", property="extCd2", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_CD3", property="extCd3", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_CD4", property="extCd4", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXT_CD5", property="extCd5", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<QmComQlistCd> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("QmComQlistCdResult")
    Optional<QmComQlistCd> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, qmComQlistCd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, qmComQlistCd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String comQlistCd_) {
        return delete(c -> 
            c.where(comQlistCd, isEqualTo(comQlistCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(QmComQlistCd row) {
        return MyBatis3Utils.insert(this::insert, row, qmComQlistCd, c ->
            c.map(comQlistCd).toProperty("comQlistCd")
            .map(hirQlistCd).toProperty("hirQlistCd")
            .map(qlistNm).toProperty("qlistNm")
            .map(rmk).toProperty("rmk")
            .map(ord).toProperty("ord")
            .map(useYn).toProperty("useYn")
            .map(delYn).toProperty("delYn")
            .map(extCd1).toProperty("extCd1")
            .map(extCd2).toProperty("extCd2")
            .map(extCd3).toProperty("extCd3")
            .map(extCd4).toProperty("extCd4")
            .map(extCd5).toProperty("extCd5")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmComQlistCd> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, qmComQlistCd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<QmComQlistCd> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, qmComQlistCd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmComQlistCd> findById(String comQlistCd_) {
        return findOne(c ->
            c.where(comQlistCd, isEqualTo(comQlistCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, qmComQlistCd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(QmComQlistCd row) {
        return update(c ->
            c.set(hirQlistCd).equalToWhenPresent(row::getHirQlistCd)
            .set(qlistNm).equalToWhenPresent(row::getQlistNm)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(extCd1).equalToWhenPresent(row::getExtCd1)
            .set(extCd2).equalToWhenPresent(row::getExtCd2)
            .set(extCd3).equalToWhenPresent(row::getExtCd3)
            .set(extCd4).equalToWhenPresent(row::getExtCd4)
            .set(extCd5).equalToWhenPresent(row::getExtCd5)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(comQlistCd, isEqualTo(row::getComQlistCd))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<QmComQlistCd> insertStatement);
}