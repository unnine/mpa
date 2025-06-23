package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Jb1Job {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short jobIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short hirJobIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short jobAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String jobProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String eduCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String joinDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String userDptNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime rvsDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String majrNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rpo1stUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rpo2stUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rpo3stUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rpo4stUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rpo5stUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

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
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getJobIdx() {
        return jobIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJobIdx(Short jobIdx) {
        this.jobIdx = jobIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getHirJobIdx() {
        return hirJobIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHirJobIdx(Short hirJobIdx) {
        this.hirJobIdx = hirJobIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRvsNo() {
        return rvsNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRvsNo(String rvsNo) {
        this.rvsNo = rvsNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSysVerCd() {
        return sysVerCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSysVerCd(String sysVerCd) {
        this.sysVerCd = sysVerCd;
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
    public String getQmsMngNo() {
        return qmsMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setQmsMngNo(String qmsMngNo) {
        this.qmsMngNo = qmsMngNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserUid() {
        return userUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserUid(String userUid) {
        this.userUid = userUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getJobAprIdx() {
        return jobAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJobAprIdx(Short jobAprIdx) {
        this.jobAprIdx = jobAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getJobProc() {
        return jobProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJobProc(String jobProc) {
        this.jobProc = jobProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEduCd() {
        return eduCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEduCd(String eduCd) {
        this.eduCd = eduCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getJoinDt() {
        return joinDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJoinDt(String joinDt) {
        this.joinDt = joinDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUserDptNm() {
        return userDptNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserDptNm(String userDptNm) {
        this.userDptNm = userDptNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRvsYn() {
        return rvsYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRvsYn(String rvsYn) {
        this.rvsYn = rvsYn;
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
    public String getMajrNm() {
        return majrNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMajrNm(String majrNm) {
        this.majrNm = majrNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRpo1stUid() {
        return rpo1stUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRpo1stUid(String rpo1stUid) {
        this.rpo1stUid = rpo1stUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRpo2stUid() {
        return rpo2stUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRpo2stUid(String rpo2stUid) {
        this.rpo2stUid = rpo2stUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRpo3stUid() {
        return rpo3stUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRpo3stUid(String rpo3stUid) {
        this.rpo3stUid = rpo3stUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRpo4stUid() {
        return rpo4stUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRpo4stUid(String rpo4stUid) {
        this.rpo4stUid = rpo4stUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRpo5stUid() {
        return rpo5stUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRpo5stUid(String rpo5stUid) {
        this.rpo5stUid = rpo5stUid;
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

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDelYn() {
        return delYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDelYn(String delYn) {
        this.delYn = delYn;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", jobIdx=").append(jobIdx);
        sb.append(", hirJobIdx=").append(hirJobIdx);
        sb.append(", rvsNo=").append(rvsNo);
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", userUid=").append(userUid);
        sb.append(", jobAprIdx=").append(jobAprIdx);
        sb.append(", jobProc=").append(jobProc);
        sb.append(", eduCd=").append(eduCd);
        sb.append(", joinDt=").append(joinDt);
        sb.append(", userDptNm=").append(userDptNm);
        sb.append(", rvsYn=").append(rvsYn);
        sb.append(", rvsRea=").append(rvsRea);
        sb.append(", rvsDs=").append(rvsDs);
        sb.append(", majrNm=").append(majrNm);
        sb.append(", rpo1stUid=").append(rpo1stUid);
        sb.append(", rpo2stUid=").append(rpo2stUid);
        sb.append(", rpo3stUid=").append(rpo3stUid);
        sb.append(", rpo4stUid=").append(rpo4stUid);
        sb.append(", rpo5stUid=").append(rpo5stUid);
        sb.append(", rmk=").append(rmk);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", useYn=").append(useYn);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", delYn=").append(delYn);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.jobIdx;
    }

    public void setId(Short jobIdx) {
        this.jobIdx = jobIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Jb1Job other = (Jb1Job) o;
        return Objects.equals(jobIdx, other.jobIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobIdx);
    }
}