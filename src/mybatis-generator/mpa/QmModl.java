package mpa;

import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class QmModl {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String modlCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlDivCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String modlNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short prgOrd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String aprYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String classify;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String backPoint;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String reviewYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ownerModlCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getModlCd() {
        return modlCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlCd(String modlCd) {
        this.modlCd = modlCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getModlDivCd() {
        return modlDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlDivCd(String modlDivCd) {
        this.modlDivCd = modlDivCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getModlNm() {
        return modlNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlNm(String modlNm) {
        this.modlNm = modlNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getPrgOrd() {
        return prgOrd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrgOrd(Short prgOrd) {
        this.prgOrd = prgOrd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAprYn() {
        return aprYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAprYn(String aprYn) {
        this.aprYn = aprYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUseYn() {
        return useYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getClassify() {
        return classify;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setClassify(String classify) {
        this.classify = classify;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBackPoint() {
        return backPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBackPoint(String backPoint) {
        this.backPoint = backPoint;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReviewYn() {
        return reviewYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReviewYn(String reviewYn) {
        this.reviewYn = reviewYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOwnerModlCd() {
        return ownerModlCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOwnerModlCd(String ownerModlCd) {
        this.ownerModlCd = ownerModlCd;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", modlCd=").append(modlCd);
        sb.append(", modlDivCd=").append(modlDivCd);
        sb.append(", modlNm=").append(modlNm);
        sb.append(", prgOrd=").append(prgOrd);
        sb.append(", aprYn=").append(aprYn);
        sb.append(", useYn=").append(useYn);
        sb.append(", classify=").append(classify);
        sb.append(", backPoint=").append(backPoint);
        sb.append(", reviewYn=").append(reviewYn);
        sb.append(", ownerModlCd=").append(ownerModlCd);
        sb.append("]");
        return sb.toString();
    }

    public String getId() {
        return this.modlCd;
    }

    public void setId(String modlCd) {
        this.modlCd = modlCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        QmModl other = (QmModl) o;
        return Objects.equals(modlCd, other.modlCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modlCd);
    }
}