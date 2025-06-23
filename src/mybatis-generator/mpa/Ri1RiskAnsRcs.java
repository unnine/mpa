package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ri1RiskAnsRcs {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short riskAnsRcsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short riskAnsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String riskElmDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String riskElmEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRiskAnsRcsIdx() {
        return riskAnsRcsIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskAnsRcsIdx(Short riskAnsRcsIdx) {
        this.riskAnsRcsIdx = riskAnsRcsIdx;
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
    public String getRiskElmDiv() {
        return riskElmDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskElmDiv(String riskElmDiv) {
        this.riskElmDiv = riskElmDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRiskElmEtc() {
        return riskElmEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskElmEtc(String riskElmEtc) {
        this.riskElmEtc = riskElmEtc;
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

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", riskAnsRcsIdx=").append(riskAnsRcsIdx);
        sb.append(", riskAnsIdx=").append(riskAnsIdx);
        sb.append(", riskElmDiv=").append(riskElmDiv);
        sb.append(", riskElmEtc=").append(riskElmEtc);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", ord=").append(ord);
        sb.append(", delYn=").append(delYn);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.riskAnsRcsIdx;
    }

    public void setId(Short riskAnsRcsIdx) {
        this.riskAnsRcsIdx = riskAnsRcsIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ri1RiskAnsRcs other = (Ri1RiskAnsRcs) o;
        return Objects.equals(riskAnsRcsIdx, other.riskAnsRcsIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riskAnsRcsIdx);
    }
}