package mpa.client;

import static mpa.client.SyFileInfoDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyFileInfo;
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

public interface SyFileInfoMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(fileIdx, fileSeq, plntCd, fileNm, ord, fileSize, delYn, fileTyp, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, fileLob);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyFileInfoResult", value = {
        @Result(column="FILE_IDX", property="fileIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="FILE_SEQ", property="fileSeq", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_NM", property="fileNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORD", property="ord", jdbcType=JdbcType.NUMERIC),
        @Result(column="FILE_SIZE", property="fileSize", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_TYP", property="fileTyp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="FILE_LOB", property="fileLob", jdbcType=JdbcType.BLOB)
    })
    List<SyFileInfo> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyFileInfoResult")
    Optional<SyFileInfo> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syFileInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syFileInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short fileIdx_, Short fileSeq_) {
        return delete(c -> 
            c.where(fileIdx, isEqualTo(fileIdx_))
            .and(fileSeq, isEqualTo(fileSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyFileInfo row) {
        return MyBatis3Utils.insert(this::insert, row, syFileInfo, c ->
            c.map(fileIdx).toProperty("fileIdx")
            .map(fileSeq).toProperty("fileSeq")
            .map(plntCd).toProperty("plntCd")
            .map(fileNm).toProperty("fileNm")
            .map(ord).toProperty("ord")
            .map(fileSize).toProperty("fileSize")
            .map(delYn).toProperty("delYn")
            .map(fileTyp).toProperty("fileTyp")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(fileLob).toProperty("fileLob")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyFileInfo> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syFileInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyFileInfo> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syFileInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyFileInfo> findById(Short fileIdx_, Short fileSeq_) {
        return findOne(c ->
            c.where(fileIdx, isEqualTo(fileIdx_))
            .and(fileSeq, isEqualTo(fileSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syFileInfo, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyFileInfo row) {
        return update(c ->
            c.set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(fileNm).equalToWhenPresent(row::getFileNm)
            .set(ord).equalToWhenPresent(row::getOrd)
            .set(fileSize).equalToWhenPresent(row::getFileSize)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .set(fileTyp).equalToWhenPresent(row::getFileTyp)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(fileLob).equalToWhenPresent(row::getFileLob)
            .where(fileIdx, isEqualTo(row::getFileIdx))
            .and(fileSeq, isEqualTo(row::getFileSeq))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyFileInfo> insertStatement);
}