package mpa.client;

import static mpa.client.AtAuditDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.AtAudit;
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

public interface AtAuditMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(auditIdx, plntCd, menuCd, httpMtd, evtUrl, esignYn, rea, crtIp, crtDs, crtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AtAuditResult", value = {
        @Result(column="AUDIT_IDX", property="auditIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="MENU_CD", property="menuCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="HTTP_MTD", property="httpMtd", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVT_URL", property="evtUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="ESIGN_YN", property="esignYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="REA", property="rea", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<AtAudit> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AtAuditResult")
    Optional<AtAudit> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, atAudit, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, atAudit, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short auditIdx_) {
        return delete(c -> 
            c.where(auditIdx, isEqualTo(auditIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(AtAudit row) {
        return MyBatis3Utils.insert(this::insert, row, atAudit, c ->
            c.map(auditIdx).toProperty("auditIdx")
            .map(plntCd).toProperty("plntCd")
            .map(menuCd).toProperty("menuCd")
            .map(httpMtd).toProperty("httpMtd")
            .map(evtUrl).toProperty("evtUrl")
            .map(esignYn).toProperty("esignYn")
            .map(rea).toProperty("rea")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<AtAudit> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, atAudit, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<AtAudit> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, atAudit, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<AtAudit> findById(Short auditIdx_) {
        return findOne(c ->
            c.where(auditIdx, isEqualTo(auditIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, atAudit, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(AtAudit row) {
        return update(c ->
            c.set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(menuCd).equalToWhenPresent(row::getMenuCd)
            .set(httpMtd).equalToWhenPresent(row::getHttpMtd)
            .set(evtUrl).equalToWhenPresent(row::getEvtUrl)
            .set(esignYn).equalToWhenPresent(row::getEsignYn)
            .set(rea).equalToWhenPresent(row::getRea)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .where(auditIdx, isEqualTo(row::getAuditIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<AtAudit> insertStatement);
}