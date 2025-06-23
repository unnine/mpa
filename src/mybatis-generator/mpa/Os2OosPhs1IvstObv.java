package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Os2OosPhs1IvstObv {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short oosPhs1IvstObvIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short oosPhs1IvstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String obvEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String obvCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String obvSltYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOosPhs1IvstObvIdx() {
        return oosPhs1IvstObvIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOosPhs1IvstObvIdx(Short oosPhs1IvstObvIdx) {
        this.oosPhs1IvstObvIdx = oosPhs1IvstObvIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOosPhs1IvstIdx() {
        return oosPhs1IvstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOosPhs1IvstIdx(Short oosPhs1IvstIdx) {
        this.oosPhs1IvstIdx = oosPhs1IvstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getObvEtc() {
        return obvEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setObvEtc(String obvEtc) {
        this.obvEtc = obvEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getObvCd() {
        return obvCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setObvCd(String obvCd) {
        this.obvCd = obvCd;
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
    public String getObvSltYn() {
        return obvSltYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setObvSltYn(String obvSltYn) {
        this.obvSltYn = obvSltYn;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oosPhs1IvstObvIdx=").append(oosPhs1IvstObvIdx);
        sb.append(", oosPhs1IvstIdx=").append(oosPhs1IvstIdx);
        sb.append(", obvEtc=").append(obvEtc);
        sb.append(", obvCd=").append(obvCd);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", obvSltYn=").append(obvSltYn);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.oosPhs1IvstObvIdx;
    }

    public void setId(Short oosPhs1IvstObvIdx) {
        this.oosPhs1IvstObvIdx = oosPhs1IvstObvIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Os2OosPhs1IvstObv other = (Os2OosPhs1IvstObv) o;
        return Objects.equals(oosPhs1IvstObvIdx, other.oosPhs1IvstObvIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oosPhs1IvstObvIdx);
    }
}