package mpa;

import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class AtLang {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String langCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String langNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String isoCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLangCd() {
        return langCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLangCd(String langCd) {
        this.langCd = langCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLangNm() {
        return langNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLangNm(String langNm) {
        this.langNm = langNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIsoCd() {
        return isoCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIsoCd(String isoCd) {
        this.isoCd = isoCd;
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
    public String getUseYn() {
        return useYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", langCd=").append(langCd);
        sb.append(", langNm=").append(langNm);
        sb.append(", isoCd=").append(isoCd);
        sb.append(", ord=").append(ord);
        sb.append(", useYn=").append(useYn);
        sb.append("]");
        return sb.toString();
    }

    public String getId() {
        return this.langCd;
    }

    public void setId(String langCd) {
        this.langCd = langCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        AtLang other = (AtLang) o;
        return Objects.equals(langCd, other.langCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(langCd);
    }
}