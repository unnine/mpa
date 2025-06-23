package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class Os2OosOcrp {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short oosOcrpIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pitmDiv;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ocrCtt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String prdSmpNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String pitmCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String testNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String lotNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String batchNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String lotDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String initTestTeamNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String initTestrNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ocrPla;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String testAtc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String testStd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String testRst;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String testMtd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short rpoAprIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String crtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rcpCanlRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime rcpCanlDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rcpCanlUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime ocrConfDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String ocrpProc;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String initTestStrDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short tracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String etcRcd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short modlTracIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOosOcrpIdx() {
        return oosOcrpIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOosOcrpIdx(Short oosOcrpIdx) {
        this.oosOcrpIdx = oosOcrpIdx;
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
    public String getSysVerCd() {
        return sysVerCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSysVerCd(String sysVerCd) {
        this.sysVerCd = sysVerCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPitmDiv() {
        return pitmDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPitmDiv(String pitmDiv) {
        this.pitmDiv = pitmDiv;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOcrCtt() {
        return ocrCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOcrCtt(String ocrCtt) {
        this.ocrCtt = ocrCtt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPrdSmpNm() {
        return prdSmpNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrdSmpNm(String prdSmpNm) {
        this.prdSmpNm = prdSmpNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPitmCd() {
        return pitmCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPitmCd(String pitmCd) {
        this.pitmCd = pitmCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTestNo() {
        return testNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTestNo(String testNo) {
        this.testNo = testNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLotNo() {
        return lotNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLotNo(String lotNo) {
        this.lotNo = lotNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBatchNo() {
        return batchNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLotDt() {
        return lotDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLotDt(String lotDt) {
        this.lotDt = lotDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getInitTestTeamNm() {
        return initTestTeamNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setInitTestTeamNm(String initTestTeamNm) {
        this.initTestTeamNm = initTestTeamNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getInitTestrNm() {
        return initTestrNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setInitTestrNm(String initTestrNm) {
        this.initTestrNm = initTestrNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOcrPla() {
        return ocrPla;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOcrPla(String ocrPla) {
        this.ocrPla = ocrPla;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTestAtc() {
        return testAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTestAtc(String testAtc) {
        this.testAtc = testAtc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTestStd() {
        return testStd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTestStd(String testStd) {
        this.testStd = testStd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTestRst() {
        return testRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTestRst(String testRst) {
        this.testRst = testRst;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTestMtd() {
        return testMtd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTestMtd(String testMtd) {
        this.testMtd = testMtd;
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
    public Short getRpoAprIdx() {
        return rpoAprIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRpoAprIdx(Short rpoAprIdx) {
        this.rpoAprIdx = rpoAprIdx;
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
    public String getRcpCanlRea() {
        return rcpCanlRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcpCanlRea(String rcpCanlRea) {
        this.rcpCanlRea = rcpCanlRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getRcpCanlDs() {
        return rcpCanlDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcpCanlDs(LocalDateTime rcpCanlDs) {
        this.rcpCanlDs = rcpCanlDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRcpCanlUid() {
        return rcpCanlUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRcpCanlUid(String rcpCanlUid) {
        this.rcpCanlUid = rcpCanlUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getOcrConfDs() {
        return ocrConfDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOcrConfDs(LocalDateTime ocrConfDs) {
        this.ocrConfDs = ocrConfDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOcrpProc() {
        return ocrpProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOcrpProc(String ocrpProc) {
        this.ocrpProc = ocrpProc;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getInitTestStrDt() {
        return initTestStrDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setInitTestStrDt(String initTestStrDt) {
        this.initTestStrDt = initTestStrDt;
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
    public String getEtcRcd() {
        return etcRcd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEtcRcd(String etcRcd) {
        this.etcRcd = etcRcd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getModlTracIdx() {
        return modlTracIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setModlTracIdx(Short modlTracIdx) {
        this.modlTracIdx = modlTracIdx;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oosOcrpIdx=").append(oosOcrpIdx);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", pitmDiv=").append(pitmDiv);
        sb.append(", ocrCtt=").append(ocrCtt);
        sb.append(", prdSmpNm=").append(prdSmpNm);
        sb.append(", pitmCd=").append(pitmCd);
        sb.append(", testNo=").append(testNo);
        sb.append(", lotNo=").append(lotNo);
        sb.append(", batchNo=").append(batchNo);
        sb.append(", lotDt=").append(lotDt);
        sb.append(", initTestTeamNm=").append(initTestTeamNm);
        sb.append(", initTestrNm=").append(initTestrNm);
        sb.append(", ocrPla=").append(ocrPla);
        sb.append(", testAtc=").append(testAtc);
        sb.append(", testStd=").append(testStd);
        sb.append(", testRst=").append(testRst);
        sb.append(", testMtd=").append(testMtd);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", rpoAprIdx=").append(rpoAprIdx);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", rcpCanlRea=").append(rcpCanlRea);
        sb.append(", rcpCanlDs=").append(rcpCanlDs);
        sb.append(", rcpCanlUid=").append(rcpCanlUid);
        sb.append(", ocrConfDs=").append(ocrConfDs);
        sb.append(", ocrpProc=").append(ocrpProc);
        sb.append(", initTestStrDt=").append(initTestStrDt);
        sb.append(", tracIdx=").append(tracIdx);
        sb.append(", etcRcd=").append(etcRcd);
        sb.append(", modlTracIdx=").append(modlTracIdx);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.oosOcrpIdx;
    }

    public void setId(Short oosOcrpIdx) {
        this.oosOcrpIdx = oosOcrpIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Os2OosOcrp other = (Os2OosOcrp) o;
        return Objects.equals(oosOcrpIdx, other.oosOcrpIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oosOcrpIdx);
    }
}