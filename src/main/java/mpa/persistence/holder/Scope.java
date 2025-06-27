package mpa.persistence.holder;

import lombok.*;

@Getter
@Setter(AccessLevel.PACKAGE)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Scope {

    @EqualsAndHashCode.Include
    private String name;
    private String basePackage;
    private DataSourceAware dataSourceAware;
    private boolean isDefault = false;


    public static Scope ofDefault(DataSourceAware dataSourceAware) {
        Scope scope = new Scope();
        scope.setName("__$default$scope");
        scope.setBasePackage("*");
        scope.setDataSourceAware(dataSourceAware);
        scope.setDefault(true);
        return scope;
    }
}