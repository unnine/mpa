package mpa.persistence.event;

public enum MutationType {
    UNKNOWN("unknown"),
    INSERT("insert"),
    UPDATE("update"),
    DELETE("delete"),
    ;

    private final String identifier;


    MutationType(String identifier) {
        this.identifier = identifier;
    }


    public String identifier() {
        return identifier;
    }
}