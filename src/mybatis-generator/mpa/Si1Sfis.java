package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Si1Sfis {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short sfisIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short sfisPlnTagtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sfisEnfoDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short sfisRstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sfisRstProc;

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
    public Short getSfisIdx() {
        return sfisIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisIdx(Short sfisIdx) {
        this.sfisIdx = sfisIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getSfisPlnTagtIdx() {
        return sfisPlnTagtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisPlnTagtIdx(Short sfisPlnTagtIdx) {
        this.sfisPlnTagtIdx = sfisPlnTagtIdx;
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
    public String getQmsMngNo() {
        return qmsMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQmsMngNo(String qmsMngNo) {
        this.qmsMngNo = qmsMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDocNo() {
        return docNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSfisEnfoDt() {
        return sfisEnfoDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisEnfoDt(String sfisEnfoDt) {
        this.sfisEnfoDt = sfisEnfoDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getSfisRstAprIdx() {
        return sfisRstAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisRstAprIdx(Short sfisRstAprIdx) {
        this.sfisRstAprIdx = sfisRstAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSfisRstProc() {
        return sfisRstProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisRstProc(String sfisRstProc) {
        this.sfisRstProc = sfisRstProc;
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
        sb.append(", sfisIdx=").append(sfisIdx);
        sb.append(", sfisPlnTagtIdx=").append(sfisPlnTagtIdx);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", docNo=").append(docNo);
        sb.append(", sfisEnfoDt=").append(sfisEnfoDt);
        sb.append(", sfisRstAprIdx=").append(sfisRstAprIdx);
        sb.append(", sfisRstProc=").append(sfisRstProc);
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
        return this.sfisIdx;
    }

    public void setId(Short sfisIdx) {
        this.sfisIdx = sfisIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Si1Sfis other = (Si1Sfis) o;
        return Objects.equals(sfisIdx, other.sfisIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sfisIdx);
    }
}