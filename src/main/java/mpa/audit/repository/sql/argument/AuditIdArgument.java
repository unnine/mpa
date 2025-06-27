package mpa.audit.repository.sql.argument;

import lombok.RequiredArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Consumer;

@RequiredArgsConstructor
public class AuditIdArgument implements IdArgument {

    private final List<Argument.Entry> arguments;


    @Override
    public boolean isEmpty() {
        return CollectionUtils.isEmpty(arguments);
    }

    @Override
    public Map<String, String> asMap() {
        Map<String, String> idMap = new HashMap<>();

        for (Argument.Entry argument : arguments) {
            idMap.put(argument.getName(), argument.getValue());
        }
        return Collections.unmodifiableMap(idMap);
    }

    @Override
    public Iterator<Argument.Entry> iterator() {
        return arguments.iterator();
    }

    @Override
    public void forEach(Consumer<? super Argument.Entry> action) {
        arguments.forEach(action);
    }

    @Override
    public Spliterator<Argument.Entry> spliterator() {
        return arguments.spliterator();
    }
}