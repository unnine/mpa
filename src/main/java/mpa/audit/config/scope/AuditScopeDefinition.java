package mpa.audit.config.scope;

import java.util.function.Consumer;

public interface AuditScopeDefinition {

    boolean isScopeConfig();

    void addScopes(AuditScope... scopes);

    void forEach(Consumer<AuditScope> register);
}