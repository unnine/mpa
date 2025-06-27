package mpa.persistence.context;

import lombok.*;
import mpa.audit.config.AuditAttribute;

import java.util.function.Function;

@Getter
@Setter(AccessLevel.PACKAGE)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Scope {

    private static final String DEFAULT_NAME = "__$default$scope";

    @EqualsAndHashCode.Include
    private String name;
    private String basePackage;
    private DataSourceAware dataSourceAware;
    private AuditAttribute auditAttribute;
    private boolean isDefault = false;


    public void setName(String name) {
        this.name = NAMING_RULE.apply(name);
    }

    public static Scope ofDefault() {
        Scope scope = new Scope();
        scope.name = DEFAULT_NAME;
        scope.basePackage = "*";
        scope.isDefault = true;
        return scope;
    }

    public static String getDefaultName() {
        return DEFAULT_NAME;
    }


    @RequiredArgsConstructor
    public enum NAMING_RULE {
        NO_DASH(s -> s.replaceAll("-", "_"))
        ;


        private final Function<String, String> converter;


        public static String apply(String name) {
            if (name == null || name.isEmpty()) {
                return name;
            }
            String convertedName = name;

            for (NAMING_RULE rule : values()) {
                convertedName = rule.converter.apply(convertedName);
            }
            return convertedName;
        }
    }
}