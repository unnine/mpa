package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cg2ChgEnfoAtc {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short chgEnfoAtcIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short chgEnfoIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgEnfoAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgEnfoAtcCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgEnfoAtcIdx() {
        return chgEnfoAtcIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgEnfoAtcIdx(Short chgEnfoAtcIdx) {
        this.chgEnfoAtcIdx = chgEnfoAtcIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgEnfoIdx() {
        return chgEnfoIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgEnfoIdx(Short chgEnfoIdx) {
        this.chgEnfoIdx = chgEnfoIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgEnfoAtc() {
        return chgEnfoAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgEnfoAtc(String chgEnfoAtc) {
        this.chgEnfoAtc = chgEnfoAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgEnfoAtcCtt() {
        return chgEnfoAtcCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgEnfoAtcCtt(String chgEnfoAtcCtt) {
        this.chgEnfoAtcCtt = chgEnfoAtcCtt;
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
        sb.append(", chgEnfoAtcIdx=").append(chgEnfoAtcIdx);
        sb.append(", chgEnfoIdx=").append(chgEnfoIdx);
        sb.append(", chgEnfoAtc=").append(chgEnfoAtc);
        sb.append(", chgEnfoAtcCtt=").append(chgEnfoAtcCtt);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.chgEnfoAtcIdx;
    }

    public void setId(Short chgEnfoAtcIdx) {
        this.chgEnfoAtcIdx = chgEnfoAtcIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cg2ChgEnfoAtc other = (Cg2ChgEnfoAtc) o;
        return Objects.equals(chgEnfoAtcIdx, other.chgEnfoAtcIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chgEnfoAtcIdx);
    }
}