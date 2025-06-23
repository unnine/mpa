package mpa.client;

import static mpa.client.Rc1Rac4m1eDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Rc1Rac4m1e;
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

public interface Rc1Rac4m1eMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(rac4m1eIdx, racWrtIdx, man, mch, mtr, mtd, evm, etc, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Rc1Rac4m1eResult", value = {
        @Result(column="RAC_4M1E_IDX", property="rac4m1eIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="RAC_WRT_IDX", property="racWrtIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="MAN", property="man", jdbcType=JdbcType.VARCHAR),
        @Result(column="MCH", property="mch", jdbcType=JdbcType.VARCHAR),
        @Result(column="MTR", property="mtr", jdbcType=JdbcType.VARCHAR),
        @Result(column="MTD", property="mtd", jdbcType=JdbcType.VARCHAR),
        @Result(column="EVM", property="evm", jdbcType=JdbcType.VARCHAR),
        @Result(column="ETC", property="etc", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Rc1Rac4m1e> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Rc1Rac4m1eResult")
    Optional<Rc1Rac4m1e> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, rc1Rac4m1e, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, rc1Rac4m1e, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short rac4m1eIdx_) {
        return delete(c -> 
            c.where(rac4m1eIdx, isEqualTo(rac4m1eIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Rc1Rac4m1e row) {
        return MyBatis3Utils.insert(this::insert, row, rc1Rac4m1e, c ->
            c.map(rac4m1eIdx).toProperty("rac4m1eIdx")
            .map(racWrtIdx).toProperty("racWrtIdx")
            .map(man).toProperty("man")
            .map(mch).toProperty("mch")
            .map(mtr).toProperty("mtr")
            .map(mtd).toProperty("mtd")
            .map(evm).toProperty("evm")
            .map(etc).toProperty("etc")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Rc1Rac4m1e> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, rc1Rac4m1e, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Rc1Rac4m1e> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, rc1Rac4m1e, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Rc1Rac4m1e> findById(Short rac4m1eIdx_) {
        return findOne(c ->
            c.where(rac4m1eIdx, isEqualTo(rac4m1eIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, rc1Rac4m1e, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Rc1Rac4m1e row) {
        return update(c ->
            c.set(racWrtIdx).equalToWhenPresent(row::getRacWrtIdx)
            .set(man).equalToWhenPresent(row::getMan)
            .set(mch).equalToWhenPresent(row::getMch)
            .set(mtr).equalToWhenPresent(row::getMtr)
            .set(mtd).equalToWhenPresent(row::getMtd)
            .set(evm).equalToWhenPresent(row::getEvm)
            .set(etc).equalToWhenPresent(row::getEtc)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(rac4m1eIdx, isEqualTo(row::getRac4m1eIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Rc1Rac4m1e> insertStatement);
}