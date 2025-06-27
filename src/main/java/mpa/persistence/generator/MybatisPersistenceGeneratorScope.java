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

    // TODO 현재의 경로에서 클래스 경로까지를 제거한 경로를 패키지 경로로 해야 함 ex) src/test/java(클래스패스)/mpa/fixture/domain -> mpa/fixture/domain
    public String getTargetPackageName() {
        String packageName = name;
        if (namespace != null && !namespace.isEmpty()) {
            packageName = namespace + "." + packageName;
        }
        return packageName;
    }
}