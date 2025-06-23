package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cp2CapaReq {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short capaReqIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlDivEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String capaTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short capaReqAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String capaReqProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reqDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reqUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docNo;

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
    private Short modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getCapaReqIdx() {
        return capaReqIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaReqIdx(Short capaReqIdx) {
        this.capaReqIdx = capaReqIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getModlDivEtc() {
        return modlDivEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlDivEtc(String modlDivEtc) {
        this.modlDivEtc = modlDivEtc;
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
    public String getModlDivCd() {
        return modlDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlDivCd(String modlDivCd) {
        this.modlDivCd = modlDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCapaTit() {
        return capaTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaTit(String capaTit) {
        this.capaTit = capaTit;
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
    public Short getCapaReqAprIdx() {
        return capaReqAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaReqAprIdx(Short capaReqAprIdx) {
        this.capaReqAprIdx = capaReqAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCapaReqProc() {
        return capaReqProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaReqProc(String capaReqProc) {
        this.capaReqProc = capaReqProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReqDptCd() {
        return reqDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReqDptCd(String reqDptCd) {
        this.reqDptCd = reqDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReqUid() {
        return reqUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReqUid(String reqUid) {
        this.reqUid = reqUid;
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
    public String getSysVerCd() {
        return sysVerCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSysVerCd(String sysVerCd) {
        this.sysVerCd = sysVerCd;
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
        sb.append(", capaReqIdx=").append(capaReqIdx);
        sb.append(", modlDivEtc=").append(modlDivEtc);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", modlDivCd=").append(modlDivCd);
        sb.append(", capaTit=").append(capaTit);
        sb.append(", rmk=").append(rmk);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", capaReqAprIdx=").append(capaReqAprIdx);
        sb.append(", capaReqProc=").append(capaReqProc);
        sb.append(", reqDptCd=").append(reqDptCd);
        sb.append(", reqUid=").append(reqUid);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", docNo=").append(docNo);
        sb.append(", delYn=").append(delYn);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", modlTracIdx=").append(modlTracIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.capaReqIdx;
    }

    public void setId(Short capaReqIdx) {
        this.capaReqIdx = capaReqIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cp2CapaReq other = (Cp2CapaReq) o;
        return Objects.equals(capaReqIdx, other.capaReqIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capaReqIdx);
    }
}