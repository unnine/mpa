package mpa.audit_old.config.scope;

import lombok.Builder;
import lombok.Getter;
import mpa.audit_old.config.holder.AuditScopeAware;

@Getter
@Builder
public class ScopeInfo {

    private String name;

    private String dataSourceRef;

    private String configClassName;


    public static ScopeInfo of(AuditScopeAware scopeAware) {
        return ScopeInfo.builder()
                .name(scopeAware.name())
                .dataSourceRef(scopeAware.dataSourceRef())
                .configClassName(scopeAware.configurerClass().getName())
                .build();
    }

}