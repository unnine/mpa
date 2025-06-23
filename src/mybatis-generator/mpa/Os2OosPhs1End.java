package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Os2OosPhs1End {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short oosPhs1EndIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short oosRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crstPhs1Yn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crstRtestAttYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String prcsPhs1EndYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String prcsPhs2PrgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short phs1EndAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short capaTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String capaMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOosPhs1EndIdx() {
        return oosPhs1EndIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOosPhs1EndIdx(Short oosPhs1EndIdx) {
        this.oosPhs1EndIdx = oosPhs1EndIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOosRcpIdx() {
        return oosRcpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOosRcpIdx(Short oosRcpIdx) {
        this.oosRcpIdx = oosRcpIdx;
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
    public String getDocNo() {
        return docNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocNo(String docNo) {
        this.docNo = docNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrstPhs1Yn() {
        return crstPhs1Yn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrstPhs1Yn(String crstPhs1Yn) {
        this.crstPhs1Yn = crstPhs1Yn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrstRtestAttYn() {
        return crstRtestAttYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrstRtestAttYn(String crstRtestAttYn) {
        this.crstRtestAttYn = crstRtestAttYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPrcsPhs1EndYn() {
        return prcsPhs1EndYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrcsPhs1EndYn(String prcsPhs1EndYn) {
        this.prcsPhs1EndYn = prcsPhs1EndYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPrcsPhs2PrgYn() {
        return prcsPhs2PrgYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrcsPhs2PrgYn(String prcsPhs2PrgYn) {
        this.prcsPhs2PrgYn = prcsPhs2PrgYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getPhs1EndAprIdx() {
        return phs1EndAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPhs1EndAprIdx(Short phs1EndAprIdx) {
        this.phs1EndAprIdx = phs1EndAprIdx;
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
    public Short getCapaTracIdx() {
        return capaTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaTracIdx(Short capaTracIdx) {
        this.capaTracIdx = capaTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCapaMngNo() {
        return capaMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaMngNo(String capaMngNo) {
        this.capaMngNo = capaMngNo;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oosPhs1EndIdx=").append(oosPhs1EndIdx);
        sb.append(", oosRcpIdx=").append(oosRcpIdx);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", docNo=").append(docNo);
        sb.append(", crstPhs1Yn=").append(crstPhs1Yn);
        sb.append(", crstRtestAttYn=").append(crstRtestAttYn);
        sb.append(", prcsPhs1EndYn=").append(prcsPhs1EndYn);
        sb.append(", prcsPhs2PrgYn=").append(prcsPhs2PrgYn);
        sb.append(", phs1EndAprIdx=").append(phs1EndAprIdx);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", capaTracIdx=").append(capaTracIdx);
        sb.append(", capaMngNo=").append(capaMngNo);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.oosPhs1EndIdx;
    }

    public void setId(Short oosPhs1EndIdx) {
        this.oosPhs1EndIdx = oosPhs1EndIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Os2OosPhs1End other = (Os2OosPhs1End) o;
        return Objects.equals(oosPhs1EndIdx, other.oosPhs1EndIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oosPhs1EndIdx);
    }
}