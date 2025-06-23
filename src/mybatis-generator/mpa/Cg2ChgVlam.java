package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cg2ChgVlam {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short chgVlamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short chgPrpsRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamEndDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamTagt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamOvw;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vlamCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgVlamSytFdbk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

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
    private Short chgVlamAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgVlamIdx() {
        return chgVlamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgVlamIdx(Short chgVlamIdx) {
        this.chgVlamIdx = chgVlamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgPrpsRcpIdx() {
        return chgPrpsRcpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgPrpsRcpIdx(Short chgPrpsRcpIdx) {
        this.chgPrpsRcpIdx = chgPrpsRcpIdx;
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
    public String getVlamRst() {
        return vlamRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVlamRst(String vlamRst) {
        this.vlamRst = vlamRst;
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
    public String getChgVlamSytFdbk() {
        return chgVlamSytFdbk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgVlamSytFdbk(String chgVlamSytFdbk) {
        this.chgVlamSytFdbk = chgVlamSytFdbk;
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

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgVlamAprIdx() {
        return chgVlamAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgVlamAprIdx(Short chgVlamAprIdx) {
        this.chgVlamAprIdx = chgVlamAprIdx;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chgVlamIdx=").append(chgVlamIdx);
        sb.append(", chgPrpsRcpIdx=").append(chgPrpsRcpIdx);
        sb.append(", vlamStrDt=").append(vlamStrDt);
        sb.append(", vlamEndDt=").append(vlamEndDt);
        sb.append(", vlamTagt=").append(vlamTagt);
        sb.append(", vlamOvw=").append(vlamOvw);
        sb.append(", vlamRst=").append(vlamRst);
        sb.append(", vlamCtt=").append(vlamCtt);
        sb.append(", chgVlamSytFdbk=").append(chgVlamSytFdbk);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", chgVlamAprIdx=").append(chgVlamAprIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.chgVlamIdx;
    }

    public void setId(Short chgVlamIdx) {
        this.chgVlamIdx = chgVlamIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cg2ChgVlam other = (Cg2ChgVlam) o;
        return Objects.equals(chgVlamIdx, other.chgVlamIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chgVlamIdx);
    }
}