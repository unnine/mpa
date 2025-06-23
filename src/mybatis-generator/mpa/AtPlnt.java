package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class AtPlnt {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntAbbrCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String loclNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPlntCd() {
        return plntCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPlntAbbrCd() {
        return plntAbbrCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlntAbbrCd(String plntAbbrCd) {
        this.plntAbbrCd = plntAbbrCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLoclNm() {
        return loclNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLoclNm(String loclNm) {
        this.loclNm = loclNm;
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
        sb.append(", plntCd=").append(plntCd);
        sb.append(", plntAbbrCd=").append(plntAbbrCd);
        sb.append(", loclNm=").append(loclNm);
        sb.append(", ord=").append(ord);
        sb.append(", useYn=").append(useYn);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public String getId() {
        return this.plntCd;
    }

    public void setId(String plntCd) {
        this.plntCd = plntCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        AtPlnt other = (AtPlnt) o;
        return Objects.equals(plntCd, other.plntCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plntCd);
    }
}