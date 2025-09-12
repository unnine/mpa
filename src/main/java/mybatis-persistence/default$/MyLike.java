package default$;

import java.util.Objects;
import javax.annotation.Generated;
import mpa.persistence.entity.annotation.Entity;
import mpa.persistence.entity.annotation.Id;

@Entity(name = "MyLike")
public class MyLike {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer memberId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer count;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getMemberId() {
        return memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCount() {
        return count;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", memberId=").append(memberId);
        sb.append(", count=").append(count);
        sb.append("]");
        return sb.toString();
    }

    public void setIdWhenPresent(Integer id) {
        if (id == null) {
            return;
        }
        this.id = id;
    }

    public void setMemberIdWhenPresent(Integer memberId) {
        if (memberId == null) {
            return;
        }
        this.memberId = memberId;
    }

    public void setCountWhenPresent(Integer count) {
        if (count == null) {
            return;
        }
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        MyLike other = (MyLike) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}