package mpa.client;

import static mpa.client.QmQlistCdDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.QmQlistCd;
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

public interface QmQlistCdMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(qlistCd, hirQlistCd, plntCd, qlistDiv, qlistVer, loclQlistNm, ord, useYn, delYn, extCd1, extCd2, extCd3, extCd4, extCd5, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, rmk);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QmQlistCdResult", value = {
        @Result(column="QLIST_CD", property="qlistCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="HIR_QLIST_CD", property="hirQlistCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="QLIST_DIV", property="qlistDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="QLIST_VER", property="qlistVer", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCL_QLIST_NM", property="loclQlistNm", jdbcType=JdbcType.VARCHAR),
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
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR)
    })
    List<QmQlistCd> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("QmQlistCdResult")
    Optional<QmQlistCd> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, qmQlistCd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, qmQlistCd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String qlistCd_) {
        return delete(c -> 
            c.where(qlistCd, isEqualTo(qlistCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(QmQlistCd row) {
        return MyBatis3Utils.insert(this::insert, row, qmQlistCd, c ->
            c.map(qlistCd).toProperty("qlistCd")
            .map(hirQlistCd).toProperty("hirQlistCd")
            .map(plntCd).toProperty("plntCd")
            .map(qlistDiv).toProperty("qlistDiv")
            .map(qlistVer).toProperty("qlistVer")
            .map(loclQlistNm).toProperty("loclQlistNm")
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
            .map(rmk).toProperty("rmk")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmQlistCd> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, qmQlistCd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<QmQlistCd> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, qmQlistCd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmQlistCd> findById(String qlistCd_) {
        return findOne(c ->
            c.where(qlistCd, isEqualTo(qlistCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, qmQlistCd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(QmQlistCd row) {
        return update(c ->
            c.set(hirQlistCd).equalToWhenPresent(row::getHirQlistCd)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(qlistDiv).equalToWhenPresent(row::getQlistDiv)
            .set(qlistVer).equalToWhenPresent(row::getQlistVer)
            .set(loclQlistNm).equalToWhenPresent(row::getLoclQlistNm)
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
            .set(rmk).equalToWhenPresent(row::getRmk)
            .where(qlistCd, isEqualTo(row::getQlistCd))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<QmQlistCd> insertStatement);
}