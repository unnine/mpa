package mpa.client;

import static mpa.client.Jb1JobQufDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Jb1JobQuf;
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

public interface Jb1JobQufMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(jobQufIdx, jobIdx, qufDivCd, qufAqstDt, rmk, delYn, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Jb1JobQufResult", value = {
        @Result(column="JOB_QUF_IDX", property="jobQufIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="JOB_IDX", property="jobIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="QUF_DIV_CD", property="qufDivCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="QUF_AQST_DT", property="qufAqstDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Jb1JobQuf> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Jb1JobQufResult")
    Optional<Jb1JobQuf> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, jb1JobQuf, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, jb1JobQuf, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short jobQufIdx_) {
        return delete(c -> 
            c.where(jobQufIdx, isEqualTo(jobQufIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Jb1JobQuf row) {
        return MyBatis3Utils.insert(this::insert, row, jb1JobQuf, c ->
            c.map(jobQufIdx).toProperty("jobQufIdx")
            .map(jobIdx).toProperty("jobIdx")
            .map(qufDivCd).toProperty("qufDivCd")
            .map(qufAqstDt).toProperty("qufAqstDt")
            .map(rmk).toProperty("rmk")
            .map(delYn).toProperty("delYn")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Jb1JobQuf> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, jb1JobQuf, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Jb1JobQuf> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, jb1JobQuf, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Jb1JobQuf> findById(Short jobQufIdx_) {
        return findOne(c ->
            c.where(jobQufIdx, isEqualTo(jobQufIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, jb1JobQuf, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Jb1JobQuf row) {
        return update(c ->
            c.set(jobIdx).equalToWhenPresent(row::getJobIdx)
            .set(qufDivCd).equalToWhenPresent(row::getQufDivCd)
            .set(qufAqstDt).equalToWhenPresent(row::getQufAqstDt)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(jobQufIdx, isEqualTo(row::getJobQufIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Jb1JobQuf> insertStatement);
}