package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyUserDlgd {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String userUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short dlgdSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reprUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dlgdDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String gbkDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dlgdRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dlgdPrgsCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dlgdSttscd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short dlgdAprReqIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserUid() {
        return userUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getDlgdSeq() {
        return dlgdSeq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDlgdSeq(Short dlgdSeq) {
        this.dlgdSeq = dlgdSeq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReprUid() {
        return reprUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReprUid(String reprUid) {
        this.reprUid = reprUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDlgdDt() {
        return dlgdDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDlgdDt(String dlgdDt) {
        this.dlgdDt = dlgdDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGbkDt() {
        return gbkDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGbkDt(String gbkDt) {
        this.gbkDt = gbkDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDlgdRea() {
        return dlgdRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDlgdRea(String dlgdRea) {
        this.dlgdRea = dlgdRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDlgdPrgsCd() {
        return dlgdPrgsCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDlgdPrgsCd(String dlgdPrgsCd) {
        this.dlgdPrgsCd = dlgdPrgsCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDlgdSttscd() {
        return dlgdSttscd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDlgdSttscd(String dlgdSttscd) {
        this.dlgdSttscd = dlgdSttscd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getDlgdAprReqIdx() {
        return dlgdAprReqIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDlgdAprReqIdx(Short dlgdAprReqIdx) {
        this.dlgdAprReqIdx = dlgdAprReqIdx;
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
        sb.append(", userUid=").append(userUid);
        sb.append(", dlgdSeq=").append(dlgdSeq);
        sb.append(", reprUid=").append(reprUid);
        sb.append(", dlgdDt=").append(dlgdDt);
        sb.append(", gbkDt=").append(gbkDt);
        sb.append(", dlgdRea=").append(dlgdRea);
        sb.append(", dlgdPrgsCd=").append(dlgdPrgsCd);
        sb.append(", dlgdSttscd=").append(dlgdSttscd);
        sb.append(", dlgdAprReqIdx=").append(dlgdAprReqIdx);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyUserDlgd other = (SyUserDlgd) o;
        return Objects.equals(userUid, other.userUid) && Objects.equals(dlgdSeq, other.dlgdSeq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUid, dlgdSeq);
    }
}