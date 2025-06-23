package mpa.client;

import static mpa.client.Ri1RiskAnsRcsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ri1RiskAnsRcs;
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

public interface Ri1RiskAnsRcsMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(riskAnsRcsIdx, riskAnsIdx, riskElmDiv, riskElmEtc, udtIp, udtDs, udtUid, ord, delYn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ri1RiskAnsRcsResult", value = {
        @Result(column="RISK_ANS_RCS_IDX", property="riskAnsRcsIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="RISK_ANS_IDX", property="riskAnsIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RISK_ELM_DIV", property="riskElmDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="RISK_ELM_ETC", property="riskElmEtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR)
    })
    List<Ri1RiskAnsRcs> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ri1RiskAnsRcsResult")
    Optional<Ri1RiskAnsRcs> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ri1RiskAnsRcs, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ri1RiskAnsRcs, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short riskAnsRcsIdx_) {
        return delete(c -> 
            c.where(riskAnsRcsIdx, isEqualTo(riskAnsRcsIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ri1RiskAnsRcs row) {
        return MyBatis3Utils.insert(this::insert, row, ri1RiskAnsRcs, c ->
            c.map(riskAnsRcsIdx).toProperty("riskAnsRcsIdx")
            .map(riskAnsIdx).toProperty("riskAnsIdx")
            .map(riskElmDiv).toProperty("riskElmDiv")
            .map(riskElmEtc).toProperty("riskElmEtc")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(ord).toProperty("ord")
            .map(delYn).toProperty("delYn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ri1RiskAnsRcs> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ri1RiskAnsRcs, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ri1RiskAnsRcs> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ri1RiskAnsRcs, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ri1RiskAnsRcs> findById(Short riskAnsRcsIdx_) {
        return findOne(c ->
            c.where(riskAnsRcsIdx, isEqualTo(riskAnsRcsIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ri1RiskAnsRcs, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ri1RiskAnsRcs row) {
        return update(c ->
            c.set(riskAnsIdx).equalToWhenPresent(row::getRiskAnsIdx)
            .set(riskElmDiv).equalToWhenPresent(row::getRiskElmDiv)
            .set(riskElmEtc).equalToWhenPresent(row::getRiskElmEtc)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .where(riskAnsRcsIdx, isEqualTo(row::getRiskAnsRcsIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ri1RiskAnsRcs> insertStatement);
}