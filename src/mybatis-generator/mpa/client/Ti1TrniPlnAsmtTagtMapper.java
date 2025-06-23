package mpa.client;

import static mpa.client.Ti1TrniPlnAsmtTagtDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ti1TrniPlnAsmtTagt;
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

public interface Ti1TrniPlnAsmtTagtMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(trniPlnAsmtTagtIdx, trniPlnAsmtIdx, trniTagtUid, trniAsmtRst, rmk, fileIdx, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ti1TrniPlnAsmtTagtResult", value = {
        @Result(column="TRNI_PLN_ASMT_TAGT_IDX", property="trniPlnAsmtTagtIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="TRNI_PLN_ASMT_IDX", property="trniPlnAsmtIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRNI_TAGT_UID", property="trniTagtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_ASMT_RST", property="trniAsmtRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Ti1TrniPlnAsmtTagt> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ti1TrniPlnAsmtTagtResult")
    Optional<Ti1TrniPlnAsmtTagt> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ti1TrniPlnAsmtTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ti1TrniPlnAsmtTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short trniPlnAsmtTagtIdx_) {
        return delete(c -> 
            c.where(trniPlnAsmtTagtIdx, isEqualTo(trniPlnAsmtTagtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ti1TrniPlnAsmtTagt row) {
        return MyBatis3Utils.insert(this::insert, row, ti1TrniPlnAsmtTagt, c ->
            c.map(trniPlnAsmtTagtIdx).toProperty("trniPlnAsmtTagtIdx")
            .map(trniPlnAsmtIdx).toProperty("trniPlnAsmtIdx")
            .map(trniTagtUid).toProperty("trniTagtUid")
            .map(trniAsmtRst).toProperty("trniAsmtRst")
            .map(rmk).toProperty("rmk")
            .map(fileIdx).toProperty("fileIdx")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1TrniPlnAsmtTagt> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ti1TrniPlnAsmtTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ti1TrniPlnAsmtTagt> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ti1TrniPlnAsmtTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1TrniPlnAsmtTagt> findById(Short trniPlnAsmtTagtIdx_) {
        return findOne(c ->
            c.where(trniPlnAsmtTagtIdx, isEqualTo(trniPlnAsmtTagtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ti1TrniPlnAsmtTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ti1TrniPlnAsmtTagt row) {
        return update(c ->
            c.set(trniPlnAsmtIdx).equalToWhenPresent(row::getTrniPlnAsmtIdx)
            .set(trniTagtUid).equalToWhenPresent(row::getTrniTagtUid)
            .set(trniAsmtRst).equalToWhenPresent(row::getTrniAsmtRst)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(trniPlnAsmtTagtIdx, isEqualTo(row::getTrniPlnAsmtTagtIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ti1TrniPlnAsmtTagt> insertStatement);
}