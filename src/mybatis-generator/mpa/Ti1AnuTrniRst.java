package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ti1AnuTrniRst {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short anuTrniRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short anuTrniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short anuTrniRstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAnuTrniRstIdx() {
        return anuTrniRstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAnuTrniRstIdx(Short anuTrniRstIdx) {
        this.anuTrniRstIdx = anuTrniRstIdx;
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
    public Short getAnuTrniRstAprIdx() {
        return anuTrniRstAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAnuTrniRstAprIdx(Short anuTrniRstAprIdx) {
        this.anuTrniRstAprIdx = anuTrniRstAprIdx;
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
        sb.append(", anuTrniRstIdx=").append(anuTrniRstIdx);
        sb.append(", anuTrniPlnIdx=").append(anuTrniPlnIdx);
        sb.append(", anuTrniRstAprIdx=").append(anuTrniRstAprIdx);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.anuTrniRstIdx;
    }

    public void setId(Short anuTrniRstIdx) {
        this.anuTrniRstIdx = anuTrniRstIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ti1AnuTrniRst other = (Ti1AnuTrniRst) o;
        return Objects.equals(anuTrniRstIdx, other.anuTrniRstIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anuTrniRstIdx);
    }
}