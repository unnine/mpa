package mpa.client;

import static mpa.client.Tr1TrnrElamRgtStdDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Tr1TrnrElamRgtStd;
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

public interface Tr1TrnrElamRgtStdMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(trnrElamRgtStdIdx, trnrElamIdx, asmtStdIdx, asmtRst, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Tr1TrnrElamRgtStdResult", value = {
        @Result(column="TRNR_ELAM_RGT_STD_IDX", property="trnrElamRgtStdIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="TRNR_ELAM_IDX", property="trnrElamIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="ASMT_STD_IDX", property="asmtStdIdx", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASMT_RST", property="asmtRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Tr1TrnrElamRgtStd> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Tr1TrnrElamRgtStdResult")
    Optional<Tr1TrnrElamRgtStd> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, tr1TrnrElamRgtStd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, tr1TrnrElamRgtStd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short trnrElamRgtStdIdx_) {
        return delete(c -> 
            c.where(trnrElamRgtStdIdx, isEqualTo(trnrElamRgtStdIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Tr1TrnrElamRgtStd row) {
        return MyBatis3Utils.insert(this::insert, row, tr1TrnrElamRgtStd, c ->
            c.map(trnrElamRgtStdIdx).toProperty("trnrElamRgtStdIdx")
            .map(trnrElamIdx).toProperty("trnrElamIdx")
            .map(asmtStdIdx).toProperty("asmtStdIdx")
            .map(asmtRst).toProperty("asmtRst")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Tr1TrnrElamRgtStd> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, tr1TrnrElamRgtStd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Tr1TrnrElamRgtStd> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, tr1TrnrElamRgtStd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Tr1TrnrElamRgtStd> findById(Short trnrElamRgtStdIdx_) {
        return findOne(c ->
            c.where(trnrElamRgtStdIdx, isEqualTo(trnrElamRgtStdIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, tr1TrnrElamRgtStd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Tr1TrnrElamRgtStd row) {
        return update(c ->
            c.set(trnrElamIdx).equalToWhenPresent(row::getTrnrElamIdx)
            .set(asmtStdIdx).equalToWhenPresent(row::getAsmtStdIdx)
            .set(asmtRst).equalToWhenPresent(row::getAsmtRst)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(trnrElamRgtStdIdx, isEqualTo(row::getTrnrElamRgtStdIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Tr1TrnrElamRgtStd> insertStatement);
}