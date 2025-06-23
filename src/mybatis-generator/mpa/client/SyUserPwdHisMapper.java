package mpa.client;

import static mpa.client.SyUserPwdHisDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyUserPwdHis;
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

public interface SyUserPwdHisMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(userUid, chgSeq, pwd, chgYn, rccCnt, failDt, crtIp, crtDs, crtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyUserPwdHisResult", value = {
        @Result(column="USER_UID", property="userUid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CHG_SEQ", property="chgSeq", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="PWD", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_YN", property="chgYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RCC_CNT", property="rccCnt", jdbcType=JdbcType.NUMERIC),
        @Result(column="FAIL_DT", property="failDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<SyUserPwdHis> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyUserPwdHisResult")
    Optional<SyUserPwdHis> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syUserPwdHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syUserPwdHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String userUid_, Short chgSeq_) {
        return delete(c -> 
            c.where(userUid, isEqualTo(userUid_))
            .and(chgSeq, isEqualTo(chgSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyUserPwdHis row) {
        return MyBatis3Utils.insert(this::insert, row, syUserPwdHis, c ->
            c.map(userUid).toProperty("userUid")
            .map(chgSeq).toProperty("chgSeq")
            .map(pwd).toProperty("pwd")
            .map(chgYn).toProperty("chgYn")
            .map(rccCnt).toProperty("rccCnt")
            .map(failDt).toProperty("failDt")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUserPwdHis> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syUserPwdHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyUserPwdHis> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syUserPwdHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUserPwdHis> findById(String userUid_, Short chgSeq_) {
        return findOne(c ->
            c.where(userUid, isEqualTo(userUid_))
            .and(chgSeq, isEqualTo(chgSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syUserPwdHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyUserPwdHis row) {
        return update(c ->
            c.set(pwd).equalToWhenPresent(row::getPwd)
            .set(chgYn).equalToWhenPresent(row::getChgYn)
            .set(rccCnt).equalToWhenPresent(row::getRccCnt)
            .set(failDt).equalToWhenPresent(row::getFailDt)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .where(userUid, isEqualTo(row::getUserUid))
            .and(chgSeq, isEqualTo(row::getChgSeq))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyUserPwdHis> insertStatement);
}