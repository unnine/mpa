package mpa.client;

import static mpa.client.SyJntLogDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyJntLog;
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

public interface SyJntLogMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(userUid, lognSeq, acssDiv, acssDs, acssIp);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyJntLogResult", value = {
        @Result(column="USER_UID", property="userUid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="LOGN_SEQ", property="lognSeq", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="ACSS_DIV", property="acssDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="ACSS_DS", property="acssDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ACSS_IP", property="acssIp", jdbcType=JdbcType.VARCHAR)
    })
    List<SyJntLog> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyJntLogResult")
    Optional<SyJntLog> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syJntLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syJntLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String userUid_, Short lognSeq_) {
        return delete(c -> 
            c.where(userUid, isEqualTo(userUid_))
            .and(lognSeq, isEqualTo(lognSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyJntLog row) {
        return MyBatis3Utils.insert(this::insert, row, syJntLog, c ->
            c.map(userUid).toProperty("userUid")
            .map(lognSeq).toProperty("lognSeq")
            .map(acssDiv).toProperty("acssDiv")
            .map(acssDs).toProperty("acssDs")
            .map(acssIp).toProperty("acssIp")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyJntLog> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syJntLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyJntLog> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syJntLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyJntLog> findById(String userUid_, Short lognSeq_) {
        return findOne(c ->
            c.where(userUid, isEqualTo(userUid_))
            .and(lognSeq, isEqualTo(lognSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syJntLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyJntLog row) {
        return update(c ->
            c.set(acssDiv).equalToWhenPresent(row::getAcssDiv)
            .set(acssDs).equalToWhenPresent(row::getAcssDs)
            .set(acssIp).equalToWhenPresent(row::getAcssIp)
            .where(userUid, isEqualTo(row::getUserUid))
            .and(lognSeq, isEqualTo(row::getLognSeq))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyJntLog> insertStatement);
}