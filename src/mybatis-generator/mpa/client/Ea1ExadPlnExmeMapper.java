package mpa.client;

import static mpa.client.Ea1ExadPlnExmeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ea1ExadPlnExme;
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

public interface Ea1ExadPlnExmeMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(exadPlnExmeIdx, exadPlnIdx, exmeUid, exmeDptNm, udtIp, udtDs, udtUid, delYn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ea1ExadPlnExmeResult", value = {
        @Result(column="EXAD_PLN_EXME_IDX", property="exadPlnExmeIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="EXAD_PLN_IDX", property="exadPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="EXME_UID", property="exmeUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXME_DPT_NM", property="exmeDptNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR)
    })
    List<Ea1ExadPlnExme> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ea1ExadPlnExmeResult")
    Optional<Ea1ExadPlnExme> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ea1ExadPlnExme, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ea1ExadPlnExme, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short exadPlnExmeIdx_) {
        return delete(c -> 
            c.where(exadPlnExmeIdx, isEqualTo(exadPlnExmeIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ea1ExadPlnExme row) {
        return MyBatis3Utils.insert(this::insert, row, ea1ExadPlnExme, c ->
            c.map(exadPlnExmeIdx).toProperty("exadPlnExmeIdx")
            .map(exadPlnIdx).toProperty("exadPlnIdx")
            .map(exmeUid).toProperty("exmeUid")
            .map(exmeDptNm).toProperty("exmeDptNm")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(delYn).toProperty("delYn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ea1ExadPlnExme> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ea1ExadPlnExme, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ea1ExadPlnExme> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ea1ExadPlnExme, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ea1ExadPlnExme> findById(Short exadPlnExmeIdx_) {
        return findOne(c ->
            c.where(exadPlnExmeIdx, isEqualTo(exadPlnExmeIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ea1ExadPlnExme, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ea1ExadPlnExme row) {
        return update(c ->
            c.set(exadPlnIdx).equalToWhenPresent(row::getExadPlnIdx)
            .set(exmeUid).equalToWhenPresent(row::getExmeUid)
            .set(exmeDptNm).equalToWhenPresent(row::getExmeDptNm)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .where(exadPlnExmeIdx, isEqualTo(row::getExadPlnExmeIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ea1ExadPlnExme> insertStatement);
}