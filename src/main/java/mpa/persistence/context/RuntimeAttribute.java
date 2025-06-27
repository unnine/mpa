package mpa.persistence.context;

public class RuntimeAttribute {

    private final Scope scope;


    public RuntimeAttribute(Scope scope) {
        this.scope = scope;
    }


    public Scope getScope() {
        return scope;
    }

    public boolean isAuditing() {
        if (!PersistenceEnvironmentAttribute.AUDITING) {
            return false;
        }
        if (!scope.getAuditAttribute().isAuditing()) {
            return false;
        }
        return true;
    }
}
