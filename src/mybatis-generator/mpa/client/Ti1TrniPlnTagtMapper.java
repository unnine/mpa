package mpa.client;

import static mpa.client.Ti1TrniPlnTagtDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ti1TrniPlnTagt;
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

public interface Ti1TrniPlnTagtMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(trniPlnTagtIdx, trniPlnIdx, trniTagtUid, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ti1TrniPlnTagtResult", value = {
        @Result(column="TRNI_PLN_TAGT_IDX", property="trniPlnTagtIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="TRNI_PLN_IDX", property="trniPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRNI_TAGT_UID", property="trniTagtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Ti1TrniPlnTagt> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ti1TrniPlnTagtResult")
    Optional<Ti1TrniPlnTagt> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ti1TrniPlnTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ti1TrniPlnTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short trniPlnTagtIdx_) {
        return delete(c -> 
            c.where(trniPlnTagtIdx, isEqualTo(trniPlnTagtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ti1TrniPlnTagt row) {
        return MyBatis3Utils.insert(this::insert, row, ti1TrniPlnTagt, c ->
            c.map(trniPlnTagtIdx).toProperty("trniPlnTagtIdx")
            .map(trniPlnIdx).toProperty("trniPlnIdx")
            .map(trniTagtUid).toProperty("trniTagtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1TrniPlnTagt> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ti1TrniPlnTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ti1TrniPlnTagt> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ti1TrniPlnTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1TrniPlnTagt> findById(Short trniPlnTagtIdx_) {
        return findOne(c ->
            c.where(trniPlnTagtIdx, isEqualTo(trniPlnTagtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ti1TrniPlnTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ti1TrniPlnTagt row) {
        return update(c ->
            c.set(trniPlnIdx).equalToWhenPresent(row::getTrniPlnIdx)
            .set(trniTagtUid).equalToWhenPresent(row::getTrniTagtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(trniPlnTagtIdx, isEqualTo(row::getTrniPlnTagtIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ti1TrniPlnTagt> insertStatement);
}