package mpa.audit.repository.sql.argument;

import java.util.List;
import java.util.Map;

public interface IdArgument extends Iterable<Argument.Entry> {

    boolean isEmpty();

    Map<String, String> asMap();


    static IdArgument of(List<Argument.Entry> parameters) {
        return new AuditIdArgument(parameters);
    }

}