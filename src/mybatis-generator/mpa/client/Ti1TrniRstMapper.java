package mpa.client;

import static mpa.client.Ti1TrniRstDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ti1TrniRst;
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

public interface Ti1TrniRstMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(trniRstIdx, trniPlnIdx, tracIdx, trniRst, trniRstRmk, asmtRstAprIdx, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ti1TrniRstResult", value = {
        @Result(column="TRNI_RST_IDX", property="trniRstIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="TRNI_PLN_IDX", property="trniPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRNI_RST", property="trniRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_RST_RMK", property="trniRstRmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASMT_RST_APR_IDX", property="asmtRstAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Ti1TrniRst> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ti1TrniRstResult")
    Optional<Ti1TrniRst> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ti1TrniRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ti1TrniRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short trniRstIdx_) {
        return delete(c -> 
            c.where(trniRstIdx, isEqualTo(trniRstIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ti1TrniRst row) {
        return MyBatis3Utils.insert(this::insert, row, ti1TrniRst, c ->
            c.map(trniRstIdx).toProperty("trniRstIdx")
            .map(trniPlnIdx).toProperty("trniPlnIdx")
            .map(tracIdx).toProperty("tracIdx")
            .map(trniRst).toProperty("trniRst")
            .map(trniRstRmk).toProperty("trniRstRmk")
            .map(asmtRstAprIdx).toProperty("asmtRstAprIdx")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1TrniRst> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ti1TrniRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ti1TrniRst> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ti1TrniRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1TrniRst> findById(Short trniRstIdx_) {
        return findOne(c ->
            c.where(trniRstIdx, isEqualTo(trniRstIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ti1TrniRst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ti1TrniRst row) {
        return update(c ->
            c.set(trniPlnIdx).equalToWhenPresent(row::getTrniPlnIdx)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(trniRst).equalToWhenPresent(row::getTrniRst)
            .set(trniRstRmk).equalToWhenPresent(row::getTrniRstRmk)
            .set(asmtRstAprIdx).equalToWhenPresent(row::getAsmtRstAprIdx)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(trniRstIdx, isEqualTo(row::getTrniRstIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ti1TrniRst> insertStatement);
}