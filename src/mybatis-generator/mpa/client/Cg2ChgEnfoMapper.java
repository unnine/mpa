package mpa.client;

import static mpa.client.Cg2ChgEnfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cg2ChgEnfo;
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

public interface Cg2ChgEnfoMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(chgEnfoIdx, chgPrpsRcpIdx, chgEnfoAprIdx, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, vlamNcsYn, tracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cg2ChgEnfoResult", value = {
        @Result(column="CHG_ENFO_IDX", property="chgEnfoIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CHG_PRPS_RCP_IDX", property="chgPrpsRcpIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CHG_ENFO_APR_IDX", property="chgEnfoAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="VLAM_NCS_YN", property="vlamNcsYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Cg2ChgEnfo> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cg2ChgEnfoResult")
    Optional<Cg2ChgEnfo> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cg2ChgEnfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cg2ChgEnfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short chgEnfoIdx_) {
        return delete(c -> 
            c.where(chgEnfoIdx, isEqualTo(chgEnfoIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cg2ChgEnfo row) {
        return MyBatis3Utils.insert(this::insert, row, cg2ChgEnfo, c ->
            c.map(chgEnfoIdx).toProperty("chgEnfoIdx")
            .map(chgPrpsRcpIdx).toProperty("chgPrpsRcpIdx")
            .map(chgEnfoAprIdx).toProperty("chgEnfoAprIdx")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(vlamNcsYn).toProperty("vlamNcsYn")
            .map(tracIdx).toProperty("tracIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgEnfo> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cg2ChgEnfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cg2ChgEnfo> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cg2ChgEnfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgEnfo> findById(Short chgEnfoIdx_) {
        return findOne(c ->
            c.where(chgEnfoIdx, isEqualTo(chgEnfoIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cg2ChgEnfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cg2ChgEnfo row) {
        return update(c ->
            c.set(chgPrpsRcpIdx).equalToWhenPresent(row::getChgPrpsRcpIdx)
            .set(chgEnfoAprIdx).equalToWhenPresent(row::getChgEnfoAprIdx)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(vlamNcsYn).equalToWhenPresent(row::getVlamNcsYn)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .where(chgEnfoIdx, isEqualTo(row::getChgEnfoIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cg2ChgEnfo> insertStatement);
}