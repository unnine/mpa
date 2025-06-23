package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class At1AdtrElam {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short adtrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short hirAdtrElamIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime rvsDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtrUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtrDptNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short adtrElamAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtrElamProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String elamDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String trniCplCosYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short testScr1st;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short testScr2st;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String adtrElamYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

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
    private String useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAdtrElamIdx() {
        return adtrElamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtrElamIdx(Short adtrElamIdx) {
        this.adtrElamIdx = adtrElamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getHirAdtrElamIdx() {
        return hirAdtrElamIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHirAdtrElamIdx(Short hirAdtrElamIdx) {
        this.hirAdtrElamIdx = hirAdtrElamIdx;
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
    public String getAdtrUid() {
        return adtrUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtrUid(String adtrUid) {
        this.adtrUid = adtrUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtrDptNm() {
        return adtrDptNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtrDptNm(String adtrDptNm) {
        this.adtrDptNm = adtrDptNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getAdtrElamAprIdx() {
        return adtrElamAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtrElamAprIdx(Short adtrElamAprIdx) {
        this.adtrElamAprIdx = adtrElamAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAdtrElamProc() {
        return adtrElamProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtrElamProc(String adtrElamProc) {
        this.adtrElamProc = adtrElamProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniNo() {
        return trniNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniNo(String trniNo) {
        this.trniNo = trniNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getElamDt() {
        return elamDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setElamDt(String elamDt) {
        this.elamDt = elamDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTrniCplCosYn() {
        return trniCplCosYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTrniCplCosYn(String trniCplCosYn) {
        this.trniCplCosYn = trniCplCosYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTestScr1st() {
        return testScr1st;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTestScr1st(Short testScr1st) {
        this.testScr1st = testScr1st;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getTestScr2st() {
        return testScr2st;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTestScr2st(Short testScr2st) {
        this.testScr2st = testScr2st;
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
    public String getAdtrElamYn() {
        return adtrElamYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAdtrElamYn(String adtrElamYn) {
        this.adtrElamYn = adtrElamYn;
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
    public String getDelYn() {
        return delYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDelYn(String delYn) {
        this.delYn = delYn;
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
    public String getUseYn() {
        return useYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adtrElamIdx=").append(adtrElamIdx);
        sb.append(", hirAdtrElamIdx=").append(hirAdtrElamIdx);
        sb.append(", rvsNo=").append(rvsNo);
        sb.append(", rvsYn=").append(rvsYn);
        sb.append(", rvsRea=").append(rvsRea);
        sb.append(", rvsDs=").append(rvsDs);
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", adtrUid=").append(adtrUid);
        sb.append(", adtrDptNm=").append(adtrDptNm);
        sb.append(", adtrElamAprIdx=").append(adtrElamAprIdx);
        sb.append(", adtrElamProc=").append(adtrElamProc);
        sb.append(", trniNo=").append(trniNo);
        sb.append(", elamDt=").append(elamDt);
        sb.append(", trniCplCosYn=").append(trniCplCosYn);
        sb.append(", testScr1st=").append(testScr1st);
        sb.append(", testScr2st=").append(testScr2st);
        sb.append(", rmk=").append(rmk);
        sb.append(", adtrElamYn=").append(adtrElamYn);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", delYn=").append(delYn);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", useYn=").append(useYn);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.adtrElamIdx;
    }

    public void setId(Short adtrElamIdx) {
        this.adtrElamIdx = adtrElamIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        At1AdtrElam other = (At1AdtrElam) o;
        return Objects.equals(adtrElamIdx, other.adtrElamIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adtrElamIdx);
    }
}