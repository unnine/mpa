package mpa;

import java.math.BigDecimal;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyUcdHir {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String ucdHir;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String hirNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal hirOrd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String hirYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ucdDesc;

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
    public String getHirNm() {
        return hirNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHirNm(String hirNm) {
        this.hirNm = hirNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getHirOrd() {
        return hirOrd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHirOrd(BigDecimal hirOrd) {
        this.hirOrd = hirOrd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHirYn() {
        return hirYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHirYn(String hirYn) {
        this.hirYn = hirYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUcdDesc() {
        return ucdDesc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUcdDesc(String ucdDesc) {
        this.ucdDesc = ucdDesc;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plntCd=").append(plntCd);
        sb.append(", ucdHir=").append(ucdHir);
        sb.append(", hirNm=").append(hirNm);
        sb.append(", hirOrd=").append(hirOrd);
        sb.append(", hirYn=").append(hirYn);
        sb.append(", ucdDesc=").append(ucdDesc);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyUcdHir other = (SyUcdHir) o;
        return Objects.equals(plntCd, other.plntCd) && Objects.equals(ucdHir, other.ucdHir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plntCd, ucdHir);
    }
}