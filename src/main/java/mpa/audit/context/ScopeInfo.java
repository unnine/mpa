package mpa.audit.context;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import mpa.persistence.context.Scope;

@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ScopeInfo {

    @EqualsAndHashCode.Include
    private String name;

    private boolean isDefault;


    public static ScopeInfo of(Scope scope) {
        ScopeInfo scopeInfo = new ScopeInfo();
        scopeInfo.name = scope.getName();
        scopeInfo.isDefault = scope.isDefault();
        return scopeInfo;
    }


}