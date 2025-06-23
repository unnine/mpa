package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ti1AnuTrniDtlCtt {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short anuTrniDtlMonIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short anuTrniDtlIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dtlDocNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dtlDocTit;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAnuTrniDtlMonIdx() {
        return anuTrniDtlMonIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAnuTrniDtlMonIdx(Short anuTrniDtlMonIdx) {
        this.anuTrniDtlMonIdx = anuTrniDtlMonIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAnuTrniDtlIdx() {
        return anuTrniDtlIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAnuTrniDtlIdx(Short anuTrniDtlIdx) {
        this.anuTrniDtlIdx = anuTrniDtlIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDtlDocNo() {
        return dtlDocNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDtlDocNo(String dtlDocNo) {
        this.dtlDocNo = dtlDocNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDtlDocTit() {
        return dtlDocTit;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDtlDocTit(String dtlDocTit) {
        this.dtlDocTit = dtlDocTit;
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
        sb.append(", anuTrniDtlMonIdx=").append(anuTrniDtlMonIdx);
        sb.append(", anuTrniDtlIdx=").append(anuTrniDtlIdx);
        sb.append(", dtlDocNo=").append(dtlDocNo);
        sb.append(", dtlDocTit=").append(dtlDocTit);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.anuTrniDtlMonIdx;
    }

    public void setId(Short anuTrniDtlMonIdx) {
        this.anuTrniDtlMonIdx = anuTrniDtlMonIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ti1AnuTrniDtlCtt other = (Ti1AnuTrniDtlCtt) o;
        return Objects.equals(anuTrniDtlMonIdx, other.anuTrniDtlMonIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(anuTrniDtlMonIdx);
    }
}