package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cg2ChgEnfo {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short chgEnfoIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short chgPrpsRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short chgEnfoAprIdx;

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
    private String vlamNcsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgEnfoIdx() {
        return chgEnfoIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgEnfoIdx(Short chgEnfoIdx) {
        this.chgEnfoIdx = chgEnfoIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgPrpsRcpIdx() {
        return chgPrpsRcpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgPrpsRcpIdx(Short chgPrpsRcpIdx) {
        this.chgPrpsRcpIdx = chgPrpsRcpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgEnfoAprIdx() {
        return chgEnfoAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgEnfoAprIdx(Short chgEnfoAprIdx) {
        this.chgEnfoAprIdx = chgEnfoAprIdx;
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
    public String getVlamNcsYn() {
        return vlamNcsYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVlamNcsYn(String vlamNcsYn) {
        this.vlamNcsYn = vlamNcsYn;
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
        sb.append(", chgEnfoIdx=").append(chgEnfoIdx);
        sb.append(", chgPrpsRcpIdx=").append(chgPrpsRcpIdx);
        sb.append(", chgEnfoAprIdx=").append(chgEnfoAprIdx);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", vlamNcsYn=").append(vlamNcsYn);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.chgEnfoIdx;
    }

    public void setId(Short chgEnfoIdx) {
        this.chgEnfoIdx = chgEnfoIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cg2ChgEnfo other = (Cg2ChgEnfo) o;
        return Objects.equals(chgEnfoIdx, other.chgEnfoIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chgEnfoIdx);
    }
}