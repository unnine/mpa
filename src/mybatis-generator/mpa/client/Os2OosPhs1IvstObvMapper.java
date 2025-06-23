package mpa.client;

import static mpa.client.Os2OosPhs1IvstObvDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Os2OosPhs1IvstObv;
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

public interface Os2OosPhs1IvstObvMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(oosPhs1IvstObvIdx, oosPhs1IvstIdx, obvEtc, obvCd, udtIp, udtDs, udtUid, obvSltYn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Os2OosPhs1IvstObvResult", value = {
        @Result(column="OOS_PHS1_IVST_OBV_IDX", property="oosPhs1IvstObvIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="OOS_PHS1_IVST_IDX", property="oosPhs1IvstIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="OBV_ETC", property="obvEtc", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBV_CD", property="obvCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="OBV_SLT_YN", property="obvSltYn", jdbcType=JdbcType.VARCHAR)
    })
    List<Os2OosPhs1IvstObv> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Os2OosPhs1IvstObvResult")
    Optional<Os2OosPhs1IvstObv> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, os2OosPhs1IvstObv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, os2OosPhs1IvstObv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short oosPhs1IvstObvIdx_) {
        return delete(c -> 
            c.where(oosPhs1IvstObvIdx, isEqualTo(oosPhs1IvstObvIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Os2OosPhs1IvstObv row) {
        return MyBatis3Utils.insert(this::insert, row, os2OosPhs1IvstObv, c ->
            c.map(oosPhs1IvstObvIdx).toProperty("oosPhs1IvstObvIdx")
            .map(oosPhs1IvstIdx).toProperty("oosPhs1IvstIdx")
            .map(obvEtc).toProperty("obvEtc")
            .map(obvCd).toProperty("obvCd")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(obvSltYn).toProperty("obvSltYn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs1IvstObv> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, os2OosPhs1IvstObv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Os2OosPhs1IvstObv> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, os2OosPhs1IvstObv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Os2OosPhs1IvstObv> findById(Short oosPhs1IvstObvIdx_) {
        return findOne(c ->
            c.where(oosPhs1IvstObvIdx, isEqualTo(oosPhs1IvstObvIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, os2OosPhs1IvstObv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Os2OosPhs1IvstObv row) {
        return update(c ->
            c.set(oosPhs1IvstIdx).equalToWhenPresent(row::getOosPhs1IvstIdx)
            .set(obvEtc).equalToWhenPresent(row::getObvEtc)
            .set(obvCd).equalToWhenPresent(row::getObvCd)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(obvSltYn).equalToWhenPresent(row::getObvSltYn)
            .where(oosPhs1IvstObvIdx, isEqualTo(row::getOosPhs1IvstObvIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Os2OosPhs1IvstObv> insertStatement);
}