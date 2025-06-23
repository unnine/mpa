package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cg2ChgImamChkl {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short chgImamChklIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short chgImamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String imamChklIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String imamRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String flua;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgImamChklIdx() {
        return chgImamChklIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgImamChklIdx(Short chgImamChklIdx) {
        this.chgImamChklIdx = chgImamChklIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgImamIdx() {
        return chgImamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgImamIdx(Short chgImamIdx) {
        this.chgImamIdx = chgImamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getImamChklIdx() {
        return imamChklIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setImamChklIdx(String imamChklIdx) {
        this.imamChklIdx = imamChklIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getImamRst() {
        return imamRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setImamRst(String imamRst) {
        this.imamRst = imamRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getFlua() {
        return flua;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFlua(String flua) {
        this.flua = flua;
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
        sb.append(", chgImamChklIdx=").append(chgImamChklIdx);
        sb.append(", chgImamIdx=").append(chgImamIdx);
        sb.append(", imamChklIdx=").append(imamChklIdx);
        sb.append(", imamRst=").append(imamRst);
        sb.append(", flua=").append(flua);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.chgImamChklIdx;
    }

    public void setId(Short chgImamChklIdx) {
        this.chgImamChklIdx = chgImamChklIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cg2ChgImamChkl other = (Cg2ChgImamChkl) o;
        return Objects.equals(chgImamChklIdx, other.chgImamChklIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chgImamChklIdx);
    }
}