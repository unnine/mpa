package mpa.audit.repository.dataaccess.sql.argument;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import mpa.util.Log;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AuditArgument implements Argument {

    private final Object originArgument;
    private final IdArgument idArgument;


    public AuditArgument(Object originArgument, IdArgument idArgument) {
        this.originArgument = originArgument;
        this.idArgument = idArgument;

        assertExistsIdArgument();
    }


    @Override
    public Object getOriginArgument() {
        return originArgument;
    }

    @Override
    public IdArgument getId() {
        return idArgument;
    }

    private void assertExistsIdArgument() {
        if (idArgument.isEmpty()) {
            throw new IllegalArgumentException(Log.format("id fields are required."));
        }
    }


    protected static class Builder implements Argument.Builder {

        private final Object originArgument;
        private final List<Argument.Entry> idArguments = new ArrayList<>();


        protected Builder(Object originArgument) {
            this.originArgument = originArgument;
        }

        @Override
        public Builder addId(String name, String value) {
            Entry parameter = new Entry(name, value);
            idArguments.add(parameter);
            return this;
        }

        @Override
        public Argument build() {
            idArguments.sort(Comparator.comparing(Argument.Entry::getName));
            return new AuditArgument(originArgument, IdArgument.of(idArguments));
        }
    }


    @Getter
    @RequiredArgsConstructor
    private static class Entry implements Argument.Entry {
        private final String name;
        private final String value;
    }
}