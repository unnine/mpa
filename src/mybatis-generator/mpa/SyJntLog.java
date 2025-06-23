package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyJntLog {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String userUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short lognSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String acssDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime acssDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String acssIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserUid() {
        return userUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getLognSeq() {
        return lognSeq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLognSeq(Short lognSeq) {
        this.lognSeq = lognSeq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAcssDiv() {
        return acssDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAcssDiv(String acssDiv) {
        this.acssDiv = acssDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getAcssDs() {
        return acssDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAcssDs(LocalDateTime acssDs) {
        this.acssDs = acssDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAcssIp() {
        return acssIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAcssIp(String acssIp) {
        this.acssIp = acssIp;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userUid=").append(userUid);
        sb.append(", lognSeq=").append(lognSeq);
        sb.append(", acssDiv=").append(acssDiv);
        sb.append(", acssDs=").append(acssDs);
        sb.append(", acssIp=").append(acssIp);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyJntLog other = (SyJntLog) o;
        return Objects.equals(userUid, other.userUid) && Objects.equals(lognSeq, other.lognSeq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUid, lognSeq);
    }
}