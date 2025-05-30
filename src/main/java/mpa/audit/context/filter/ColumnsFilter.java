package mpa.audit.context.filter;

import mpa.audit.repository.database.schema.Data;

public interface ColumnsFilter {

    void filter(Data originData, Data updatedData);

}