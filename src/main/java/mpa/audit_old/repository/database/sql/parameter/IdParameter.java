package mpa.audit_old.repository.database.sql.parameter;

import java.util.List;
import java.util.Map;

public interface IdParameter extends Iterable<Parameter.Entry> {

    boolean isEmpty();

    Map<String, String> asMap();


    static IdParameter of(List<Parameter.Entry> parameters) {
        return new AuditIdParameter(parameters);
    }

}