package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ea1ExadPlnPrd {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short exadPlnPrdIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short exadPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pitmDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pitmCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pitmNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getExadPlnPrdIdx() {
        return exadPlnPrdIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExadPlnPrdIdx(Short exadPlnPrdIdx) {
        this.exadPlnPrdIdx = exadPlnPrdIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getExadPlnIdx() {
        return exadPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExadPlnIdx(Short exadPlnIdx) {
        this.exadPlnIdx = exadPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPitmDiv() {
        return pitmDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPitmDiv(String pitmDiv) {
        this.pitmDiv = pitmDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPitmCd() {
        return pitmCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPitmCd(String pitmCd) {
        this.pitmCd = pitmCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPitmNm() {
        return pitmNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPitmNm(String pitmNm) {
        this.pitmNm = pitmNm;
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

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDelYn() {
        return delYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDelYn(String delYn) {
        this.delYn = delYn;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", exadPlnPrdIdx=").append(exadPlnPrdIdx);
        sb.append(", exadPlnIdx=").append(exadPlnIdx);
        sb.append(", pitmDiv=").append(pitmDiv);
        sb.append(", pitmCd=").append(pitmCd);
        sb.append(", pitmNm=").append(pitmNm);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", delYn=").append(delYn);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.exadPlnPrdIdx;
    }

    public void setId(Short exadPlnPrdIdx) {
        this.exadPlnPrdIdx = exadPlnPrdIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ea1ExadPlnPrd other = (Ea1ExadPlnPrd) o;
        return Objects.equals(exadPlnPrdIdx, other.exadPlnPrdIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exadPlnPrdIdx);
    }
}