package mpa.client;

import static mpa.client.SyAthLangDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyAthLang;
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

public interface SyAthLangMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(athCd, langCd, langNm, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyAthLangResult", value = {
        @Result(column="ATH_CD", property="athCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="LANG_CD", property="langCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="LANG_NM", property="langNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<SyAthLang> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyAthLangResult")
    Optional<SyAthLang> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syAthLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syAthLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String athCd_, String langCd_) {
        return delete(c -> 
            c.where(athCd, isEqualTo(athCd_))
            .and(langCd, isEqualTo(langCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyAthLang row) {
        return MyBatis3Utils.insert(this::insert, row, syAthLang, c ->
            c.map(athCd).toProperty("athCd")
            .map(langCd).toProperty("langCd")
            .map(langNm).toProperty("langNm")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyAthLang> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syAthLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyAthLang> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syAthLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyAthLang> findById(String athCd_, String langCd_) {
        return findOne(c ->
            c.where(athCd, isEqualTo(athCd_))
            .and(langCd, isEqualTo(langCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syAthLang, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyAthLang row) {
        return update(c ->
            c.set(langNm).equalToWhenPresent(row::getLangNm)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(athCd, isEqualTo(row::getAthCd))
            .and(langCd, isEqualTo(row::getLangCd))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyAthLang> insertStatement);
}