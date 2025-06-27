package mpa.audit.repository.database.sql.parameter;

public interface Parameter {

    Object[] getOriginArguments();

    IdParameter getId();


    interface Entry {

        String getName();

        String getValue();

    }


    static Builder builder(Object[] originArguments) {
        return new AuditParameter.Builder(originArguments);
    }

    interface Builder {

        Builder addIdParameter(String name, String value);

        Parameter build();

    }

}