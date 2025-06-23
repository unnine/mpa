package mpa.client;

import static mpa.client.Ea1ExadPlnPrdDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ea1ExadPlnPrd;
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

public interface Ea1ExadPlnPrdMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(exadPlnPrdIdx, exadPlnIdx, pitmDiv, pitmCd, pitmNm, udtIp, udtDs, udtUid, delYn);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ea1ExadPlnPrdResult", value = {
        @Result(column="EXAD_PLN_PRD_IDX", property="exadPlnPrdIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="EXAD_PLN_IDX", property="exadPlnIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="PITM_DIV", property="pitmDiv", jdbcType=JdbcType.VARCHAR),
        @Result(column="PITM_CD", property="pitmCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="PITM_NM", property="pitmNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEL_YN", property="delYn", jdbcType=JdbcType.VARCHAR)
    })
    List<Ea1ExadPlnPrd> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ea1ExadPlnPrdResult")
    Optional<Ea1ExadPlnPrd> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ea1ExadPlnPrd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ea1ExadPlnPrd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short exadPlnPrdIdx_) {
        return delete(c -> 
            c.where(exadPlnPrdIdx, isEqualTo(exadPlnPrdIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ea1ExadPlnPrd row) {
        return MyBatis3Utils.insert(this::insert, row, ea1ExadPlnPrd, c ->
            c.map(exadPlnPrdIdx).toProperty("exadPlnPrdIdx")
            .map(exadPlnIdx).toProperty("exadPlnIdx")
            .map(pitmDiv).toProperty("pitmDiv")
            .map(pitmCd).toProperty("pitmCd")
            .map(pitmNm).toProperty("pitmNm")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(delYn).toProperty("delYn")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ea1ExadPlnPrd> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ea1ExadPlnPrd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ea1ExadPlnPrd> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ea1ExadPlnPrd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ea1ExadPlnPrd> findById(Short exadPlnPrdIdx_) {
        return findOne(c ->
            c.where(exadPlnPrdIdx, isEqualTo(exadPlnPrdIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ea1ExadPlnPrd, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ea1ExadPlnPrd row) {
        return update(c ->
            c.set(exadPlnIdx).equalToWhenPresent(row::getExadPlnIdx)
            .set(pitmDiv).equalToWhenPresent(row::getPitmDiv)
            .set(pitmCd).equalToWhenPresent(row::getPitmCd)
            .set(pitmNm).equalToWhenPresent(row::getPitmNm)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(delYn).equalToWhenPresent(row::getDelYn)
            .where(exadPlnPrdIdx, isEqualTo(row::getExadPlnPrdIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ea1ExadPlnPrd> insertStatement);
}