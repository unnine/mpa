package mpa.persistence.generator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PACKAGE)
public class MybatisPersistenceGeneratorScope {

    private String name;
    private String namespace;
    private MybatisPersistenceGeneratorDataSource dataSource = new MybatisPersistenceGeneratorDataSource();


    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            return;
        }
        this.name = name.replaceAll("-", "_");
    }

    public String getTargetPackageName() {
        String packageName = name;
        if (namespace != null && !namespace.isEmpty()) {
            packageName = namespace + "." + packageName;
        }
        return packageName;
    }
}