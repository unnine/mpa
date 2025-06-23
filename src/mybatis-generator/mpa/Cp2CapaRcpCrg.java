package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cp2CapaRcpCrg {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short capaRcpCrgIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short capaRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crgDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crgUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ncsAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reqFdbk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ctt;

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
    public Short getCapaRcpCrgIdx() {
        return capaRcpCrgIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaRcpCrgIdx(Short capaRcpCrgIdx) {
        this.capaRcpCrgIdx = capaRcpCrgIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getCapaRcpIdx() {
        return capaRcpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaRcpIdx(Short capaRcpIdx) {
        this.capaRcpIdx = capaRcpIdx;
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
    public String getCmplDt() {
        return cmplDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCmplDt(String cmplDt) {
        this.cmplDt = cmplDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNcsAtc() {
        return ncsAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNcsAtc(String ncsAtc) {
        this.ncsAtc = ncsAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReqFdbk() {
        return reqFdbk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReqFdbk(String reqFdbk) {
        this.reqFdbk = reqFdbk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCtt() {
        return ctt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCtt(String ctt) {
        this.ctt = ctt;
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
        sb.append(", capaRcpCrgIdx=").append(capaRcpCrgIdx);
        sb.append(", capaRcpIdx=").append(capaRcpIdx);
        sb.append(", crgDptCd=").append(crgDptCd);
        sb.append(", crgUid=").append(crgUid);
        sb.append(", cmplDt=").append(cmplDt);
        sb.append(", ncsAtc=").append(ncsAtc);
        sb.append(", reqFdbk=").append(reqFdbk);
        sb.append(", ctt=").append(ctt);
        sb.append(", ord=").append(ord);
        sb.append(", delYn=").append(delYn);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.capaRcpCrgIdx;
    }

    public void setId(Short capaRcpCrgIdx) {
        this.capaRcpCrgIdx = capaRcpCrgIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cp2CapaRcpCrg other = (Cp2CapaRcpCrg) o;
        return Objects.equals(capaRcpCrgIdx, other.capaRcpCrgIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capaRcpCrgIdx);
    }
}