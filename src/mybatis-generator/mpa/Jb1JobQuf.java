package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Jb1JobQuf {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short jobQufIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short jobIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qufDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qufAqstDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getJobQufIdx() {
        return jobQufIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJobQufIdx(Short jobQufIdx) {
        this.jobQufIdx = jobQufIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getJobIdx() {
        return jobIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJobIdx(Short jobIdx) {
        this.jobIdx = jobIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getQufDivCd() {
        return qufDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQufDivCd(String qufDivCd) {
        this.qufDivCd = qufDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getQufAqstDt() {
        return qufAqstDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQufAqstDt(String qufAqstDt) {
        this.qufAqstDt = qufAqstDt;
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
    public String getDelYn() {
        return delYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDelYn(String delYn) {
        this.delYn = delYn;
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
        sb.append(", jobQufIdx=").append(jobQufIdx);
        sb.append(", jobIdx=").append(jobIdx);
        sb.append(", qufDivCd=").append(qufDivCd);
        sb.append(", qufAqstDt=").append(qufAqstDt);
        sb.append(", rmk=").append(rmk);
        sb.append(", delYn=").append(delYn);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.jobQufIdx;
    }

    public void setId(Short jobQufIdx) {
        this.jobQufIdx = jobQufIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Jb1JobQuf other = (Jb1JobQuf) o;
        return Objects.equals(jobQufIdx, other.jobQufIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobQufIdx);
    }
}