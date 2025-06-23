package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class DcDoc {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short docIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short hirDocIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer docClfIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String plntCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docNm;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docNmEn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docWrtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docWrtDptCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String enmDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String enfoDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String expDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String openYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String kwd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dpsDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String dpsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docRmk;

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
    private Short fileIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sysVerCd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsRea;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rvsSumr;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String qmsMngNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short docAprReqidx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String docPrgs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getDocIdx() {
        return docIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocIdx(Short docIdx) {
        this.docIdx = docIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getHirDocIdx() {
        return hirDocIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setHirDocIdx(Short hirDocIdx) {
        this.hirDocIdx = hirDocIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getDocClfIdx() {
        return docClfIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocClfIdx(Integer docClfIdx) {
        this.docClfIdx = docClfIdx;
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
    public String getDocNm() {
        return docNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocNm(String docNm) {
        this.docNm = docNm;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDocNmEn() {
        return docNmEn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocNmEn(String docNmEn) {
        this.docNmEn = docNmEn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDocWrtUid() {
        return docWrtUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocWrtUid(String docWrtUid) {
        this.docWrtUid = docWrtUid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDocWrtDptCd() {
        return docWrtDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocWrtDptCd(String docWrtDptCd) {
        this.docWrtDptCd = docWrtDptCd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEnmDt() {
        return enmDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEnmDt(String enmDt) {
        this.enmDt = enmDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getEnfoDt() {
        return enfoDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setEnfoDt(String enfoDt) {
        this.enfoDt = enfoDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getExpDt() {
        return expDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExpDt(String expDt) {
        this.expDt = expDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getOpenYn() {
        return openYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOpenYn(String openYn) {
        this.openYn = openYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getKwd() {
        return kwd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setKwd(String kwd) {
        this.kwd = kwd;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDpsDt() {
        return dpsDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDpsDt(String dpsDt) {
        this.dpsDt = dpsDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDpsRea() {
        return dpsRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDpsRea(String dpsRea) {
        this.dpsRea = dpsRea;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDocRmk() {
        return docRmk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocRmk(String docRmk) {
        this.docRmk = docRmk;
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
    public Short getFileIdx() {
        return fileIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFileIdx(Short fileIdx) {
        this.fileIdx = fileIdx;
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
    public String getRvsDt() {
        return rvsDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRvsDt(String rvsDt) {
        this.rvsDt = rvsDt;
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
    public String getRvsSumr() {
        return rvsSumr;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRvsSumr(String rvsSumr) {
        this.rvsSumr = rvsSumr;
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
    public String getUseYn() {
        return useYn;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseYn(String useYn) {
        this.useYn = useYn;
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
    public Short getDocAprReqidx() {
        return docAprReqidx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocAprReqidx(Short docAprReqidx) {
        this.docAprReqidx = docAprReqidx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDocPrgs() {
        return docPrgs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocPrgs(String docPrgs) {
        this.docPrgs = docPrgs;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", docIdx=").append(docIdx);
        sb.append(", hirDocIdx=").append(hirDocIdx);
        sb.append(", docClfIdx=").append(docClfIdx);
        sb.append(", plntCd=").append(plntCd);
        sb.append(", docNm=").append(docNm);
        sb.append(", docNmEn=").append(docNmEn);
        sb.append(", docWrtUid=").append(docWrtUid);
        sb.append(", docWrtDptCd=").append(docWrtDptCd);
        sb.append(", enmDt=").append(enmDt);
        sb.append(", enfoDt=").append(enfoDt);
        sb.append(", expDt=").append(expDt);
        sb.append(", openYn=").append(openYn);
        sb.append(", kwd=").append(kwd);
        sb.append(", dpsDt=").append(dpsDt);
        sb.append(", dpsRea=").append(dpsRea);
        sb.append(", docRmk=").append(docRmk);
        sb.append(", crtIp=").append(crtIp);
        sb.append(", crtDs=").append(crtDs);
        sb.append(", crtUid=").append(crtUid);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append(", fileIdx=").append(fileIdx);
        sb.append(", sysVerCd=").append(sysVerCd);
        sb.append(", rvsNo=").append(rvsNo);
        sb.append(", rvsYn=").append(rvsYn);
        sb.append(", rvsDt=").append(rvsDt);
        sb.append(", rvsRea=").append(rvsRea);
        sb.append(", rvsSumr=").append(rvsSumr);
        sb.append(", qmsMngNo=").append(qmsMngNo);
        sb.append(", useYn=").append(useYn);
        sb.append(", delYn=").append(delYn);
        sb.append(", docAprReqidx=").append(docAprReqidx);
        sb.append(", docPrgs=").append(docPrgs);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.docIdx;
    }

    public void setId(Short docIdx) {
        this.docIdx = docIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        DcDoc other = (DcDoc) o;
        return Objects.equals(docIdx, other.docIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(docIdx);
    }
}