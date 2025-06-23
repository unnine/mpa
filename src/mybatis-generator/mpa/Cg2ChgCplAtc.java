package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cg2ChgCplAtc {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short chgCplAtcIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short chgCplIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgCplAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgCplAtcCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgCplAtcIdx() {
        return chgCplAtcIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgCplAtcIdx(Short chgCplAtcIdx) {
        this.chgCplAtcIdx = chgCplAtcIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgCplIdx() {
        return chgCplIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgCplIdx(Short chgCplIdx) {
        this.chgCplIdx = chgCplIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgCplAtc() {
        return chgCplAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgCplAtc(String chgCplAtc) {
        this.chgCplAtc = chgCplAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgCplAtcCtt() {
        return chgCplAtcCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgCplAtcCtt(String chgCplAtcCtt) {
        this.chgCplAtcCtt = chgCplAtcCtt;
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
        sb.append(", chgCplAtcIdx=").append(chgCplAtcIdx);
        sb.append(", chgCplIdx=").append(chgCplIdx);
        sb.append(", chgCplAtc=").append(chgCplAtc);
        sb.append(", chgCplAtcCtt=").append(chgCplAtcCtt);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.chgCplAtcIdx;
    }

    public void setId(Short chgCplAtcIdx) {
        this.chgCplAtcIdx = chgCplAtcIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cg2ChgCplAtc other = (Cg2ChgCplAtc) o;
        return Objects.equals(chgCplAtcIdx, other.chgCplAtcIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chgCplAtcIdx);
    }
}