package mpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyUcd {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String ucd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ucdHir;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String loclNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String abbr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String extCd1;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String extCd2;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String extCd3;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String jnm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUcd() {
        return ucd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUcd(String ucd) {
        this.ucd = ucd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPlntCd() {
        return plntCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUcdHir() {
        return ucdHir;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUcdHir(String ucdHir) {
        this.ucdHir = ucdHir;
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
    public String getAbbr() {
        return abbr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getExtCd1() {
        return extCd1;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExtCd1(String extCd1) {
        this.extCd1 = extCd1;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getExtCd2() {
        return extCd2;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExtCd2(String extCd2) {
        this.extCd2 = extCd2;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getExtCd3() {
        return extCd3;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExtCd3(String extCd3) {
        this.extCd3 = extCd3;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getOrd() {
        return ord;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrd(BigDecimal ord) {
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
    public String getJnm() {
        return jnm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJnm(String jnm) {
        this.jnm = jnm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrtIp() {
        return crtIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrtIp(String crtIp) {
        this.crtIp = crtIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getCrtDs() {
        return crtDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrtDs(LocalDateTime crtDs) {
        this.crtDs = crtDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCrtUid() {
        return crtUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrtUid(String crtUid) {
        this.crtUid = crtUid;
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
        sb.append(", ucd=").append(ucd);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", ucdHir=").append(ucdHir);
        sb.append(", loclNm=").append(loclNm);
        sb.append(", abbr=").append(abbr);
        sb.append(", extCd1=").append(extCd1);
        sb.append(", extCd2=").append(extCd2);
        sb.append(", extCd3=").append(extCd3);
        sb.append(", ord=").append(ord);
        sb.append(", useYn=").append(useYn);
        sb.append(", jnm=").append(jnm);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public String getId() {
        return this.ucd;
    }

    public void setId(String ucd) {
        this.ucd = ucd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyUcd other = (SyUcd) o;
        return Objects.equals(ucd, other.ucd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ucd);
    }
}