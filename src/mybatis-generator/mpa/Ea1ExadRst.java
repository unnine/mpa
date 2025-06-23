package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ea1ExadRst {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short exadRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short exadPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtEnfoStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtEnfoEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtRstRevDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String siteIspMts;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docIspMts;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

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
    private Short exadRstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getExadRstIdx() {
        return exadRstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExadRstIdx(Short exadRstIdx) {
        this.exadRstIdx = exadRstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getExadPlnIdx() {
        return exadPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExadPlnIdx(Short exadPlnIdx) {
        this.exadPlnIdx = exadPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtEnfoStrDt() {
        return adtEnfoStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtEnfoStrDt(String adtEnfoStrDt) {
        this.adtEnfoStrDt = adtEnfoStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtEnfoEndDt() {
        return adtEnfoEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtEnfoEndDt(String adtEnfoEndDt) {
        this.adtEnfoEndDt = adtEnfoEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtRstRevDt() {
        return adtRstRevDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtRstRevDt(String adtRstRevDt) {
        this.adtRstRevDt = adtRstRevDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtRst() {
        return adtRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtRst(String adtRst) {
        this.adtRst = adtRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSiteIspMts() {
        return siteIspMts;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSiteIspMts(String siteIspMts) {
        this.siteIspMts = siteIspMts;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDocIspMts() {
        return docIspMts;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocIspMts(String docIspMts) {
        this.docIspMts = docIspMts;
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
    public Short getFileIdx() {
        return fileIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFileIdx(Short fileIdx) {
        this.fileIdx = fileIdx;
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
    public Short getExadRstAprIdx() {
        return exadRstAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExadRstAprIdx(Short exadRstAprIdx) {
        this.exadRstAprIdx = exadRstAprIdx;
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
        sb.append(", exadRstIdx=").append(exadRstIdx);
        sb.append(", exadPlnIdx=").append(exadPlnIdx);
        sb.append(", adtEnfoStrDt=").append(adtEnfoStrDt);
        sb.append(", adtEnfoEndDt=").append(adtEnfoEndDt);
        sb.append(", adtRstRevDt=").append(adtRstRevDt);
        sb.append(", adtRst=").append(adtRst);
        sb.append(", siteIspMts=").append(siteIspMts);
        sb.append(", docIspMts=").append(docIspMts);
        sb.append(", rmk=").append(rmk);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", delYn=").append(delYn);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", exadRstAprIdx=").append(exadRstAprIdx);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.exadRstIdx;
    }

    public void setId(Short exadRstIdx) {
        this.exadRstIdx = exadRstIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ea1ExadRst other = (Ea1ExadRst) o;
        return Objects.equals(exadRstIdx, other.exadRstIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exadRstIdx);
    }
}