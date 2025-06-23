package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Os2OosPhs2IvstIvga {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short oosPhs2IvstIvgaIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short oosPhs2IvstIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ivgaIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ivgaAns;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOosPhs2IvstIvgaIdx() {
        return oosPhs2IvstIvgaIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOosPhs2IvstIvgaIdx(Short oosPhs2IvstIvgaIdx) {
        this.oosPhs2IvstIvgaIdx = oosPhs2IvstIvgaIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOosPhs2IvstIdx() {
        return oosPhs2IvstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOosPhs2IvstIdx(Short oosPhs2IvstIdx) {
        this.oosPhs2IvstIdx = oosPhs2IvstIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIvgaIdx() {
        return ivgaIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIvgaIdx(String ivgaIdx) {
        this.ivgaIdx = ivgaIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIvgaAns() {
        return ivgaAns;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIvgaAns(String ivgaAns) {
        this.ivgaAns = ivgaAns;
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
        sb.append(", oosPhs2IvstIvgaIdx=").append(oosPhs2IvstIvgaIdx);
        sb.append(", oosPhs2IvstIdx=").append(oosPhs2IvstIdx);
        sb.append(", ivgaIdx=").append(ivgaIdx);
        sb.append(", ivgaAns=").append(ivgaAns);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.oosPhs2IvstIvgaIdx;
    }

    public void setId(Short oosPhs2IvstIvgaIdx) {
        this.oosPhs2IvstIvgaIdx = oosPhs2IvstIvgaIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Os2OosPhs2IvstIvga other = (Os2OosPhs2IvstIvga) o;
        return Objects.equals(oosPhs2IvstIvgaIdx, other.oosPhs2IvstIvgaIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oosPhs2IvstIvgaIdx);
    }
}