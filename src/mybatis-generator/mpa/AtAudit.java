package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class AtAudit {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short auditIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String menuCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String httpMtd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String evtUrl;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String esignYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAuditIdx() {
        return auditIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAuditIdx(Short auditIdx) {
        this.auditIdx = auditIdx;
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
    public String getMenuCd() {
        return menuCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMenuCd(String menuCd) {
        this.menuCd = menuCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getHttpMtd() {
        return httpMtd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHttpMtd(String httpMtd) {
        this.httpMtd = httpMtd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEvtUrl() {
        return evtUrl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEvtUrl(String evtUrl) {
        this.evtUrl = evtUrl;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEsignYn() {
        return esignYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEsignYn(String esignYn) {
        this.esignYn = esignYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRea() {
        return rea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRea(String rea) {
        this.rea = rea;
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

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", auditIdx=").append(auditIdx);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", menuCd=").append(menuCd);
        sb.append(", httpMtd=").append(httpMtd);
        sb.append(", evtUrl=").append(evtUrl);
        sb.append(", esignYn=").append(esignYn);
        sb.append(", rea=").append(rea);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.auditIdx;
    }

    public void setId(Short auditIdx) {
        this.auditIdx = auditIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        AtAudit other = (AtAudit) o;
        return Objects.equals(auditIdx, other.auditIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditIdx);
    }
}