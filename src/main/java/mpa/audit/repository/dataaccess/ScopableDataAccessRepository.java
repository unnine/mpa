package mpa.audit.repository.dataaccess;

import lombok.RequiredArgsConstructor;
import mpa.audit.repository.dataaccess.schema.Data;
import mpa.audit.repository.dataaccess.sql.AuditSQL;
import mpa.audit.repository.dataaccess.sql.argument.Argument;
import mpa.persistence.context.Scopable;

@RequiredArgsConstructor
public class ScopableDataAccessRepository implements DataAccessRepository {

    private final Scopable<DataAccessRepository> proxy;


    private DataAccessRepository getInstance() {
        return proxy.getInstance();
    }

    @Override
    public Data selectData(AuditSQL sql, Argument argument) {
        return getInstance().selectData(sql, argument);
    }
}