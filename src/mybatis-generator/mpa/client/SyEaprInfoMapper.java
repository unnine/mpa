package mpa.client;

import static mpa.client.SyEaprInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyEaprInfo;
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

public interface SyEaprInfoMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(eaprIdx, eaprReqDegr, seq, eaprDiv, eaprUid, dlgEaprUid, ncsYn, aprDegr, eaprDs, eaprIp, eaprRmk, eaprYn, eaprCttCd);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyEaprInfoResult", value = {
        @Result(column="EAPR_IDX", property="eaprIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="EAPR_REQ_DEGR", property="eaprReqDegr", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="SEQ", property="seq", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="EAPR_DIV", property="eaprDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="EAPR_UID", property="eaprUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLG_EAPR_UID", property="dlgEaprUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="NCS_YN", property="ncsYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="APR_DEGR", property="aprDegr", jdbcType=JdbcType.NUMERIC),
        @Result(column="EAPR_DS", property="eaprDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="EAPR_IP", property="eaprIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="EAPR_RMK", property="eaprRmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="EAPR_YN", property="eaprYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="EAPR_CTT_CD", property="eaprCttCd", jdbcType=JdbcType.VARCHAR)
    })
    List<SyEaprInfo> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyEaprInfoResult")
    Optional<SyEaprInfo> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syEaprInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syEaprInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short eaprIdx_, BigDecimal eaprReqDegr_, Short seq_) {
        return delete(c -> 
            c.where(eaprIdx, isEqualTo(eaprIdx_))
            .and(eaprReqDegr, isEqualTo(eaprReqDegr_))
            .and(seq, isEqualTo(seq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyEaprInfo row) {
        return MyBatis3Utils.insert(this::insert, row, syEaprInfo, c ->
            c.map(eaprIdx).toProperty("eaprIdx")
            .map(eaprReqDegr).toProperty("eaprReqDegr")
            .map(seq).toProperty("seq")
            .map(eaprDiv).toProperty("eaprDiv")
            .map(eaprUid).toProperty("eaprUid")
            .map(dlgEaprUid).toProperty("dlgEaprUid")
            .map(ncsYn).toProperty("ncsYn")
            .map(aprDegr).toProperty("aprDegr")
            .map(eaprDs).toProperty("eaprDs")
            .map(eaprIp).toProperty("eaprIp")
            .map(eaprRmk).toProperty("eaprRmk")
            .map(eaprYn).toProperty("eaprYn")
            .map(eaprCttCd).toProperty("eaprCttCd")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyEaprInfo> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syEaprInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyEaprInfo> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syEaprInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyEaprInfo> findById(Short eaprIdx_, BigDecimal eaprReqDegr_, Short seq_) {
        return findOne(c ->
            c.where(eaprIdx, isEqualTo(eaprIdx_))
            .and(eaprReqDegr, isEqualTo(eaprReqDegr_))
            .and(seq, isEqualTo(seq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syEaprInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyEaprInfo row) {
        return update(c ->
            c.set(eaprDiv).equalToWhenPresent(row::getEaprDiv)
            .set(eaprUid).equalToWhenPresent(row::getEaprUid)
            .set(dlgEaprUid).equalToWhenPresent(row::getDlgEaprUid)
            .set(ncsYn).equalToWhenPresent(row::getNcsYn)
            .set(aprDegr).equalToWhenPresent(row::getAprDegr)
            .set(eaprDs).equalToWhenPresent(row::getEaprDs)
            .set(eaprIp).equalToWhenPresent(row::getEaprIp)
            .set(eaprRmk).equalToWhenPresent(row::getEaprRmk)
            .set(eaprYn).equalToWhenPresent(row::getEaprYn)
            .set(eaprCttCd).equalToWhenPresent(row::getEaprCttCd)
            .where(eaprIdx, isEqualTo(row::getEaprIdx))
            .and(eaprReqDegr, isEqualTo(row::getEaprReqDegr))
            .and(seq, isEqualTo(row::getSeq))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyEaprInfo> insertStatement);
}