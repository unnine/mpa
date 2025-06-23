package mpa.client;

import static mpa.client.Ti1TrniPlnAsmtDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ti1TrniPlnAsmt;
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

public interface Ti1TrniPlnAsmtMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(trniPlnAsmtIdx, trniPlnIdx, tracIdx, trniAsmtDegr, trniAsmtMtd, trniDiv, trniMtd, trniPla, trniDat, trniRmk, trniDatFileIdx, trniDatCtt, asmtEnfoDt, asmtRst, asmtRmk, asmtFileIdx, asmtEndYn, asmtAprIdx, udtIp, udtDs, udtUid, ctftRt);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ti1TrniPlnAsmtResult", value = {
        @Result(column="TRNI_PLN_ASMT_IDX", property="trniPlnAsmtIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="TRNI_PLN_IDX", property="trniPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRNI_ASMT_DEGR", property="trniAsmtDegr", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRNI_ASMT_MTD", property="trniAsmtMtd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_DIV", property="trniDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_MTD", property="trniMtd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_PLA", property="trniPla", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_DAT", property="trniDat", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_RMK", property="trniRmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRNI_DAT_FILE_IDX", property="trniDatFileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRNI_DAT_CTT", property="trniDatCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASMT_ENFO_DT", property="asmtEnfoDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASMT_RST", property="asmtRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASMT_RMK", property="asmtRmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASMT_FILE_IDX", property="asmtFileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="ASMT_END_YN", property="asmtEndYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ASMT_APR_IDX", property="asmtAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="CTFT_RT", property="ctftRt", jdbcType=JdbcType.NUMERIC)
    })
    List<Ti1TrniPlnAsmt> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ti1TrniPlnAsmtResult")
    Optional<Ti1TrniPlnAsmt> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ti1TrniPlnAsmt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ti1TrniPlnAsmt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short trniPlnAsmtIdx_) {
        return delete(c -> 
            c.where(trniPlnAsmtIdx, isEqualTo(trniPlnAsmtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ti1TrniPlnAsmt row) {
        return MyBatis3Utils.insert(this::insert, row, ti1TrniPlnAsmt, c ->
            c.map(trniPlnAsmtIdx).toProperty("trniPlnAsmtIdx")
            .map(trniPlnIdx).toProperty("trniPlnIdx")
            .map(tracIdx).toProperty("tracIdx")
            .map(trniAsmtDegr).toProperty("trniAsmtDegr")
            .map(trniAsmtMtd).toProperty("trniAsmtMtd")
            .map(trniDiv).toProperty("trniDiv")
            .map(trniMtd).toProperty("trniMtd")
            .map(trniPla).toProperty("trniPla")
            .map(trniDat).toProperty("trniDat")
            .map(trniRmk).toProperty("trniRmk")
            .map(trniDatFileIdx).toProperty("trniDatFileIdx")
            .map(trniDatCtt).toProperty("trniDatCtt")
            .map(asmtEnfoDt).toProperty("asmtEnfoDt")
            .map(asmtRst).toProperty("asmtRst")
            .map(asmtRmk).toProperty("asmtRmk")
            .map(asmtFileIdx).toProperty("asmtFileIdx")
            .map(asmtEndYn).toProperty("asmtEndYn")
            .map(asmtAprIdx).toProperty("asmtAprIdx")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(ctftRt).toProperty("ctftRt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1TrniPlnAsmt> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ti1TrniPlnAsmt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ti1TrniPlnAsmt> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ti1TrniPlnAsmt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ti1TrniPlnAsmt> findById(Short trniPlnAsmtIdx_) {
        return findOne(c ->
            c.where(trniPlnAsmtIdx, isEqualTo(trniPlnAsmtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ti1TrniPlnAsmt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ti1TrniPlnAsmt row) {
        return update(c ->
            c.set(trniPlnIdx).equalToWhenPresent(row::getTrniPlnIdx)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(trniAsmtDegr).equalToWhenPresent(row::getTrniAsmtDegr)
            .set(trniAsmtMtd).equalToWhenPresent(row::getTrniAsmtMtd)
            .set(trniDiv).equalToWhenPresent(row::getTrniDiv)
            .set(trniMtd).equalToWhenPresent(row::getTrniMtd)
            .set(trniPla).equalToWhenPresent(row::getTrniPla)
            .set(trniDat).equalToWhenPresent(row::getTrniDat)
            .set(trniRmk).equalToWhenPresent(row::getTrniRmk)
            .set(trniDatFileIdx).equalToWhenPresent(row::getTrniDatFileIdx)
            .set(trniDatCtt).equalToWhenPresent(row::getTrniDatCtt)
            .set(asmtEnfoDt).equalToWhenPresent(row::getAsmtEnfoDt)
            .set(asmtRst).equalToWhenPresent(row::getAsmtRst)
            .set(asmtRmk).equalToWhenPresent(row::getAsmtRmk)
            .set(asmtFileIdx).equalToWhenPresent(row::getAsmtFileIdx)
            .set(asmtEndYn).equalToWhenPresent(row::getAsmtEndYn)
            .set(asmtAprIdx).equalToWhenPresent(row::getAsmtAprIdx)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(ctftRt).equalToWhenPresent(row::getCtftRt)
            .where(trniPlnAsmtIdx, isEqualTo(row::getTrniPlnAsmtIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ti1TrniPlnAsmt> insertStatement);
}