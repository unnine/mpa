package mpa.client;

import static mpa.client.DcDocClfDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.DcDocClf;
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

public interface DcDocClfMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(docClfIdx, hirDocClfIdx, plntCd, clfNm, clfAbbrCd, rmk, ord, useYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DcDocClfResult", value = {
        @Result(column="DOC_CLF_IDX", property="docClfIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="HIR_DOC_CLF_IDX", property="hirDocClfIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLF_NM", property="clfNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLF_ABBR_CD", property="clfAbbrCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<DcDocClf> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DcDocClfResult")
    Optional<DcDocClf> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dcDocClf, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dcDocClf, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Integer docClfIdx_) {
        return delete(c -> 
            c.where(docClfIdx, isEqualTo(docClfIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(DcDocClf row) {
        return MyBatis3Utils.insert(this::insert, row, dcDocClf, c ->
            c.map(docClfIdx).toProperty("docClfIdx")
            .map(hirDocClfIdx).toProperty("hirDocClfIdx")
            .map(plntCd).toProperty("plntCd")
            .map(clfNm).toProperty("clfNm")
            .map(clfAbbrCd).toProperty("clfAbbrCd")
            .map(rmk).toProperty("rmk")
            .map(ord).toProperty("ord")
            .map(useYn).toProperty("useYn")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DcDocClf> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, dcDocClf, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<DcDocClf> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, dcDocClf, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DcDocClf> findById(Integer docClfIdx_) {
        return findOne(c ->
            c.where(docClfIdx, isEqualTo(docClfIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dcDocClf, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(DcDocClf row) {
        return update(c ->
            c.set(hirDocClfIdx).equalToWhenPresent(row::getHirDocClfIdx)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(clfNm).equalToWhenPresent(row::getClfNm)
            .set(clfAbbrCd).equalToWhenPresent(row::getClfAbbrCd)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(docClfIdx, isEqualTo(row::getDocClfIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<DcDocClf> insertStatement);
}