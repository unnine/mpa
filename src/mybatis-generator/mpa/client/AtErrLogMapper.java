package mpa.client;

import static mpa.client.AtErrLogDynamicSqlSupport.*;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.AtErrLog;
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

public interface AtErrLogMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(errLogIdx, url, excp, msg, strace, crtDs);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AtErrLogResult", value = {
        @Result(column="ERR_LOG_IDX", property="errLogIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="URL", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="EXCP", property="excp", jdbcType=JdbcType.VARCHAR),
        @Result(column="MSG", property="msg", jdbcType=JdbcType.VARCHAR),
        @Result(column="STRACE", property="strace", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AtErrLog> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AtErrLogResult")
    Optional<AtErrLog> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, atErrLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, atErrLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(AtErrLog row) {
        return MyBatis3Utils.insert(this::insert, row, atErrLog, c ->
            c.map(errLogIdx).toProperty("errLogIdx")
            .map(url).toProperty("url")
            .map(excp).toProperty("excp")
            .map(msg).toProperty("msg")
            .map(strace).toProperty("strace")
            .map(crtDs).toProperty("crtDs")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<AtErrLog> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, atErrLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<AtErrLog> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, atErrLog, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, atErrLog, completer);
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<AtErrLog> insertStatement);
}