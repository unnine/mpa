package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Si1SfisPsn {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short sfisPsnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sfisPsnUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short sfisIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getSfisPsnIdx() {
        return sfisPsnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisPsnIdx(Short sfisPsnIdx) {
        this.sfisPsnIdx = sfisPsnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSfisPsnUid() {
        return sfisPsnUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisPsnUid(String sfisPsnUid) {
        this.sfisPsnUid = sfisPsnUid;
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
    public Short getSfisIdx() {
        return sfisIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisIdx(Short sfisIdx) {
        this.sfisIdx = sfisIdx;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sfisPsnIdx=").append(sfisPsnIdx);
        sb.append(", sfisPsnUid=").append(sfisPsnUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", sfisIdx=").append(sfisIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.sfisPsnIdx;
    }

    public void setId(Short sfisPsnIdx) {
        this.sfisPsnIdx = sfisPsnIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Si1SfisPsn other = (Si1SfisPsn) o;
        return Objects.equals(sfisPsnIdx, other.sfisPsnIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sfisPsnIdx);
    }
}