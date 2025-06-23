package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ti1TrniPlnSop {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short trniPlnSopIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short trniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sopDocNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sopDocTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTrniPlnSopIdx() {
        return trniPlnSopIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniPlnSopIdx(Short trniPlnSopIdx) {
        this.trniPlnSopIdx = trniPlnSopIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTrniPlnIdx() {
        return trniPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniPlnIdx(Short trniPlnIdx) {
        this.trniPlnIdx = trniPlnIdx;
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
    public String getSopDocNo() {
        return sopDocNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSopDocNo(String sopDocNo) {
        this.sopDocNo = sopDocNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSopDocTit() {
        return sopDocTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSopDocTit(String sopDocTit) {
        this.sopDocTit = sopDocTit;
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
        sb.append(", trniPlnSopIdx=").append(trniPlnSopIdx);
        sb.append(", trniPlnIdx=").append(trniPlnIdx);
        sb.append(", ord=").append(ord);
        sb.append(", delYn=").append(delYn);
        sb.append(", sopDocNo=").append(sopDocNo);
        sb.append(", sopDocTit=").append(sopDocTit);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.trniPlnSopIdx;
    }

    public void setId(Short trniPlnSopIdx) {
        this.trniPlnSopIdx = trniPlnSopIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ti1TrniPlnSop other = (Ti1TrniPlnSop) o;
        return Objects.equals(trniPlnSopIdx, other.trniPlnSopIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trniPlnSopIdx);
    }
}