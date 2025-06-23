package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cp2CapaPlnEnd {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short capaEndIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short capaPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String jdgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String jdgSplmRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short plnEndAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getCapaEndIdx() {
        return capaEndIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaEndIdx(Short capaEndIdx) {
        this.capaEndIdx = capaEndIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getCapaPlnIdx() {
        return capaPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaPlnIdx(Short capaPlnIdx) {
        this.capaPlnIdx = capaPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getJdgYn() {
        return jdgYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJdgYn(String jdgYn) {
        this.jdgYn = jdgYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getJdgSplmRea() {
        return jdgSplmRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJdgSplmRea(String jdgSplmRea) {
        this.jdgSplmRea = jdgSplmRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getPlnEndAprIdx() {
        return plnEndAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlnEndAprIdx(Short plnEndAprIdx) {
        this.plnEndAprIdx = plnEndAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrtIp() {
        return crtIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrtIp(String crtIp) {
        this.crtIp = crtIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getCrtDs() {
        return crtDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrtDs(LocalDateTime crtDs) {
        this.crtDs = crtDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrtUid() {
        return crtUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrtUid(String crtUid) {
        this.crtUid = crtUid;
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
    public Short getTracIdx() {
        return tracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTracIdx(Short tracIdx) {
        this.tracIdx = tracIdx;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", capaEndIdx=").append(capaEndIdx);
        sb.append(", capaPlnIdx=").append(capaPlnIdx);
        sb.append(", jdgYn=").append(jdgYn);
        sb.append(", jdgSplmRea=").append(jdgSplmRea);
        sb.append(", plnEndAprIdx=").append(plnEndAprIdx);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.capaEndIdx;
    }

    public void setId(Short capaEndIdx) {
        this.capaEndIdx = capaEndIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cp2CapaPlnEnd other = (Cp2CapaPlnEnd) o;
        return Objects.equals(capaEndIdx, other.capaEndIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capaEndIdx);
    }
}