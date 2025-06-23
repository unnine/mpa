package mpa.client;

import static mpa.client.Cg2ChgPrpsReqDivDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cg2ChgPrpsReqDiv;
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

public interface Cg2ChgPrpsReqDivMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(chgPrpsReqDivIdx, chgPrpsReqIdx, chgDiv, chgDivEtc, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cg2ChgPrpsReqDivResult", value = {
        @Result(column="CHG_PRPS_REQ_DIV_IDX", property="chgPrpsReqDivIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CHG_PRPS_REQ_IDX", property="chgPrpsReqIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CHG_DIV", property="chgDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_DIV_ETC", property="chgDivEtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Cg2ChgPrpsReqDiv> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cg2ChgPrpsReqDivResult")
    Optional<Cg2ChgPrpsReqDiv> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cg2ChgPrpsReqDiv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cg2ChgPrpsReqDiv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short chgPrpsReqDivIdx_) {
        return delete(c -> 
            c.where(chgPrpsReqDivIdx, isEqualTo(chgPrpsReqDivIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cg2ChgPrpsReqDiv row) {
        return MyBatis3Utils.insert(this::insert, row, cg2ChgPrpsReqDiv, c ->
            c.map(chgPrpsReqDivIdx).toProperty("chgPrpsReqDivIdx")
            .map(chgPrpsReqIdx).toProperty("chgPrpsReqIdx")
            .map(chgDiv).toProperty("chgDiv")
            .map(chgDivEtc).toProperty("chgDivEtc")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgPrpsReqDiv> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cg2ChgPrpsReqDiv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cg2ChgPrpsReqDiv> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cg2ChgPrpsReqDiv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgPrpsReqDiv> findById(Short chgPrpsReqDivIdx_) {
        return findOne(c ->
            c.where(chgPrpsReqDivIdx, isEqualTo(chgPrpsReqDivIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cg2ChgPrpsReqDiv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cg2ChgPrpsReqDiv row) {
        return update(c ->
            c.set(chgPrpsReqIdx).equalToWhenPresent(row::getChgPrpsReqIdx)
            .set(chgDiv).equalToWhenPresent(row::getChgDiv)
            .set(chgDivEtc).equalToWhenPresent(row::getChgDivEtc)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(chgPrpsReqDivIdx, isEqualTo(row::getChgPrpsReqDivIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cg2ChgPrpsReqDiv> insertStatement);
}