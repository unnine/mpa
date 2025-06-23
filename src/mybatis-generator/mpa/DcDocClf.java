package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class DcDocClf {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Integer docClfIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer hirDocClfIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String clfNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String clfAbbrCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

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
    public Integer getDocClfIdx() {
        return docClfIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocClfIdx(Integer docClfIdx) {
        this.docClfIdx = docClfIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getHirDocClfIdx() {
        return hirDocClfIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHirDocClfIdx(Integer hirDocClfIdx) {
        this.hirDocClfIdx = hirDocClfIdx;
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
    public String getClfNm() {
        return clfNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setClfNm(String clfNm) {
        this.clfNm = clfNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getClfAbbrCd() {
        return clfAbbrCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setClfAbbrCd(String clfAbbrCd) {
        this.clfAbbrCd = clfAbbrCd;
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
    public Short getOrd() {
        return ord;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrd(Short ord) {
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

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", docClfIdx=").append(docClfIdx);
        sb.append(", hirDocClfIdx=").append(hirDocClfIdx);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", clfNm=").append(clfNm);
        sb.append(", clfAbbrCd=").append(clfAbbrCd);
        sb.append(", rmk=").append(rmk);
        sb.append(", ord=").append(ord);
        sb.append(", useYn=").append(useYn);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Integer getId() {
        return this.docClfIdx;
    }

    public void setId(Integer docClfIdx) {
        this.docClfIdx = docClfIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        DcDocClf other = (DcDocClf) o;
        return Objects.equals(docClfIdx, other.docClfIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docClfIdx);
    }
}