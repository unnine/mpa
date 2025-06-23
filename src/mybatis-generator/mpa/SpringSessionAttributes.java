package mpa;

import java.util.Objects;
import javax.annotation.Generated;
import mpa.annotation.Entity;
import mpa.annotation.Id;

@Entity
public class SpringSessionAttributes {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String sessionPrimaryId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private String attributeName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private byte[] attributeBytes;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSessionPrimaryId() {
        return sessionPrimaryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSessionPrimaryId(String sessionPrimaryId) {
        this.sessionPrimaryId = sessionPrimaryId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getAttributeName() {
        return attributeName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public byte[] getAttributeBytes() {
        return attributeBytes;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAttributeBytes(byte[] attributeBytes) {
        this.attributeBytes = attributeBytes;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sessionPrimaryId=").append(sessionPrimaryId);
        sb.append(", attributeName=").append(attributeName);
        sb.append(", attributeBytes=").append(attributeBytes);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        SpringSessionAttributes other = (SpringSessionAttributes) o;
        return Objects.equals(sessionPrimaryId, other.sessionPrimaryId) && Objects.equals(attributeName, other.attributeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionPrimaryId, attributeName);
    }
}