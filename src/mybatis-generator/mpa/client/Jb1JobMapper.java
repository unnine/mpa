package mpa.client;

import static mpa.client.Jb1JobDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Jb1Job;
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

public interface Jb1JobMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(jobIdx, hirJobIdx, rvsNo, sysVerCd, plntCd, qmsMngNo, userUid, jobAprIdx, jobProc, eduCd, joinDt, userDptNm, rvsYn, rvsRea, rvsDs, majrNm, rpo1stUid, rpo2stUid, rpo3stUid, rpo4stUid, rpo5stUid, rmk, fileIdx, useYn, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, delYn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Jb1JobResult", value = {
        @Result(column="JOB_IDX", property="jobIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="HIR_JOB_IDX", property="hirJobIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RVS_NO", property="rvsNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_UID", property="userUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="JOB_APR_IDX", property="jobAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="JOB_PROC", property="jobProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="EDU_CD", property="eduCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="JOIN_DT", property="joinDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="USER_DPT_NM", property="userDptNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_YN", property="rvsYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_REA", property="rvsRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="RVS_DS", property="rvsDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MAJR_NM", property="majrNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPO_1ST_UID", property="rpo1stUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPO_2ST_UID", property="rpo2stUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPO_3ST_UID", property="rpo3stUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPO_4ST_UID", property="rpo4stUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="RPO_5ST_UID", property="rpo5stUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="RMK", property="rmk", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="USE_YN", property="useYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR)
    })
    List<Jb1Job> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Jb1JobResult")
    Optional<Jb1Job> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, jb1Job, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, jb1Job, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short jobIdx_) {
        return delete(c -> 
            c.where(jobIdx, isEqualTo(jobIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Jb1Job row) {
        return MyBatis3Utils.insert(this::insert, row, jb1Job, c ->
            c.map(jobIdx).toProperty("jobIdx")
            .map(hirJobIdx).toProperty("hirJobIdx")
            .map(rvsNo).toProperty("rvsNo")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(plntCd).toProperty("plntCd")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(userUid).toProperty("userUid")
            .map(jobAprIdx).toProperty("jobAprIdx")
            .map(jobProc).toProperty("jobProc")
            .map(eduCd).toProperty("eduCd")
            .map(joinDt).toProperty("joinDt")
            .map(userDptNm).toProperty("userDptNm")
            .map(rvsYn).toProperty("rvsYn")
            .map(rvsRea).toProperty("rvsRea")
            .map(rvsDs).toProperty("rvsDs")
            .map(majrNm).toProperty("majrNm")
            .map(rpo1stUid).toProperty("rpo1stUid")
            .map(rpo2stUid).toProperty("rpo2stUid")
            .map(rpo3stUid).toProperty("rpo3stUid")
            .map(rpo4stUid).toProperty("rpo4stUid")
            .map(rpo5stUid).toProperty("rpo5stUid")
            .map(rmk).toProperty("rmk")
            .map(fileIdx).toProperty("fileIdx")
            .map(useYn).toProperty("useYn")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(delYn).toProperty("delYn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Jb1Job> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, jb1Job, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Jb1Job> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, jb1Job, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Jb1Job> findById(Short jobIdx_) {
        return findOne(c ->
            c.where(jobIdx, isEqualTo(jobIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, jb1Job, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Jb1Job row) {
        return update(c ->
            c.set(hirJobIdx).equalToWhenPresent(row::getHirJobIdx)
            .set(rvsNo).equalToWhenPresent(row::getRvsNo)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(userUid).equalToWhenPresent(row::getUserUid)
            .set(jobAprIdx).equalToWhenPresent(row::getJobAprIdx)
            .set(jobProc).equalToWhenPresent(row::getJobProc)
            .set(eduCd).equalToWhenPresent(row::getEduCd)
            .set(joinDt).equalToWhenPresent(row::getJoinDt)
            .set(userDptNm).equalToWhenPresent(row::getUserDptNm)
            .set(rvsYn).equalToWhenPresent(row::getRvsYn)
            .set(rvsRea).equalToWhenPresent(row::getRvsRea)
            .set(rvsDs).equalToWhenPresent(row::getRvsDs)
            .set(majrNm).equalToWhenPresent(row::getMajrNm)
            .set(rpo1stUid).equalToWhenPresent(row::getRpo1stUid)
            .set(rpo2stUid).equalToWhenPresent(row::getRpo2stUid)
            .set(rpo3stUid).equalToWhenPresent(row::getRpo3stUid)
            .set(rpo4stUid).equalToWhenPresent(row::getRpo4stUid)
            .set(rpo5stUid).equalToWhenPresent(row::getRpo5stUid)
            .set(rmk).equalToWhenPresent(row::getRmk)
            .set(fileIdx).equalToWhenPresent(row::getFileIdx)
            .set(useYn).equalToWhenPresent(row::getUseYn)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .where(jobIdx, isEqualTo(row::getJobIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Jb1Job> insertStatement);
}