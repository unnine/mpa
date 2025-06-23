package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Si1SfisRst {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short sfisRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short sfisIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ispCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sfisRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getSfisRstIdx() {
        return sfisRstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisRstIdx(Short sfisRstIdx) {
        this.sfisRstIdx = sfisRstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getSfisIdx() {
        return sfisIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisIdx(Short sfisIdx) {
        this.sfisIdx = sfisIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIspCtt() {
        return ispCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIspCtt(String ispCtt) {
        this.ispCtt = ispCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSfisRst() {
        return sfisRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSfisRst(String sfisRst) {
        this.sfisRst = sfisRst;
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
        sb.append(", sfisRstIdx=").append(sfisRstIdx);
        sb.append(", sfisIdx=").append(sfisIdx);
        sb.append(", ispCtt=").append(ispCtt);
        sb.append(", sfisRst=").append(sfisRst);
        sb.append(", rmk=").append(rmk);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.sfisRstIdx;
    }

    public void setId(Short sfisRstIdx) {
        this.sfisRstIdx = sfisRstIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Si1SfisRst other = (Si1SfisRst) o;
        return Objects.equals(sfisRstIdx, other.sfisRstIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sfisRstIdx);
    }
}