package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Rc1RacRcs {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short racRcsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short racWrtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rcsClf;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rcsClfEtc;

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
    public Short getRacRcsIdx() {
        return racRcsIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRacRcsIdx(Short racRcsIdx) {
        this.racRcsIdx = racRcsIdx;
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
    public String getRcsClf() {
        return rcsClf;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcsClf(String rcsClf) {
        this.rcsClf = rcsClf;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRcsClfEtc() {
        return rcsClfEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcsClfEtc(String rcsClfEtc) {
        this.rcsClfEtc = rcsClfEtc;
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
        sb.append(", racRcsIdx=").append(racRcsIdx);
        sb.append(", racWrtIdx=").append(racWrtIdx);
        sb.append(", rcsClf=").append(rcsClf);
        sb.append(", rcsClfEtc=").append(rcsClfEtc);
        sb.append(", ord=").append(ord);
        sb.append(", delYn=").append(delYn);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.racRcsIdx;
    }

    public void setId(Short racRcsIdx) {
        this.racRcsIdx = racRcsIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Rc1RacRcs other = (Rc1RacRcs) o;
        return Objects.equals(racRcsIdx, other.racRcsIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(racRcsIdx);
    }
}