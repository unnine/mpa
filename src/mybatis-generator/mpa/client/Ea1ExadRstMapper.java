package mpa.client;

import static mpa.client.Ea1ExadRstDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ea1ExadRst;
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

public interface Ea1ExadRstMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(exadRstIdx, exadPlnIdx, adtEnfoStrDt, adtEnfoEndDt, adtRstRevDt, adtRst, siteIspMts, docIspMts, rmk, fileIdx, delYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, exadRstAprIdx, tracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ea1ExadRstResult", value = {
        @Result(column="EXAD_RST_IDX", property="exadRstIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="EXAD_PLN_IDX", property="exadPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="ADT_ENFO_STR_DT", property="adtEnfoStrDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADT_ENFO_END_DT", property="adtEnfoEndDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADT_RST_REV_DT", property="adtRstRevDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADT_RST", property="adtRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="SITE_ISP_MTS", property="siteIspMts", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_ISP_MTS", property="docIspMts", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXAD_RST_APR_IDX", property="exadRstAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Ea1ExadRst> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ea1ExadRstResult")
    Optional<Ea1ExadRst> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ea1ExadRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ea1ExadRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short exadRstIdx_) {
        return delete(c -> 
            c.where(exadRstIdx, isEqualTo(exadRstIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ea1ExadRst row) {
        return MyBatis3Utils.insert(this::insert, row, ea1ExadRst, c ->
            c.map(exadRstIdx).toProperty("exadRstIdx")
            .map(exadPlnIdx).toProperty("exadPlnIdx")
            .map(adtEnfoStrDt).toProperty("adtEnfoStrDt")
            .map(adtEnfoEndDt).toProperty("adtEnfoEndDt")
            .map(adtRstRevDt).toProperty("adtRstRevDt")
            .map(adtRst).toProperty("adtRst")
            .map(siteIspMts).toProperty("siteIspMts")
            .map(docIspMts).toProperty("docIspMts")
            .map(rmk).toProperty("rmk")
            .map(fileIdx).toProperty("fileIdx")
            .map(delYn).toProperty("delYn")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(exadRstAprIdx).toProperty("exadRstAprIdx")
            .map(tracIdx).toProperty("tracIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ea1ExadRst> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ea1ExadRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ea1ExadRst> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ea1ExadRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ea1ExadRst> findById(Short exadRstIdx_) {
        return findOne(c ->
            c.where(exadRstIdx, isEqualTo(exadRstIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ea1ExadRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ea1ExadRst row) {
        return update(c ->
            c.set(exadPlnIdx).equalToWhenPresent(row::getExadPlnIdx)
            .set(adtEnfoStrDt).equalToWhenPresent(row::getAdtEnfoStrDt)
            .set(adtEnfoEndDt).equalToWhenPresent(row::getAdtEnfoEndDt)
            .set(adtRstRevDt).equalToWhenPresent(row::getAdtRstRevDt)
            .set(adtRst).equalToWhenPresent(row::getAdtRst)
            .set(siteIspMts).equalToWhenPresent(row::getSiteIspMts)
            .set(docIspMts).equalToWhenPresent(row::getDocIspMts)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(exadRstAprIdx).equalToWhenPresent(row::getExadRstAprIdx)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .where(exadRstIdx, isEqualTo(row::getExadRstIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ea1ExadRst> insertStatement);
}