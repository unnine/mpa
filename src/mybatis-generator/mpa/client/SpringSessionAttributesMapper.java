package mpa.client;

import static mpa.client.SpringSessionAttributesDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SpringSessionAttributes;
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

public interface SpringSessionAttributesMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(sessionPrimaryId, attributeName, attributeBytes);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SpringSessionAttributesResult", value = {
        @Result(column="SESSION_PRIMARY_ID", property="sessionPrimaryId", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="ATTRIBUTE_NAME", property="attributeName", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="ATTRIBUTE_BYTES", property="attributeBytes", jdbcType=JdbcType.BLOB)
    })
    List<SpringSessionAttributes> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SpringSessionAttributesResult")
    Optional<SpringSessionAttributes> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, springSessionAttributes, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, springSessionAttributes, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String sessionPrimaryId_, String attributeName_) {
        return delete(c -> 
            c.where(sessionPrimaryId, isEqualTo(sessionPrimaryId_))
            .and(attributeName, isEqualTo(attributeName_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SpringSessionAttributes row) {
        return MyBatis3Utils.insert(this::insert, row, springSessionAttributes, c ->
            c.map(sessionPrimaryId).toProperty("sessionPrimaryId")
            .map(attributeName).toProperty("attributeName")
            .map(attributeBytes).toProperty("attributeBytes")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SpringSessionAttributes> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, springSessionAttributes, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SpringSessionAttributes> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, springSessionAttributes, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SpringSessionAttributes> findById(String sessionPrimaryId_, String attributeName_) {
        return findOne(c ->
            c.where(sessionPrimaryId, isEqualTo(sessionPrimaryId_))
            .and(attributeName, isEqualTo(attributeName_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, springSessionAttributes, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SpringSessionAttributes row) {
        return update(c ->
            c.set(attributeBytes).equalToWhenPresent(row::getAttributeBytes)
            .where(sessionPrimaryId, isEqualTo(row::getSessionPrimaryId))
            .and(attributeName, isEqualTo(row::getAttributeName))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SpringSessionAttributes> insertStatement);
}