package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Ti1TrniPlnAsmtTagt {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short trniPlnAsmtTagtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short trniPlnAsmtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniTagtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniAsmtRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTrniPlnAsmtTagtIdx() {
        return trniPlnAsmtTagtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniPlnAsmtTagtIdx(Short trniPlnAsmtTagtIdx) {
        this.trniPlnAsmtTagtIdx = trniPlnAsmtTagtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTrniPlnAsmtIdx() {
        return trniPlnAsmtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniPlnAsmtIdx(Short trniPlnAsmtIdx) {
        this.trniPlnAsmtIdx = trniPlnAsmtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniTagtUid() {
        return trniTagtUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniTagtUid(String trniTagtUid) {
        this.trniTagtUid = trniTagtUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniAsmtRst() {
        return trniAsmtRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniAsmtRst(String trniAsmtRst) {
        this.trniAsmtRst = trniAsmtRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRmk() {
        return rmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRmk(String rmk) {
        this.rmk = rmk;
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
        sb.append(", trniPlnAsmtTagtIdx=").append(trniPlnAsmtTagtIdx);
        sb.append(", trniPlnAsmtIdx=").append(trniPlnAsmtIdx);
        sb.append(", trniTagtUid=").append(trniTagtUid);
        sb.append(", trniAsmtRst=").append(trniAsmtRst);
        sb.append(", rmk=").append(rmk);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.trniPlnAsmtTagtIdx;
    }

    public void setId(Short trniPlnAsmtTagtIdx) {
        this.trniPlnAsmtTagtIdx = trniPlnAsmtTagtIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Ti1TrniPlnAsmtTagt other = (Ti1TrniPlnAsmtTagt) o;
        return Objects.equals(trniPlnAsmtTagtIdx, other.trniPlnAsmtTagtIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trniPlnAsmtTagtIdx);
    }
}