package mpa.client;

import static mpa.client.QmModlDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.QmModl;
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

public interface QmModlMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(modlCd, modlDivCd, modlNm, prgOrd, aprYn, useYn, classify, backPoint, reviewYn, ownerModlCd);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QmModlResult", value = {
        @Result(column="MODL_CD", property="modlCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="MODL_DIV_CD", property="modlDivCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_NM", property="modlNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRG_ORD", property="prgOrd", jdbcType=JdbcType.NUMERIC),
        @Result(column="APR_YN", property="aprYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CLASSIFY", property="classify", jdbcType=JdbcType.VARCHAR),
        @Result(column="BACK_POINT", property="backPoint", jdbcType=JdbcType.VARCHAR),
        @Result(column="REVIEW_YN", property="reviewYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="OWNER_MODL_CD", property="ownerModlCd", jdbcType=JdbcType.VARCHAR)
    })
    List<QmModl> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("QmModlResult")
    Optional<QmModl> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, qmModl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, qmModl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String modlCd_) {
        return delete(c -> 
            c.where(modlCd, isEqualTo(modlCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(QmModl row) {
        return MyBatis3Utils.insert(this::insert, row, qmModl, c ->
            c.map(modlCd).toProperty("modlCd")
            .map(modlDivCd).toProperty("modlDivCd")
            .map(modlNm).toProperty("modlNm")
            .map(prgOrd).toProperty("prgOrd")
            .map(aprYn).toProperty("aprYn")
            .map(useYn).toProperty("useYn")
            .map(classify).toProperty("classify")
            .map(backPoint).toProperty("backPoint")
            .map(reviewYn).toProperty("reviewYn")
            .map(ownerModlCd).toProperty("ownerModlCd")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmModl> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, qmModl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<QmModl> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, qmModl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmModl> findById(String modlCd_) {
        return findOne(c ->
            c.where(modlCd, isEqualTo(modlCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, qmModl, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(QmModl row) {
        return update(c ->
            c.set(modlDivCd).equalToWhenPresent(row::getModlDivCd)
            .set(modlNm).equalToWhenPresent(row::getModlNm)
            .set(prgOrd).equalToWhenPresent(row::getPrgOrd)
            .set(aprYn).equalToWhenPresent(row::getAprYn)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(classify).equalToWhenPresent(row::getClassify)
            .set(backPoint).equalToWhenPresent(row::getBackPoint)
            .set(reviewYn).equalToWhenPresent(row::getReviewYn)
            .set(ownerModlCd).equalToWhenPresent(row::getOwnerModlCd)
            .where(modlCd, isEqualTo(row::getModlCd))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<QmModl> insertStatement);
}