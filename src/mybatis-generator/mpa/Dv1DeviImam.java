package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Dv1DeviImam {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short deviImamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short deviOcrpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short deviImamAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String prgStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String prgEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String deviCcls;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

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
    public Short getDeviImamIdx() {
        return deviImamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeviImamIdx(Short deviImamIdx) {
        this.deviImamIdx = deviImamIdx;
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
    public Short getDeviImamAprIdx() {
        return deviImamAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeviImamAprIdx(Short deviImamAprIdx) {
        this.deviImamAprIdx = deviImamAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPrgStrDt() {
        return prgStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrgStrDt(String prgStrDt) {
        this.prgStrDt = prgStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPrgEndDt() {
        return prgEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrgEndDt(String prgEndDt) {
        this.prgEndDt = prgEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDeviCcls() {
        return deviCcls;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDeviCcls(String deviCcls) {
        this.deviCcls = deviCcls;
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
        sb.append(", deviImamIdx=").append(deviImamIdx);
        sb.append(", deviOcrpIdx=").append(deviOcrpIdx);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", deviImamAprIdx=").append(deviImamAprIdx);
        sb.append(", prgStrDt=").append(prgStrDt);
        sb.append(", prgEndDt=").append(prgEndDt);
        sb.append(", deviCcls=").append(deviCcls);
        sb.append(", fileIdx=").append(fileIdx);
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
        return this.deviImamIdx;
    }

    public void setId(Short deviImamIdx) {
        this.deviImamIdx = deviImamIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Dv1DeviImam other = (Dv1DeviImam) o;
        return Objects.equals(deviImamIdx, other.deviImamIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deviImamIdx);
    }
}