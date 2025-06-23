package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class MeMneReq {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short mneIdx;

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
    private Short mneAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String mneProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String relModlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tagt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String impt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cmplDtPrv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cmplDtAft;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cttPrv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cttAft;

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
    private Short relTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String relQmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String mneDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String relProcDivNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getMneIdx() {
        return mneIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMneIdx(Short mneIdx) {
        this.mneIdx = mneIdx;
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
    public Short getMneAprIdx() {
        return mneAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMneAprIdx(Short mneAprIdx) {
        this.mneAprIdx = mneAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMneProc() {
        return mneProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMneProc(String mneProc) {
        this.mneProc = mneProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRelModlDivCd() {
        return relModlDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRelModlDivCd(String relModlDivCd) {
        this.relModlDivCd = relModlDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTagt() {
        return tagt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTagt(String tagt) {
        this.tagt = tagt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRea() {
        return rea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRea(String rea) {
        this.rea = rea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getImpt() {
        return impt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setImpt(String impt) {
        this.impt = impt;
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
    public String getCmplDtPrv() {
        return cmplDtPrv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCmplDtPrv(String cmplDtPrv) {
        this.cmplDtPrv = cmplDtPrv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCmplDtAft() {
        return cmplDtAft;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCmplDtAft(String cmplDtAft) {
        this.cmplDtAft = cmplDtAft;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCttPrv() {
        return cttPrv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCttPrv(String cttPrv) {
        this.cttPrv = cttPrv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCttAft() {
        return cttAft;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCttAft(String cttAft) {
        this.cttAft = cttAft;
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
    public Short getRelTracIdx() {
        return relTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRelTracIdx(Short relTracIdx) {
        this.relTracIdx = relTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRelQmsMngNo() {
        return relQmsMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRelQmsMngNo(String relQmsMngNo) {
        this.relQmsMngNo = relQmsMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMneDiv() {
        return mneDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMneDiv(String mneDiv) {
        this.mneDiv = mneDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRelProcDivNm() {
        return relProcDivNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRelProcDivNm(String relProcDivNm) {
        this.relProcDivNm = relProcDivNm;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mneIdx=").append(mneIdx);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", docNo=").append(docNo);
        sb.append(", mneAprIdx=").append(mneAprIdx);
        sb.append(", mneProc=").append(mneProc);
        sb.append(", relModlDivCd=").append(relModlDivCd);
        sb.append(", tagt=").append(tagt);
        sb.append(", rea=").append(rea);
        sb.append(", impt=").append(impt);
        sb.append(", rmk=").append(rmk);
        sb.append(", cmplDtPrv=").append(cmplDtPrv);
        sb.append(", cmplDtAft=").append(cmplDtAft);
        sb.append(", cttPrv=").append(cttPrv);
        sb.append(", cttAft=").append(cttAft);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", relTracIdx=").append(relTracIdx);
        sb.append(", relQmsMngNo=").append(relQmsMngNo);
        sb.append(", mneDiv=").append(mneDiv);
        sb.append(", relProcDivNm=").append(relProcDivNm);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.mneIdx;
    }

    public void setId(Short mneIdx) {
        this.mneIdx = mneIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        MeMneReq other = (MeMneReq) o;
        return Objects.equals(mneIdx, other.mneIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mneIdx);
    }
}