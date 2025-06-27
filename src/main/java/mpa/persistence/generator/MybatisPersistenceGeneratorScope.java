package mpa.persistence.generator;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import mpa.persistence.context.Scope;

@Getter
@Setter(AccessLevel.PACKAGE)
public class MybatisPersistenceGeneratorScope {

    private String name;
    private String namespace;
    private MybatisPersistenceGeneratorDataSource dataSource = new MybatisPersistenceGeneratorDataSource();


    public void setName(String name) {
        this.name = Scope.NAMING_RULE.apply(name);
    }

    public String getTargetPackageName() {
        String packageName = name;
        if (namespace != null && !namespace.isEmpty()) {
            packageName = namespace + "." + packageName;
        }
        return packageName;
    }
}