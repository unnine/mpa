package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Si1SfisRpt {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short sfisRptIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short sfisIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sfisRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String fileCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short sfisRptAprIdx;

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
    public Short getSfisRptIdx() {
        return sfisRptIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisRptIdx(Short sfisRptIdx) {
        this.sfisRptIdx = sfisRptIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getSfisIdx() {
        return sfisIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisIdx(Short sfisIdx) {
        this.sfisIdx = sfisIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSfisRst() {
        return sfisRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisRst(String sfisRst) {
        this.sfisRst = sfisRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getFileIdx() {
        return fileIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFileIdx(Short fileIdx) {
        this.fileIdx = fileIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getFileCtt() {
        return fileCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFileCtt(String fileCtt) {
        this.fileCtt = fileCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getSfisRptAprIdx() {
        return sfisRptAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisRptAprIdx(Short sfisRptAprIdx) {
        this.sfisRptAprIdx = sfisRptAprIdx;
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
        sb.append(", sfisRptIdx=").append(sfisRptIdx);
        sb.append(", sfisIdx=").append(sfisIdx);
        sb.append(", sfisRst=").append(sfisRst);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", fileCtt=").append(fileCtt);
        sb.append(", sfisRptAprIdx=").append(sfisRptAprIdx);
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
        return this.sfisRptIdx;
    }

    public void setId(Short sfisRptIdx) {
        this.sfisRptIdx = sfisRptIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Si1SfisRpt other = (Si1SfisRpt) o;
        return Objects.equals(sfisRptIdx, other.sfisRptIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sfisRptIdx);
    }
}