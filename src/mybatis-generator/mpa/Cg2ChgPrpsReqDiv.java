package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cg2ChgPrpsReqDiv {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short chgPrpsReqDivIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short chgPrpsReqIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgDivEtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgPrpsReqDivIdx() {
        return chgPrpsReqDivIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgPrpsReqDivIdx(Short chgPrpsReqDivIdx) {
        this.chgPrpsReqDivIdx = chgPrpsReqDivIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgPrpsReqIdx() {
        return chgPrpsReqIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgPrpsReqIdx(Short chgPrpsReqIdx) {
        this.chgPrpsReqIdx = chgPrpsReqIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgDiv() {
        return chgDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgDiv(String chgDiv) {
        this.chgDiv = chgDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgDivEtc() {
        return chgDivEtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgDivEtc(String chgDivEtc) {
        this.chgDivEtc = chgDivEtc;
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
        sb.append(", chgPrpsReqDivIdx=").append(chgPrpsReqDivIdx);
        sb.append(", chgPrpsReqIdx=").append(chgPrpsReqIdx);
        sb.append(", chgDiv=").append(chgDiv);
        sb.append(", chgDivEtc=").append(chgDivEtc);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.chgPrpsReqDivIdx;
    }

    public void setId(Short chgPrpsReqDivIdx) {
        this.chgPrpsReqDivIdx = chgPrpsReqDivIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cg2ChgPrpsReqDiv other = (Cg2ChgPrpsReqDiv) o;
        return Objects.equals(chgPrpsReqDivIdx, other.chgPrpsReqDivIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chgPrpsReqDivIdx);
    }
}