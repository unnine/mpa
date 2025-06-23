package mpa.client;

import static mpa.client.Si1SfisPsnDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Si1SfisPsn;
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

public interface Si1SfisPsnMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(sfisPsnIdx, sfisPsnUid, udtIp, udtDs, udtUid, sfisIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Si1SfisPsnResult", value = {
        @Result(column="SFIS_PSN_IDX", property="sfisPsnIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="SFIS_PSN_UID", property="sfisPsnUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFIS_IDX", property="sfisIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Si1SfisPsn> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Si1SfisPsnResult")
    Optional<Si1SfisPsn> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, si1SfisPsn, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, si1SfisPsn, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short sfisPsnIdx_) {
        return delete(c -> 
            c.where(sfisPsnIdx, isEqualTo(sfisPsnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Si1SfisPsn row) {
        return MyBatis3Utils.insert(this::insert, row, si1SfisPsn, c ->
            c.map(sfisPsnIdx).toProperty("sfisPsnIdx")
            .map(sfisPsnUid).toProperty("sfisPsnUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(sfisIdx).toProperty("sfisIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Si1SfisPsn> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, si1SfisPsn, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Si1SfisPsn> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, si1SfisPsn, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Si1SfisPsn> findById(Short sfisPsnIdx_) {
        return findOne(c ->
            c.where(sfisPsnIdx, isEqualTo(sfisPsnIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, si1SfisPsn, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Si1SfisPsn row) {
        return update(c ->
            c.set(sfisPsnUid).equalToWhenPresent(row::getSfisPsnUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(sfisIdx).equalToWhenPresent(row::getSfisIdx)
            .where(sfisPsnIdx, isEqualTo(row::getSfisPsnIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Si1SfisPsn> insertStatement);
}