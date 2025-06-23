package mpa.client;

import static mpa.client.SyUserDlgdDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.SyUserDlgd;
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

public interface SyUserDlgdMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(userUid, dlgdSeq, reprUid, dlgdDt, gbkDt, dlgdRea, dlgdPrgsCd, dlgdSttscd, dlgdAprReqIdx, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="SyUserDlgdResult", value = {
        @Result(column="USER_UID", property="userUid", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="DLGD_SEQ", property="dlgdSeq", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="REPR_UID", property="reprUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLGD_DT", property="dlgdDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="GBK_DT", property="gbkDt", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLGD_REA", property="dlgdRea", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLGD_PRGS_CD", property="dlgdPrgsCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLGD_STTSCD", property="dlgdSttscd", jdbcType=JdbcType.VARCHAR),
        @Result(column="DLGD_APR_REQ_IDX", property="dlgdAprReqIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<SyUserDlgd> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("SyUserDlgdResult")
    Optional<SyUserDlgd> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, syUserDlgd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, syUserDlgd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(String userUid_, Short dlgdSeq_) {
        return delete(c -> 
            c.where(userUid, isEqualTo(userUid_))
            .and(dlgdSeq, isEqualTo(dlgdSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(SyUserDlgd row) {
        return MyBatis3Utils.insert(this::insert, row, syUserDlgd, c ->
            c.map(userUid).toProperty("userUid")
            .map(dlgdSeq).toProperty("dlgdSeq")
            .map(reprUid).toProperty("reprUid")
            .map(dlgdDt).toProperty("dlgdDt")
            .map(gbkDt).toProperty("gbkDt")
            .map(dlgdRea).toProperty("dlgdRea")
            .map(dlgdPrgsCd).toProperty("dlgdPrgsCd")
            .map(dlgdSttscd).toProperty("dlgdSttscd")
            .map(dlgdAprReqIdx).toProperty("dlgdAprReqIdx")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUserDlgd> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, syUserDlgd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<SyUserDlgd> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, syUserDlgd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<SyUserDlgd> findById(String userUid_, Short dlgdSeq_) {
        return findOne(c ->
            c.where(userUid, isEqualTo(userUid_))
            .and(dlgdSeq, isEqualTo(dlgdSeq_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, syUserDlgd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(SyUserDlgd row) {
        return update(c ->
            c.set(reprUid).equalToWhenPresent(row::getReprUid)
            .set(dlgdDt).equalToWhenPresent(row::getDlgdDt)
            .set(gbkDt).equalToWhenPresent(row::getGbkDt)
            .set(dlgdRea).equalToWhenPresent(row::getDlgdRea)
            .set(dlgdPrgsCd).equalToWhenPresent(row::getDlgdPrgsCd)
            .set(dlgdSttscd).equalToWhenPresent(row::getDlgdSttscd)
            .set(dlgdAprReqIdx).equalToWhenPresent(row::getDlgdAprReqIdx)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(userUid, isEqualTo(row::getUserUid))
            .and(dlgdSeq, isEqualTo(row::getDlgdSeq))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<SyUserDlgd> insertStatement);
}