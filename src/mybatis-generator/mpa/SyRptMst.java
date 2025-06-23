package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyRptMst {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short rptIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sysModlDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rptDivNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String mngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String enmDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

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
    private String modlCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRptIdx() {
        return rptIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRptIdx(Short rptIdx) {
        this.rptIdx = rptIdx;
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
    public String getSysModlDiv() {
        return sysModlDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSysModlDiv(String sysModlDiv) {
        this.sysModlDiv = sysModlDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRptDivNm() {
        return rptDivNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRptDivNm(String rptDivNm) {
        this.rptDivNm = rptDivNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMngNo() {
        return mngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMngNo(String mngNo) {
        this.mngNo = mngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEnmDt() {
        return enmDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEnmDt(String enmDt) {
        this.enmDt = enmDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUseYn() {
        return useYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseYn(String useYn) {
        this.useYn = useYn;
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
    public String getModlCd() {
        return modlCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlCd(String modlCd) {
        this.modlCd = modlCd;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rptIdx=").append(rptIdx);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", sysModlDiv=").append(sysModlDiv);
        sb.append(", rptDivNm=").append(rptDivNm);
        sb.append(", mngNo=").append(mngNo);
        sb.append(", enmDt=").append(enmDt);
        sb.append(", useYn=").append(useYn);
        sb.append(", delYn=").append(delYn);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", modlCd=").append(modlCd);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.rptIdx;
    }

    public void setId(Short rptIdx) {
        this.rptIdx = rptIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyRptMst other = (SyRptMst) o;
        return Objects.equals(rptIdx, other.rptIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rptIdx);
    }
}