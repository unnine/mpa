package mpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyRptVer {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short rptVerIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short rptIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rptRdPath;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rptNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rptVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useVerYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String strDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String endDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRptVerIdx() {
        return rptVerIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRptVerIdx(Short rptVerIdx) {
        this.rptVerIdx = rptVerIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRptIdx() {
        return rptIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRptIdx(Short rptIdx) {
        this.rptIdx = rptIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRptRdPath() {
        return rptRdPath;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRptRdPath(String rptRdPath) {
        this.rptRdPath = rptRdPath;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRptNm() {
        return rptNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRptNm(String rptNm) {
        this.rptNm = rptNm;
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
    public String getRptVer() {
        return rptVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRptVer(String rptVer) {
        this.rptVer = rptVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRvsDt() {
        return rvsDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRvsDt(String rvsDt) {
        this.rvsDt = rvsDt;
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
    public BigDecimal getOrd() {
        return ord;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrd(BigDecimal ord) {
        this.ord = ord;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUseVerYn() {
        return useVerYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseVerYn(String useVerYn) {
        this.useVerYn = useVerYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getStrDt() {
        return strDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStrDt(String strDt) {
        this.strDt = strDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEndDt() {
        return endDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEndDt(String endDt) {
        this.endDt = endDt;
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
        sb.append(", rptVerIdx=").append(rptVerIdx);
        sb.append(", rptIdx=").append(rptIdx);
        sb.append(", rptRdPath=").append(rptRdPath);
        sb.append(", rptNm=").append(rptNm);
        sb.append(", docNo=").append(docNo);
        sb.append(", rptVer=").append(rptVer);
        sb.append(", rvsDt=").append(rvsDt);
        sb.append(", rmk=").append(rmk);
        sb.append(", ord=").append(ord);
        sb.append(", useVerYn=").append(useVerYn);
        sb.append(", strDt=").append(strDt);
        sb.append(", endDt=").append(endDt);
        sb.append(", useYn=").append(useYn);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.rptVerIdx;
    }

    public void setId(Short rptVerIdx) {
        this.rptVerIdx = rptVerIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyRptVer other = (SyRptVer) o;
        return Objects.equals(rptVerIdx, other.rptVerIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rptVerIdx);
    }
}