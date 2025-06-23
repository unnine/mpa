package mpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyEaprInfo {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short eaprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private BigDecimal eaprReqDegr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short seq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eaprDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eaprUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dlgEaprUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ncsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal aprDegr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime eaprDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eaprIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eaprRmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eaprYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eaprCttCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getEaprIdx() {
        return eaprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprIdx(Short eaprIdx) {
        this.eaprIdx = eaprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getEaprReqDegr() {
        return eaprReqDegr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprReqDegr(BigDecimal eaprReqDegr) {
        this.eaprReqDegr = eaprReqDegr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getSeq() {
        return seq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSeq(Short seq) {
        this.seq = seq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEaprDiv() {
        return eaprDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprDiv(String eaprDiv) {
        this.eaprDiv = eaprDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEaprUid() {
        return eaprUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprUid(String eaprUid) {
        this.eaprUid = eaprUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDlgEaprUid() {
        return dlgEaprUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDlgEaprUid(String dlgEaprUid) {
        this.dlgEaprUid = dlgEaprUid;
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
    public BigDecimal getAprDegr() {
        return aprDegr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAprDegr(BigDecimal aprDegr) {
        this.aprDegr = aprDegr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getEaprDs() {
        return eaprDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprDs(LocalDateTime eaprDs) {
        this.eaprDs = eaprDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEaprIp() {
        return eaprIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprIp(String eaprIp) {
        this.eaprIp = eaprIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEaprRmk() {
        return eaprRmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprRmk(String eaprRmk) {
        this.eaprRmk = eaprRmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEaprYn() {
        return eaprYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprYn(String eaprYn) {
        this.eaprYn = eaprYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEaprCttCd() {
        return eaprCttCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprCttCd(String eaprCttCd) {
        this.eaprCttCd = eaprCttCd;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eaprIdx=").append(eaprIdx);
        sb.append(", eaprReqDegr=").append(eaprReqDegr);
        sb.append(", seq=").append(seq);
        sb.append(", eaprDiv=").append(eaprDiv);
        sb.append(", eaprUid=").append(eaprUid);
        sb.append(", dlgEaprUid=").append(dlgEaprUid);
        sb.append(", ncsYn=").append(ncsYn);
        sb.append(", aprDegr=").append(aprDegr);
        sb.append(", eaprDs=").append(eaprDs);
        sb.append(", eaprIp=").append(eaprIp);
        sb.append(", eaprRmk=").append(eaprRmk);
        sb.append(", eaprYn=").append(eaprYn);
        sb.append(", eaprCttCd=").append(eaprCttCd);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyEaprInfo other = (SyEaprInfo) o;
        return Objects.equals(eaprIdx, other.eaprIdx) && Objects.equals(eaprReqDegr, other.eaprReqDegr) && Objects.equals(seq, other.seq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eaprIdx, eaprReqDegr, seq);
    }
}