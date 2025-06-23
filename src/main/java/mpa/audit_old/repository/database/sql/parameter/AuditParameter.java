package mpa.audit_old.repository.database.sql.parameter;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.util.Log;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AuditParameter implements Parameter {

    private final Object[] originArguments;
    private final IdParameter idParameter;


    public AuditParameter(Object[] originArguments, IdParameter idParameter) {
        this.originArguments = originArguments;
        this.idParameter = idParameter;

        assertExistsIdParameter();
    }


    @Override
    public Object[] getOriginArguments() {
        return originArguments;
    }

    @Override
    public IdParameter getId() {
        return idParameter;
    }

    private void assertExistsIdParameter() {
        if (idParameter.isEmpty()) {
            throw new IllegalArgumentException(Log.format("id fields are required."));
        }
    }


    protected static class Builder implements Parameter.Builder {

        private final Object[] originArguments;
        private final List<Parameter.Entry> idParameters = new ArrayList<>();


        protected Builder(Object[] originArguments) {
            this.originArguments = originArguments;
        }

        @Override
        public Builder addIdParameter(String name, String value) {
            Entry parameter = new Entry(name, value);
            idParameters.add(parameter);
            return this;
        }

        @Override
        public Parameter build() {
            idParameters.sort(Comparator.comparing(Parameter.Entry::getName));
            return new AuditParameter(originArguments, IdParameter.of(idParameters));
        }
    }


    @Getter
    @RequiredArgsConstructor
    private static class Entry implements Parameter.Entry {
        private final String name;
        private final String value;
    }
}