package default$;

import java.time.LocalDate;
import java.util.Objects;
import javax.annotation.Generated;
import mpa.persistence.entity.annotation.Entity;
import mpa.persistence.entity.annotation.Id;

@Entity(name = "Member")
public class Member {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @Id
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String email;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDate createdt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private LocalDate updatedt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name;
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
    public LocalDate getCreatedt() {
        return createdt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreatedt(LocalDate createdt) {
        this.createdt = createdt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public LocalDate getUpdatedt() {
        return updatedt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdatedt(LocalDate updatedt) {
        this.updatedt = updatedt;
    }

    @Override
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", email=").append(email);
        sb.append(", createdt=").append(createdt);
        sb.append(", updatedt=").append(updatedt);
        sb.append("]");
        return sb.toString();
    }

    public void setIdWhenPresent(Integer id) {
        if (id == null) {
            return;
        }
        this.id = id;
    }

    public void setNameWhenPresent(String name) {
        if (name == null) {
            return;
        }
        this.name = name;
    }

    public void setEmailWhenPresent(String email) {
        if (email == null) {
            return;
        }
        this.email = email;
    }

    public void setCreatedtWhenPresent(LocalDate createdt) {
        if (createdt == null) {
            return;
        }
        this.createdt = createdt;
    }

    public void setUpdatedtWhenPresent(LocalDate updatedt) {
        if (updatedt == null) {
            return;
        }
        this.updatedt = updatedt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Member other = (Member) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}