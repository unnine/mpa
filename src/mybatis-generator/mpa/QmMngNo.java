package mpa;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import mpa.annotation.Entity;

@Entity
public class QmMngNo {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String yr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short seq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPlntCd() {
        return plntCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
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
    public String getYr() {
        return yr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setYr(String yr) {
        this.yr = yr;
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
    public String getQmsMngNo() {
        return qmsMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQmsMngNo(String qmsMngNo) {
        this.qmsMngNo = qmsMngNo;
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

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plntCd=").append(plntCd);
        sb.append(", modlDivCd=").append(modlDivCd);
        sb.append(", yr=").append(yr);
        sb.append(", seq=").append(seq);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append("]");
        return sb.toString();
    }
}