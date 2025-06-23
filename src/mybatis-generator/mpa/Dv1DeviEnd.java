package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Dv1DeviEnd {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short deviEndIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short deviOcrpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short deviEndAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

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
    public Short getDeviEndIdx() {
        return deviEndIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeviEndIdx(Short deviEndIdx) {
        this.deviEndIdx = deviEndIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getDeviOcrpIdx() {
        return deviOcrpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeviOcrpIdx(Short deviOcrpIdx) {
        this.deviOcrpIdx = deviOcrpIdx;
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
    public Short getDeviEndAprIdx() {
        return deviEndAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeviEndAprIdx(Short deviEndAprIdx) {
        this.deviEndAprIdx = deviEndAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRmk() {
        return rmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRmk(String rmk) {
        this.rmk = rmk;
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

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deviEndIdx=").append(deviEndIdx);
        sb.append(", deviOcrpIdx=").append(deviOcrpIdx);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", deviEndAprIdx=").append(deviEndAprIdx);
        sb.append(", rmk=").append(rmk);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.deviEndIdx;
    }

    public void setId(Short deviEndIdx) {
        this.deviEndIdx = deviEndIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Dv1DeviEnd other = (Dv1DeviEnd) o;
        return Objects.equals(deviEndIdx, other.deviEndIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviEndIdx);
    }
}