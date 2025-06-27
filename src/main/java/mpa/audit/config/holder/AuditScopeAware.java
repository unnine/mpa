package mpa.audit.config.holder;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import mpa.audit.config.AuditConfigurer;

@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public final class AuditScopeAware {

    @EqualsAndHashCode.Include
    private String name;
    private String schema;
    private String dataSourceRef;
    private String[] basePackages;
    private Class<? extends AuditConfigurer> configurerClass;
    private boolean defaultConfig;

    public String name() {
        return name;
    }

    public String dataSourceRef() {
        return dataSourceRef;
    }

    public String[] basePackages() {
        return basePackages;
    }

    public Class<? extends AuditConfigurer> configurerClass() {
        return configurerClass;
    }

    public boolean isDefaultScope() {
        return defaultConfig;
    }

    public boolean existsSchema() {
        return schema != null && !schema.isEmpty();
    }

    public String schema() {
        if (existsSchema()) {
            return schema;
        }
        return "";
    }

}