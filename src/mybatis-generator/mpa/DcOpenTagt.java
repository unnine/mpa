package mpa;

import java.time.LocalDateTime;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class DcOpenTagt {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Short openTagtIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short docIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String useruid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String initReadDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long readCnt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String readDt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String delYn;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short ord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String rmk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtIp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime udtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String udtUid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getOpenTagtIdx() {
        return openTagtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOpenTagtIdx(Short openTagtIdx) {
        this.openTagtIdx = openTagtIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getDocIdx() {
        return docIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDocIdx(Short docIdx) {
        this.docIdx = docIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUseruid() {
        return useruid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUseruid(String useruid) {
        this.useruid = useruid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getInitReadDt() {
        return initReadDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setInitReadDt(String initReadDt) {
        this.initReadDt = initReadDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getReadCnt() {
        return readCnt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReadCnt(Long readCnt) {
        this.readCnt = readCnt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getReadDt() {
        return readDt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setReadDt(String readDt) {
        this.readDt = readDt;
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
    public Short getOrd() {
        return ord;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setOrd(Short ord) {
        this.ord = ord;
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
        sb.append(", openTagtIdx=").append(openTagtIdx);
        sb.append(", docIdx=").append(docIdx);
        sb.append(", useruid=").append(useruid);
        sb.append(", initReadDt=").append(initReadDt);
        sb.append(", readCnt=").append(readCnt);
        sb.append(", readDt=").append(readDt);
        sb.append(", delYn=").append(delYn);
        sb.append(", ord=").append(ord);
        sb.append(", rmk=").append(rmk);
        sb.append(", udtIp=").append(udtIp);
        sb.append(", udtDs=").append(udtDs);
        sb.append(", udtUid=").append(udtUid);
        sb.append("]");
        return sb.toString();
    }

    public Short getId() {
        return this.openTagtIdx;
    }

    public void setId(Short openTagtIdx) {
        this.openTagtIdx = openTagtIdx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        DcOpenTagt other = (DcOpenTagt) o;
        return Objects.equals(openTagtIdx, other.openTagtIdx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openTagtIdx);
    }
}