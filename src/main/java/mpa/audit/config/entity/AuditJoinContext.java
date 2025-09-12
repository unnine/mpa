package mpa.audit.config.entity;

import lombok.RequiredArgsConstructor;
import mpa.audit.repository.sql.join.Join;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiredArgsConstructor
public class AuditJoinContext<T> implements Iterable<Join> {

    private final List<Join> joins = new ArrayList<>();

    private final Class<T> entityClass;


    public void add(Join join) {
        this.joins.add(join);
    }

    @Override
    public Iterator<Join> iterator() {
        return joins.iterator();
    }
}
