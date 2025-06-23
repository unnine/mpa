package mpa.client;

import static mpa.client.Rc1RacRcsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Rc1RacRcs;
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

public interface Rc1RacRcsMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(racRcsIdx, racWrtIdx, rcsClf, rcsClfEtc, ord, delYn, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Rc1RacRcsResult", value = {
        @Result(column="RAC_RCS_IDX", property="racRcsIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="RAC_WRT_IDX", property="racWrtIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RCS_CLF", property="rcsClf", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCS_CLF_ETC", property="rcsClfEtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Rc1RacRcs> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Rc1RacRcsResult")
    Optional<Rc1RacRcs> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, rc1RacRcs, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, rc1RacRcs, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short racRcsIdx_) {
        return delete(c -> 
            c.where(racRcsIdx, isEqualTo(racRcsIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Rc1RacRcs row) {
        return MyBatis3Utils.insert(this::insert, row, rc1RacRcs, c ->
            c.map(racRcsIdx).toProperty("racRcsIdx")
            .map(racWrtIdx).toProperty("racWrtIdx")
            .map(rcsClf).toProperty("rcsClf")
            .map(rcsClfEtc).toProperty("rcsClfEtc")
            .map(ord).toProperty("ord")
            .map(delYn).toProperty("delYn")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Rc1RacRcs> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, rc1RacRcs, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Rc1RacRcs> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, rc1RacRcs, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Rc1RacRcs> findById(Short racRcsIdx_) {
        return findOne(c ->
            c.where(racRcsIdx, isEqualTo(racRcsIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, rc1RacRcs, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Rc1RacRcs row) {
        return update(c ->
            c.set(racWrtIdx).equalToWhenPresent(row::getRacWrtIdx)
            .set(rcsClf).equalToWhenPresent(row::getRcsClf)
            .set(rcsClfEtc).equalToWhenPresent(row::getRcsClfEtc)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(racRcsIdx, isEqualTo(row::getRacRcsIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Rc1RacRcs> insertStatement);
}