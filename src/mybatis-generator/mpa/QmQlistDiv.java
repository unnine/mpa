package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class QmQlistDiv {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String qlistDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String qlistVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qlistDivNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qlistDivUseYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short qlistDivOrd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qlistDivDelYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPlntCd() {
        return plntCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPlntCd(String plntCd) {
        this.plntCd = plntCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getQlistDiv() {
        return qlistDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQlistDiv(String qlistDiv) {
        this.qlistDiv = qlistDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getQlistVer() {
        return qlistVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQlistVer(String qlistVer) {
        this.qlistVer = qlistVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getQlistDivNm() {
        return qlistDivNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQlistDivNm(String qlistDivNm) {
        this.qlistDivNm = qlistDivNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getQlistDivUseYn() {
        return qlistDivUseYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQlistDivUseYn(String qlistDivUseYn) {
        this.qlistDivUseYn = qlistDivUseYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getQlistDivOrd() {
        return qlistDivOrd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQlistDivOrd(Short qlistDivOrd) {
        this.qlistDivOrd = qlistDivOrd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getQlistDivDelYn() {
        return qlistDivDelYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQlistDivDelYn(String qlistDivDelYn) {
        this.qlistDivDelYn = qlistDivDelYn;
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
    public String getRmk() {
        return rmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRmk(String rmk) {
        this.rmk = rmk;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", plntCd=").append(plntCd);
        sb.append(", qlistDiv=").append(qlistDiv);
        sb.append(", qlistVer=").append(qlistVer);
        sb.append(", qlistDivNm=").append(qlistDivNm);
        sb.append(", qlistDivUseYn=").append(qlistDivUseYn);
        sb.append(", qlistDivOrd=").append(qlistDivOrd);
        sb.append(", qlistDivDelYn=").append(qlistDivDelYn);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", rmk=").append(rmk);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        QmQlistDiv other = (QmQlistDiv) o;
        return Objects.equals(plntCd, other.plntCd) && Objects.equals(qlistDiv, other.qlistDiv) && Objects.equals(qlistVer, other.qlistVer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plntCd, qlistDiv, qlistVer);
    }
}