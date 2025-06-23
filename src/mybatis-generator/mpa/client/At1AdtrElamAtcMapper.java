package mpa.client;

import static mpa.client.At1AdtrElamAtcDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.At1AdtrElamAtc;
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

public interface At1AdtrElamAtcMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(adtrElamAtcIdx, adtrElamIdx, adtrElamAtc, elamScr, delYn, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="At1AdtrElamAtcResult", value = {
        @Result(column="ADTR_ELAM_ATC_IDX", property="adtrElamAtcIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="ADTR_ELAM_IDX", property="adtrElamIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="ADTR_ELAM_ATC", property="adtrElamAtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ELAM_SCR", property="elamScr", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<At1AdtrElamAtc> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("At1AdtrElamAtcResult")
    Optional<At1AdtrElamAtc> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, at1AdtrElamAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, at1AdtrElamAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short adtrElamAtcIdx_) {
        return delete(c -> 
            c.where(adtrElamAtcIdx, isEqualTo(adtrElamAtcIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(At1AdtrElamAtc row) {
        return MyBatis3Utils.insert(this::insert, row, at1AdtrElamAtc, c ->
            c.map(adtrElamAtcIdx).toProperty("adtrElamAtcIdx")
            .map(adtrElamIdx).toProperty("adtrElamIdx")
            .map(adtrElamAtc).toProperty("adtrElamAtc")
            .map(elamScr).toProperty("elamScr")
            .map(delYn).toProperty("delYn")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<At1AdtrElamAtc> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, at1AdtrElamAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<At1AdtrElamAtc> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, at1AdtrElamAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<At1AdtrElamAtc> findById(Short adtrElamAtcIdx_) {
        return findOne(c ->
            c.where(adtrElamAtcIdx, isEqualTo(adtrElamAtcIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, at1AdtrElamAtc, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(At1AdtrElamAtc row) {
        return update(c ->
            c.set(adtrElamIdx).equalToWhenPresent(row::getAdtrElamIdx)
            .set(adtrElamAtc).equalToWhenPresent(row::getAdtrElamAtc)
            .set(elamScr).equalToWhenPresent(row::getElamScr)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(adtrElamAtcIdx, isEqualTo(row::getAdtrElamAtcIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<At1AdtrElamAtc> insertStatement);
}