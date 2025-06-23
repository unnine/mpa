package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class AtAuditDtl {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short auditSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgPrv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgAft;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String evtNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cudDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short auditIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String managementNumber;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private byte[] chgAftBlob;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private byte[] chgPrvBlob;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAuditSeq() {
        return auditSeq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAuditSeq(Short auditSeq) {
        this.auditSeq = auditSeq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgPrv() {
        return chgPrv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgPrv(String chgPrv) {
        this.chgPrv = chgPrv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgAft() {
        return chgAft;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgAft(String chgAft) {
        this.chgAft = chgAft;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEvtNm() {
        return evtNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEvtNm(String evtNm) {
        this.evtNm = evtNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCudDiv() {
        return cudDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCudDiv(String cudDiv) {
        this.cudDiv = cudDiv;
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
    public Short getAuditIdx() {
        return auditIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAuditIdx(Short auditIdx) {
        this.auditIdx = auditIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getManagementNumber() {
        return managementNumber;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setManagementNumber(String managementNumber) {
        this.managementNumber = managementNumber;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public byte[] getChgAftBlob() {
        return chgAftBlob;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgAftBlob(byte[] chgAftBlob) {
        this.chgAftBlob = chgAftBlob;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public byte[] getChgPrvBlob() {
        return chgPrvBlob;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgPrvBlob(byte[] chgPrvBlob) {
        this.chgPrvBlob = chgPrvBlob;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", auditSeq=").append(auditSeq);
        sb.append(", chgPrv=").append(chgPrv);
        sb.append(", chgAft=").append(chgAft);
        sb.append(", evtNm=").append(evtNm);
        sb.append(", cudDiv=").append(cudDiv);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", auditIdx=").append(auditIdx);
        sb.append(", managementNumber=").append(managementNumber);
        sb.append(", chgAftBlob=").append(chgAftBlob);
        sb.append(", chgPrvBlob=").append(chgPrvBlob);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.auditSeq;
    }

    public void setId(Short auditSeq) {
        this.auditSeq = auditSeq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        AtAuditDtl other = (AtAuditDtl) o;
        return Objects.equals(auditSeq, other.auditSeq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditSeq);
    }
}