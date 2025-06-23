package mpa;

import java.math.BigDecimal;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyMenu {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String menuCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String hirMenuCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String menuUrl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String menuDesc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String aprPageYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMenuCd() {
        return menuCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMenuCd(String menuCd) {
        this.menuCd = menuCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHirMenuCd() {
        return hirMenuCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHirMenuCd(String hirMenuCd) {
        this.hirMenuCd = hirMenuCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMenuUrl() {
        return menuUrl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMenuDesc() {
        return menuDesc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc;
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
    public String getAprPageYn() {
        return aprPageYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAprPageYn(String aprPageYn) {
        this.aprPageYn = aprPageYn;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuCd=").append(menuCd);
        sb.append(", hirMenuCd=").append(hirMenuCd);
        sb.append(", menuUrl=").append(menuUrl);
        sb.append(", menuDesc=").append(menuDesc);
        sb.append(", ord=").append(ord);
        sb.append(", useYn=").append(useYn);
        sb.append(", aprPageYn=").append(aprPageYn);
        sb.append("]");
        return sb.toString();
    }

    public String getId() {
        return this.menuCd;
    }

    public void setId(String menuCd) {
        this.menuCd = menuCd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyMenu other = (SyMenu) o;
        return Objects.equals(menuCd, other.menuCd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuCd);
    }
}