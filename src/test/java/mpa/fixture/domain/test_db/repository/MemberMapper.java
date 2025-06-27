package mpa.fixture.domain.test_db.repository;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static mpa.fixture.domain.test_db.repository.MemberDynamicSqlSupport.*;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

import mpa.fixture.domain.test_db.Member;
import mpa.persistence.MybatisPersistenceAssistantRepository;
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

public interface MemberMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper, MybatisPersistenceAssistantRepository<Member> {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, name, email, createdt, updatedt);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MemberResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="CREATEDT", property="createdt", jdbcType=JdbcType.DATE),
        @Result(column="UPDATEDT", property="updatedt", jdbcType=JdbcType.DATE)
    })
    List<Member> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MemberResult")
    Optional<Member> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, member, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, member, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Member row) {
        return MyBatis3Utils.insert(this::insert, row, member, c ->
            c.map(id).toProperty("id")
            .map(name).toProperty("name")
            .map(email).toProperty("email")
            .map(createdt).toProperty("createdt")
            .map(updatedt).toProperty("updatedt")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Member> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, member, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Member> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, member, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Member> findById(Integer id_) {
        return findOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, member, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Member row) {
        return update(c ->
            c.set(name).equalTo(row::getName)
            .set(email).equalTo(row::getEmail)
            .set(createdt).equalTo(row::getCreatedt)
            .set(updatedt).equalTo(row::getUpdatedt)
            .where(id, isEqualTo(row::getId))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Member> insertStatement);
}