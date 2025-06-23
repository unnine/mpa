package mpa.client;

import static mpa.client.SyUserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyUser;
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

public interface SyUserMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(userUid, plntCd, userHirUid, userVer, dptCd, athCd, loclNm, lognId, pwd, pwdChgDt, gradCd, pstnCd, emid, email, mobNo, tel, lognFailCnt, useYn, useChgRea, useChgDs, lockYn, lockChgRea, lockChgDs, rvsRea, rvsDs, iniYn, ord, revwYn, aprYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, advYn, userIp, signFile);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyUserResult", value = {
        @Result(column="USER_UID", property="userUid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_HIR_UID", property="userHirUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_VER", property="userVer", jdbcType=JdbcType.VARCHAR),
        @Result(column="DPT_CD", property="dptCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="ATH_CD", property="athCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCL_NM", property="loclNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGN_ID", property="lognId", jdbcType=JdbcType.VARCHAR),
        @Result(column="PWD", property="pwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PWD_CHG_DT", property="pwdChgDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="GRAD_CD", property="gradCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PSTN_CD", property="pstnCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMID", property="emid", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="MOB_NO", property="mobNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEL", property="tel", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOGN_FAIL_CNT", property="lognFailCnt", jdbcType=JdbcType.NUMERIC),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="USE_CHG_REA", property="useChgRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="USE_CHG_DS", property="useChgDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="LOCK_YN", property="lockYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCK_CHG_REA", property="lockChgRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="LOCK_CHG_DS", property="lockChgDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="RVS_REA", property="rvsRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_DS", property="rvsDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="INI_YN", property="iniYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="REVW_YN", property="revwYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="APR_YN", property="aprYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADV_YN", property="advYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_IP", property="userIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="SIGN_FILE", property="signFile", jdbcType=JdbcType.BLOB)
    })
    List<SyUser> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyUserResult")
    Optional<SyUser> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String userUid_) {
        return delete(c -> 
            c.where(userUid, isEqualTo(userUid_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyUser row) {
        return MyBatis3Utils.insert(this::insert, row, syUser, c ->
            c.map(userUid).toProperty("userUid")
            .map(plntCd).toProperty("plntCd")
            .map(userHirUid).toProperty("userHirUid")
            .map(userVer).toProperty("userVer")
            .map(dptCd).toProperty("dptCd")
            .map(athCd).toProperty("athCd")
            .map(loclNm).toProperty("loclNm")
            .map(lognId).toProperty("lognId")
            .map(pwd).toProperty("pwd")
            .map(pwdChgDt).toProperty("pwdChgDt")
            .map(gradCd).toProperty("gradCd")
            .map(pstnCd).toProperty("pstnCd")
            .map(emid).toProperty("emid")
            .map(email).toProperty("email")
            .map(mobNo).toProperty("mobNo")
            .map(tel).toProperty("tel")
            .map(lognFailCnt).toProperty("lognFailCnt")
            .map(useYn).toProperty("useYn")
            .map(useChgRea).toProperty("useChgRea")
            .map(useChgDs).toProperty("useChgDs")
            .map(lockYn).toProperty("lockYn")
            .map(lockChgRea).toProperty("lockChgRea")
            .map(lockChgDs).toProperty("lockChgDs")
            .map(rvsRea).toProperty("rvsRea")
            .map(rvsDs).toProperty("rvsDs")
            .map(iniYn).toProperty("iniYn")
            .map(ord).toProperty("ord")
            .map(revwYn).toProperty("revwYn")
            .map(aprYn).toProperty("aprYn")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(advYn).toProperty("advYn")
            .map(userIp).toProperty("userIp")
            .map(signFile).toProperty("signFile")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUser> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyUser> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUser> findById(String userUid_) {
        return findOne(c ->
            c.where(userUid, isEqualTo(userUid_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syUser, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyUser row) {
        return update(c ->
            c.set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(userHirUid).equalToWhenPresent(row::getUserHirUid)
            .set(userVer).equalToWhenPresent(row::getUserVer)
            .set(dptCd).equalToWhenPresent(row::getDptCd)
            .set(athCd).equalToWhenPresent(row::getAthCd)
            .set(loclNm).equalToWhenPresent(row::getLoclNm)
            .set(lognId).equalToWhenPresent(row::getLognId)
            .set(pwd).equalToWhenPresent(row::getPwd)
            .set(pwdChgDt).equalToWhenPresent(row::getPwdChgDt)
            .set(gradCd).equalToWhenPresent(row::getGradCd)
            .set(pstnCd).equalToWhenPresent(row::getPstnCd)
            .set(emid).equalToWhenPresent(row::getEmid)
            .set(email).equalToWhenPresent(row::getEmail)
            .set(mobNo).equalToWhenPresent(row::getMobNo)
            .set(tel).equalToWhenPresent(row::getTel)
            .set(lognFailCnt).equalToWhenPresent(row::getLognFailCnt)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(useChgRea).equalToWhenPresent(row::getUseChgRea)
            .set(useChgDs).equalToWhenPresent(row::getUseChgDs)
            .set(lockYn).equalToWhenPresent(row::getLockYn)
            .set(lockChgRea).equalToWhenPresent(row::getLockChgRea)
            .set(lockChgDs).equalToWhenPresent(row::getLockChgDs)
            .set(rvsRea).equalToWhenPresent(row::getRvsRea)
            .set(rvsDs).equalToWhenPresent(row::getRvsDs)
            .set(iniYn).equalToWhenPresent(row::getIniYn)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(revwYn).equalToWhenPresent(row::getRevwYn)
            .set(aprYn).equalToWhenPresent(row::getAprYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(advYn).equalToWhenPresent(row::getAdvYn)
            .set(userIp).equalToWhenPresent(row::getUserIp)
            .set(signFile).equalToWhenPresent(row::getSignFile)
            .where(userUid, isEqualTo(row::getUserUid))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyUser> insertStatement);
}