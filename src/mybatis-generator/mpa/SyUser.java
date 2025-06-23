package mpa;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SyUser {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String userUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userHirUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userVer;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String athCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String loclNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String lognId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pwd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pwdChgDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String gradCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pstnCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String emid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String email;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String mobNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String tel;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal lognFailCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useChgRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime useChgDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String lockYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String lockChgRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime lockChgDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime rvsDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String iniYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String revwYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String aprYn;

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
    private String advYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private byte[] signFile;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserUid() {
        return userUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserUid(String userUid) {
        this.userUid = userUid;
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
    public String getUserHirUid() {
        return userHirUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserHirUid(String userHirUid) {
        this.userHirUid = userHirUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserVer() {
        return userVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserVer(String userVer) {
        this.userVer = userVer;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDptCd() {
        return dptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDptCd(String dptCd) {
        this.dptCd = dptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAthCd() {
        return athCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAthCd(String athCd) {
        this.athCd = athCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLoclNm() {
        return loclNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLoclNm(String loclNm) {
        this.loclNm = loclNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLognId() {
        return lognId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLognId(String lognId) {
        this.lognId = lognId;
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
    public String getPwdChgDt() {
        return pwdChgDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPwdChgDt(String pwdChgDt) {
        this.pwdChgDt = pwdChgDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getGradCd() {
        return gradCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGradCd(String gradCd) {
        this.gradCd = gradCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPstnCd() {
        return pstnCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPstnCd(String pstnCd) {
        this.pstnCd = pstnCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEmid() {
        return emid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmid(String emid) {
        this.emid = emid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEmail() {
        return email;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEmail(String email) {
        this.email = email;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMobNo() {
        return mobNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMobNo(String mobNo) {
        this.mobNo = mobNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTel() {
        return tel;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTel(String tel) {
        this.tel = tel;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getLognFailCnt() {
        return lognFailCnt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLognFailCnt(BigDecimal lognFailCnt) {
        this.lognFailCnt = lognFailCnt;
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
    public String getUseChgRea() {
        return useChgRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseChgRea(String useChgRea) {
        this.useChgRea = useChgRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getUseChgDs() {
        return useChgDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseChgDs(LocalDateTime useChgDs) {
        this.useChgDs = useChgDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLockYn() {
        return lockYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLockYn(String lockYn) {
        this.lockYn = lockYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLockChgRea() {
        return lockChgRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLockChgRea(String lockChgRea) {
        this.lockChgRea = lockChgRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getLockChgDs() {
        return lockChgDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLockChgDs(LocalDateTime lockChgDs) {
        this.lockChgDs = lockChgDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRvsRea() {
        return rvsRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRvsRea(String rvsRea) {
        this.rvsRea = rvsRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getRvsDs() {
        return rvsDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRvsDs(LocalDateTime rvsDs) {
        this.rvsDs = rvsDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getIniYn() {
        return iniYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setIniYn(String iniYn) {
        this.iniYn = iniYn;
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
    public String getRevwYn() {
        return revwYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRevwYn(String revwYn) {
        this.revwYn = revwYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAprYn() {
        return aprYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAprYn(String aprYn) {
        this.aprYn = aprYn;
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
    public String getAdvYn() {
        return advYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdvYn(String advYn) {
        this.advYn = advYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserIp() {
        return userIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public byte[] getSignFile() {
        return signFile;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSignFile(byte[] signFile) {
        this.signFile = signFile;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userUid=").append(userUid);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", userHirUid=").append(userHirUid);
        sb.append(", userVer=").append(userVer);
        sb.append(", dptCd=").append(dptCd);
        sb.append(", athCd=").append(athCd);
        sb.append(", loclNm=").append(loclNm);
        sb.append(", lognId=").append(lognId);
        sb.append(", pwd=").append(pwd);
        sb.append(", pwdChgDt=").append(pwdChgDt);
        sb.append(", gradCd=").append(gradCd);
        sb.append(", pstnCd=").append(pstnCd);
        sb.append(", emid=").append(emid);
        sb.append(", email=").append(email);
        sb.append(", mobNo=").append(mobNo);
        sb.append(", tel=").append(tel);
        sb.append(", lognFailCnt=").append(lognFailCnt);
        sb.append(", useYn=").append(useYn);
        sb.append(", useChgRea=").append(useChgRea);
        sb.append(", useChgDs=").append(useChgDs);
        sb.append(", lockYn=").append(lockYn);
        sb.append(", lockChgRea=").append(lockChgRea);
        sb.append(", lockChgDs=").append(lockChgDs);
        sb.append(", rvsRea=").append(rvsRea);
        sb.append(", rvsDs=").append(rvsDs);
        sb.append(", iniYn=").append(iniYn);
        sb.append(", ord=").append(ord);
        sb.append(", revwYn=").append(revwYn);
        sb.append(", aprYn=").append(aprYn);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", advYn=").append(advYn);
        sb.append(", userIp=").append(userIp);
        sb.append(", signFile=").append(signFile);
        sb.append("]");
        return sb.toString();
    }

    public String getId() {
        return this.userUid;
    }

    public void setId(String userUid) {
        this.userUid = userUid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SyUser other = (SyUser) o;
        return Objects.equals(userUid, other.userUid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userUid);
    }
}