package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Jb1JobRsbi {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short jobRsbiIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short jobIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String jobCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dlgCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getJobRsbiIdx() {
        return jobRsbiIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJobRsbiIdx(Short jobRsbiIdx) {
        this.jobRsbiIdx = jobRsbiIdx;
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
    public String getJobCtt() {
        return jobCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJobCtt(String jobCtt) {
        this.jobCtt = jobCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDlgCtt() {
        return dlgCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDlgCtt(String dlgCtt) {
        this.dlgCtt = dlgCtt;
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
        sb.append(", jobRsbiIdx=").append(jobRsbiIdx);
        sb.append(", jobIdx=").append(jobIdx);
        sb.append(", jobCtt=").append(jobCtt);
        sb.append(", dlgCtt=").append(dlgCtt);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.jobRsbiIdx;
    }

    public void setId(Short jobRsbiIdx) {
        this.jobRsbiIdx = jobRsbiIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Jb1JobRsbi other = (Jb1JobRsbi) o;
        return Objects.equals(jobRsbiIdx, other.jobRsbiIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobRsbiIdx);
    }
}