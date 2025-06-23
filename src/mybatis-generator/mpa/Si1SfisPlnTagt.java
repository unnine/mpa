package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Si1SfisPlnTagt {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short sfisPlnTagtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short sfisPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sfisExpStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sfisExpEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sfisTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sfisPsn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sfisFid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sfisFidEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getSfisPlnTagtIdx() {
        return sfisPlnTagtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisPlnTagtIdx(Short sfisPlnTagtIdx) {
        this.sfisPlnTagtIdx = sfisPlnTagtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getSfisPlnIdx() {
        return sfisPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisPlnIdx(Short sfisPlnIdx) {
        this.sfisPlnIdx = sfisPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSfisExpStrDt() {
        return sfisExpStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisExpStrDt(String sfisExpStrDt) {
        this.sfisExpStrDt = sfisExpStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSfisExpEndDt() {
        return sfisExpEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisExpEndDt(String sfisExpEndDt) {
        this.sfisExpEndDt = sfisExpEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSfisTit() {
        return sfisTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisTit(String sfisTit) {
        this.sfisTit = sfisTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSfisPsn() {
        return sfisPsn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisPsn(String sfisPsn) {
        this.sfisPsn = sfisPsn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSfisFid() {
        return sfisFid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisFid(String sfisFid) {
        this.sfisFid = sfisFid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSfisFidEtc() {
        return sfisFidEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisFidEtc(String sfisFidEtc) {
        this.sfisFidEtc = sfisFidEtc;
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
        sb.append(", sfisPlnTagtIdx=").append(sfisPlnTagtIdx);
        sb.append(", sfisPlnIdx=").append(sfisPlnIdx);
        sb.append(", sfisExpStrDt=").append(sfisExpStrDt);
        sb.append(", sfisExpEndDt=").append(sfisExpEndDt);
        sb.append(", sfisTit=").append(sfisTit);
        sb.append(", sfisPsn=").append(sfisPsn);
        sb.append(", sfisFid=").append(sfisFid);
        sb.append(", sfisFidEtc=").append(sfisFidEtc);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.sfisPlnTagtIdx;
    }

    public void setId(Short sfisPlnTagtIdx) {
        this.sfisPlnTagtIdx = sfisPlnTagtIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Si1SfisPlnTagt other = (Si1SfisPlnTagt) o;
        return Objects.equals(sfisPlnTagtIdx, other.sfisPlnTagtIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sfisPlnTagtIdx);
    }
}