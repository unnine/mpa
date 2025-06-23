package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Tr1TrnrElamRgtStd {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short trnrElamRgtStdIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short trnrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String asmtStdIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String asmtRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTrnrElamRgtStdIdx() {
        return trnrElamRgtStdIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrnrElamRgtStdIdx(Short trnrElamRgtStdIdx) {
        this.trnrElamRgtStdIdx = trnrElamRgtStdIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTrnrElamIdx() {
        return trnrElamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrnrElamIdx(Short trnrElamIdx) {
        this.trnrElamIdx = trnrElamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAsmtStdIdx() {
        return asmtStdIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAsmtStdIdx(String asmtStdIdx) {
        this.asmtStdIdx = asmtStdIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAsmtRst() {
        return asmtRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAsmtRst(String asmtRst) {
        this.asmtRst = asmtRst;
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
        sb.append(", trnrElamRgtStdIdx=").append(trnrElamRgtStdIdx);
        sb.append(", trnrElamIdx=").append(trnrElamIdx);
        sb.append(", asmtStdIdx=").append(asmtStdIdx);
        sb.append(", asmtRst=").append(asmtRst);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.trnrElamRgtStdIdx;
    }

    public void setId(Short trnrElamRgtStdIdx) {
        this.trnrElamRgtStdIdx = trnrElamRgtStdIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Tr1TrnrElamRgtStd other = (Tr1TrnrElamRgtStd) o;
        return Objects.equals(trnrElamRgtStdIdx, other.trnrElamRgtStdIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trnrElamRgtStdIdx);
    }
}