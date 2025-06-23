package mpa;

import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class QmModlCpnt {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String modlCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String cpntModlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String syncYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String syncByEscalate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getModlCd() {
        return modlCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlCd(String modlCd) {
        this.modlCd = modlCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCpntModlDivCd() {
        return cpntModlDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCpntModlDivCd(String cpntModlDivCd) {
        this.cpntModlDivCd = cpntModlDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSyncYn() {
        return syncYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSyncYn(String syncYn) {
        this.syncYn = syncYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOrd() {
        return ord;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrd(Short ord) {
        this.ord = ord;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSyncByEscalate() {
        return syncByEscalate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSyncByEscalate(String syncByEscalate) {
        this.syncByEscalate = syncByEscalate;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modlCd=").append(modlCd);
        sb.append(", cpntModlDivCd=").append(cpntModlDivCd);
        sb.append(", syncYn=").append(syncYn);
        sb.append(", ord=").append(ord);
        sb.append(", syncByEscalate=").append(syncByEscalate);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        QmModlCpnt other = (QmModlCpnt) o;
        return Objects.equals(modlCd, other.modlCd) && Objects.equals(cpntModlDivCd, other.cpntModlDivCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modlCd, cpntModlDivCd);
    }
}