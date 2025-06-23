package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cp2CapaRcp {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short capaRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short capaReqIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rcpDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rcpUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short rcpAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String capaProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rcpVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlDivEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String capaTit;

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
    public Short getCapaRcpIdx() {
        return capaRcpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaRcpIdx(Short capaRcpIdx) {
        this.capaRcpIdx = capaRcpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getCapaReqIdx() {
        return capaReqIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaReqIdx(Short capaReqIdx) {
        this.capaReqIdx = capaReqIdx;
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
    public String getRcpDptCd() {
        return rcpDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcpDptCd(String rcpDptCd) {
        this.rcpDptCd = rcpDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRcpUid() {
        return rcpUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcpUid(String rcpUid) {
        this.rcpUid = rcpUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRcpAprIdx() {
        return rcpAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcpAprIdx(Short rcpAprIdx) {
        this.rcpAprIdx = rcpAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCapaProc() {
        return capaProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaProc(String capaProc) {
        this.capaProc = capaProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRcpVer() {
        return rcpVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcpVer(String rcpVer) {
        this.rcpVer = rcpVer;
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
    public String getModlDivEtc() {
        return modlDivEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlDivEtc(String modlDivEtc) {
        this.modlDivEtc = modlDivEtc;
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
        sb.append(", capaRcpIdx=").append(capaRcpIdx);
        sb.append(", capaReqIdx=").append(capaReqIdx);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", docNo=").append(docNo);
        sb.append(", rcpDptCd=").append(rcpDptCd);
        sb.append(", rcpUid=").append(rcpUid);
        sb.append(", rcpAprIdx=").append(rcpAprIdx);
        sb.append(", capaProc=").append(capaProc);
        sb.append(", rcpVer=").append(rcpVer);
        sb.append(", modlDivCd=").append(modlDivCd);
        sb.append(", modlDivEtc=").append(modlDivEtc);
        sb.append(", capaTit=").append(capaTit);
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
        return this.capaRcpIdx;
    }

    public void setId(Short capaRcpIdx) {
        this.capaRcpIdx = capaRcpIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cp2CapaRcp other = (Cp2CapaRcp) o;
        return Objects.equals(capaRcpIdx, other.capaRcpIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capaRcpIdx);
    }
}