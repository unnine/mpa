package mpa.client;

import static mpa.client.AtAuditDtlDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.AtAuditDtl;
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

public interface AtAuditDtlMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(auditSeq, chgPrv, chgAft, evtNm, cudDiv, crtDs, auditIdx, managementNumber, chgAftBlob, chgPrvBlob);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AtAuditDtlResult", value = {
        @Result(column="AUDIT_SEQ", property="auditSeq", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CHG_PRV", property="chgPrv", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_AFT", property="chgAft", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVT_NM", property="evtNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="CUD_DIV", property="cudDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="AUDIT_IDX", property="auditIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="MANAGEMENT_NUMBER", property="managementNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_AFT_BLOB", property="chgAftBlob", jdbcType=JdbcType.BLOB),
        @Result(column="CHG_PRV_BLOB", property="chgPrvBlob", jdbcType=JdbcType.BLOB)
    })
    List<AtAuditDtl> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AtAuditDtlResult")
    Optional<AtAuditDtl> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, atAuditDtl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, atAuditDtl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short auditSeq_) {
        return delete(c -> 
            c.where(auditSeq, isEqualTo(auditSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(AtAuditDtl row) {
        return MyBatis3Utils.insert(this::insert, row, atAuditDtl, c ->
            c.map(auditSeq).toProperty("auditSeq")
            .map(chgPrv).toProperty("chgPrv")
            .map(chgAft).toProperty("chgAft")
            .map(evtNm).toProperty("evtNm")
            .map(cudDiv).toProperty("cudDiv")
            .map(crtDs).toProperty("crtDs")
            .map(auditIdx).toProperty("auditIdx")
            .map(managementNumber).toProperty("managementNumber")
            .map(chgAftBlob).toProperty("chgAftBlob")
            .map(chgPrvBlob).toProperty("chgPrvBlob")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<AtAuditDtl> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, atAuditDtl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<AtAuditDtl> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, atAuditDtl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<AtAuditDtl> findById(Short auditSeq_) {
        return findOne(c ->
            c.where(auditSeq, isEqualTo(auditSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, atAuditDtl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(AtAuditDtl row) {
        return update(c ->
            c.set(chgPrv).equalToWhenPresent(row::getChgPrv)
            .set(chgAft).equalToWhenPresent(row::getChgAft)
            .set(evtNm).equalToWhenPresent(row::getEvtNm)
            .set(cudDiv).equalToWhenPresent(row::getCudDiv)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(auditIdx).equalToWhenPresent(row::getAuditIdx)
            .set(managementNumber).equalToWhenPresent(row::getManagementNumber)
            .set(chgAftBlob).equalToWhenPresent(row::getChgAftBlob)
            .set(chgPrvBlob).equalToWhenPresent(row::getChgPrvBlob)
            .where(auditSeq, isEqualTo(row::getAuditSeq))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<AtAuditDtl> insertStatement);
}