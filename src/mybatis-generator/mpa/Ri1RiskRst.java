package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ri1RiskRst {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short riskRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short riskAnsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short riskRstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String riskRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String riskCcls;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

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
    public Short getRiskRstIdx() {
        return riskRstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskRstIdx(Short riskRstIdx) {
        this.riskRstIdx = riskRstIdx;
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
    public Short getRiskRstAprIdx() {
        return riskRstAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskRstAprIdx(Short riskRstAprIdx) {
        this.riskRstAprIdx = riskRstAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRiskRst() {
        return riskRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskRst(String riskRst) {
        this.riskRst = riskRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRiskCcls() {
        return riskCcls;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskCcls(String riskCcls) {
        this.riskCcls = riskCcls;
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

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", riskRstIdx=").append(riskRstIdx);
        sb.append(", riskAnsIdx=").append(riskAnsIdx);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", riskRstAprIdx=").append(riskRstAprIdx);
        sb.append(", riskRst=").append(riskRst);
        sb.append(", riskCcls=").append(riskCcls);
        sb.append(", rmk=").append(rmk);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.riskRstIdx;
    }

    public void setId(Short riskRstIdx) {
        this.riskRstIdx = riskRstIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ri1RiskRst other = (Ri1RiskRst) o;
        return Objects.equals(riskRstIdx, other.riskRstIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskRstIdx);
    }
}