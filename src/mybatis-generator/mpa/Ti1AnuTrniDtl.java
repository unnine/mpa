package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ti1AnuTrniDtl {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short anuTrniDtlIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short anuTrniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short trnrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniExpStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniExpEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniPrgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAnuTrniDtlIdx() {
        return anuTrniDtlIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAnuTrniDtlIdx(Short anuTrniDtlIdx) {
        this.anuTrniDtlIdx = anuTrniDtlIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAnuTrniPlnIdx() {
        return anuTrniPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAnuTrniPlnIdx(Short anuTrniPlnIdx) {
        this.anuTrniPlnIdx = anuTrniPlnIdx;
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
    public Short getTrnrElamIdx() {
        return trnrElamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrnrElamIdx(Short trnrElamIdx) {
        this.trnrElamIdx = trnrElamIdx;
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
    public String getTrniTit() {
        return trniTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniTit(String trniTit) {
        this.trniTit = trniTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniPrgYn() {
        return trniPrgYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniPrgYn(String trniPrgYn) {
        this.trniPrgYn = trniPrgYn;
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
        sb.append(", anuTrniDtlIdx=").append(anuTrniDtlIdx);
        sb.append(", anuTrniPlnIdx=").append(anuTrniPlnIdx);
        sb.append(", trniUid=").append(trniUid);
        sb.append(", trnrElamIdx=").append(trnrElamIdx);
        sb.append(", trniExpStrDt=").append(trniExpStrDt);
        sb.append(", trniExpEndDt=").append(trniExpEndDt);
        sb.append(", trniTit=").append(trniTit);
        sb.append(", trniPrgYn=").append(trniPrgYn);
        sb.append(", rmk=").append(rmk);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.anuTrniDtlIdx;
    }

    public void setId(Short anuTrniDtlIdx) {
        this.anuTrniDtlIdx = anuTrniDtlIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ti1AnuTrniDtl other = (Ti1AnuTrniDtl) o;
        return Objects.equals(anuTrniDtlIdx, other.anuTrniDtlIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anuTrniDtlIdx);
    }
}