package mpa.audit.context;

import lombok.Getter;
import mpa.persistence.context.Scope;

@Getter
public class ScopeInfo {

    private String name;

    private String dataSourceRef;


    public static ScopeInfo of(Scope scope) {
        ScopeInfo scopeInfo = new ScopeInfo();
        scopeInfo.name = scope.getName();
        scopeInfo.dataSourceRef = scope.getDataSourceAware().getRef();
        return scopeInfo;
    }


}