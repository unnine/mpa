package mpa.client;

import static mpa.client.AtSysVerHisDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.AtSysVerHis;
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

public interface AtSysVerHisMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(sysVerCd, sysVer, chgRmk, chgDt, chgCrg, useYn, delYn, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AtSysVerHisResult", value = {
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="SYS_VER", property="sysVer", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_RMK", property="chgRmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_DT", property="chgDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHG_CRG", property="chgCrg", jdbcType=JdbcType.VARCHAR),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<AtSysVerHis> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AtSysVerHisResult")
    Optional<AtSysVerHis> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, atSysVerHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, atSysVerHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String sysVerCd_) {
        return delete(c -> 
            c.where(sysVerCd, isEqualTo(sysVerCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(AtSysVerHis row) {
        return MyBatis3Utils.insert(this::insert, row, atSysVerHis, c ->
            c.map(sysVerCd).toProperty("sysVerCd")
            .map(sysVer).toProperty("sysVer")
            .map(chgRmk).toProperty("chgRmk")
            .map(chgDt).toProperty("chgDt")
            .map(chgCrg).toProperty("chgCrg")
            .map(useYn).toProperty("useYn")
            .map(delYn).toProperty("delYn")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<AtSysVerHis> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, atSysVerHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<AtSysVerHis> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, atSysVerHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<AtSysVerHis> findById(String sysVerCd_) {
        return findOne(c ->
            c.where(sysVerCd, isEqualTo(sysVerCd_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, atSysVerHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(AtSysVerHis row) {
        return update(c ->
            c.set(sysVer).equalToWhenPresent(row::getSysVer)
            .set(chgRmk).equalToWhenPresent(row::getChgRmk)
            .set(chgDt).equalToWhenPresent(row::getChgDt)
            .set(chgCrg).equalToWhenPresent(row::getChgCrg)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(sysVerCd, isEqualTo(row::getSysVerCd))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<AtSysVerHis> insertStatement);
}