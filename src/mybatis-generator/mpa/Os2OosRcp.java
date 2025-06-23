package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Os2OosRcp {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short oosRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short oosOcrpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String oosTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short rcpAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String oosProc;

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
    private String rcpVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rcpDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOosRcpIdx() {
        return oosRcpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOosRcpIdx(Short oosRcpIdx) {
        this.oosRcpIdx = oosRcpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOosOcrpIdx() {
        return oosOcrpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOosOcrpIdx(Short oosOcrpIdx) {
        this.oosOcrpIdx = oosOcrpIdx;
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
    public Short getTracIdx() {
        return tracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTracIdx(Short tracIdx) {
        this.tracIdx = tracIdx;
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
    public String getOosTit() {
        return oosTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOosTit(String oosTit) {
        this.oosTit = oosTit;
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
    public Short getRcpAprIdx() {
        return rcpAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcpAprIdx(Short rcpAprIdx) {
        this.rcpAprIdx = rcpAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOosProc() {
        return oosProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOosProc(String oosProc) {
        this.oosProc = oosProc;
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
    public String getRcpVer() {
        return rcpVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcpVer(String rcpVer) {
        this.rcpVer = rcpVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRcpDt() {
        return rcpDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcpDt(String rcpDt) {
        this.rcpDt = rcpDt;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oosRcpIdx=").append(oosRcpIdx);
        sb.append(", oosOcrpIdx=").append(oosOcrpIdx);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", docNo=").append(docNo);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", oosTit=").append(oosTit);
        sb.append(", cmplDt=").append(cmplDt);
        sb.append(", rcpAprIdx=").append(rcpAprIdx);
        sb.append(", oosProc=").append(oosProc);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", rcpVer=").append(rcpVer);
        sb.append(", rcpDt=").append(rcpDt);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.oosRcpIdx;
    }

    public void setId(Short oosRcpIdx) {
        this.oosRcpIdx = oosRcpIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Os2OosRcp other = (Os2OosRcp) o;
        return Objects.equals(oosRcpIdx, other.oosRcpIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oosRcpIdx);
    }
}