package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class At1AdtrElamAtc {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short adtrElamAtcIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short adtrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtrElamAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short elamScr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAdtrElamAtcIdx() {
        return adtrElamAtcIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtrElamAtcIdx(Short adtrElamAtcIdx) {
        this.adtrElamAtcIdx = adtrElamAtcIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAdtrElamIdx() {
        return adtrElamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtrElamIdx(Short adtrElamIdx) {
        this.adtrElamIdx = adtrElamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtrElamAtc() {
        return adtrElamAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtrElamAtc(String adtrElamAtc) {
        this.adtrElamAtc = adtrElamAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getElamScr() {
        return elamScr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setElamScr(Short elamScr) {
        this.elamScr = elamScr;
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
        sb.append(", adtrElamAtcIdx=").append(adtrElamAtcIdx);
        sb.append(", adtrElamIdx=").append(adtrElamIdx);
        sb.append(", adtrElamAtc=").append(adtrElamAtc);
        sb.append(", elamScr=").append(elamScr);
        sb.append(", delYn=").append(delYn);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.adtrElamAtcIdx;
    }

    public void setId(Short adtrElamAtcIdx) {
        this.adtrElamAtcIdx = adtrElamAtcIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        At1AdtrElamAtc other = (At1AdtrElamAtc) o;
        return Objects.equals(adtrElamAtcIdx, other.adtrElamAtcIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adtrElamAtcIdx);
    }
}