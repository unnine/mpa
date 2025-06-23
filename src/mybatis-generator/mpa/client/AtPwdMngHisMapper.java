package mpa.client;

import static mpa.client.AtPwdMngHisDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.AtPwdMngHis;
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

public interface AtPwdMngHisMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(pwdMngSeq, plntCd, ver, useYn, iniPwd, pwdMinDigt, cobOptCd, dobLmtCnt, rccPosbCnt, srlPwdUseYn, pwdChgDudt, lognFailLockCnt, crtIp, crtDs, crtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="AtPwdMngHisResult", value = {
        @Result(column="PWD_MNG_SEQ", property="pwdMngSeq", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="VER", property="ver", jdbcType=JdbcType.NUMERIC),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="INI_PWD", property="iniPwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PWD_MIN_DIGT", property="pwdMinDigt", jdbcType=JdbcType.NUMERIC),
        @Result(column="COB_OPT_CD", property="cobOptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOB_LMT_CNT", property="dobLmtCnt", jdbcType=JdbcType.NUMERIC),
        @Result(column="RCC_POSB_CNT", property="rccPosbCnt", jdbcType=JdbcType.NUMERIC),
        @Result(column="SRL_PWD_USE_YN", property="srlPwdUseYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="PWD_CHG_DUDT", property="pwdChgDudt", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGN_FAIL_LOCK_CNT", property="lognFailLockCnt", jdbcType=JdbcType.NUMERIC),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<AtPwdMngHis> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("AtPwdMngHisResult")
    Optional<AtPwdMngHis> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, atPwdMngHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, atPwdMngHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short pwdMngSeq_) {
        return delete(c -> 
            c.where(pwdMngSeq, isEqualTo(pwdMngSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(AtPwdMngHis row) {
        return MyBatis3Utils.insert(this::insert, row, atPwdMngHis, c ->
            c.map(pwdMngSeq).toProperty("pwdMngSeq")
            .map(plntCd).toProperty("plntCd")
            .map(ver).toProperty("ver")
            .map(useYn).toProperty("useYn")
            .map(iniPwd).toProperty("iniPwd")
            .map(pwdMinDigt).toProperty("pwdMinDigt")
            .map(cobOptCd).toProperty("cobOptCd")
            .map(dobLmtCnt).toProperty("dobLmtCnt")
            .map(rccPosbCnt).toProperty("rccPosbCnt")
            .map(srlPwdUseYn).toProperty("srlPwdUseYn")
            .map(pwdChgDudt).toProperty("pwdChgDudt")
            .map(lognFailLockCnt).toProperty("lognFailLockCnt")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<AtPwdMngHis> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, atPwdMngHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<AtPwdMngHis> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, atPwdMngHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<AtPwdMngHis> findById(Short pwdMngSeq_) {
        return findOne(c ->
            c.where(pwdMngSeq, isEqualTo(pwdMngSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, atPwdMngHis, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(AtPwdMngHis row) {
        return update(c ->
            c.set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(ver).equalToWhenPresent(row::getVer)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(iniPwd).equalToWhenPresent(row::getIniPwd)
            .set(pwdMinDigt).equalToWhenPresent(row::getPwdMinDigt)
            .set(cobOptCd).equalToWhenPresent(row::getCobOptCd)
            .set(dobLmtCnt).equalToWhenPresent(row::getDobLmtCnt)
            .set(rccPosbCnt).equalToWhenPresent(row::getRccPosbCnt)
            .set(srlPwdUseYn).equalToWhenPresent(row::getSrlPwdUseYn)
            .set(pwdChgDudt).equalToWhenPresent(row::getPwdChgDudt)
            .set(lognFailLockCnt).equalToWhenPresent(row::getLognFailLockCnt)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .where(pwdMngSeq, isEqualTo(row::getPwdMngSeq))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<AtPwdMngHis> insertStatement);
}