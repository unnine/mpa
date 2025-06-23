package mpa;

import java.math.BigDecimal;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SpringSession {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String primaryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String sessionId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal creationTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal lastAccessTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long maxInactiveInterval;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private BigDecimal expiryTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String principalName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPrimaryId() {
        return primaryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrimaryId(String primaryId) {
        this.primaryId = primaryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSessionId() {
        return sessionId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getCreationTime() {
        return creationTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreationTime(BigDecimal creationTime) {
        this.creationTime = creationTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getLastAccessTime() {
        return lastAccessTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLastAccessTime(BigDecimal lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getMaxInactiveInterval() {
        return maxInactiveInterval;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMaxInactiveInterval(Long maxInactiveInterval) {
        this.maxInactiveInterval = maxInactiveInterval;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public BigDecimal getExpiryTime() {
        return expiryTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setExpiryTime(BigDecimal expiryTime) {
        this.expiryTime = expiryTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPrincipalName() {
        return principalName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPrincipalName(String principalName) {
        this.principalName = principalName;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", primaryId=").append(primaryId);
        sb.append(", sessionId=").append(sessionId);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", lastAccessTime=").append(lastAccessTime);
        sb.append(", maxInactiveInterval=").append(maxInactiveInterval);
        sb.append(", expiryTime=").append(expiryTime);
        sb.append(", principalName=").append(principalName);
        sb.append("]");
        return sb.toString();
    }

    public String getId() {
        return this.primaryId;
    }

    public void setId(String primaryId) {
        this.primaryId = primaryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SpringSession other = (SpringSession) o;
        return Objects.equals(primaryId, other.primaryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryId);
    }
}