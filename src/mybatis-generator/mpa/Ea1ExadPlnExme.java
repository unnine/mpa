package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ea1ExadPlnExme {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short exadPlnExmeIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short exadPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String exmeUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String exmeDptNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getExadPlnExmeIdx() {
        return exadPlnExmeIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExadPlnExmeIdx(Short exadPlnExmeIdx) {
        this.exadPlnExmeIdx = exadPlnExmeIdx;
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
    public String getExmeUid() {
        return exmeUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExmeUid(String exmeUid) {
        this.exmeUid = exmeUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getExmeDptNm() {
        return exmeDptNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExmeDptNm(String exmeDptNm) {
        this.exmeDptNm = exmeDptNm;
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
        sb.append(", exadPlnExmeIdx=").append(exadPlnExmeIdx);
        sb.append(", exadPlnIdx=").append(exadPlnIdx);
        sb.append(", exmeUid=").append(exmeUid);
        sb.append(", exmeDptNm=").append(exmeDptNm);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", delYn=").append(delYn);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.exadPlnExmeIdx;
    }

    public void setId(Short exadPlnExmeIdx) {
        this.exadPlnExmeIdx = exadPlnExmeIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ea1ExadPlnExme other = (Ea1ExadPlnExme) o;
        return Objects.equals(exadPlnExmeIdx, other.exadPlnExmeIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exadPlnExmeIdx);
    }
}