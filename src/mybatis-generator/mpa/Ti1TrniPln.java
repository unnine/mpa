package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ti1TrniPln {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short trniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short anuTrniDtlIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reqDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reqUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlDivEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short trnrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniExpStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniExpEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short plnAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTrniPlnIdx() {
        return trniPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniPlnIdx(Short trniPlnIdx) {
        this.trniPlnIdx = trniPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAnuTrniDtlIdx() {
        return anuTrniDtlIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAnuTrniDtlIdx(Short anuTrniDtlIdx) {
        this.anuTrniDtlIdx = anuTrniDtlIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSysVerCd() {
        return sysVerCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSysVerCd(String sysVerCd) {
        this.sysVerCd = sysVerCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTracIdx() {
        return tracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTracIdx(Short tracIdx) {
        this.tracIdx = tracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getModlTracIdx() {
        return modlTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlTracIdx(Short modlTracIdx) {
        this.modlTracIdx = modlTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPlntCd() {
        return plntCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getQmsMngNo() {
        return qmsMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQmsMngNo(String qmsMngNo) {
        this.qmsMngNo = qmsMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDocNo() {
        return docNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniProc() {
        return trniProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniProc(String trniProc) {
        this.trniProc = trniProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getModlDivCd() {
        return modlDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlDivCd(String modlDivCd) {
        this.modlDivCd = modlDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReqDptCd() {
        return reqDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReqDptCd(String reqDptCd) {
        this.reqDptCd = reqDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReqUid() {
        return reqUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReqUid(String reqUid) {
        this.reqUid = reqUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getModlDivEtc() {
        return modlDivEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlDivEtc(String modlDivEtc) {
        this.modlDivEtc = modlDivEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTrnrElamIdx() {
        return trnrElamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrnrElamIdx(Short trnrElamIdx) {
        this.trnrElamIdx = trnrElamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniUid() {
        return trniUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniUid(String trniUid) {
        this.trniUid = trniUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniTit() {
        return trniTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniTit(String trniTit) {
        this.trniTit = trniTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniExpStrDt() {
        return trniExpStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniExpStrDt(String trniExpStrDt) {
        this.trniExpStrDt = trniExpStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniExpEndDt() {
        return trniExpEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniExpEndDt(String trniExpEndDt) {
        this.trniExpEndDt = trniExpEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUdtIp() {
        return udtIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUdtIp(String udtIp) {
        this.udtIp = udtIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getUdtDs() {
        return udtDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUdtDs(LocalDateTime udtDs) {
        this.udtDs = udtDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUdtUid() {
        return udtUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUdtUid(String udtUid) {
        this.udtUid = udtUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getPlnAprIdx() {
        return plnAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlnAprIdx(Short plnAprIdx) {
        this.plnAprIdx = plnAprIdx;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", trniPlnIdx=").append(trniPlnIdx);
        sb.append(", anuTrniDtlIdx=").append(anuTrniDtlIdx);
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", modlTracIdx=").append(modlTracIdx);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", docNo=").append(docNo);
        sb.append(", trniProc=").append(trniProc);
        sb.append(", modlDivCd=").append(modlDivCd);
        sb.append(", reqDptCd=").append(reqDptCd);
        sb.append(", reqUid=").append(reqUid);
        sb.append(", modlDivEtc=").append(modlDivEtc);
        sb.append(", trnrElamIdx=").append(trnrElamIdx);
        sb.append(", trniUid=").append(trniUid);
        sb.append(", trniTit=").append(trniTit);
        sb.append(", trniExpStrDt=").append(trniExpStrDt);
        sb.append(", trniExpEndDt=").append(trniExpEndDt);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", plnAprIdx=").append(plnAprIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.trniPlnIdx;
    }

    public void setId(Short trniPlnIdx) {
        this.trniPlnIdx = trniPlnIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ti1TrniPln other = (Ti1TrniPln) o;
        return Objects.equals(trniPlnIdx, other.trniPlnIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trniPlnIdx);
    }
}