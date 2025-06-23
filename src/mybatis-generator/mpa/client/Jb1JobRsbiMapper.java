package mpa.client;

import static mpa.client.Jb1JobRsbiDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Jb1JobRsbi;
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

public interface Jb1JobRsbiMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(jobRsbiIdx, jobIdx, jobCtt, dlgCtt, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Jb1JobRsbiResult", value = {
        @Result(column="JOB_RSBI_IDX", property="jobRsbiIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="JOB_IDX", property="jobIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="JOB_CTT", property="jobCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLG_CTT", property="dlgCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Jb1JobRsbi> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Jb1JobRsbiResult")
    Optional<Jb1JobRsbi> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, jb1JobRsbi, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, jb1JobRsbi, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short jobRsbiIdx_) {
        return delete(c -> 
            c.where(jobRsbiIdx, isEqualTo(jobRsbiIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Jb1JobRsbi row) {
        return MyBatis3Utils.insert(this::insert, row, jb1JobRsbi, c ->
            c.map(jobRsbiIdx).toProperty("jobRsbiIdx")
            .map(jobIdx).toProperty("jobIdx")
            .map(jobCtt).toProperty("jobCtt")
            .map(dlgCtt).toProperty("dlgCtt")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Jb1JobRsbi> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, jb1JobRsbi, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Jb1JobRsbi> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, jb1JobRsbi, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Jb1JobRsbi> findById(Short jobRsbiIdx_) {
        return findOne(c ->
            c.where(jobRsbiIdx, isEqualTo(jobRsbiIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, jb1JobRsbi, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Jb1JobRsbi row) {
        return update(c ->
            c.set(jobIdx).equalToWhenPresent(row::getJobIdx)
            .set(jobCtt).equalToWhenPresent(row::getJobCtt)
            .set(dlgCtt).equalToWhenPresent(row::getDlgCtt)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(jobRsbiIdx, isEqualTo(row::getJobRsbiIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Jb1JobRsbi> insertStatement);
}