package mpa.audit_old.config.scope;

import mpa.audit_old.config.AuditConfigurer;
import mpa.audit_old.config.holder.AuditScopeAware;

import java.util.Objects;
import java.util.UUID;

public class AuditScope {

    private static final String DEFAULT_NAME = String.format("default$$%s", UUID.randomUUID());

    private String name;
    private String schema;
    private String dataSourceRef;
    private String[] basePackages;
    private Class<? extends AuditConfigurer> configurerClass;


    public void setName(String name) {
        Objects.requireNonNull(name);
        this.name = name;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public void setDataSourceRef(String dataSourceRef) {
        Objects.requireNonNull(dataSourceRef);
        this.dataSourceRef = dataSourceRef;
    }

    public void addBasePackages(String... basePackages) {
        Objects.requireNonNull(basePackages);
        this.basePackages = basePackages;
    }

    public void setConfigurerClass(Class<? extends AuditConfigurer> configurerClass) {
        Objects.requireNonNull(configurerClass);
        this.configurerClass = configurerClass;
    }


    public AuditScopeAware toAware() {
        return AuditScopeAware.builder()
                .name(name)
                .schema(schema)
                .dataSourceRef(dataSourceRef)
                .basePackages(basePackages)
                .configurerClass(configurerClass)
                .defaultConfig(DEFAULT_NAME.equals(name))
                .build();
    }

    public static AuditScope ofDefault() {
        AuditScope scope = new AuditScope();
        scope.setName(DEFAULT_NAME);
        scope.setConfigurerClass(AuditConfigurer.class);
        return scope;
    }

}