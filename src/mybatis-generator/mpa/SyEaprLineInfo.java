package mpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyEaprLineInfo {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short eaprLineInfoIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short eaprLineIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eaprReqDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal aprDegr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ncsYn;

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
    private String eaprUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getEaprLineInfoIdx() {
        return eaprLineInfoIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprLineInfoIdx(Short eaprLineInfoIdx) {
        this.eaprLineInfoIdx = eaprLineInfoIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getEaprLineIdx() {
        return eaprLineIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprLineIdx(Short eaprLineIdx) {
        this.eaprLineIdx = eaprLineIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEaprReqDiv() {
        return eaprReqDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprReqDiv(String eaprReqDiv) {
        this.eaprReqDiv = eaprReqDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getAprDegr() {
        return aprDegr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAprDegr(BigDecimal aprDegr) {
        this.aprDegr = aprDegr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNcsYn() {
        return ncsYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNcsYn(String ncsYn) {
        this.ncsYn = ncsYn;
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
    public String getEaprUid() {
        return eaprUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprUid(String eaprUid) {
        this.eaprUid = eaprUid;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eaprLineInfoIdx=").append(eaprLineInfoIdx);
        sb.append(", eaprLineIdx=").append(eaprLineIdx);
        sb.append(", eaprReqDiv=").append(eaprReqDiv);
        sb.append(", aprDegr=").append(aprDegr);
        sb.append(", ncsYn=").append(ncsYn);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", eaprUid=").append(eaprUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.eaprLineInfoIdx;
    }

    public void setId(Short eaprLineInfoIdx) {
        this.eaprLineInfoIdx = eaprLineInfoIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyEaprLineInfo other = (SyEaprLineInfo) o;
        return Objects.equals(eaprLineInfoIdx, other.eaprLineInfoIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eaprLineInfoIdx);
    }
}