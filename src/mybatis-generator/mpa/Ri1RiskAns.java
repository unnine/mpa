package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ri1RiskAns {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short riskAnsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short riskAnsAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String riskProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String riskElm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String riskRcs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pitmDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String riskCgntYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRiskAnsIdx() {
        return riskAnsIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskAnsIdx(Short riskAnsIdx) {
        this.riskAnsIdx = riskAnsIdx;
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
    public Short getRiskAnsAprIdx() {
        return riskAnsAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskAnsAprIdx(Short riskAnsAprIdx) {
        this.riskAnsAprIdx = riskAnsAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRiskProc() {
        return riskProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskProc(String riskProc) {
        this.riskProc = riskProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRiskElm() {
        return riskElm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskElm(String riskElm) {
        this.riskElm = riskElm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRiskRcs() {
        return riskRcs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskRcs(String riskRcs) {
        this.riskRcs = riskRcs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPitmDiv() {
        return pitmDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPitmDiv(String pitmDiv) {
        this.pitmDiv = pitmDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRiskCgntYn() {
        return riskCgntYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskCgntYn(String riskCgntYn) {
        this.riskCgntYn = riskCgntYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrtIp() {
        return crtIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrtIp(String crtIp) {
        this.crtIp = crtIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getCrtDs() {
        return crtDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrtDs(LocalDateTime crtDs) {
        this.crtDs = crtDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrtUid() {
        return crtUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrtUid(String crtUid) {
        this.crtUid = crtUid;
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
    public Short getModlTracIdx() {
        return modlTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlTracIdx(Short modlTracIdx) {
        this.modlTracIdx = modlTracIdx;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", riskAnsIdx=").append(riskAnsIdx);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", docNo=").append(docNo);
        sb.append(", riskAnsAprIdx=").append(riskAnsAprIdx);
        sb.append(", riskProc=").append(riskProc);
        sb.append(", riskElm=").append(riskElm);
        sb.append(", riskRcs=").append(riskRcs);
        sb.append(", pitmDiv=").append(pitmDiv);
        sb.append(", riskCgntYn=").append(riskCgntYn);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", modlTracIdx=").append(modlTracIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.riskAnsIdx;
    }

    public void setId(Short riskAnsIdx) {
        this.riskAnsIdx = riskAnsIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ri1RiskAns other = (Ri1RiskAns) o;
        return Objects.equals(riskAnsIdx, other.riskAnsIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskAnsIdx);
    }
}