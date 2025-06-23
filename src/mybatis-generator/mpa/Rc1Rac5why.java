package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Rc1Rac5why {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short rac5whyIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short racWrtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String why;

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
    public Short getRac5whyIdx() {
        return rac5whyIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRac5whyIdx(Short rac5whyIdx) {
        this.rac5whyIdx = rac5whyIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRacWrtIdx() {
        return racWrtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRacWrtIdx(Short racWrtIdx) {
        this.racWrtIdx = racWrtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getWhy() {
        return why;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setWhy(String why) {
        this.why = why;
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
        sb.append(", rac5whyIdx=").append(rac5whyIdx);
        sb.append(", racWrtIdx=").append(racWrtIdx);
        sb.append(", why=").append(why);
        sb.append(", ord=").append(ord);
        sb.append(", delYn=").append(delYn);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.rac5whyIdx;
    }

    public void setId(Short rac5whyIdx) {
        this.rac5whyIdx = rac5whyIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Rc1Rac5why other = (Rc1Rac5why) o;
        return Objects.equals(rac5whyIdx, other.rac5whyIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rac5whyIdx);
    }
}