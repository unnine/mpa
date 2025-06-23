package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyUserPwdHis {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String userUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short chgSeq;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pwd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String chgYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long rccCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String failDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserUid() {
        return userUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getChgSeq() {
        return chgSeq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgSeq(Short chgSeq) {
        this.chgSeq = chgSeq;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPwd() {
        return pwd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getChgYn() {
        return chgYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setChgYn(String chgYn) {
        this.chgYn = chgYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getRccCnt() {
        return rccCnt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRccCnt(Long rccCnt) {
        this.rccCnt = rccCnt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getFailDt() {
        return failDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFailDt(String failDt) {
        this.failDt = failDt;
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
        sb.append(", userUid=").append(userUid);
        sb.append(", chgSeq=").append(chgSeq);
        sb.append(", pwd=").append(pwd);
        sb.append(", chgYn=").append(chgYn);
        sb.append(", rccCnt=").append(rccCnt);
        sb.append(", failDt=").append(failDt);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyUserPwdHis other = (SyUserPwdHis) o;
        return Objects.equals(userUid, other.userUid) && Objects.equals(chgSeq, other.chgSeq);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUid, chgSeq);
    }
}