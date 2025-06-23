package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ti1TrniPlnTagt {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short trniPlnTagtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short trniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniTagtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTrniPlnTagtIdx() {
        return trniPlnTagtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniPlnTagtIdx(Short trniPlnTagtIdx) {
        this.trniPlnTagtIdx = trniPlnTagtIdx;
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
    public String getTrniTagtUid() {
        return trniTagtUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniTagtUid(String trniTagtUid) {
        this.trniTagtUid = trniTagtUid;
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
        sb.append(", trniPlnTagtIdx=").append(trniPlnTagtIdx);
        sb.append(", trniPlnIdx=").append(trniPlnIdx);
        sb.append(", trniTagtUid=").append(trniTagtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.trniPlnTagtIdx;
    }

    public void setId(Short trniPlnTagtIdx) {
        this.trniPlnTagtIdx = trniPlnTagtIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ti1TrniPlnTagt other = (Ti1TrniPlnTagt) o;
        return Objects.equals(trniPlnTagtIdx, other.trniPlnTagtIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trniPlnTagtIdx);
    }
}