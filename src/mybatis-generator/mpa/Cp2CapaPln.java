package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cp2CapaPln {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short capaPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short capaRcpCrgIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plnVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plnMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crgDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crgUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String capaPln;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short plnAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String capaPlnProc;

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
    private Short changeTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String changeMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getCapaPlnIdx() {
        return capaPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaPlnIdx(Short capaPlnIdx) {
        this.capaPlnIdx = capaPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getCapaRcpCrgIdx() {
        return capaRcpCrgIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaRcpCrgIdx(Short capaRcpCrgIdx) {
        this.capaRcpCrgIdx = capaRcpCrgIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPlnVer() {
        return plnVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlnVer(String plnVer) {
        this.plnVer = plnVer;
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
    public Short getTracIdx() {
        return tracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTracIdx(Short tracIdx) {
        this.tracIdx = tracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPlnMngNo() {
        return plnMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlnMngNo(String plnMngNo) {
        this.plnMngNo = plnMngNo;
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
    public String getCrgDptCd() {
        return crgDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrgDptCd(String crgDptCd) {
        this.crgDptCd = crgDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrgUid() {
        return crgUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrgUid(String crgUid) {
        this.crgUid = crgUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCmplDt() {
        return cmplDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCmplDt(String cmplDt) {
        this.cmplDt = cmplDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCapaPln() {
        return capaPln;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaPln(String capaPln) {
        this.capaPln = capaPln;
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
    public Short getPlnAprIdx() {
        return plnAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlnAprIdx(Short plnAprIdx) {
        this.plnAprIdx = plnAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCapaPlnProc() {
        return capaPlnProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaPlnProc(String capaPlnProc) {
        this.capaPlnProc = capaPlnProc;
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
    public Short getChangeTracIdx() {
        return changeTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChangeTracIdx(Short changeTracIdx) {
        this.changeTracIdx = changeTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChangeMngNo() {
        return changeMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChangeMngNo(String changeMngNo) {
        this.changeMngNo = changeMngNo;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", capaPlnIdx=").append(capaPlnIdx);
        sb.append(", capaRcpCrgIdx=").append(capaRcpCrgIdx);
        sb.append(", plnVer=").append(plnVer);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", plnMngNo=").append(plnMngNo);
        sb.append(", docNo=").append(docNo);
        sb.append(", crgDptCd=").append(crgDptCd);
        sb.append(", crgUid=").append(crgUid);
        sb.append(", cmplDt=").append(cmplDt);
        sb.append(", capaPln=").append(capaPln);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", plnAprIdx=").append(plnAprIdx);
        sb.append(", capaPlnProc=").append(capaPlnProc);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", changeTracIdx=").append(changeTracIdx);
        sb.append(", changeMngNo=").append(changeMngNo);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.capaPlnIdx;
    }

    public void setId(Short capaPlnIdx) {
        this.capaPlnIdx = capaPlnIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cp2CapaPln other = (Cp2CapaPln) o;
        return Objects.equals(capaPlnIdx, other.capaPlnIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capaPlnIdx);
    }
}