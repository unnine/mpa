package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Cg2ChgImam {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short chgImamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short chgPrpsRcpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String exac;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgCclsPrgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgCclsStopYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgRnk;

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
    private Short chgImamAsmtAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgImamIdx() {
        return chgImamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgImamIdx(Short chgImamIdx) {
        this.chgImamIdx = chgImamIdx;
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
    public String getExac() {
        return exac;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExac(String exac) {
        this.exac = exac;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgCclsPrgYn() {
        return chgCclsPrgYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgCclsPrgYn(String chgCclsPrgYn) {
        this.chgCclsPrgYn = chgCclsPrgYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgCclsStopYn() {
        return chgCclsStopYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgCclsStopYn(String chgCclsStopYn) {
        this.chgCclsStopYn = chgCclsStopYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgRnk() {
        return chgRnk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgRnk(String chgRnk) {
        this.chgRnk = chgRnk;
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
    public Short getChgImamAsmtAprIdx() {
        return chgImamAsmtAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgImamAsmtAprIdx(Short chgImamAsmtAprIdx) {
        this.chgImamAsmtAprIdx = chgImamAsmtAprIdx;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", chgImamIdx=").append(chgImamIdx);
        sb.append(", chgPrpsRcpIdx=").append(chgPrpsRcpIdx);
        sb.append(", exac=").append(exac);
        sb.append(", chgCclsPrgYn=").append(chgCclsPrgYn);
        sb.append(", chgCclsStopYn=").append(chgCclsStopYn);
        sb.append(", chgRnk=").append(chgRnk);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", chgImamAsmtAprIdx=").append(chgImamAsmtAprIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.chgImamIdx;
    }

    public void setId(Short chgImamIdx) {
        this.chgImamIdx = chgImamIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Cg2ChgImam other = (Cg2ChgImam) o;
        return Objects.equals(chgImamIdx, other.chgImamIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chgImamIdx);
    }
}