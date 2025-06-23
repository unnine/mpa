package mpa.client;

import static mpa.client.Dv1DeviOcrpDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import mpa.Dv1DeviOcrp;
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

public interface Dv1DeviOcrpMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(deviOcrpIdx, plntCd, sysVerCd, tracIdx, qmsMngNo, docNo, deviOcrpAprIdx, deviProc, deviTit, prdSmpNm, deviPlnYn, ocrConfDs, dscver, ocrPla, dscvTestTeamNm, deviKnd, imdActItm, eptRcs, crtIp, crtDs, crtUid, udtIp, udtDs, udtUid, modlTracIdx);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="Dv1DeviOcrpResult", value = {
        @Result(column="DEVI_OCRP_IDX", property="deviOcrpIdx", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="PLNT_CD", property="plntCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYS_VER_CD", property="sysVerCd", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRAC_IDX", property="tracIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="QMS_MNG_NO", property="qmsMngNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DOC_NO", property="docNo", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEVI_OCRP_APR_IDX", property="deviOcrpAprIdx", jdbcType=JdbcType.NUMERIC),
        @Result(column="DEVI_PROC", property="deviProc", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEVI_TIT", property="deviTit", jdbcType=JdbcType.VARCHAR),
        @Result(column="PRD_SMP_NM", property="prdSmpNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEVI_PLN_YN", property="deviPlnYn", jdbcType=JdbcType.VARCHAR),
        @Result(column="OCR_CONF_DS", property="ocrConfDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="DSCVER", property="dscver", jdbcType=JdbcType.VARCHAR),
        @Result(column="OCR_PLA", property="ocrPla", jdbcType=JdbcType.VARCHAR),
        @Result(column="DSCV_TEST_TEAM_NM", property="dscvTestTeamNm", jdbcType=JdbcType.VARCHAR),
        @Result(column="DEVI_KND", property="deviKnd", jdbcType=JdbcType.VARCHAR),
        @Result(column="IMD_ACT_ITM", property="imdActItm", jdbcType=JdbcType.VARCHAR),
        @Result(column="EPT_RCS", property="eptRcs", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_IP", property="crtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CRT_DS", property="crtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="CRT_UID", property="crtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_IP", property="udtIp", jdbcType=JdbcType.VARCHAR),
        @Result(column="UDT_DS", property="udtDs", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="UDT_UID", property="udtUid", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODL_TRAC_IDX", property="modlTracIdx", jdbcType=JdbcType.NUMERIC)
    })
    List<Dv1DeviOcrp> findAll(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("Dv1DeviOcrpResult")
    Optional<Dv1DeviOcrp> findOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, dv1DeviOcrp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, dv1DeviOcrp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(Short deviOcrpIdx_) {
        return delete(c -> 
            c.where(deviOcrpIdx, isEqualTo(deviOcrpIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Dv1DeviOcrp row) {
        return MyBatis3Utils.insert(this::insert, row, dv1DeviOcrp, c ->
            c.map(deviOcrpIdx).toProperty("deviOcrpIdx")
            .map(plntCd).toProperty("plntCd")
            .map(sysVerCd).toProperty("sysVerCd")
            .map(tracIdx).toProperty("tracIdx")
            .map(qmsMngNo).toProperty("qmsMngNo")
            .map(docNo).toProperty("docNo")
            .map(deviOcrpAprIdx).toProperty("deviOcrpAprIdx")
            .map(deviProc).toProperty("deviProc")
            .map(deviTit).toProperty("deviTit")
            .map(prdSmpNm).toProperty("prdSmpNm")
            .map(deviPlnYn).toProperty("deviPlnYn")
            .map(ocrConfDs).toProperty("ocrConfDs")
            .map(dscver).toProperty("dscver")
            .map(ocrPla).toProperty("ocrPla")
            .map(dscvTestTeamNm).toProperty("dscvTestTeamNm")
            .map(deviKnd).toProperty("deviKnd")
            .map(imdActItm).toProperty("imdActItm")
            .map(eptRcs).toProperty("eptRcs")
            .map(crtIp).toProperty("crtIp")
            .map(crtDs).toProperty("crtDs")
            .map(crtUid).toProperty("crtUid")
            .map(udtIp).toProperty("udtIp")
            .map(udtDs).toProperty("udtDs")
            .map(udtUid).toProperty("udtUid")
            .map(modlTracIdx).toProperty("modlTracIdx")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Dv1DeviOcrp> findOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::findOne, selectList, dv1DeviOcrp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Dv1DeviOcrp> findAll(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::findAll, selectList, dv1DeviOcrp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Dv1DeviOcrp> findById(Short deviOcrpIdx_) {
        return findOne(c ->
            c.where(deviOcrpIdx, isEqualTo(deviOcrpIdx_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, dv1DeviOcrp, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(Dv1DeviOcrp row) {
        return update(c ->
            c.set(plntCd).equalToWhenPresent(row::getPlntCd)
            .set(sysVerCd).equalToWhenPresent(row::getSysVerCd)
            .set(tracIdx).equalToWhenPresent(row::getTracIdx)
            .set(qmsMngNo).equalToWhenPresent(row::getQmsMngNo)
            .set(docNo).equalToWhenPresent(row::getDocNo)
            .set(deviOcrpAprIdx).equalToWhenPresent(row::getDeviOcrpAprIdx)
            .set(deviProc).equalToWhenPresent(row::getDeviProc)
            .set(deviTit).equalToWhenPresent(row::getDeviTit)
            .set(prdSmpNm).equalToWhenPresent(row::getPrdSmpNm)
            .set(deviPlnYn).equalToWhenPresent(row::getDeviPlnYn)
            .set(ocrConfDs).equalToWhenPresent(row::getOcrConfDs)
            .set(dscver).equalToWhenPresent(row::getDscver)
            .set(ocrPla).equalToWhenPresent(row::getOcrPla)
            .set(dscvTestTeamNm).equalToWhenPresent(row::getDscvTestTeamNm)
            .set(deviKnd).equalToWhenPresent(row::getDeviKnd)
            .set(imdActItm).equalToWhenPresent(row::getImdActItm)
            .set(eptRcs).equalToWhenPresent(row::getEptRcs)
            .set(crtIp).equalToWhenPresent(row::getCrtIp)
            .set(crtDs).equalToWhenPresent(row::getCrtDs)
            .set(crtUid).equalToWhenPresent(row::getCrtUid)
            .set(udtIp).equalToWhenPresent(row::getUdtIp)
            .set(udtDs).equalToWhenPresent(row::getUdtDs)
            .set(udtUid).equalToWhenPresent(row::getUdtUid)
            .set(modlTracIdx).equalToWhenPresent(row::getModlTracIdx)
            .where(deviOcrpIdx, isEqualTo(row::getDeviOcrpIdx))
        );
    }

    @InsertProvider(type = SqlProviderAdapter.class, method = "insert")
    int insert(InsertStatementProvider<Dv1DeviOcrp> insertStatement);
}