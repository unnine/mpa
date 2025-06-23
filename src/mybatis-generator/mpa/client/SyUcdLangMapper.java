package mpa.client;

import static mpa.client.SyUcdLangDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyUcdLang;
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

public interface SyUcdLangMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(ucd, langCd, langNm, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyUcdLangResult", value = {
        @Result(column="UCD", property="ucd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="LANG_CD", property="langCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="LANG_NM", property="langNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<SyUcdLang> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyUcdLangResult")
    Optional<SyUcdLang> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syUcdLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syUcdLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String ucd_, String langCd_) {
        return delete(c -> 
            c.where(ucd, isEqualTo(ucd_))
            .and(langCd, isEqualTo(langCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyUcdLang row) {
        return MyBatis3Utils.insert(this::insert, row, syUcdLang, c ->
            c.map(ucd).toProperty("ucd")
            .map(langCd).toProperty("langCd")
            .map(langNm).toProperty("langNm")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUcdLang> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syUcdLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyUcdLang> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syUcdLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUcdLang> findById(String ucd_, String langCd_) {
        return findOne(c ->
            c.where(ucd, isEqualTo(ucd_))
            .and(langCd, isEqualTo(langCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syUcdLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyUcdLang row) {
        return update(c ->
            c.set(langNm).equalToWhenPresent(row::getLangNm)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(ucd, isEqualTo(row::getUcd))
            .and(langCd, isEqualTo(row::getLangCd))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyUcdLang> insertStatement);
}