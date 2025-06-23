package mpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyEaprReq {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short eaprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private BigDecimal eaprReqDegr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eaprReqUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime eaprReqDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eaprReqIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eaprReqCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eaprPrgs;

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
    public String getEaprReqUid() {
        return eaprReqUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprReqUid(String eaprReqUid) {
        this.eaprReqUid = eaprReqUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getEaprReqDs() {
        return eaprReqDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprReqDs(LocalDateTime eaprReqDs) {
        this.eaprReqDs = eaprReqDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEaprReqIp() {
        return eaprReqIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprReqIp(String eaprReqIp) {
        this.eaprReqIp = eaprReqIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEaprReqCtt() {
        return eaprReqCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprReqCtt(String eaprReqCtt) {
        this.eaprReqCtt = eaprReqCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEaprPrgs() {
        return eaprPrgs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEaprPrgs(String eaprPrgs) {
        this.eaprPrgs = eaprPrgs;
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
        sb.append(", eaprReqUid=").append(eaprReqUid);
        sb.append(", eaprReqDs=").append(eaprReqDs);
        sb.append(", eaprReqIp=").append(eaprReqIp);
        sb.append(", eaprReqCtt=").append(eaprReqCtt);
        sb.append(", eaprPrgs=").append(eaprPrgs);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyEaprReq other = (SyEaprReq) o;
        return Objects.equals(eaprIdx, other.eaprIdx) && Objects.equals(eaprReqDegr, other.eaprReqDegr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eaprIdx, eaprReqDegr);
    }
}