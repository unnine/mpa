package mpa.client;

import static mpa.client.Ea1ExadRstMismtsDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Ea1ExadRstMismts;
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

public interface Ea1ExadRstMismtsMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(exadRstMismtsIdx, exadRstIdx, riskRnk, misMtsCtt, udtIp, udtDs, udtUid);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Ea1ExadRstMismtsResult", value = {
        @Result(column="EXAD_RST_MISMTS_IDX", property="exadRstMismtsIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="EXAD_RST_IDX", property="exadRstIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="RISK_RNK", property="riskRnk", jdbcType=JdbcType.VARCHAR),
        @Result(column="MIS_MTS_CTT", property="misMtsCtt", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR)
    })
    List<Ea1ExadRstMismts> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Ea1ExadRstMismtsResult")
    Optional<Ea1ExadRstMismts> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, ea1ExadRstMismts, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, ea1ExadRstMismts, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short exadRstMismtsIdx_) {
        return delete(c -> 
            c.where(exadRstMismtsIdx, isEqualTo(exadRstMismtsIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Ea1ExadRstMismts row) {
        return MyBatis3Utils.insert(this::insert, row, ea1ExadRstMismts, c ->
            c.map(exadRstMismtsIdx).toProperty("exadRstMismtsIdx")
            .map(exadRstIdx).toProperty("exadRstIdx")
            .map(riskRnk).toProperty("riskRnk")
            .map(misMtsCtt).toProperty("misMtsCtt")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ea1ExadRstMismts> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, ea1ExadRstMismts, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Ea1ExadRstMismts> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, ea1ExadRstMismts, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Ea1ExadRstMismts> findById(Short exadRstMismtsIdx_) {
        return findOne(c ->
            c.where(exadRstMismtsIdx, isEqualTo(exadRstMismtsIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, ea1ExadRstMismts, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Ea1ExadRstMismts row) {
        return update(c ->
            c.set(exadRstIdx).equalToWhenPresent(row::getExadRstIdx)
            .set(riskRnk).equalToWhenPresent(row::getRiskRnk)
            .set(misMtsCtt).equalToWhenPresent(row::getMisMtsCtt)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .where(exadRstMismtsIdx, isEqualTo(row::getExadRstMismtsIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Ea1ExadRstMismts> insertStatement);
}