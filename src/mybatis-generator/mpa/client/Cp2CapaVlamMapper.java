package mpa.client;

import static mpa.client.Cp2CapaVlamDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cp2CapaVlam;
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

public interface Cp2CapaVlamMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(capaVlamIdx, capaPlnIdx, vlamStrDt, vlamEndDt, vlamTagt, vlamOvw, vlamCtt, vlamRst, capaVlamSytFdbk, fileIdx, capaVlamAprIdx, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, tracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cp2CapaVlamResult", value = {
        @Result(column="CAPA_VLAM_IDX", property="capaVlamIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CAPA_PLN_IDX", property="capaPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="VLAM_STR_DT", property="vlamStrDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="VLAM_END_DT", property="vlamEndDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="VLAM_TAGT", property="vlamTagt", jdbcType=JdbcType.VARCHAR),
        @Result(column="VLAM_OVW", property="vlamOvw", jdbcType=JdbcType.VARCHAR),
        @Result(column="VLAM_CTT", property="vlamCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="VLAM_RST", property="vlamRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="CAPA_VLAM_SYT_FDBK", property="capaVlamSytFdbk", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CAPA_VLAM_APR_IDX", property="capaVlamAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Cp2CapaVlam> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cp2CapaVlamResult")
    Optional<Cp2CapaVlam> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cp2CapaVlam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cp2CapaVlam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short capaVlamIdx_) {
        return delete(c -> 
            c.where(capaVlamIdx, isEqualTo(capaVlamIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cp2CapaVlam row) {
        return MyBatis3Utils.insert(this::insert, row, cp2CapaVlam, c ->
            c.map(capaVlamIdx).toProperty("capaVlamIdx")
            .map(capaPlnIdx).toProperty("capaPlnIdx")
            .map(vlamStrDt).toProperty("vlamStrDt")
            .map(vlamEndDt).toProperty("vlamEndDt")
            .map(vlamTagt).toProperty("vlamTagt")
            .map(vlamOvw).toProperty("vlamOvw")
            .map(vlamCtt).toProperty("vlamCtt")
            .map(vlamRst).toProperty("vlamRst")
            .map(capaVlamSytFdbk).toProperty("capaVlamSytFdbk")
            .map(fileIdx).toProperty("fileIdx")
            .map(capaVlamAprIdx).toProperty("capaVlamAprIdx")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(tracIdx).toProperty("tracIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaVlam> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cp2CapaVlam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cp2CapaVlam> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cp2CapaVlam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cp2CapaVlam> findById(Short capaVlamIdx_) {
        return findOne(c ->
            c.where(capaVlamIdx, isEqualTo(capaVlamIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cp2CapaVlam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cp2CapaVlam row) {
        return update(c ->
            c.set(capaPlnIdx).equalToWhenPresent(row::getCapaPlnIdx)
            .set(vlamStrDt).equalToWhenPresent(row::getVlamStrDt)
            .set(vlamEndDt).equalToWhenPresent(row::getVlamEndDt)
            .set(vlamTagt).equalToWhenPresent(row::getVlamTagt)
            .set(vlamOvw).equalToWhenPresent(row::getVlamOvw)
            .set(vlamCtt).equalToWhenPresent(row::getVlamCtt)
            .set(vlamRst).equalToWhenPresent(row::getVlamRst)
            .set(capaVlamSytFdbk).equalToWhenPresent(row::getCapaVlamSytFdbk)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(capaVlamAprIdx).equalToWhenPresent(row::getCapaVlamAprIdx)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .where(capaVlamIdx, isEqualTo(row::getCapaVlamIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cp2CapaVlam> insertStatement);
}