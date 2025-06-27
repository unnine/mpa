package mpa.audit.holder;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter(AccessLevel.PACKAGE)
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class ScopeInfo {

    private String name;

    private String dataSourceRef;

    private String configClassName;

}