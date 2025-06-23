package mpa.client;

import static mpa.client.QmModlCpntDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.QmModlCpnt;
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

public interface QmModlCpntMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(modlCd, cpntModlDivCd, syncYn, ord, syncByEscalate);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QmModlCpntResult", value = {
        @Result(column="MODL_CD", property="modlCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="CPNT_MODL_DIV_CD", property="cpntModlDivCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="SYNC_YN", property="syncYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="SYNC_BY_ESCALATE", property="syncByEscalate", jdbcType=JdbcType.VARCHAR)
    })
    List<QmModlCpnt> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("QmModlCpntResult")
    Optional<QmModlCpnt> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, qmModlCpnt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, qmModlCpnt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String modlCd_, String cpntModlDivCd_) {
        return delete(c -> 
            c.where(modlCd, isEqualTo(modlCd_))
            .and(cpntModlDivCd, isEqualTo(cpntModlDivCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(QmModlCpnt row) {
        return MyBatis3Utils.insert(this::insert, row, qmModlCpnt, c ->
            c.map(modlCd).toProperty("modlCd")
            .map(cpntModlDivCd).toProperty("cpntModlDivCd")
            .map(syncYn).toProperty("syncYn")
            .map(ord).toProperty("ord")
            .map(syncByEscalate).toProperty("syncByEscalate")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmModlCpnt> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, qmModlCpnt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<QmModlCpnt> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, qmModlCpnt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmModlCpnt> findById(String modlCd_, String cpntModlDivCd_) {
        return findOne(c ->
            c.where(modlCd, isEqualTo(modlCd_))
            .and(cpntModlDivCd, isEqualTo(cpntModlDivCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, qmModlCpnt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(QmModlCpnt row) {
        return update(c ->
            c.set(syncYn).equalToWhenPresent(row::getSyncYn)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(syncByEscalate).equalToWhenPresent(row::getSyncByEscalate)
            .where(modlCd, isEqualTo(row::getModlCd))
            .and(cpntModlDivCd, isEqualTo(row::getCpntModlDivCd))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<QmModlCpnt> insertStatement);
}