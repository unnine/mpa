package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ea1ExadPln {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short exadPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtComp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtPps;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtrInfo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtExpStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtExpEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cplTrm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short exadPlnAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String exadProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtKnd;

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
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getExadPlnIdx() {
        return exadPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExadPlnIdx(Short exadPlnIdx) {
        this.exadPlnIdx = exadPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSysVerCd() {
        return sysVerCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSysVerCd(String sysVerCd) {
        this.sysVerCd = sysVerCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPlntCd() {
        return plntCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
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
    public String getAdtComp() {
        return adtComp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtComp(String adtComp) {
        this.adtComp = adtComp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtPps() {
        return adtPps;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtPps(String adtPps) {
        this.adtPps = adtPps;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtrInfo() {
        return adtrInfo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtrInfo(String adtrInfo) {
        this.adtrInfo = adtrInfo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtExpStrDt() {
        return adtExpStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtExpStrDt(String adtExpStrDt) {
        this.adtExpStrDt = adtExpStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtExpEndDt() {
        return adtExpEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtExpEndDt(String adtExpEndDt) {
        this.adtExpEndDt = adtExpEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCplTrm() {
        return cplTrm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCplTrm(String cplTrm) {
        this.cplTrm = cplTrm;
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
    public Short getExadPlnAprIdx() {
        return exadPlnAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExadPlnAprIdx(Short exadPlnAprIdx) {
        this.exadPlnAprIdx = exadPlnAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getExadProc() {
        return exadProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExadProc(String exadProc) {
        this.exadProc = exadProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtKnd() {
        return adtKnd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtKnd(String adtKnd) {
        this.adtKnd = adtKnd;
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

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDelYn() {
        return delYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDelYn(String delYn) {
        this.delYn = delYn;
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
    public Short getModlTracIdx() {
        return modlTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlTracIdx(Short modlTracIdx) {
        this.modlTracIdx = modlTracIdx;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", exadPlnIdx=").append(exadPlnIdx);
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", adtComp=").append(adtComp);
        sb.append(", adtPps=").append(adtPps);
        sb.append(", adtrInfo=").append(adtrInfo);
        sb.append(", adtExpStrDt=").append(adtExpStrDt);
        sb.append(", adtExpEndDt=").append(adtExpEndDt);
        sb.append(", cplTrm=").append(cplTrm);
        sb.append(", rmk=").append(rmk);
        sb.append(", exadPlnAprIdx=").append(exadPlnAprIdx);
        sb.append(", exadProc=").append(exadProc);
        sb.append(", adtKnd=").append(adtKnd);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", delYn=").append(delYn);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", modlTracIdx=").append(modlTracIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.exadPlnIdx;
    }

    public void setId(Short exadPlnIdx) {
        this.exadPlnIdx = exadPlnIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ea1ExadPln other = (Ea1ExadPln) o;
        return Objects.equals(exadPlnIdx, other.exadPlnIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exadPlnIdx);
    }
}