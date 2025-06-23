package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ti1TrniRst {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short trniRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short trniPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniRstRmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short asmtRstAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTrniRstIdx() {
        return trniRstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniRstIdx(Short trniRstIdx) {
        this.trniRstIdx = trniRstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTrniPlnIdx() {
        return trniPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniPlnIdx(Short trniPlnIdx) {
        this.trniPlnIdx = trniPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTracIdx() {
        return tracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTracIdx(Short tracIdx) {
        this.tracIdx = tracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniRst() {
        return trniRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniRst(String trniRst) {
        this.trniRst = trniRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniRstRmk() {
        return trniRstRmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniRstRmk(String trniRstRmk) {
        this.trniRstRmk = trniRstRmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAsmtRstAprIdx() {
        return asmtRstAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAsmtRstAprIdx(Short asmtRstAprIdx) {
        this.asmtRstAprIdx = asmtRstAprIdx;
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
        sb.append(", trniRstIdx=").append(trniRstIdx);
        sb.append(", trniPlnIdx=").append(trniPlnIdx);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", trniRst=").append(trniRst);
        sb.append(", trniRstRmk=").append(trniRstRmk);
        sb.append(", asmtRstAprIdx=").append(asmtRstAprIdx);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.trniRstIdx;
    }

    public void setId(Short trniRstIdx) {
        this.trniRstIdx = trniRstIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ti1TrniRst other = (Ti1TrniRst) o;
        return Objects.equals(trniRstIdx, other.trniRstIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trniRstIdx);
    }
}