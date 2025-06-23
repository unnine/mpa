package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class AtAuditMst {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String menuCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short menuSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tabNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String colNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String colHedNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String colComt;

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
    private String joinColNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String joinDisplayColNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String joinTabNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMenuCd() {
        return menuCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMenuCd(String menuCd) {
        this.menuCd = menuCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getMenuSeq() {
        return menuSeq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMenuSeq(Short menuSeq) {
        this.menuSeq = menuSeq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTabNm() {
        return tabNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTabNm(String tabNm) {
        this.tabNm = tabNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getColNm() {
        return colNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setColNm(String colNm) {
        this.colNm = colNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getColHedNm() {
        return colHedNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setColHedNm(String colHedNm) {
        this.colHedNm = colHedNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getColComt() {
        return colComt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setColComt(String colComt) {
        this.colComt = colComt;
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

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getJoinColNm() {
        return joinColNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJoinColNm(String joinColNm) {
        this.joinColNm = joinColNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getJoinDisplayColNm() {
        return joinDisplayColNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJoinDisplayColNm(String joinDisplayColNm) {
        this.joinDisplayColNm = joinDisplayColNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getJoinTabNm() {
        return joinTabNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJoinTabNm(String joinTabNm) {
        this.joinTabNm = joinTabNm;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuCd=").append(menuCd);
        sb.append(", menuSeq=").append(menuSeq);
        sb.append(", tabNm=").append(tabNm);
        sb.append(", colNm=").append(colNm);
        sb.append(", colHedNm=").append(colHedNm);
        sb.append(", colComt=").append(colComt);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", joinColNm=").append(joinColNm);
        sb.append(", joinDisplayColNm=").append(joinDisplayColNm);
        sb.append(", joinTabNm=").append(joinTabNm);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        AtAuditMst other = (AtAuditMst) o;
        return Objects.equals(menuCd, other.menuCd) && Objects.equals(menuSeq, other.menuSeq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuCd, menuSeq);
    }
}