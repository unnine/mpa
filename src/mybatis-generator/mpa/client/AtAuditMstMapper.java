package mpa.client;

import static mpa.client.AtAuditMstDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.AtAuditMst;
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

public interface AtAuditMstMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(menuCd, menuSeq, tabNm, colNm, colHedNm, colComt, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, joinColNm, joinDisplayColNm, joinTabNm);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AtAuditMstResult", value = {
        @Result(column="MENU_CD", property="menuCd", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="MENU_SEQ", property="menuSeq", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="TAB_NM", property="tabNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="COL_NM", property="colNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="COL_HED_NM", property="colHedNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="COL_COMT", property="colComt", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="JOIN_COL_NM", property="joinColNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="JOIN_DISPLAY_COL_NM", property="joinDisplayColNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="JOIN_TAB_NM", property="joinTabNm", jdbcType=JdbcType.VARCHAR)
    })
    List<AtAuditMst> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AtAuditMstResult")
    Optional<AtAuditMst> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, atAuditMst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, atAuditMst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String menuCd_, Short menuSeq_) {
        return delete(c -> 
            c.where(menuCd, isEqualTo(menuCd_))
            .and(menuSeq, isEqualTo(menuSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(AtAuditMst row) {
        return MyBatis3Utils.insert(this::insert, row, atAuditMst, c ->
            c.map(menuCd).toProperty("menuCd")
            .map(menuSeq).toProperty("menuSeq")
            .map(tabNm).toProperty("tabNm")
            .map(colNm).toProperty("colNm")
            .map(colHedNm).toProperty("colHedNm")
            .map(colComt).toProperty("colComt")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(joinColNm).toProperty("joinColNm")
            .map(joinDisplayColNm).toProperty("joinDisplayColNm")
            .map(joinTabNm).toProperty("joinTabNm")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<AtAuditMst> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, atAuditMst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<AtAuditMst> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, atAuditMst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<AtAuditMst> findById(String menuCd_, Short menuSeq_) {
        return findOne(c ->
            c.where(menuCd, isEqualTo(menuCd_))
            .and(menuSeq, isEqualTo(menuSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, atAuditMst, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(AtAuditMst row) {
        return update(c ->
            c.set(tabNm).equalToWhenPresent(row::getTabNm)
            .set(colNm).equalToWhenPresent(row::getColNm)
            .set(colHedNm).equalToWhenPresent(row::getColHedNm)
            .set(colComt).equalToWhenPresent(row::getColComt)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(joinColNm).equalToWhenPresent(row::getJoinColNm)
            .set(joinDisplayColNm).equalToWhenPresent(row::getJoinDisplayColNm)
            .set(joinTabNm).equalToWhenPresent(row::getJoinTabNm)
            .where(menuCd, isEqualTo(row::getMenuCd))
            .and(menuSeq, isEqualTo(row::getMenuSeq))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<AtAuditMst> insertStatement);
}