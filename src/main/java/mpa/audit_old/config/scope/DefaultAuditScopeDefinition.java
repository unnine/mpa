package mpa.audit_old.config.scope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DefaultAuditScopeDefinition implements AuditScopeDefinition {

    private final boolean scopeConfig;

    private final List<AuditScope> scopes = new ArrayList<>();

    private DefaultAuditScopeDefinition(boolean scopeConfig) {
        this.scopeConfig = scopeConfig;
    }

    public static DefaultAuditScopeDefinition defaultConfigDefinition() {
        return new DefaultAuditScopeDefinition(false);
    }

    public static DefaultAuditScopeDefinition scopeConfigDefinition() {
        return new DefaultAuditScopeDefinition(true);
    }


    @Override
    public boolean isScopeConfig() {
        return scopeConfig;
    }

    @Override
    public void addScopes(AuditScope... scopes) {
        this.scopes.addAll(Arrays.asList(scopes));
    }

    @Override
    public void forEach(Consumer<AuditScope> register) {
        for (AuditScope scope : scopes) {
            register.accept(scope);
        }
    }
}