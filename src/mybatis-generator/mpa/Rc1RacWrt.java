package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Rc1RacWrt {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short racWrtIdx;

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
    private Short racWrtAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String racProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reqDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reqUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlDivEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String racTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String racNcsAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String issu;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rcs;

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
    private String rc5whyYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rc4m1eYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rcEtcYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rcEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRacWrtIdx() {
        return racWrtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRacWrtIdx(Short racWrtIdx) {
        this.racWrtIdx = racWrtIdx;
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
    public Short getRacWrtAprIdx() {
        return racWrtAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRacWrtAprIdx(Short racWrtAprIdx) {
        this.racWrtAprIdx = racWrtAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRacProc() {
        return racProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRacProc(String racProc) {
        this.racProc = racProc;
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
    public String getModlDivEtc() {
        return modlDivEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlDivEtc(String modlDivEtc) {
        this.modlDivEtc = modlDivEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRacTit() {
        return racTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRacTit(String racTit) {
        this.racTit = racTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRacNcsAtc() {
        return racNcsAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRacNcsAtc(String racNcsAtc) {
        this.racNcsAtc = racNcsAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIssu() {
        return issu;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIssu(String issu) {
        this.issu = issu;
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
    public String getRcs() {
        return rcs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcs(String rcs) {
        this.rcs = rcs;
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

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRc5whyYn() {
        return rc5whyYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRc5whyYn(String rc5whyYn) {
        this.rc5whyYn = rc5whyYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRc4m1eYn() {
        return rc4m1eYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRc4m1eYn(String rc4m1eYn) {
        this.rc4m1eYn = rc4m1eYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRcEtcYn() {
        return rcEtcYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcEtcYn(String rcEtcYn) {
        this.rcEtcYn = rcEtcYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRcEtc() {
        return rcEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcEtc(String rcEtc) {
        this.rcEtc = rcEtc;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", racWrtIdx=").append(racWrtIdx);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", docNo=").append(docNo);
        sb.append(", racWrtAprIdx=").append(racWrtAprIdx);
        sb.append(", racProc=").append(racProc);
        sb.append(", modlDivCd=").append(modlDivCd);
        sb.append(", reqDptCd=").append(reqDptCd);
        sb.append(", reqUid=").append(reqUid);
        sb.append(", modlDivEtc=").append(modlDivEtc);
        sb.append(", racTit=").append(racTit);
        sb.append(", racNcsAtc=").append(racNcsAtc);
        sb.append(", issu=").append(issu);
        sb.append(", cmplDt=").append(cmplDt);
        sb.append(", rmk=").append(rmk);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", rcs=").append(rcs);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", modlTracIdx=").append(modlTracIdx);
        sb.append(", rc5whyYn=").append(rc5whyYn);
        sb.append(", rc4m1eYn=").append(rc4m1eYn);
        sb.append(", rcEtcYn=").append(rcEtcYn);
        sb.append(", rcEtc=").append(rcEtc);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.racWrtIdx;
    }

    public void setId(Short racWrtIdx) {
        this.racWrtIdx = racWrtIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Rc1RacWrt other = (Rc1RacWrt) o;
        return Objects.equals(racWrtIdx, other.racWrtIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(racWrtIdx);
    }
}