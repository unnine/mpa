package mpa.client;

import static mpa.client.Jb1JobHisDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Jb1JobHis;
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

public interface Jb1JobHisMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(jobHisIdx, jobIdx, compNm, afatDpt, work, trm, delYn, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Jb1JobHisResult", value = {
        @Result(column="JOB_HIS_IDX", property="jobHisIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="JOB_IDX", property="jobIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="COMP_NM", property="compNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="AFAT_DPT", property="afatDpt", jdbcType=JdbcType.VARCHAR),
        @Result(column="WORK", property="work", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRM", property="trm", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Jb1JobHis> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Jb1JobHisResult")
    Optional<Jb1JobHis> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, jb1JobHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, jb1JobHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short jobHisIdx_) {
        return delete(c -> 
            c.where(jobHisIdx, isEqualTo(jobHisIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Jb1JobHis row) {
        return MyBatis3Utils.insert(this::insert, row, jb1JobHis, c ->
            c.map(jobHisIdx).toProperty("jobHisIdx")
            .map(jobIdx).toProperty("jobIdx")
            .map(compNm).toProperty("compNm")
            .map(afatDpt).toProperty("afatDpt")
            .map(work).toProperty("work")
            .map(trm).toProperty("trm")
            .map(delYn).toProperty("delYn")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Jb1JobHis> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, jb1JobHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Jb1JobHis> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, jb1JobHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Jb1JobHis> findById(Short jobHisIdx_) {
        return findOne(c ->
            c.where(jobHisIdx, isEqualTo(jobHisIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, jb1JobHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Jb1JobHis row) {
        return update(c ->
            c.set(jobIdx).equalToWhenPresent(row::getJobIdx)
            .set(compNm).equalToWhenPresent(row::getCompNm)
            .set(afatDpt).equalToWhenPresent(row::getAfatDpt)
            .set(work).equalToWhenPresent(row::getWork)
            .set(trm).equalToWhenPresent(row::getTrm)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(jobHisIdx, isEqualTo(row::getJobHisIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Jb1JobHis> insertStatement);
}