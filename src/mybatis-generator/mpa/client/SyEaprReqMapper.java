package mpa.client;

import static mpa.client.SyEaprReqDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyEaprReq;
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

public interface SyEaprReqMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(eaprIdx, eaprReqDegr, eaprReqUid, eaprReqDs, eaprReqIp, eaprReqCtt, eaprPrgs);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyEaprReqResult", value = {
        @Result(column="EAPR_IDX", property="eaprIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="EAPR_REQ_DEGR", property="eaprReqDegr", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="EAPR_REQ_UID", property="eaprReqUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="EAPR_REQ_DS", property="eaprReqDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EAPR_REQ_IP", property="eaprReqIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="EAPR_REQ_CTT", property="eaprReqCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="EAPR_PRGS", property="eaprPrgs", jdbcType=JdbcType.VARCHAR)
    })
    List<SyEaprReq> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyEaprReqResult")
    Optional<SyEaprReq> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syEaprReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syEaprReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short eaprIdx_, BigDecimal eaprReqDegr_) {
        return delete(c -> 
            c.where(eaprIdx, isEqualTo(eaprIdx_))
            .and(eaprReqDegr, isEqualTo(eaprReqDegr_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyEaprReq row) {
        return MyBatis3Utils.insert(this::insert, row, syEaprReq, c ->
            c.map(eaprIdx).toProperty("eaprIdx")
            .map(eaprReqDegr).toProperty("eaprReqDegr")
            .map(eaprReqUid).toProperty("eaprReqUid")
            .map(eaprReqDs).toProperty("eaprReqDs")
            .map(eaprReqIp).toProperty("eaprReqIp")
            .map(eaprReqCtt).toProperty("eaprReqCtt")
            .map(eaprPrgs).toProperty("eaprPrgs")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyEaprReq> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syEaprReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyEaprReq> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syEaprReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyEaprReq> findById(Short eaprIdx_, BigDecimal eaprReqDegr_) {
        return findOne(c ->
            c.where(eaprIdx, isEqualTo(eaprIdx_))
            .and(eaprReqDegr, isEqualTo(eaprReqDegr_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syEaprReq, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyEaprReq row) {
        return update(c ->
            c.set(eaprReqUid).equalToWhenPresent(row::getEaprReqUid)
            .set(eaprReqDs).equalToWhenPresent(row::getEaprReqDs)
            .set(eaprReqIp).equalToWhenPresent(row::getEaprReqIp)
            .set(eaprReqCtt).equalToWhenPresent(row::getEaprReqCtt)
            .set(eaprPrgs).equalToWhenPresent(row::getEaprPrgs)
            .where(eaprIdx, isEqualTo(row::getEaprIdx))
            .and(eaprReqDegr, isEqualTo(row::getEaprReqDegr))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyEaprReq> insertStatement);
}