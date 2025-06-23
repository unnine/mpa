package mpa.client;

import static mpa.client.Cg2ChgVlamDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Cg2ChgVlam;
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

public interface Cg2ChgVlamMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(chgVlamIdx, chgPrpsRcpIdx, vlamStrDt, vlamEndDt, vlamTagt, vlamOvw, vlamRst, vlamCtt, chgVlamSytFdbk, fileIdx, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, tracIdx, chgVlamAprIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Cg2ChgVlamResult", value = {
        @Result(column="CHG_VLAM_IDX", property="chgVlamIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CHG_PRPS_RCP_IDX", property="chgPrpsRcpIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="VLAM_STR_DT", property="vlamStrDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="VLAM_END_DT", property="vlamEndDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="VLAM_TAGT", property="vlamTagt", jdbcType=JdbcType.VARCHAR),
        @Result(column="VLAM_OVW", property="vlamOvw", jdbcType=JdbcType.VARCHAR),
        @Result(column="VLAM_RST", property="vlamRst", jdbcType=JdbcType.VARCHAR),
        @Result(column="VLAM_CTT", property="vlamCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_VLAM_SYT_FDBK", property="chgVlamSytFdbk", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="CHG_VLAM_APR_IDX", property="chgVlamAprIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Cg2ChgVlam> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Cg2ChgVlamResult")
    Optional<Cg2ChgVlam> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, cg2ChgVlam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, cg2ChgVlam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short chgVlamIdx_) {
        return delete(c -> 
            c.where(chgVlamIdx, isEqualTo(chgVlamIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Cg2ChgVlam row) {
        return MyBatis3Utils.insert(this::insert, row, cg2ChgVlam, c ->
            c.map(chgVlamIdx).toProperty("chgVlamIdx")
            .map(chgPrpsRcpIdx).toProperty("chgPrpsRcpIdx")
            .map(vlamStrDt).toProperty("vlamStrDt")
            .map(vlamEndDt).toProperty("vlamEndDt")
            .map(vlamTagt).toProperty("vlamTagt")
            .map(vlamOvw).toProperty("vlamOvw")
            .map(vlamRst).toProperty("vlamRst")
            .map(vlamCtt).toProperty("vlamCtt")
            .map(chgVlamSytFdbk).toProperty("chgVlamSytFdbk")
            .map(fileIdx).toProperty("fileIdx")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(tracIdx).toProperty("tracIdx")
            .map(chgVlamAprIdx).toProperty("chgVlamAprIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgVlam> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, cg2ChgVlam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Cg2ChgVlam> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, cg2ChgVlam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Cg2ChgVlam> findById(Short chgVlamIdx_) {
        return findOne(c ->
            c.where(chgVlamIdx, isEqualTo(chgVlamIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, cg2ChgVlam, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Cg2ChgVlam row) {
        return update(c ->
            c.set(chgPrpsRcpIdx).equalToWhenPresent(row::getChgPrpsRcpIdx)
            .set(vlamStrDt).equalToWhenPresent(row::getVlamStrDt)
            .set(vlamEndDt).equalToWhenPresent(row::getVlamEndDt)
            .set(vlamTagt).equalToWhenPresent(row::getVlamTagt)
            .set(vlamOvw).equalToWhenPresent(row::getVlamOvw)
            .set(vlamRst).equalToWhenPresent(row::getVlamRst)
            .set(vlamCtt).equalToWhenPresent(row::getVlamCtt)
            .set(chgVlamSytFdbk).equalToWhenPresent(row::getChgVlamSytFdbk)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(chgVlamAprIdx).equalToWhenPresent(row::getChgVlamAprIdx)
            .where(chgVlamIdx, isEqualTo(row::getChgVlamIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Cg2ChgVlam> insertStatement);
}