package mpa.client;

import static mpa.client.Ti1AnuTrniDtlCttDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ti1AnuTrniDtlCtt;
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

public interface Ti1AnuTrniDtlCttMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(anuTrniDtlMonIdx, anuTrniDtlIdx, dtlDocNo, dtlDocTit, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ti1AnuTrniDtlCttResult", value = {
        @Result(column="ANU_TRNI_DTL_MON_IDX", property="anuTrniDtlMonIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="ANU_TRNI_DTL_IDX", property="anuTrniDtlIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DTL_DOC_NO", property="dtlDocNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DTL_DOC_TIT", property="dtlDocTit", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Ti1AnuTrniDtlCtt> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ti1AnuTrniDtlCttResult")
    Optional<Ti1AnuTrniDtlCtt> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ti1AnuTrniDtlCtt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ti1AnuTrniDtlCtt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short anuTrniDtlMonIdx_) {
        return delete(c -> 
            c.where(anuTrniDtlMonIdx, isEqualTo(anuTrniDtlMonIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ti1AnuTrniDtlCtt row) {
        return MyBatis3Utils.insert(this::insert, row, ti1AnuTrniDtlCtt, c ->
            c.map(anuTrniDtlMonIdx).toProperty("anuTrniDtlMonIdx")
            .map(anuTrniDtlIdx).toProperty("anuTrniDtlIdx")
            .map(dtlDocNo).toProperty("dtlDocNo")
            .map(dtlDocTit).toProperty("dtlDocTit")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1AnuTrniDtlCtt> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ti1AnuTrniDtlCtt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ti1AnuTrniDtlCtt> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ti1AnuTrniDtlCtt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1AnuTrniDtlCtt> findById(Short anuTrniDtlMonIdx_) {
        return findOne(c ->
            c.where(anuTrniDtlMonIdx, isEqualTo(anuTrniDtlMonIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ti1AnuTrniDtlCtt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ti1AnuTrniDtlCtt row) {
        return update(c ->
            c.set(anuTrniDtlIdx).equalToWhenPresent(row::getAnuTrniDtlIdx)
            .set(dtlDocNo).equalToWhenPresent(row::getDtlDocNo)
            .set(dtlDocTit).equalToWhenPresent(row::getDtlDocTit)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(anuTrniDtlMonIdx, isEqualTo(row::getAnuTrniDtlMonIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ti1AnuTrniDtlCtt> insertStatement);
}