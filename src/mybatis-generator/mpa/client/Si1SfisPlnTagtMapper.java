package mpa.client;

import static mpa.client.Si1SfisPlnTagtDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Si1SfisPlnTagt;
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

public interface Si1SfisPlnTagtMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(sfisPlnTagtIdx, sfisPlnIdx, sfisExpStrDt, sfisExpEndDt, sfisTit, sfisPsn, sfisFid, sfisFidEtc, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Si1SfisPlnTagtResult", value = {
        @Result(column="SFIS_PLN_TAGT_IDX", property="sfisPlnTagtIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="SFIS_PLN_IDX", property="sfisPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="SFIS_EXP_STR_DT", property="sfisExpStrDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFIS_EXP_END_DT", property="sfisExpEndDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFIS_TIT", property="sfisTit", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFIS_PSN", property="sfisPsn", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFIS_FID", property="sfisFid", jdbcType=JdbcType.VARCHAR),
        @Result(column="SFIS_FID_ETC", property="sfisFidEtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Si1SfisPlnTagt> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Si1SfisPlnTagtResult")
    Optional<Si1SfisPlnTagt> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, si1SfisPlnTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, si1SfisPlnTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short sfisPlnTagtIdx_) {
        return delete(c -> 
            c.where(sfisPlnTagtIdx, isEqualTo(sfisPlnTagtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Si1SfisPlnTagt row) {
        return MyBatis3Utils.insert(this::insert, row, si1SfisPlnTagt, c ->
            c.map(sfisPlnTagtIdx).toProperty("sfisPlnTagtIdx")
            .map(sfisPlnIdx).toProperty("sfisPlnIdx")
            .map(sfisExpStrDt).toProperty("sfisExpStrDt")
            .map(sfisExpEndDt).toProperty("sfisExpEndDt")
            .map(sfisTit).toProperty("sfisTit")
            .map(sfisPsn).toProperty("sfisPsn")
            .map(sfisFid).toProperty("sfisFid")
            .map(sfisFidEtc).toProperty("sfisFidEtc")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Si1SfisPlnTagt> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, si1SfisPlnTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Si1SfisPlnTagt> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, si1SfisPlnTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Si1SfisPlnTagt> findById(Short sfisPlnTagtIdx_) {
        return findOne(c ->
            c.where(sfisPlnTagtIdx, isEqualTo(sfisPlnTagtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, si1SfisPlnTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Si1SfisPlnTagt row) {
        return update(c ->
            c.set(sfisPlnIdx).equalToWhenPresent(row::getSfisPlnIdx)
            .set(sfisExpStrDt).equalToWhenPresent(row::getSfisExpStrDt)
            .set(sfisExpEndDt).equalToWhenPresent(row::getSfisExpEndDt)
            .set(sfisTit).equalToWhenPresent(row::getSfisTit)
            .set(sfisPsn).equalToWhenPresent(row::getSfisPsn)
            .set(sfisFid).equalToWhenPresent(row::getSfisFid)
            .set(sfisFidEtc).equalToWhenPresent(row::getSfisFidEtc)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(sfisPlnTagtIdx, isEqualTo(row::getSfisPlnTagtIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Si1SfisPlnTagt> insertStatement);
}