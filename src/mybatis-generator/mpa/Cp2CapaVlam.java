package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cp2CapaVlam {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short capaVlamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short capaPlnIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamTagt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamOvw;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String capaVlamSytFdbk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short capaVlamAprIdx;

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
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getCapaVlamIdx() {
        return capaVlamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaVlamIdx(Short capaVlamIdx) {
        this.capaVlamIdx = capaVlamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getCapaPlnIdx() {
        return capaPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaPlnIdx(Short capaPlnIdx) {
        this.capaPlnIdx = capaPlnIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getVlamStrDt() {
        return vlamStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVlamStrDt(String vlamStrDt) {
        this.vlamStrDt = vlamStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getVlamEndDt() {
        return vlamEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVlamEndDt(String vlamEndDt) {
        this.vlamEndDt = vlamEndDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getVlamTagt() {
        return vlamTagt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVlamTagt(String vlamTagt) {
        this.vlamTagt = vlamTagt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getVlamOvw() {
        return vlamOvw;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVlamOvw(String vlamOvw) {
        this.vlamOvw = vlamOvw;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getVlamCtt() {
        return vlamCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVlamCtt(String vlamCtt) {
        this.vlamCtt = vlamCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getVlamRst() {
        return vlamRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVlamRst(String vlamRst) {
        this.vlamRst = vlamRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCapaVlamSytFdbk() {
        return capaVlamSytFdbk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaVlamSytFdbk(String capaVlamSytFdbk) {
        this.capaVlamSytFdbk = capaVlamSytFdbk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getFileIdx() {
        return fileIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFileIdx(Short fileIdx) {
        this.fileIdx = fileIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getCapaVlamAprIdx() {
        return capaVlamAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCapaVlamAprIdx(Short capaVlamAprIdx) {
        this.capaVlamAprIdx = capaVlamAprIdx;
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
    public Short getTracIdx() {
        return tracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTracIdx(Short tracIdx) {
        this.tracIdx = tracIdx;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", capaVlamIdx=").append(capaVlamIdx);
        sb.append(", capaPlnIdx=").append(capaPlnIdx);
        sb.append(", vlamStrDt=").append(vlamStrDt);
        sb.append(", vlamEndDt=").append(vlamEndDt);
        sb.append(", vlamTagt=").append(vlamTagt);
        sb.append(", vlamOvw=").append(vlamOvw);
        sb.append(", vlamCtt=").append(vlamCtt);
        sb.append(", vlamRst=").append(vlamRst);
        sb.append(", capaVlamSytFdbk=").append(capaVlamSytFdbk);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", capaVlamAprIdx=").append(capaVlamAprIdx);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.capaVlamIdx;
    }

    public void setId(Short capaVlamIdx) {
        this.capaVlamIdx = capaVlamIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cp2CapaVlam other = (Cp2CapaVlam) o;
        return Objects.equals(capaVlamIdx, other.capaVlamIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(capaVlamIdx);
    }
}