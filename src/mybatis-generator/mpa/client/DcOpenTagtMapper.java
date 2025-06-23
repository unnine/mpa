package mpa.client;

import static mpa.client.DcOpenTagtDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.DcOpenTagt;
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

public interface DcOpenTagtMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(openTagtIdx, docIdx, useruid, initReadDt, readCnt, readDt, delYn, ord, rmk, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DcOpenTagtResult", value = {
        @Result(column="OPEN_TAGT_IDX", property="openTagtIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="DOC_IDX", property="docIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="USERUID", property="useruid", jdbcType=JdbcType.VARCHAR),
        @Result(column="INIT_READ_DT", property="initReadDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="READ_CNT", property="readCnt", jdbcType=JdbcType.NUMERIC),
        @Result(column="READ_DT", property="readDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<DcOpenTagt> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DcOpenTagtResult")
    Optional<DcOpenTagt> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dcOpenTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dcOpenTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short openTagtIdx_) {
        return delete(c -> 
            c.where(openTagtIdx, isEqualTo(openTagtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(DcOpenTagt row) {
        return MyBatis3Utils.insert(this::insert, row, dcOpenTagt, c ->
            c.map(openTagtIdx).toProperty("openTagtIdx")
            .map(docIdx).toProperty("docIdx")
            .map(useruid).toProperty("useruid")
            .map(initReadDt).toProperty("initReadDt")
            .map(readCnt).toProperty("readCnt")
            .map(readDt).toProperty("readDt")
            .map(delYn).toProperty("delYn")
            .map(ord).toProperty("ord")
            .map(rmk).toProperty("rmk")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DcOpenTagt> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, dcOpenTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<DcOpenTagt> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, dcOpenTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<DcOpenTagt> findById(Short openTagtIdx_) {
        return findOne(c ->
            c.where(openTagtIdx, isEqualTo(openTagtIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dcOpenTagt, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(DcOpenTagt row) {
        return update(c ->
            c.set(docIdx).equalToWhenPresent(row::getDocIdx)
            .set(useruid).equalToWhenPresent(row::getUseruid)
            .set(initReadDt).equalToWhenPresent(row::getInitReadDt)
            .set(readCnt).equalToWhenPresent(row::getReadCnt)
            .set(readDt).equalToWhenPresent(row::getReadDt)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(openTagtIdx, isEqualTo(row::getOpenTagtIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<DcOpenTagt> insertStatement);
}