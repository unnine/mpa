package mpa.audit.repository.database.sql.parameter;

import lombok.RequiredArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class AuditIdParameter implements IdParameter {

    private final List<Parameter.Entry> parameters;


    @Override
    public boolean isEmpty() {
        return CollectionUtils.isEmpty(parameters);
    }

    @Override
    public Map<String, String> asMap() {
        Map<String, String> idMap = new HashMap<>();

        for (Parameter.Entry parameter : parameters) {
            idMap.put(parameter.getName(), parameter.getValue());
        }
        return Collections.unmodifiableMap(idMap);
    }

    @Override
    public Iterator<Parameter.Entry> iterator() {
        return parameters.iterator();
    }

    @Override
    public void forEach(Consumer<? super Parameter.Entry> action) {
        parameters.forEach(action);
    }

    @Override
    public Spliterator<Parameter.Entry> spliterator() {
        return parameters.spliterator();
    }
}