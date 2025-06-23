package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ri1RiskPlnOrg {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short riskPlnOrgIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short riskPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crgDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crgUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String role;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRiskPlnOrgIdx() {
        return riskPlnOrgIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskPlnOrgIdx(Short riskPlnOrgIdx) {
        this.riskPlnOrgIdx = riskPlnOrgIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRiskPlnIdx() {
        return riskPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskPlnIdx(Short riskPlnIdx) {
        this.riskPlnIdx = riskPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrgDptCd() {
        return crgDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrgDptCd(String crgDptCd) {
        this.crgDptCd = crgDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrgUid() {
        return crgUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrgUid(String crgUid) {
        this.crgUid = crgUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRole() {
        return role;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRole(String role) {
        this.role = role;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOrd() {
        return ord;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrd(Short ord) {
        this.ord = ord;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDelYn() {
        return delYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDelYn(String delYn) {
        this.delYn = delYn;
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
        sb.append(", riskPlnOrgIdx=").append(riskPlnOrgIdx);
        sb.append(", riskPlnIdx=").append(riskPlnIdx);
        sb.append(", crgDptCd=").append(crgDptCd);
        sb.append(", crgUid=").append(crgUid);
        sb.append(", role=").append(role);
        sb.append(", ord=").append(ord);
        sb.append(", delYn=").append(delYn);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.riskPlnOrgIdx;
    }

    public void setId(Short riskPlnOrgIdx) {
        this.riskPlnOrgIdx = riskPlnOrgIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ri1RiskPlnOrg other = (Ri1RiskPlnOrg) o;
        return Objects.equals(riskPlnOrgIdx, other.riskPlnOrgIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskPlnOrgIdx);
    }
}