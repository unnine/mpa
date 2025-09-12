package default$.repository;

import static default$.repository.MyLikeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import default$.MyLike;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
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

public interface MyLikeMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper, MybatisPersistenceAssistantRepository<MyLike> {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, memberId, count);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MyLikeResult", value = {
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="MEMBER_ID", property="memberId", jdbcType=JdbcType.INTEGER),
        @Result(column="COUNT", property="count", jdbcType=JdbcType.INTEGER)
    })
    List<MyLike> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MyLikeResult")
    Optional<MyLike> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, myLike, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, myLike, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(MyLike row) {
        return MyBatis3Utils.insert(this::insert, row, myLike, c ->
            c.map(id).toProperty("id")
            .map(memberId).toProperty("memberId")
            .map(count).toProperty("count")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MyLike> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, myLike, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<MyLike> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, myLike, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<MyLike> findById(Integer id_) {
        return findOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, myLike, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(MyLike row) {
        return update(c ->
            c.set(memberId).equalTo(row::getMemberId)
            .set(count).equalTo(row::getCount)
            .where(id, isEqualTo(row::getId))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<MyLike> insertStatement);
}