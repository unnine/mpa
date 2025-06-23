package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class QmTrac {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short hirTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime reqDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reqUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ncsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String uncsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cmplDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crgDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crgUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ncsAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reqFdbk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ctt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tracPrgs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String classify;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fromIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTracIdx() {
        return tracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTracIdx(Short tracIdx) {
        this.tracIdx = tracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getHirTracIdx() {
        return hirTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHirTracIdx(Short hirTracIdx) {
        this.hirTracIdx = hirTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getModlCd() {
        return modlCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlCd(String modlCd) {
        this.modlCd = modlCd;
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
    public LocalDateTime getReqDs() {
        return reqDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReqDs(LocalDateTime reqDs) {
        this.reqDs = reqDs;
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
    public String getNcsYn() {
        return ncsYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNcsYn(String ncsYn) {
        this.ncsYn = ncsYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUncsRea() {
        return uncsRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUncsRea(String uncsRea) {
        this.uncsRea = uncsRea;
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
    public String getNcsAtc() {
        return ncsAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNcsAtc(String ncsAtc) {
        this.ncsAtc = ncsAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReqFdbk() {
        return reqFdbk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReqFdbk(String reqFdbk) {
        this.reqFdbk = reqFdbk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCtt() {
        return ctt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCtt(String ctt) {
        this.ctt = ctt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTracPrgs() {
        return tracPrgs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTracPrgs(String tracPrgs) {
        this.tracPrgs = tracPrgs;
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
    public String getClassify() {
        return classify;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setClassify(String classify) {
        this.classify = classify;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getFromIdx() {
        return fromIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFromIdx(Short fromIdx) {
        this.fromIdx = fromIdx;
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
    public String getTit() {
        return tit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTit(String tit) {
        this.tit = tit;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", hirTracIdx=").append(hirTracIdx);
        sb.append(", modlCd=").append(modlCd);
        sb.append(", modlDivCd=").append(modlDivCd);
        sb.append(", reqDs=").append(reqDs);
        sb.append(", reqUid=").append(reqUid);
        sb.append(", ncsYn=").append(ncsYn);
        sb.append(", uncsRea=").append(uncsRea);
        sb.append(", cmplDt=").append(cmplDt);
        sb.append(", crgDptCd=").append(crgDptCd);
        sb.append(", crgUid=").append(crgUid);
        sb.append(", ncsAtc=").append(ncsAtc);
        sb.append(", reqFdbk=").append(reqFdbk);
        sb.append(", ctt=").append(ctt);
        sb.append(", tracPrgs=").append(tracPrgs);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", classify=").append(classify);
        sb.append(", fromIdx=").append(fromIdx);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", tit=").append(tit);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.tracIdx;
    }

    public void setId(Short tracIdx) {
        this.tracIdx = tracIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        QmTrac other = (QmTrac) o;
        return Objects.equals(tracIdx, other.tracIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tracIdx);
    }
}