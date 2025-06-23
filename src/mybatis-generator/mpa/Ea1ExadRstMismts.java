package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ea1ExadRstMismts {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short exadRstMismtsIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short exadRstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String riskRnk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String misMtsCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getExadRstMismtsIdx() {
        return exadRstMismtsIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExadRstMismtsIdx(Short exadRstMismtsIdx) {
        this.exadRstMismtsIdx = exadRstMismtsIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getExadRstIdx() {
        return exadRstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExadRstIdx(Short exadRstIdx) {
        this.exadRstIdx = exadRstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRiskRnk() {
        return riskRnk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRiskRnk(String riskRnk) {
        this.riskRnk = riskRnk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMisMtsCtt() {
        return misMtsCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMisMtsCtt(String misMtsCtt) {
        this.misMtsCtt = misMtsCtt;
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
        sb.append(", exadRstMismtsIdx=").append(exadRstMismtsIdx);
        sb.append(", exadRstIdx=").append(exadRstIdx);
        sb.append(", riskRnk=").append(riskRnk);
        sb.append(", misMtsCtt=").append(misMtsCtt);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.exadRstMismtsIdx;
    }

    public void setId(Short exadRstMismtsIdx) {
        this.exadRstMismtsIdx = exadRstMismtsIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ea1ExadRstMismts other = (Ea1ExadRstMismts) o;
        return Objects.equals(exadRstMismtsIdx, other.exadRstMismtsIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exadRstMismtsIdx);
    }
}