package mpa.client;

import static mpa.client.SpringSessionDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SpringSession;
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

public interface SpringSessionMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(primaryId, sessionId, creationTime, lastAccessTime, maxInactiveInterval, expiryTime, principalName);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SpringSessionResult", value = {
        @Result(column="PRIMARY_ID", property="primaryId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="SESSION_ID", property="sessionId", jdbcType=JdbcType.CHAR),
        @Result(column="CREATION_TIME", property="creationTime", jdbcType=JdbcType.NUMERIC),
        @Result(column="LAST_ACCESS_TIME", property="lastAccessTime", jdbcType=JdbcType.NUMERIC),
        @Result(column="MAX_INACTIVE_INTERVAL", property="maxInactiveInterval", jdbcType=JdbcType.NUMERIC),
        @Result(column="EXPIRY_TIME", property="expiryTime", jdbcType=JdbcType.NUMERIC),
        @Result(column="PRINCIPAL_NAME", property="principalName", jdbcType=JdbcType.VARCHAR)
    })
    List<SpringSession> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SpringSessionResult")
    Optional<SpringSession> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, springSession, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, springSession, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String primaryId_) {
        return delete(c -> 
            c.where(primaryId, isEqualTo(primaryId_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SpringSession row) {
        return MyBatis3Utils.insert(this::insert, row, springSession, c ->
            c.map(primaryId).toProperty("primaryId")
            .map(sessionId).toProperty("sessionId")
            .map(creationTime).toProperty("creationTime")
            .map(lastAccessTime).toProperty("lastAccessTime")
            .map(maxInactiveInterval).toProperty("maxInactiveInterval")
            .map(expiryTime).toProperty("expiryTime")
            .map(principalName).toProperty("principalName")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SpringSession> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, springSession, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SpringSession> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, springSession, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SpringSession> findById(String primaryId_) {
        return findOne(c ->
            c.where(primaryId, isEqualTo(primaryId_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, springSession, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SpringSession row) {
        return update(c ->
            c.set(sessionId).equalToWhenPresent(row::getSessionId)
            .set(creationTime).equalToWhenPresent(row::getCreationTime)
            .set(lastAccessTime).equalToWhenPresent(row::getLastAccessTime)
            .set(maxInactiveInterval).equalToWhenPresent(row::getMaxInactiveInterval)
            .set(expiryTime).equalToWhenPresent(row::getExpiryTime)
            .set(principalName).equalToWhenPresent(row::getPrincipalName)
            .where(primaryId, isEqualTo(row::getPrimaryId))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SpringSession> insertStatement);
}