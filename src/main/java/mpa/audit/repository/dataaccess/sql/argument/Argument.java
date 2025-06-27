package mpa.audit.repository.dataaccess.sql.argument;

public interface Argument {

    Object getOriginArgument();

    IdArgument getId();


    interface Entry {

        String getName();

        String getValue();

    }


    static Builder builder(Object originArgument) {
        return new AuditArgument.Builder(originArgument);
    }

    interface Builder {

        Builder addId(String name, String value);

        Argument build();

    }

}