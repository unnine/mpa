package mpa;

import java.time.LocalDateTime;
import javax.annotation.Generated;
import mpa.annotation.Entity;

@Entity
public class AtErrLog {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Short errLogIdx;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String url;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String excp;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String msg;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String strace;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDateTime crtDs;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Short getErrLogIdx() {
        return errLogIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setErrLogIdx(Short errLogIdx) {
        this.errLogIdx = errLogIdx;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUrl() {
        return url;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUrl(String url) {
        this.url = url;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getExcp() {
        return excp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExcp(String excp) {
        this.excp = excp;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getMsg() {
        return msg;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getStrace() {
        return strace;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStrace(String strace) {
        this.strace = strace;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDateTime getCrtDs() {
        return crtDs;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCrtDs(LocalDateTime crtDs) {
        this.crtDs = crtDs;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", errLogIdx=").append(errLogIdx);
        sb.append(", url=").append(url);
        sb.append(", excp=").append(excp);
        sb.append(", msg=").append(msg);
        sb.append(", strace=").append(strace);
        sb.append(", crtDs=").append(crtDs);
        sb.append("]");
        return sb.toString();
    }
}