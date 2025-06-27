package mpa.audit.holder;

import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import mpa.audit.config.AuditConfiguration;
import mpa.persistence.holder.Scope;

@RequiredArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public final class AuditScope {

    @EqualsAndHashCode.Include
    private final Scope scope;
    private final Class<? extends AuditConfiguration> configurerClass;


    public ScopeInfo toScopeInfo() {
        ScopeInfo scopeInfo = new ScopeInfo();
        scopeInfo.setName(scope.getName());
        scopeInfo.setDataSourceRef(scope.getDataSourceAware().getRef());
        scopeInfo.setConfigClassName(configurerClass.getName());
        return scopeInfo;
    }
}