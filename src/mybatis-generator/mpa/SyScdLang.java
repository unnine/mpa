package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyScdLang {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String scd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String langCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String langNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getScd() {
        return scd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setScd(String scd) {
        this.scd = scd;
    }

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
        sb.append(", scd=").append(scd);
        sb.append(", langCd=").append(langCd);
        sb.append(", langNm=").append(langNm);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyScdLang other = (SyScdLang) o;
        return Objects.equals(scd, other.scd) && Objects.equals(langCd, other.langCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scd, langCd);
    }
}