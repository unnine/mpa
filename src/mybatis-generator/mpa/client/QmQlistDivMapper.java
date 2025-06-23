package mpa.client;

import static mpa.client.QmQlistDivDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.QmQlistDiv;
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

public interface QmQlistDivMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(plntCd, qlistDiv, qlistVer, qlistDivNm, qlistDivUseYn, qlistDivOrd, qlistDivDelYn, udtIp, udtDs, udtUid, rmk);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="QmQlistDivResult", value = {
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="QLIST_DIV", property="qlistDiv", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="QLIST_VER", property="qlistVer", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="QLIST_DIV_NM", property="qlistDivNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="QLIST_DIV_USE_YN", property="qlistDivUseYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="QLIST_DIV_ORD", property="qlistDivOrd", jdbcType=JdbcType.NUMERIC),
        @Result(column="QLIST_DIV_DEL_YN", property="qlistDivDelYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR)
    })
    List<QmQlistDiv> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("QmQlistDivResult")
    Optional<QmQlistDiv> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, qmQlistDiv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, qmQlistDiv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String plntCd_, String qlistDiv_, String qlistVer_) {
        return delete(c -> 
            c.where(plntCd, isEqualTo(plntCd_))
            .and(qlistDiv, isEqualTo(qlistDiv_))
            .and(qlistVer, isEqualTo(qlistVer_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(QmQlistDiv row) {
        return MyBatis3Utils.insert(this::insert, row, qmQlistDiv, c ->
            c.map(plntCd).toProperty("plntCd")
            .map(qlistDiv).toProperty("qlistDiv")
            .map(qlistVer).toProperty("qlistVer")
            .map(qlistDivNm).toProperty("qlistDivNm")
            .map(qlistDivUseYn).toProperty("qlistDivUseYn")
            .map(qlistDivOrd).toProperty("qlistDivOrd")
            .map(qlistDivDelYn).toProperty("qlistDivDelYn")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(rmk).toProperty("rmk")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmQlistDiv> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, qmQlistDiv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<QmQlistDiv> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, qmQlistDiv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<QmQlistDiv> findById(String plntCd_, String qlistDiv_, String qlistVer_) {
        return findOne(c ->
            c.where(plntCd, isEqualTo(plntCd_))
            .and(qlistDiv, isEqualTo(qlistDiv_))
            .and(qlistVer, isEqualTo(qlistVer_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, qmQlistDiv, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(QmQlistDiv row) {
        return update(c ->
            c.set(qlistDivNm).equalToWhenPresent(row::getQlistDivNm)
            .set(qlistDivUseYn).equalToWhenPresent(row::getQlistDivUseYn)
            .set(qlistDivOrd).equalToWhenPresent(row::getQlistDivOrd)
            .set(qlistDivDelYn).equalToWhenPresent(row::getQlistDivDelYn)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .where(plntCd, isEqualTo(row::getPlntCd))
            .and(qlistDiv, isEqualTo(row::getQlistDiv))
            .and(qlistVer, isEqualTo(row::getQlistVer))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<QmQlistDiv> insertStatement);
}