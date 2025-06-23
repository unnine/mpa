package mpa.audit_old.context.filter;

import mpa.audit_old.repository.database.schema.Data;

public interface ColumnsFilter {

    void filter(Data originData, Data updatedData);

}