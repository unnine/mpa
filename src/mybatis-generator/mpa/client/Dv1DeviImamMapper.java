package mpa.client;

import static mpa.client.Dv1DeviImamDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Dv1DeviImam;
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

public interface Dv1DeviImamMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(deviImamIdx, deviOcrpIdx, tracIdx, deviImamAprIdx, prgStrDt, prgEndDt, deviCcls, fileIdx, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Dv1DeviImamResult", value = {
        @Result(column="DEVI_IMAM_IDX", property="deviImamIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="DEVI_OCRP_IDX", property="deviOcrpIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEVI_IMAM_APR_IDX", property="deviImamAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PRG_STR_DT", property="prgStrDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRG_END_DT", property="prgEndDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEVI_CCLS", property="deviCcls", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Dv1DeviImam> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Dv1DeviImamResult")
    Optional<Dv1DeviImam> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dv1DeviImam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dv1DeviImam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short deviImamIdx_) {
        return delete(c -> 
            c.where(deviImamIdx, isEqualTo(deviImamIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Dv1DeviImam row) {
        return MyBatis3Utils.insert(this::insert, row, dv1DeviImam, c ->
            c.map(deviImamIdx).toProperty("deviImamIdx")
            .map(deviOcrpIdx).toProperty("deviOcrpIdx")
            .map(tracIdx).toProperty("tracIdx")
            .map(deviImamAprIdx).toProperty("deviImamAprIdx")
            .map(prgStrDt).toProperty("prgStrDt")
            .map(prgEndDt).toProperty("prgEndDt")
            .map(deviCcls).toProperty("deviCcls")
            .map(fileIdx).toProperty("fileIdx")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Dv1DeviImam> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, dv1DeviImam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Dv1DeviImam> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, dv1DeviImam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Dv1DeviImam> findById(Short deviImamIdx_) {
        return findOne(c ->
            c.where(deviImamIdx, isEqualTo(deviImamIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dv1DeviImam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Dv1DeviImam row) {
        return update(c ->
            c.set(deviOcrpIdx).equalToWhenPresent(row::getDeviOcrpIdx)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(deviImamAprIdx).equalToWhenPresent(row::getDeviImamAprIdx)
            .set(prgStrDt).equalToWhenPresent(row::getPrgStrDt)
            .set(prgEndDt).equalToWhenPresent(row::getPrgEndDt)
            .set(deviCcls).equalToWhenPresent(row::getDeviCcls)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(deviImamIdx, isEqualTo(row::getDeviImamIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Dv1DeviImam> insertStatement);
}