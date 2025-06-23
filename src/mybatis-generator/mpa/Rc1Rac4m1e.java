package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Rc1Rac4m1e {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short rac4m1eIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short racWrtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String man;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String mch;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String mtr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String mtd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String evm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String etc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRac4m1eIdx() {
        return rac4m1eIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRac4m1eIdx(Short rac4m1eIdx) {
        this.rac4m1eIdx = rac4m1eIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getRacWrtIdx() {
        return racWrtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRacWrtIdx(Short racWrtIdx) {
        this.racWrtIdx = racWrtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMan() {
        return man;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMan(String man) {
        this.man = man;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMch() {
        return mch;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMch(String mch) {
        this.mch = mch;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMtr() {
        return mtr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMtr(String mtr) {
        this.mtr = mtr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMtd() {
        return mtd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMtd(String mtd) {
        this.mtd = mtd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEvm() {
        return evm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEvm(String evm) {
        this.evm = evm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEtc() {
        return etc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEtc(String etc) {
        this.etc = etc;
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
        sb.append(", rac4m1eIdx=").append(rac4m1eIdx);
        sb.append(", racWrtIdx=").append(racWrtIdx);
        sb.append(", man=").append(man);
        sb.append(", mch=").append(mch);
        sb.append(", mtr=").append(mtr);
        sb.append(", mtd=").append(mtd);
        sb.append(", evm=").append(evm);
        sb.append(", etc=").append(etc);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.rac4m1eIdx;
    }

    public void setId(Short rac4m1eIdx) {
        this.rac4m1eIdx = rac4m1eIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Rc1Rac4m1e other = (Rc1Rac4m1e) o;
        return Objects.equals(rac4m1eIdx, other.rac4m1eIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rac4m1eIdx);
    }
}