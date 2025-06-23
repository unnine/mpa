package mpa.client;

import static mpa.client.SyScdLangDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyScdLang;
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

public interface SyScdLangMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(scd, langCd, langNm, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyScdLangResult", value = {
        @Result(column="SCD", property="scd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="LANG_CD", property="langCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="LANG_NM", property="langNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<SyScdLang> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyScdLangResult")
    Optional<SyScdLang> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syScdLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syScdLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String scd_, String langCd_) {
        return delete(c -> 
            c.where(scd, isEqualTo(scd_))
            .and(langCd, isEqualTo(langCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyScdLang row) {
        return MyBatis3Utils.insert(this::insert, row, syScdLang, c ->
            c.map(scd).toProperty("scd")
            .map(langCd).toProperty("langCd")
            .map(langNm).toProperty("langNm")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyScdLang> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syScdLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyScdLang> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syScdLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyScdLang> findById(String scd_, String langCd_) {
        return findOne(c ->
            c.where(scd, isEqualTo(scd_))
            .and(langCd, isEqualTo(langCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syScdLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyScdLang row) {
        return update(c ->
            c.set(langNm).equalToWhenPresent(row::getLangNm)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(scd, isEqualTo(row::getScd))
            .and(langCd, isEqualTo(row::getLangCd))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyScdLang> insertStatement);
}