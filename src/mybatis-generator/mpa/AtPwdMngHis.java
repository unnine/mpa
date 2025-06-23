package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class AtPwdMngHis {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short pwdMngSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short ver;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String iniPwd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long pwdMinDigt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String cobOptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long dobLmtCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long rccPosbCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String srlPwdUseYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pwdChgDudt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long lognFailLockCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getPwdMngSeq() {
        return pwdMngSeq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPwdMngSeq(Short pwdMngSeq) {
        this.pwdMngSeq = pwdMngSeq;
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
    public Short getVer() {
        return ver;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVer(Short ver) {
        this.ver = ver;
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
    public String getIniPwd() {
        return iniPwd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIniPwd(String iniPwd) {
        this.iniPwd = iniPwd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getPwdMinDigt() {
        return pwdMinDigt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPwdMinDigt(Long pwdMinDigt) {
        this.pwdMinDigt = pwdMinDigt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCobOptCd() {
        return cobOptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCobOptCd(String cobOptCd) {
        this.cobOptCd = cobOptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getDobLmtCnt() {
        return dobLmtCnt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDobLmtCnt(Long dobLmtCnt) {
        this.dobLmtCnt = dobLmtCnt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getRccPosbCnt() {
        return rccPosbCnt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRccPosbCnt(Long rccPosbCnt) {
        this.rccPosbCnt = rccPosbCnt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSrlPwdUseYn() {
        return srlPwdUseYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSrlPwdUseYn(String srlPwdUseYn) {
        this.srlPwdUseYn = srlPwdUseYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPwdChgDudt() {
        return pwdChgDudt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPwdChgDudt(String pwdChgDudt) {
        this.pwdChgDudt = pwdChgDudt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getLognFailLockCnt() {
        return lognFailLockCnt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLognFailLockCnt(Long lognFailLockCnt) {
        this.lognFailLockCnt = lognFailLockCnt;
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
        sb.append(", pwdMngSeq=").append(pwdMngSeq);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", ver=").append(ver);
        sb.append(", useYn=").append(useYn);
        sb.append(", iniPwd=").append(iniPwd);
        sb.append(", pwdMinDigt=").append(pwdMinDigt);
        sb.append(", cobOptCd=").append(cobOptCd);
        sb.append(", dobLmtCnt=").append(dobLmtCnt);
        sb.append(", rccPosbCnt=").append(rccPosbCnt);
        sb.append(", srlPwdUseYn=").append(srlPwdUseYn);
        sb.append(", pwdChgDudt=").append(pwdChgDudt);
        sb.append(", lognFailLockCnt=").append(lognFailLockCnt);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.pwdMngSeq;
    }

    public void setId(Short pwdMngSeq) {
        this.pwdMngSeq = pwdMngSeq;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        AtPwdMngHis other = (AtPwdMngHis) o;
        return Objects.equals(pwdMngSeq, other.pwdMngSeq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pwdMngSeq);
    }
}