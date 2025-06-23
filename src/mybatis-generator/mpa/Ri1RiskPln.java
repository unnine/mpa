package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ri1RiskPln {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short riskPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short riskAnsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short riskPlnAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ocrPosb;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ocrPosbDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sev;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sevDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String accpStd;

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
    private String enfoPln;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRiskPlnIdx() {
        return riskPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskPlnIdx(Short riskPlnIdx) {
        this.riskPlnIdx = riskPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRiskAnsIdx() {
        return riskAnsIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskAnsIdx(Short riskAnsIdx) {
        this.riskAnsIdx = riskAnsIdx;
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
    public Short getRiskPlnAprIdx() {
        return riskPlnAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskPlnAprIdx(Short riskPlnAprIdx) {
        this.riskPlnAprIdx = riskPlnAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOcrPosb() {
        return ocrPosb;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOcrPosb(String ocrPosb) {
        this.ocrPosb = ocrPosb;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOcrPosbDesc() {
        return ocrPosbDesc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOcrPosbDesc(String ocrPosbDesc) {
        this.ocrPosbDesc = ocrPosbDesc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSev() {
        return sev;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSev(String sev) {
        this.sev = sev;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSevDesc() {
        return sevDesc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSevDesc(String sevDesc) {
        this.sevDesc = sevDesc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAccpStd() {
        return accpStd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAccpStd(String accpStd) {
        this.accpStd = accpStd;
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
    public String getEnfoPln() {
        return enfoPln;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEnfoPln(String enfoPln) {
        this.enfoPln = enfoPln;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRmk() {
        return rmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRmk(String rmk) {
        this.rmk = rmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getFileIdx() {
        return fileIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFileIdx(Short fileIdx) {
        this.fileIdx = fileIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCmplDt() {
        return cmplDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCmplDt(String cmplDt) {
        this.cmplDt = cmplDt;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", riskPlnIdx=").append(riskPlnIdx);
        sb.append(", riskAnsIdx=").append(riskAnsIdx);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", riskPlnAprIdx=").append(riskPlnAprIdx);
        sb.append(", ocrPosb=").append(ocrPosb);
        sb.append(", ocrPosbDesc=").append(ocrPosbDesc);
        sb.append(", sev=").append(sev);
        sb.append(", sevDesc=").append(sevDesc);
        sb.append(", accpStd=").append(accpStd);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", enfoPln=").append(enfoPln);
        sb.append(", rmk=").append(rmk);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", cmplDt=").append(cmplDt);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.riskPlnIdx;
    }

    public void setId(Short riskPlnIdx) {
        this.riskPlnIdx = riskPlnIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ri1RiskPln other = (Ri1RiskPln) o;
        return Objects.equals(riskPlnIdx, other.riskPlnIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskPlnIdx);
    }
}