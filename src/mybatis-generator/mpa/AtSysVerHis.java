package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class AtSysVerHis {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sysVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgRmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgCrg;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSysVerCd() {
        return sysVerCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSysVerCd(String sysVerCd) {
        this.sysVerCd = sysVerCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSysVer() {
        return sysVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSysVer(String sysVer) {
        this.sysVer = sysVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgRmk() {
        return chgRmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgRmk(String chgRmk) {
        this.chgRmk = chgRmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgDt() {
        return chgDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgDt(String chgDt) {
        this.chgDt = chgDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgCrg() {
        return chgCrg;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgCrg(String chgCrg) {
        this.chgCrg = chgCrg;
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
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", sysVer=").append(sysVer);
        sb.append(", chgRmk=").append(chgRmk);
        sb.append(", chgDt=").append(chgDt);
        sb.append(", chgCrg=").append(chgCrg);
        sb.append(", useYn=").append(useYn);
        sb.append(", delYn=").append(delYn);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public String getId() {
        return this.sysVerCd;
    }

    public void setId(String sysVerCd) {
        this.sysVerCd = sysVerCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        AtSysVerHis other = (AtSysVerHis) o;
        return Objects.equals(sysVerCd, other.sysVerCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sysVerCd);
    }
}