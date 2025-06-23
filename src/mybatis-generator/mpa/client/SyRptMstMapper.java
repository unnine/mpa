package mpa.client;

import static mpa.client.SyRptMstDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyRptMst;
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

public interface SyRptMstMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(rptIdx, plntCd, sysModlDiv, rptDivNm, mngNo, enmDt, useYn, delYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, modlCd);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyRptMstResult", value = {
        @Result(column="RPT_IDX", property="rptIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_MODL_DIV", property="sysModlDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPT_DIV_NM", property="rptDivNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="MNG_NO", property="mngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="ENM_DT", property="enmDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_CD", property="modlCd", jdbcType=JdbcType.VARCHAR)
    })
    List<SyRptMst> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyRptMstResult")
    Optional<SyRptMst> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syRptMst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syRptMst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short rptIdx_) {
        return delete(c -> 
            c.where(rptIdx, isEqualTo(rptIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyRptMst row) {
        return MyBatis3Utils.insert(this::insert, row, syRptMst, c ->
            c.map(rptIdx).toProperty("rptIdx")
            .map(plntCd).toProperty("plntCd")
            .map(sysModlDiv).toProperty("sysModlDiv")
            .map(rptDivNm).toProperty("rptDivNm")
            .map(mngNo).toProperty("mngNo")
            .map(enmDt).toProperty("enmDt")
            .map(useYn).toProperty("useYn")
            .map(delYn).toProperty("delYn")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(modlCd).toProperty("modlCd")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyRptMst> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syRptMst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyRptMst> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syRptMst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyRptMst> findById(Short rptIdx_) {
        return findOne(c ->
            c.where(rptIdx, isEqualTo(rptIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syRptMst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyRptMst row) {
        return update(c ->
            c.set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(sysModlDiv).equalToWhenPresent(row::getSysModlDiv)
            .set(rptDivNm).equalToWhenPresent(row::getRptDivNm)
            .set(mngNo).equalToWhenPresent(row::getMngNo)
            .set(enmDt).equalToWhenPresent(row::getEnmDt)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(modlCd).equalToWhenPresent(row::getModlCd)
            .where(rptIdx, isEqualTo(row::getRptIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyRptMst> insertStatement);
}