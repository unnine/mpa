package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Jb1JobHis {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short jobHisIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short jobIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String compNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String afatDpt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String work;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getJobHisIdx() {
        return jobHisIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJobHisIdx(Short jobHisIdx) {
        this.jobHisIdx = jobHisIdx;
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
    public String getCompNm() {
        return compNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAfatDpt() {
        return afatDpt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAfatDpt(String afatDpt) {
        this.afatDpt = afatDpt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getWork() {
        return work;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setWork(String work) {
        this.work = work;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrm() {
        return trm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrm(String trm) {
        this.trm = trm;
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
        sb.append(", jobHisIdx=").append(jobHisIdx);
        sb.append(", jobIdx=").append(jobIdx);
        sb.append(", compNm=").append(compNm);
        sb.append(", afatDpt=").append(afatDpt);
        sb.append(", work=").append(work);
        sb.append(", trm=").append(trm);
        sb.append(", delYn=").append(delYn);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.jobHisIdx;
    }

    public void setId(Short jobHisIdx) {
        this.jobHisIdx = jobHisIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Jb1JobHis other = (Jb1JobHis) o;
        return Objects.equals(jobHisIdx, other.jobHisIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobHisIdx);
    }
}