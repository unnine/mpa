package mpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyScdHir {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String scdHir;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String hirNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal hirOrd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String hirUseYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String scdDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getScdHir() {
        return scdHir;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setScdHir(String scdHir) {
        this.scdHir = scdHir;
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
    public String getHirUseYn() {
        return hirUseYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHirUseYn(String hirUseYn) {
        this.hirUseYn = hirUseYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getScdDesc() {
        return scdDesc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setScdDesc(String scdDesc) {
        this.scdDesc = scdDesc;
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
        sb.append(", scdHir=").append(scdHir);
        sb.append(", hirNm=").append(hirNm);
        sb.append(", hirOrd=").append(hirOrd);
        sb.append(", hirUseYn=").append(hirUseYn);
        sb.append(", scdDesc=").append(scdDesc);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public String getId() {
        return this.scdHir;
    }

    public void setId(String scdHir) {
        this.scdHir = scdHir;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyScdHir other = (SyScdHir) o;
        return Objects.equals(scdHir, other.scdHir);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scdHir);
    }
}